package Lang;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;

import Grammar.*;

public class LangInterpreter extends LangBaseVisitor<Object> {
    private final Map<String, ParseTree> declaredFunctions;
    private final Map<String, Object> variables = new HashMap<>();

    public LangInterpreter(Map<String, ParseTree> declaredFunctions) {
        this.declaredFunctions = declaredFunctions;
    }

    @Override
    public Object visitAtribDecl(LangParser.AtribDeclContext ctx) {
        String varName = ctx.VAR().getText();
        Object value = visit(ctx.expr());
        variables.put(varName, value);
        return null;
    }

    @Override
    public Object visitAtribAssign(LangParser.AtribAssignContext ctx) {
        String varName = ctx.VAR().getText();
        Object value = visit(ctx.expr());
        if (!variables.containsKey(varName)) {
            System.err.println("Variável não definida: " + varName);
        }
        variables.put(varName, value);
        return null;
    }

    @Override
    public Object visitFuncInvocLine(LangParser.FuncInvocLineContext ctx) {
        String funcName = ctx.VAR().getText();
        if (!declaredFunctions.containsKey(funcName)) {
            System.err.println("Função não definida: " + funcName);
            return null;
        }
        visit(declaredFunctions.get(funcName));
        return null;
    }

    @Override
    public Object visitOutputWrite(LangParser.OutputWriteContext ctx) {
        if (ctx.expr() != null) {
            for (var expr : ctx.expr()) {
                Object value = visit(expr);
                System.out.println(value != null ? value.toString() : "null");
            }
        }
        return null;
    }
}
