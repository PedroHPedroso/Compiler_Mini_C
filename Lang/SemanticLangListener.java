package Lang;

import Grammar.LangBaseListener;
import Grammar.LangParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class SemanticLangListener extends LangBaseListener {

    private final Map<String, ParseTree> functions = new HashMap<>();
    private final Set<String> variables = new HashSet<>();
    private boolean hasErrors = false;
    private final List<String> errorMessages = new ArrayList<>();

    // Getters
    public Map<String, ParseTree> getFunctions() {
        return functions;
    }

    public Set<String> getVariables() {
        return variables;
    }

    public boolean hasErrors() {
        return hasErrors;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    @Override
    public void exitInputRead(LangParser.InputReadContext ctx) {
        String varName = ctx.VAR().getText();
        variables.add(varName);
    }

    @Override
    public void exitAtribVar(LangParser.AtribVarContext ctx) {
        String varName = ctx.VAR().getText();
        variables.add(varName);
    }

    @Override
    public void exitOutputWriteVar(LangParser.OutputWriteVarContext ctx) {
        String varName = ctx.VAR().getText();
        if (!variables.contains(varName)) {
            hasErrors = true;
            errorMessages.add("Undefined variable " + varName);
        }
    }

    @Override
    public void exitFunction(LangParser.FunctionContext ctx) {
        String fnName = ctx.VAR().getText();
        if (functions.containsKey(fnName)) {
            hasErrors = true;
            errorMessages.add("Function " + fnName + " already defined");
        } else {
            // Armazena a própria subárvore (ParseTree) associada a esse nome de função
            functions.put(fnName, ctx);
        }
    }
}
