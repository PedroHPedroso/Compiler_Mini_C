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
            errors.add("Structure not declared: " + structType);
            return;
        }
        
        currentScope.define(varName, "struct:" + structType);
        declaredVariables.add(varName);
        variableTypes.put(varName, "struct:" + structType);
    }

    

    @Override
    public void exitUniondeclaration(LangParser.UniondeclarationContext ctx) {
        String unionVar = ctx.VAR(0).getText();
        String instanceName = ctx.VAR(1).getText();
        
        // Verificar se o tipo union existe
        if (!declaredUnions.containsKey(unionVar)) {
            errors.add("Union type not declared: " + unionVar);
            return;
        }
        
        // Registrar a variável
        declaredVariables.add(instanceName);
        variableTypes.put(instanceName, "union:" + unionVar);
        currentScope.define(instanceName, "union:" + unionVar);
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
            errors.add("Number of arguments does not match format specifiers in scanf");
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
            errors.add("Number of arguments does not match format specifiers in printf");
        }
    }

    @Override
    public void exitArraydecl(LangParser.ArraydeclContext ctx) {
        String arrayName = ctx.VAR().getText();
        String arrayType = ctx.typeSpec().getText();
        
        if (declaredVariables.contains(arrayName)) {
            errors.add("Array already declared: " + arrayName);
            return;
        }
        
        try {
            int size = Integer.parseInt(ctx.NUM().getText());
            if (size <= 0) {
                errors.add("Array size must be positive: " + arrayName);
                return;
            }
            
            declaredVariables.add(arrayName);
            variableTypes.put(arrayName, arrayType + "[]");
            currentScope.define(arrayName, arrayType + "[]");
            
            if (ctx.arrayelems() != null) {
                validateArrayInitialization(ctx, arrayName, arrayType, size);
            }
        } catch (NumberFormatException e) {
            errors.add("Invalid array size: " + arrayName);
        }
    }

    private void validateArrayInitialization(LangParser.ArraydeclContext ctx, 
                                          String arrayName, 
                                          String arrayType, 
                                          int size) {
        List<LangParser.ExpressionContext> elements = ctx.arrayelems().expression();
        
        if (elements.size() > size) {
            errors.add("Initialization exceeds array size: " + arrayName);
            return;
        }
        
        for (LangParser.ExpressionContext element : elements) {
            String elementType = getExpressionType(element);
            if (!isCompatibleType(arrayType, elementType)) {
                errors.add("Incompatible type in array initialization: " + arrayName);
            }
        }
    }

    @Override
    public void exitPointerdecl(LangParser.PointerdeclContext ctx) {
        String pointerName = ctx.VAR().getText();
        String baseType = ctx.typeSpec().getText();
        
        if (declaredVariables.contains(pointerName)) {
            errors.add("Pointer already declared: " + pointerName);
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
            errors.add("Pointer not declared: " + pointerName);
            return;
        }
        
        if (!declaredVariables.contains(varName)) {
            errors.add("Variable not declared: " + varName);
            return;
        }
        
        String pointerType = variableTypes.get(pointerName);
        String varType = variableTypes.get(varName);
        
        if (!pointerType.endsWith("*")) {
            errors.add("Variable is not a pointer: " + pointerName);
            return;
        }
        
        String baseType = pointerType.substring(0, pointerType.length() - 1);
        if (!baseType.equals(varType)) {
            errors.add("Incompatible type in address assignment");
        }
    }

    @Override
    public void exitStructaccess(LangParser.StructaccessContext ctx) {
        String structVar = ctx.VAR(0).getText();
        String field = ctx.VAR(1).getText();
        
        if (!declaredVariables.contains(structVar)) {
            errors.add("Struct instance not declared: " + structVar);
            return;
        }
        
        String type = variableTypes.get(structVar);
        if (!type.startsWith("struct:")) {
            errors.add("Variable is not a struct: " + structVar);
            return;
        }
        
        String structType = type.substring(7);
        Map<String, String> fields = declaredStructs.get(structType);
        if (!fields.containsKey(field)) {
            errors.add("Field does not exist in struct: " + field);
            return;
        }
        
        if (ctx.expression() != null) {
            String exprType = getExpressionType(ctx.expression());
            String fieldType = fields.get(field);
            if (!isCompatibleType(fieldType, exprType)) {
                errors.add("Incompatible type in struct field assignment");
            }
        }
    }

    private String getExpressionType(LangParser.ExpressionContext expr) {
        if (expr == null) return "unknown";
        
        if (expr.term() != null) {
            String termType = getTermType(expr.term());
            
            for (LangParser.TermTailContext tail : expr.termTail()) {
                String nextTermType = getTermType(tail.term());
                if (isNumericType(termType) && isNumericType(nextTermType)) {
                    termType = getWidestType(termType, nextTermType);
                }
            }
            return termType;
        } else if (expr.VAR() != null) {
            String varName = expr.VAR().getText();
            String varType = currentScope.resolve(varName);
            
            // Se for uma union, verifica o tipo do campo atual
            if (varType != null && varType.startsWith("union:")) {
                String unionName = varType.substring(6);
                Map<String, String> fields = declaredUnions.get(unionName);
                if (fields != null) {
                    // Retorna o tipo do campo ativo
                    return fields.values().iterator().next();
                }
            }
            return varType;
        }
        return "unknown";
    }

    private String getTermType(LangParser.TermContext term) {
        if (term == null) return "unknown";
        
        if (term.factor() != null) {
            String factorType = getFactorType(term.factor());
            
            for (LangParser.FactorTailContext tail : term.factorTail()) {
                String nextFactorType = getFactorType(tail.factor());
                
                if (isNumericType(factorType) && isNumericType(nextFactorType)) {
                    factorType = getWidestType(factorType, nextFactorType);
                } else {
                    return "unknown";
                }
            }
            return factorType;
        }
        return "unknown";
    }

    private String getFactorType(LangParser.FactorContext factor) {
        if (factor == null) return "unknown";
        
        if (factor.NUM() != null) {
            return "int";
        } else if (factor.DECIM() != null) {
            return "float";
        } else if (factor.VAR() != null) {
            String varName = factor.VAR().getText();
            String varType = currentScope.resolve(varName);
            return varType != null ? varType : "unknown";
        } else if (factor.expression() != null) {
            return getExpressionType(factor.expression());
        } else if (factor.structaccess() != null) {
            String structVar = factor.structaccess().VAR(0).getText();
            String field = factor.structaccess().VAR(1).getText();
            String structType = variableTypes.get(structVar);
            
            if (structType != null && structType.startsWith("struct:")) {
                String structName = structType.substring(7);
                Map<String, String> fields = declaredStructs.get(structName);
                if (fields != null && fields.containsKey(field)) {
                    return fields.get(field);
                }
            }
        } else if (factor.unionaccess() != null) {
            String unionVar = factor.unionaccess().VAR(0).getText();
            String field = factor.unionaccess().VAR(1).getText();
            String unionType = variableTypes.get(unionVar);
            
            if (unionType != null && unionType.startsWith("union:")) {
                String unionName = unionType.substring(6);
                Map<String, String> fields = declaredUnions.get(unionName);
                if (fields != null && fields.containsKey(field)) {
                    return fields.get(field);
                }
            }
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
        
        // Adiciona suporte para unions
        if (expectedType.startsWith("union:") || actualType.startsWith("union:")) {
            String unionType = expectedType.startsWith("union:") ? expectedType : actualType;
            String otherType = expectedType.startsWith("union:") ? actualType : expectedType;
            
            String unionName = unionType.substring(6);
            Map<String, String> fields = declaredUnions.get(unionName);
            
            if (fields != null) {
                // Verifica se algum campo da union é compatível com o outro tipo
                return fields.values().stream().anyMatch(fieldType -> 
                    fieldType.equals(otherType) || isNumericType(fieldType) && isNumericType(otherType)
                );
            }
        }
        
        return isNumericType(expectedType) && isNumericType(actualType);
    }

    @Override
    public void exitFuncinvoc(LangParser.FuncinvocContext ctx) {
        String funcName = ctx.VAR().getText();
        
        // Check if function exists
        if (!declaredFunctions.containsKey(funcName)) {
            errors.add("Function not declared: " + funcName);
            return;
        }
        
        LangParser.FunctionContext funcDecl = declaredFunctions.get(funcName);
        LangParser.ParamsContext paramsDecl = funcDecl.params();
        List<LangParser.ExpressionContext> arguments = 
            ctx.argumentos() != null ? ctx.argumentos().expression() : new ArrayList<>();
        
        // Check number of arguments
        List<TerminalNode> declaredParams = paramsDecl != null ? paramsDecl.VAR() : new ArrayList<>();
        if (declaredParams.size() != arguments.size()) {
            errors.add("Incorrect number of arguments for function: " + funcName);
            return;
        }
        
        // Check argument types
        if (paramsDecl != null) {
            List<LangParser.TypeSpecContext> paramTypes = paramsDecl.typeSpec();
            for (int i = 0; i < arguments.size(); i++) {
                String expectedType = paramTypes.get(i).getText();
                String actualType = getExpressionType(arguments.get(i));
                
                if (!isCompatibleType(expectedType, actualType)) {
                    errors.add("Incompatible type in argument " + (i + 1) + 
                            " of function " + funcName);
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
            errors.add("Function already declared: " + funcName);
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
            errors.add("Program does not have a main function");
        }
    }

    @Override
    public void exitPreprocessorDirective(LangParser.PreprocessorDirectiveContext ctx) {
        String lib = ctx.LIB().getText();
        // Remove < and >
        lib = lib.substring(1, lib.length() - 1);
        
        if (includedLibs.contains(lib)) {
            errors.add("Library already included: " + lib);
            return;
        }
        
        includedLibs.add(lib);
    }

    @Override
    public void exitStructdecl(LangParser.StructdeclContext ctx) {
        String structName = ctx.VAR().getText();
        
        if (declaredStructs.containsKey(structName)) {
            errors.add("Structure already declared: " + structName);
            return;
        }
        
        Map<String, String> fields = new HashMap<>();
        if (ctx.structfieldList() != null) {
            for (LangParser.StructfieldsContext field : ctx.structfieldList().structfields()) {
                String fieldName = field.VAR().getText();
                String fieldType = field.typeSpec().getText();
                
                if (fields.containsKey(fieldName)) {
                    errors.add("Duplicate field in structure " + structName + ": " + fieldName);
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
            errors.add("Union already declared: " + unionName);
            return;
        }
        
        Map<String, String> fields = new HashMap<>();
        if (ctx.unionfieldList() != null) {
            for (LangParser.UnionfieldsContext field : ctx.unionfieldList().unionfields()) {
                String fieldName = field.VAR().getText();
                String fieldType = field.typeSpec().getText();
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
            errors.add("Union instance not declared: " + unionVar);
            return;
        }
        
        String type = variableTypes.get(unionVar);
        
        if (type == null || !type.startsWith("union:")) {
            errors.add("Variable is not a union: " + unionVar);
            return;
        }
        
        String unionType = type.substring(6);
        Map<String, String> fields = declaredUnions.get(unionType);
        
        if (fields == null || !fields.containsKey(field)) {
            errors.add("Field does not exist in union: " + field);
            return;
        }
        
        if (ctx.expression() != null) {
            String exprType = getExpressionType(ctx.expression());
            String fieldType = fields.get(field);
            
            if (!isCompatibleType(fieldType, exprType)) {
                errors.add("Incompatible type in union field assignment");
            }
        }
    }

    @Override
    public void exitSwitchstmt(LangParser.SwitchstmtContext ctx) {
        String varName = ctx.VAR().getText();
        
        if (!declaredVariables.contains(varName)) {
            errors.add("Variable not declared in switch: " + varName);
            return;
        }
        
        String varType = variableTypes.get(varName);
        if (!varType.equals("int") && !varType.equals("char")) {
            errors.add("Switch requires int or char variable");
        }
        
        Set<String> caseValues = new HashSet<>();
        for (LangParser.CaseClauseContext caseCtx : ctx.caseClause()) {
            String caseValue = caseCtx.NUM().getText();
            if (!caseValues.add(caseValue)) {
                errors.add("Duplicate case value: " + caseValue);
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
                errors.add("Variable already declared: " + varName);
                return;
            }
            
            declaredVariables.add(varName);
            variableTypes.put(varName, varType);
            currentScope.define(varName, varType);
            
            if (ctx.expression() != null) {
                String exprType = getExpressionType(ctx.expression());
                if (!isCompatibleType(varType, exprType)) {
                    errors.add("Incompatible type in variable initialization: " + varName);
                }
            }
        } 
        // Handle assignment to existing variable
        else {
            String varName = ctx.VAR().getText();
            
            if (!declaredVariables.contains(varName)) {
                errors.add("Variable not declared: " + varName);
                return;
            }
            
            String varType = variableTypes.get(varName);
            
            // Handle increment/decrement
            if (ctx.getText().contains("++") || ctx.getText().contains("--")) {
                if (!isNumericType(varType)) {
                    errors.add("Increment/decrement operator requires numeric type: " + varName);             }
            }
            // Handle compound assignments (+=, -=)
            else if (ctx.expression() != null) {
                String exprType = getExpressionType(ctx.expression());
                if (!isCompatibleType(varType, exprType)) {
                    errors.add("Incompatible type in assignment: " + varName);
                }
            }
        }
    }

    @Override
    public void exitExpression(LangParser.ExpressionContext ctx) {
        if (ctx.VAR() != null) {  // Handle ++/-- in expressions
            String varName = ctx.VAR().getText();
            
            if (!declaredVariables.contains(varName)) {
                errors.add("Variable not declared: " + varName);
                return;
            }
            
            String varType = variableTypes.get(varName);
            if (!isNumericType(varType)) {
                errors.add("Increment/decrement operator requires numeric type: " + varName);
            }
        }
    }

    @Override
    public void exitCond(LangParser.CondContext ctx) {
        if (ctx.RELOP() != null) {
            String leftType = getCondType(ctx.cond(0));
            String rightType = getCondType(ctx.cond(1));
            
            if (!isCompatibleType(leftType, rightType)) {
                errors.add("Incompatible types in comparison");
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
            errors.add("Condition must be numeric or boolean");
        }
    }
}