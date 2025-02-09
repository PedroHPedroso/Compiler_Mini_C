package Lang;

import grammar.*;
import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SemanticLangListener extends LangBaseListener {
    public final List<String> errors = new ArrayList<>();
    public final Set<String> declaredVariables = new HashSet<>();
    public final Map<String, String> variableTypes = new HashMap<>();
    public final Map<String, LangParser.FunctionContext> declaredFunctions = new HashMap<>();
    public final Map<String, Map<String, String>> declaredStructs = new HashMap<>();
    public final Map<String, Map<String, String>> declaredUnions = new HashMap<>();
    public final Map<String, Object> defines = new HashMap<>();
    public final Set<String> includedLibs = new HashSet<>();
    public boolean hasMainFunction = false;
    public Scope currentScope = new Scope();

    private class Scope {
        private final Map<String, String> variables = new HashMap<>();
        private final Scope parent;
        
        public Scope() {
            this.parent = null;
        }
        
        public Scope(Scope parent) {
            this.parent = parent;
        }
        
        public void define(String name, String type) {
            variables.put(name, type);
        }
        
        public String resolve(String name) {
            String type = variables.get(name);
            if (type != null) return type;
            return parent != null ? parent.resolve(name) : null;
        }
    }

    @Override
    public void exitGlobalVariable(LangParser.GlobalVariableContext ctx) {
        if (ctx.DEFINE() != null) {
            String name = ctx.VAR().getText();
            String value = null; // Alterado de Object para String
            if (ctx.expression() != null) {
                value = ctx.expression().getText();
            }
            defines.put(name, value);
        }
    }

    @Override
    public void exitStructdeclaration(LangParser.StructdeclarationContext ctx) {
        String structType = ctx.VAR(0).getText();
        String varName = ctx.VAR(1).getText();
        
        if (!declaredStructs.containsKey(structType)) {
            errors.add("Estrutura não declarada: " + structType);
            return;
        }
        
        currentScope.define(varName, "struct:" + structType);
        declaredVariables.add(varName);
        variableTypes.put(varName, "struct:" + structType);
    }

    

    @Override
    public void exitUniondeclaration(LangParser.UniondeclarationContext ctx) {
        String unionType = ctx.VAR(0).getText();
        String varName = ctx.VAR(1).getText();
        
        if (!declaredUnions.containsKey(unionType)) {
            errors.add("União não declarada: " + unionType);
            return;
        }
        
        currentScope.define(varName, "union:" + unionType);
        declaredVariables.add(varName);
        variableTypes.put(varName, "union:" + unionType);
    }

    @Override
    public void exitInput(LangParser.InputContext ctx) {
        if (ctx.SCAN() != null) {
            String format = ctx.FORMATSTRING().getText();
            List<TerminalNode> vars = ctx.VAR();
            validateScanfFormat(format, vars);
        }
    }

    private void validateScanfFormat(String format, List<TerminalNode> vars) {
        // Remove as aspas
        format = format.substring(1, format.length() - 1);
        
        // Conta os especificadores de formato
        int formatCount = 0;
        for (int i = 0; i < format.length(); i++) {
            if (format.charAt(i) == '%') {
                if (i + 1 < format.length() && "dfsc".indexOf(format.charAt(i + 1)) >= 0) {
                    formatCount++;
                }
            }
        }
        
        if (formatCount != vars.size()) {
            errors.add("Número de argumentos não corresponde aos especificadores de formato em scanf");
        }
    }

    @Override
    public void exitOutput(LangParser.OutputContext ctx) {
        if (ctx.PRINT() != null) {
            String format = ctx.FORMATSTRING().getText();
            List<LangParser.ExpressionContext> expressions = ctx.expression();
            validatePrintfFormat(format, expressions);
        }
    }

    private void validatePrintfFormat(String format, List<LangParser.ExpressionContext> expressions) {
        format = format.substring(1, format.length() - 1);
        
        int formatCount = 0;
        for (int i = 0; i < format.length(); i++) {
            if (format.charAt(i) == '%') {
                if (i + 1 < format.length() && "dfsc".indexOf(format.charAt(i + 1)) >= 0) {
                    formatCount++;
                }
            }
        }
        
        if (formatCount != expressions.size()) {
            errors.add("Número de argumentos não corresponde aos especificadores de formato em printf");
        }
    }

    @Override
    public void exitArraydecl(LangParser.ArraydeclContext ctx) {
        String arrayName = ctx.VAR().getText();
        String arrayType = ctx.typeSpec().getText();
        
        if (declaredVariables.contains(arrayName)) {
            errors.add("Array já declarado: " + arrayName);
            return;
        }
        
        try {
            int size = Integer.parseInt(ctx.NUM().getText());
            if (size <= 0) {
                errors.add("Tamanho do array deve ser positivo: " + arrayName);
                return;
            }
            
            declaredVariables.add(arrayName);
            variableTypes.put(arrayName, arrayType + "[]");
            currentScope.define(arrayName, arrayType + "[]");
            
            if (ctx.arrayelems() != null) {
                validateArrayInitialization(ctx, arrayName, arrayType, size);
            }
        } catch (NumberFormatException e) {
            errors.add("Tamanho inválido para array: " + arrayName);
        }
    }

    private void validateArrayInitialization(LangParser.ArraydeclContext ctx, 
                                          String arrayName, 
                                          String arrayType, 
                                          int size) {
        List<LangParser.ExpressionContext> elements = ctx.arrayelems().expression();
        
        if (elements.size() > size) {
            errors.add("Inicialização excede o tamanho do array: " + arrayName);
            return;
        }
        
        for (LangParser.ExpressionContext element : elements) {
            String elementType = getExpressionType(element);
            if (!isCompatibleType(arrayType, elementType)) {
                errors.add("Tipo incompatível na inicialização do array " + arrayName);
            }
        }
    }

    @Override
    public void exitPointerdecl(LangParser.PointerdeclContext ctx) {
        String pointerName = ctx.VAR().getText();
        String baseType = ctx.typeSpec().getText();
        
        if (declaredVariables.contains(pointerName)) {
            errors.add("Ponteiro já declarado: " + pointerName);
            return;
        }
        
        declaredVariables.add(pointerName);
        variableTypes.put(pointerName, baseType + "*");
        currentScope.define(pointerName, baseType + "*");
    }

    @Override
    public void exitPointerassign(LangParser.PointerassignContext ctx) {
        String pointerName = ctx.VAR(0).getText();
        String varName = ctx.VAR(1).getText();
        
        if (!declaredVariables.contains(pointerName)) {
            errors.add("Ponteiro não declarado: " + pointerName);
            return;
        }
        
        if (!declaredVariables.contains(varName)) {
            errors.add("Variável não declarada: " + varName);
            return;
        }
        
        String pointerType = variableTypes.get(pointerName);
        String varType = variableTypes.get(varName);
        
        if (!pointerType.endsWith("*")) {
            errors.add("Variável não é um ponteiro: " + pointerName);
            return;
        }
        
        String baseType = pointerType.substring(0, pointerType.length() - 1);
        if (!baseType.equals(varType)) {
            errors.add("Tipo incompatível na atribuição de endereço");
        }
    }

    @Override
    public void exitStructaccess(LangParser.StructaccessContext ctx) {
        String structVar = ctx.VAR(0).getText();
        String field = ctx.VAR(1).getText();
        
        if (!declaredVariables.contains(structVar)) {
            errors.add("Variável de estrutura não declarada: " + structVar);
            return;
        }
        
        String type = variableTypes.get(structVar);
        if (!type.startsWith("struct:")) {
            errors.add("Variável não é uma estrutura: " + structVar);
            return;
        }
        
        String structType = type.substring(7);
        Map<String, String> fields = declaredStructs.get(structType);
        if (!fields.containsKey(field)) {
            errors.add("Campo não existe na estrutura: " + field);
        }
    }

    private String getExpressionType(LangParser.ExpressionContext expr) {
        if (expr == null) return "unknown";
        
        if (expr.term() != null && expr.termTail().isEmpty()) {
            return getTermType(expr.term());
        }
        
        String leftType = getTermType(expr.term());
        for (LangParser.TermTailContext tail : expr.termTail()) {
            String rightType = getTermType(tail.term());
            if (leftType.equals("unknown") || rightType.equals("unknown")) {
                return "unknown";
            }
            if (isNumericType(leftType) && isNumericType(rightType)) {
                leftType = getWidestType(leftType, rightType);
            } else {
                return "unknown";
            }
        }
        return leftType;
    }

    private String getTermType(LangParser.TermContext term) {
        if (term == null) return "unknown";
        
        if (term.factor() != null && term.factorTail().isEmpty()) {
            return getFactorType(term.factor());
        }
        
        String leftType = getFactorType(term.factor());
        for (LangParser.FactorTailContext tail : term.factorTail()) {
            String rightType = getFactorType(tail.factor());
            if (leftType.equals("unknown") || rightType.equals("unknown")) {
                return "unknown";
            }
            if (isNumericType(leftType) && isNumericType(rightType)) {
                leftType = getWidestType(leftType, rightType);
            } else {
                return "unknown";
            }
        }
        return leftType;
    }

    private String getFactorType(LangParser.FactorContext factor) {
        if (factor == null) return "unknown";
        
        if (factor.NUM() != null) return "int";
        if (factor.DECIM() != null) return "float";
        if (factor.VAR() != null) {
            String varName = factor.VAR().getText();
            if (declaredVariables.contains(varName)) {
                return variableTypes.get(varName);
            }
            if (defines.containsKey(varName)) return "int";
        }
        if (factor.expression() != null) {
            return getExpressionType(factor.expression());
        }
        return "unknown";
    }

    private boolean isNumericType(String type) {
        return type != null && (type.equals("int") || type.equals("float") || 
               type.equals("double") || type.equals("char"));
    }

    private String getWidestType(String type1, String type2) {
        if (type1.equals("double") || type2.equals("double")) return "double";
        if (type1.equals("float") || type2.equals("float")) return "float";
        return "int";
    }

    private boolean isCompatibleType(String expectedType, String actualType) {
        if (expectedType == null || actualType == null) return false;
        if (expectedType.equals(actualType)) return true;
        
        if (isNumericType(expectedType) && isNumericType(actualType)) {
            if (expectedType.equals("double")) return true;
            if (expectedType.equals("float") && actualType.equals("int")) return true;
        }
        
        return false;
    }

    @Override
    public void exitFuncinvoc(LangParser.FuncinvocContext ctx) {
        String funcName = ctx.VAR().getText();
        
        // Check if function exists
        if (!declaredFunctions.containsKey(funcName)) {
            errors.add("Função não declarada: " + funcName);
            return;
        }
        
        LangParser.FunctionContext funcDecl = declaredFunctions.get(funcName);
        LangParser.ParamsContext paramsDecl = funcDecl.params();
        List<LangParser.ExpressionContext> arguments = 
            ctx.argumentos() != null ? ctx.argumentos().expression() : new ArrayList<>();
        
        // Check number of arguments
        List<TerminalNode> declaredParams = paramsDecl != null ? paramsDecl.VAR() : new ArrayList<>();
        if (declaredParams.size() != arguments.size()) {
            errors.add("Número incorreto de argumentos para a função: " + funcName);
            return;
        }
        
        // Check argument types
        if (paramsDecl != null) {
            List<LangParser.TypeSpecContext> paramTypes = paramsDecl.typeSpec();
            for (int i = 0; i < arguments.size(); i++) {
                String expectedType = paramTypes.get(i).getText();
                String actualType = getExpressionType(arguments.get(i));
                
                if (!isCompatibleType(expectedType, actualType)) {
                    errors.add("Tipo incompatível no argumento " + (i + 1) + 
                            " da função " + funcName);
                }
            }
        }
    }

    @Override
    public void exitFunction(LangParser.FunctionContext ctx) {
        String funcName;
        if (ctx.MAIN() != null) {
            funcName = "main";
            hasMainFunction = true;
        } else {
            funcName = ctx.VAR().getText();
        }
        
        if (declaredFunctions.containsKey(funcName)) {
            errors.add("Função já declarada: " + funcName);
            return;
        }
        
        declaredFunctions.put(funcName, ctx);
        
        // Create new scope for function
        currentScope = new Scope(currentScope);
        
        // Add parameters to function scope
        if (ctx.params() != null) {
            List<TerminalNode> params = ctx.params().VAR();
            List<LangParser.TypeSpecContext> types = ctx.params().typeSpec();
            
            for (int i = 0; i < params.size(); i++) {
                String paramName = params.get(i).getText();
                String paramType = types.get(i).getText();
                
                currentScope.define(paramName, paramType);
                declaredVariables.add(paramName);
                variableTypes.put(paramName, paramType);
            }
        }
    }

        @Override
        public void exitFnBlock(LangParser.FnBlockContext ctx) {
            // Restore parent scope when exiting function block
            if (currentScope.parent != null) {
                currentScope = currentScope.parent;
            }
        }

        @Override
    public void exitProg(LangParser.ProgContext ctx) {
        if (!hasMainFunction) {
            errors.add("Programa não possui função main");
        }
    }

    @Override
    public void exitPreprocessorDirective(LangParser.PreprocessorDirectiveContext ctx) {
        String lib = ctx.LIB().getText();
        // Remove < and >
        lib = lib.substring(1, lib.length() - 1);
        
        if (includedLibs.contains(lib)) {
            errors.add("Biblioteca já incluída: " + lib);
            return;
        }
        
        includedLibs.add(lib);
    }

    @Override
    public void exitStructdecl(LangParser.StructdeclContext ctx) {
        String structName = ctx.VAR().getText();
        
        if (declaredStructs.containsKey(structName)) {
            errors.add("Estrutura já declarada: " + structName);
            return;
        }
        
        Map<String, String> fields = new HashMap<>();
        if (ctx.structfieldList() != null) {
            for (LangParser.StructfieldsContext field : ctx.structfieldList().structfields()) {
                String fieldName = field.VAR().getText();
                String fieldType = field.typeSpec().getText();
                
                if (fields.containsKey(fieldName)) {
                    errors.add("Campo duplicado na estrutura " + structName + ": " + fieldName);
                    continue;
                }
                
                fields.put(fieldName, fieldType);
            }
        }
        
        declaredStructs.put(structName, fields);
    }

    @Override
    public void exitUniondecl(LangParser.UniondeclContext ctx) {
        String unionName = ctx.VAR().getText();
        
        if (declaredUnions.containsKey(unionName)) {
            errors.add("União já declarada: " + unionName);
            return;
        }
        
        Map<String, String> fields = new HashMap<>();
        if (ctx.unionfieldList() != null) {
            for (LangParser.UnionfieldsContext field : ctx.unionfieldList().unionfields()) {
                String fieldName = field.VAR().getText();
                String fieldType = field.typeSpec().getText();
                
                if (fields.containsKey(fieldName)) {
                    errors.add("Campo duplicado na união " + unionName + ": " + fieldName);
                    continue;
                }
                
                fields.put(fieldName, fieldType);
            }
        }
        
        declaredUnions.put(unionName, fields);
    }

    @Override
    public void exitUnionaccess(LangParser.UnionaccessContext ctx) {
        String unionVar = ctx.VAR(0).getText();
        String field = ctx.VAR(1).getText();
        
        if (!declaredVariables.contains(unionVar)) {
            errors.add("Variável de união não declarada: " + unionVar);
            return;
        }
        
        String type = variableTypes.get(unionVar);
        if (!type.startsWith("union:")) {
            errors.add("Variável não é uma união: " + unionVar);
            return;
        }
        
        String unionType = type.substring(6);
        Map<String, String> fields = declaredUnions.get(unionType);
        if (!fields.containsKey(field)) {
            errors.add("Campo não existe na união: " + field);
            return;
        }
        
        if (ctx.expression() != null) {
            String exprType = getExpressionType(ctx.expression());
            String fieldType = fields.get(field);
            if (!isCompatibleType(fieldType, exprType)) {
                errors.add("Tipo incompatível na atribuição do campo da união");
            }
        }
    }

    @Override
    public void exitSwitchstmt(LangParser.SwitchstmtContext ctx) {
        String varName = ctx.VAR().getText();
        
        if (!declaredVariables.contains(varName)) {
            errors.add("Variável não declarada no switch: " + varName);
            return;
        }
        
        String varType = variableTypes.get(varName);
        if (!varType.equals("int") && !varType.equals("char")) {
            errors.add("Switch requer variável do tipo int ou char");
        }
        
        Set<String> caseValues = new HashSet<>();
        for (LangParser.CaseClauseContext caseCtx : ctx.caseClause()) {
            String caseValue = caseCtx.NUM().getText();
            if (!caseValues.add(caseValue)) {
                errors.add("Valor de case duplicado: " + caseValue);
            }
        }
    }

    // Método auxiliar para obter lista de erros
    public List<String> getErrors() {
        return errors;
    }

    // Método auxiliar para verificar se houve erros
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    @Override
    public void exitAtrib(LangParser.AtribContext ctx) {
        // Handle variable declaration with type
        if (ctx.typeSpec() != null) {
            String varName = ctx.VAR().getText();
            String varType = ctx.typeSpec().getText();
            
            if (declaredVariables.contains(varName)) {
                errors.add("Variável já declarada: " + varName);
                return;
            }
            
            declaredVariables.add(varName);
            variableTypes.put(varName, varType);
            currentScope.define(varName, varType);
            
            if (ctx.expression() != null) {
                String exprType = getExpressionType(ctx.expression());
                if (!isCompatibleType(varType, exprType)) {
                    errors.add("Tipo incompatível na inicialização da variável: " + varName);
                }
            }
        } 
        // Handle assignment to existing variable
        else {
            String varName = ctx.VAR().getText();
            
            if (!declaredVariables.contains(varName)) {
                errors.add("Variável não declarada: " + varName);
                return;
            }
            
            String varType = variableTypes.get(varName);
            
            // Handle increment/decrement
            if (ctx.getText().contains("++") || ctx.getText().contains("--")) {
                if (!isNumericType(varType)) {
                    errors.add("Operador de incremento/decremento requer tipo numérico: " + varName);             }
            }
            // Handle compound assignments (+=, -=)
            else if (ctx.expression() != null) {
                String exprType = getExpressionType(ctx.expression());
                if (!isCompatibleType(varType, exprType)) {
                    errors.add("Tipo incompatível na atribuição: " + varName);
                }
            }
        }
    }

    @Override
    public void exitExpression(LangParser.ExpressionContext ctx) {
        if (ctx.VAR() != null) {  // Handle ++/-- in expressions
            String varName = ctx.VAR().getText();
            
            if (!declaredVariables.contains(varName)) {
                errors.add("Variável não declarada: " + varName);
                return;
            }
            
            String varType = variableTypes.get(varName);
            if (!isNumericType(varType)) {
                errors.add("Operador de incremento/decremento requer tipo numérico: " + varName);
            }
        }
    }

    @Override
    public void exitCond(LangParser.CondContext ctx) {
        if (ctx.RELOP() != null) {
            String leftType = getCondType(ctx.cond(0));
            String rightType = getCondType(ctx.cond(1));
            
            if (!isCompatibleType(leftType, rightType)) {
                errors.add("Tipos incompatíveis na comparação");
            }
        }
    }

    private String getCondType(LangParser.CondContext ctx) {
        if (ctx.expression() != null) {
            return getExpressionType(ctx.expression());
        }
        return "boolean";
    }

    @Override
    public void exitDowhilestmt(LangParser.DowhilestmtContext ctx) {
        validateCondition(ctx.cond());
    }

    @Override
    public void exitWhilestmt(LangParser.WhilestmtContext ctx) {
        validateCondition(ctx.cond());
    }

    @Override
    public void exitForstmt(LangParser.ForstmtContext ctx) {
        validateCondition(ctx.cond());
    }

    private void validateCondition(LangParser.CondContext ctx) {
        String condType = getCondType(ctx);
        if (ctx.expression() != null && !isNumericType(condType) && !condType.equals("boolean")) {
            errors.add("Condição deve ser numérica ou booleana");
        }
    }
}