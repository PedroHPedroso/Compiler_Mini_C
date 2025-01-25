package Lang;

import Grammar.LangBaseListener;
import Grammar.LangParser;
import java.util.*;

public class SemanticLangListener extends LangBaseListener {
    private final List<String> errors = new ArrayList<>();
    private final Set<String> declaredVariables = new HashSet<>();
    private final Map<String, LangParser.FunctionContext> declaredFunctions = new HashMap<>();

    // Métodos para verificar erros
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<String> getErrorMessages() {
        return errors;
    }

    // Métodos para obter variáveis e funções declaradas
    public Set<String> getDeclaredVariables() {
        return declaredVariables;
    }

    public Map<String, LangParser.FunctionContext> getDeclaredFunctions() {
        return declaredFunctions;
    }

    // Verifica a declaração de funções
    @Override
    public void exitRandomFunction(LangParser.RandomFunctionContext ctx) {
        String functionName = ctx.VAR().getText();
        if (declaredFunctions.containsKey(functionName)) {
            errors.add("Função já definida: " + functionName);
        } else {
            declaredFunctions.put(functionName, ctx);
        }
    }

    // Verifica declarações de variáveis
    @Override
    public void exitAtribDecl(LangParser.AtribDeclContext ctx) {
        String varName = ctx.VAR().getText();
        if (declaredVariables.contains(varName)) {
            errors.add("Variável já declarada: " + varName);
        } else {
            declaredVariables.add(varName);
        }
    }

    // Verifica atribuições de variáveis
    @Override
    public void exitAtribAssign(LangParser.AtribAssignContext ctx) {
        String varName = ctx.VAR().getText();
        if (!declaredVariables.contains(varName)) {
            errors.add("Variável não declarada: " + varName);
        }
    }

    // Verifica saída de variáveis
    @Override
    public void exitStmtOutput(LangParser.StmtOutputContext ctx) {
        // Iterar sobre as expressões de saída
        LangParser.OutputWriteContext outputCtx = (LangParser.OutputWriteContext) ctx.output();
        List<LangParser.ExprContext> expressions = outputCtx.expr();
        for (LangParser.ExprContext expr : expressions) {
            // Se for um identificador de variável, verificamos se está declarado
            String varName = expr.getText();
            if (!declaredVariables.contains(varName)) {
                errors.add("Variável não declarada usada na saída: " + varName);
            }
        }
    }    
}
    