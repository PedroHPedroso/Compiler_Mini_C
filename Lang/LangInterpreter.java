package Lang;

import Grammar.LangBaseVisitor;
import Grammar.LangParser;
import Grammar.LangLexer;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Interpretador em Java, equivalente à implementação C# do LangInterpreter.
 */
public class LangInterpreter extends LangBaseVisitor<Object> {

    // Scanner estático para simplificar leituras do console
    private static final Scanner SCANNER = new Scanner(System.in);

    // Funções armazenadas (nome da função -> ParseTree)
    private Map<String, ParseTree> functions;

    // Variáveis globais do interpretador
    private Map<String, Object> variables = new HashMap<>();

    // Construtor
    public LangInterpreter(Map<String, ParseTree> functions) {
        this.functions = functions;
    }

    // Getter das variáveis, caso seja necessário acesso externo
    public Map<String, Object> getVariables() {
        return variables;
    }

    /* ----------------------------------------------------------------
       MÉTODOS AUXILIARES
    ------------------------------------------------------------------ */
    /**
     * Tenta converter o objeto retornado de uma subárvore em double.
     * Caso não seja possível, retorna 0.0.
     */
    private double parseDoubleOrZero(Object value) {
        if (value == null) return 0.0;
        try {
            return Double.parseDouble(value.toString());
        } catch (NumberFormatException ex) {
            return 0.0;
        }
    }

    /**
     * Visita duas subárvores e retorna os valores numéricos (double)
     * correspondentes em um array [d1, d2].
     */
    private double[] getDoubles(ParseTree tree1, ParseTree tree2) {
        Object v1 = visit(tree1);
        Object v2 = visit(tree2);
        return new double[] { parseDoubleOrZero(v1), parseDoubleOrZero(v2) };
    }

    /* ----------------------------------------------------------------
       I/O STATEMENTS
    ------------------------------------------------------------------ */

    @Override
    public Object visitInputRead(LangParser.InputReadContext context) {
        System.out.print("> ");
        String input = SCANNER.nextLine();
        if (!input.isEmpty()) {
            String varName = context.VAR().getText();
            variables.put(varName, input);
        }
        return null;
    }

    @Override
    public Object visitOutputWriteVar(LangParser.OutputWriteVarContext context) {
        String varName = context.VAR().getText();
        if (variables.containsKey(varName)) {
            System.out.println(variables.get(varName));
        } else {
            System.out.println("Variable " + varName + " is not defined");
        }
        return null;
    }

    @Override
    public Object visitOutputWriteStr(LangParser.OutputWriteStrContext context) {
        // Removendo as aspas da string
        String str = context.STR().getText().replace("\"", "");
        System.out.println(str);
        return null;
    }

    @Override
    public Object visitOutputWriteExpr(LangParser.OutputWriteExprContext context) {
        Object value = visit(context.expr());
        if (value != null) {
            System.out.println(value);
        }
        return null;
    }

    /* ----------------------------------------------------------------
       VARIABLE & EXPRESSION STATEMENTS
    ------------------------------------------------------------------ */

    @Override
    public Object visitAtribVar(LangParser.AtribVarContext context) {
        String varName = context.VAR().getText();
        Object value = visit(context.expr());
        variables.put(varName, value);
        return null;
    }

    @Override
    public Object visitExprPlus(LangParser.ExprPlusContext context) {
        double[] d = getDoubles(context.term(), context.expr());
        return d[0] + d[1];
    }

    @Override
    public Object visitExprMinus(LangParser.ExprMinusContext context) {
        double[] d = getDoubles(context.term(), context.expr());
        return d[0] - d[1];
    }

    @Override
    public Object visitExprTerm(LangParser.ExprTermContext context) {
        return visit(context.term());
    }

    @Override
    public Object visitTermMult(LangParser.TermMultContext context) {
        double[] d = getDoubles(context.factor(), context.term());
        return d[0] * d[1];
    }

    @Override
    public Object visitTermDiv(LangParser.TermDivContext context) {
        double[] d = getDoubles(context.factor(), context.term());
        // cuidado com divisão por zero (d[1]) se necessário
        return d[0] / d[1];
    }

    @Override
    public Object visitTermFactor(LangParser.TermFactorContext context) {
        return visit(context.factor());
    }

    @Override
    public Object visitFactorVar(LangParser.FactorVarContext context) {
        String varName = context.VAR().getText();
        if (variables.containsKey(varName)) {
            return variables.get(varName);
        }
        System.out.println("Variable " + varName + " is not defined");
        return null;
    }

    @Override
    public Object visitFactorNum(LangParser.FactorNumContext context) {
        return Double.parseDouble(context.NUM().getText());
    }

    @Override
    public Object visitFactorExpr(LangParser.FactorExprContext context) {
        return visit(context.expr());
    }

    /* ----------------------------------------------------------------
       CONTROL STATEMENTS
    ------------------------------------------------------------------ */

    @Override
    public Object visitIfstIf(LangParser.IfstIfContext context) {
        Object cond = visit(context.cond());
        if (cond != null && cond instanceof Boolean && (Boolean) cond) {
            visit(context.block());
        }
        return null;
    }

    @Override
    public Object visitIfstIfElse(LangParser.IfstIfElseContext context) {
        Object cond = visit(context.cond());
        if (cond != null && cond instanceof Boolean && (Boolean) cond) {
            visit(context.b1);
        } else {
            visit(context.b2);
        }
        return null;
    }

    @Override
    public Object visitCondExpr(LangParser.CondExprContext context) {
        // Retorna true se expr != 0
        Object v = visit(context.expr());
        double d = parseDoubleOrZero(v);
        return d != 0.0;
    }

    @Override
    public Object visitCondRelop(LangParser.CondRelopContext context) {
        double[] d = getDoubles(context.e1, context.e2);
        switch (context.op.getType()) {
            case LangLexer.EQ: return d[0] == d[1];
            case LangLexer.NE: return d[0] != d[1];
            case LangLexer.LT: return d[0] < d[1];
            case LangLexer.LE: return d[0] <= d[1];
            case LangLexer.GT: return d[0] > d[1];
            case LangLexer.GE: return d[0] >= d[1];
            default:           return false;
        }
    }

    @Override
    public Object visitCondAnd(LangParser.CondAndContext context) {
        Object v1 = visit(context.c1);
        Object v2 = visit(context.c2);
        return (v1 instanceof Boolean && (Boolean) v1) 
            && (v2 instanceof Boolean && (Boolean) v2);
    }

    @Override
    public Object visitCondOr(LangParser.CondOrContext context) {
        Object v1 = visit(context.c1);
        Object v2 = visit(context.c2);
        boolean b1 = (v1 instanceof Boolean) && (Boolean) v1;
        boolean b2 = (v2 instanceof Boolean) && (Boolean) v2;
        return b1 || b2;
    }

    @Override
    public Object visitCondNot(LangParser.CondNotContext context) {
        Object v = visit(context.cond());
        return (v instanceof Boolean) && !((Boolean) v);
    }

    /* ----------------------------------------------------------------
       FUNCTIONS
    ------------------------------------------------------------------ */

    @Override
    public Object visitFuncInvocLine(LangParser.FuncInvocLineContext context) {
        String funcName = context.VAR().getText();
        ParseTree function = functions.get(funcName);
        if (function != null) {
            return visit(function);
        }
        // Se não encontrar a função, simplesmente retorna null
        return null;
    }
}
