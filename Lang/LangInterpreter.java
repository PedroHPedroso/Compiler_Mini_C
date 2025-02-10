package Lang;
import grammar.*;
import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LangInterpreter extends LangBaseVisitor<Object> {
    private Stack<Map<String, Object>> memoryStack = new Stack<>();
    private Map<String, LangParser.FunctionContext> functions = new HashMap<>();
    private Map<String, Object> defines = new HashMap<>();
    private boolean returnFlag = false;
    private Object returnValue = null;

    public LangInterpreter() {
        memoryStack.push(new HashMap<>());
    }

    public void executeProgram() {
        if (functions.containsKey("main")) {
            executeFunction("main", new ArrayList<>());
        } else {
            throw new RuntimeException("Error: function main() not found");
        }
    }


    @Override
    public Object visitFunction(LangParser.FunctionContext ctx) {
        String functionName = ctx.VAR() != null ? ctx.VAR().getText() : "main";
        functions.put(functionName, ctx);
        return null;
    }

    @Override
    public Object visitFuncinvoc(LangParser.FuncinvocContext ctx) {
        String functionName = ctx.VAR().getText();
        if (!functions.containsKey(functionName)) {
            throw new RuntimeException("Error: function '" + functionName + "' not declared.");
        }

        LangParser.FunctionContext functionCtx = functions.get(functionName);
        List<Object> args = new ArrayList<>();

        if (ctx.argumentos() != null) {
            for (LangParser.ExpressionContext expr : ctx.argumentos().expression()) {
                args.add(visit(expr));
            }
        }

        return executeFunction(functionName, args);
    }

    private Object executeFunction(String functionName, List<Object> args) {
        LangParser.FunctionContext functionCtx = functions.get(functionName);
        if (functionCtx == null) {
            throw new RuntimeException("Error: Function '" + functionName + "' not found.");
        }

        memoryStack.push(new HashMap<>());

        if (functionCtx.params() != null) {
            List<TerminalNode> paramVars = functionCtx.params().VAR();
            for (int i = 0; i < paramVars.size(); i++) {
                memoryStack.peek().put(paramVars.get(i).getText(), args.get(i));
            }
        }

        returnFlag = false;
        returnValue = null;
        visit(functionCtx.fnBlock());

        memoryStack.pop();
        return returnValue;
    }


    @Override
    public Object visitProg(LangParser.ProgContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        return null;
    }

    @Override
    public Object visitPreprocessorDirective(LangParser.PreprocessorDirectiveContext ctx) {
        return null;
    }

    @Override
    public Object visitGlobalVariable(LangParser.GlobalVariableContext ctx) {
        if (ctx.DEFINE() != null) {
            String name = ctx.VAR().getText();
            Object value = null;
            if (ctx.expression() != null) {
                value = visit(ctx.expression());
            }
            defines.put(name, value);
        }
        return null;
    }

    @Override
public Object visitAtrib(LangParser.AtribContext ctx) {
    String varName = ctx.VAR().getText();
    Map<String, Object> currentScope = memoryStack.peek();

    if (ctx.typeSpec() != null) {
        currentScope.put(varName, ctx.expression() != null ? visit(ctx.expression()) : null);
    } else if (ctx.AT() != null) {
        if (!currentScope.containsKey(varName)) {
            throw new RuntimeException("Error: Variable '" + varName + "' not declared.");
        }
        currentScope.put(varName, visit(ctx.expression()));
    } else if (ctx.getText().contains("+=")) {
        if (!currentScope.containsKey(varName)) {
            throw new RuntimeException("Error: Variable '" + varName + "' not declared.");
        }
        Object value = currentScope.get(varName);
        Object exprValue = visit(ctx.expression());
        if (value instanceof Integer && exprValue instanceof Integer) {
            currentScope.put(varName, (Integer)value + (Integer)exprValue);
        }
    } else if (ctx.getText().contains("-=")) {
        if (!currentScope.containsKey(varName)) {
            throw new RuntimeException("Error: Variable '" + varName + "' not declared.");
        }
        Object value = currentScope.get(varName);
        Object exprValue = visit(ctx.expression());
        if (value instanceof Integer && exprValue instanceof Integer) {
            currentScope.put(varName, (Integer)value - (Integer)exprValue);
        }
    } else if (ctx.getText().contains("++")) {
        if (!currentScope.containsKey(varName)) {
            throw new RuntimeException("Error: Variable '" + varName + "' not declared.");
        }
        Object value = currentScope.get(varName);
        if (value instanceof Integer) {
            currentScope.put(varName, (Integer)value + 1);
        }
    } else if (ctx.getText().contains("--")) {
        if (!currentScope.containsKey(varName)) {
            throw new RuntimeException("Error: Variable '" + varName + "' not declared.");
        }
        Object value = currentScope.get(varName);
        if (value instanceof Integer) {
            currentScope.put(varName, (Integer)value - 1);
        }
    }
    return null;
}

    @Override
    public Object visitFnBlock(LangParser.FnBlockContext ctx) {
        if (ctx.fnBodyList() != null) {
            visit(ctx.fnBodyList());
        }
        return null;
    }

    @Override
    public Object visitFnBodyList(LangParser.FnBodyListContext ctx) {
        for (LangParser.FnBodyItemContext item : ctx.fnBodyItem()) {
            visit(item);
            if (returnFlag) break;
        }
        return null;
    }

    @Override
    public Object visitFnBodyItem(LangParser.FnBodyItemContext ctx) {
        if (ctx.RETURN() != null) {
            returnFlag = true;
            returnValue = ctx.expression() != null ? visit(ctx.expression()) : null;
            return returnValue;
        }
        return visit(ctx.line());
    }

    @Override
    public Object visitLine(LangParser.LineContext ctx) {
        if (ctx.stmt() != null) return visit(ctx.stmt());
            if (ctx.ifstmt() != null) return visit(ctx.ifstmt());
                if (ctx.whilestmt() != null) return visit(ctx.whilestmt());
                    if (ctx.dowhilestmt() != null) return visit(ctx.dowhilestmt());
                if (ctx.forstmt() != null) return visit(ctx.forstmt());
            if (ctx.switchstmt() != null) return visit(ctx.switchstmt());
        if (ctx.fnBlock() != null) return visit(ctx.fnBlock());
    return null;
    }

    @Override
    public Object visitStmt(LangParser.StmtContext ctx) {
        if (ctx.atrib() != null) return visit(ctx.atrib());
            if (ctx.arraydecl() != null) return visit(ctx.arraydecl());
                if (ctx.pointerdecl() != null) return visit(ctx.pointerdecl());
                    if (ctx.pointerassign() != null) return visit(ctx.pointerassign());
                        if (ctx.pointerdereference() != null) return visit(ctx.pointerdereference());
                                if (ctx.structdeclaration() != null) return visit(ctx.structdeclaration());
                            if (ctx.structaccess() != null) return visit(ctx.structaccess());
                        if (ctx.uniondeclaration() != null) return visit(ctx.uniondeclaration());
                    if (ctx.unionaccess() != null) return visit(ctx.unionaccess());
                if (ctx.input() != null) return visit(ctx.input());
            if (ctx.output() != null) return visit(ctx.output());
        if (ctx.funcinvoc() != null) return visit(ctx.funcinvoc());
    return null;
    }

    @Override
    public Object visitArraydecl(LangParser.ArraydeclContext ctx) {
        String arrayName = ctx.VAR().getText();
        int size = Integer.parseInt(ctx.NUM().getText());
        List<Object> elements = new ArrayList<>(Collections.nCopies(size, null));
    
        if (ctx.arrayelems() != null) { 
            List<LangParser.ExpressionContext> exprs = ctx.arrayelems().expression();
            for (int i = 0; i < exprs.size(); i++) {
                elements.set(i, visit(exprs.get(i)));
            }
        }
    
        memoryStack.peek().put(arrayName, elements);
        return null;
    }

    private Map<String, String> pointerReferences = new HashMap<>();

    @Override
    public Object visitPointerdecl(LangParser.PointerdeclContext ctx) {
        String pointerName = ctx.VAR().getText();
        pointerReferences.put(pointerName, null);
        return null;
    }
    

    @Override
    public Object visitPointerassign(LangParser.PointerassignContext ctx) {
        String pointerName = ctx.VAR(0).getText();
        String targetVariable = ctx.VAR(1).getText();

        if (!memoryStack.peek().containsKey(targetVariable)) {
            throw new RuntimeException("Error: Variable '" + targetVariable + "' not declared.");
        }

        pointerReferences.put(pointerName, targetVariable);
        return null;
    }


    @Override
    public Object visitPointerdereference(LangParser.PointerdereferenceContext ctx) {
        String pointerName = ctx.VAR().getText();
        
        if (!pointerReferences.containsKey(pointerName) || pointerReferences.get(pointerName) == null) {
            throw new RuntimeException("Error: Pointer '" + pointerName + "' is not pointing to any variable.");
        }
    
        String targetVariable = pointerReferences.get(pointerName);
        Object value = visit(ctx.expression());
        memoryStack.peek().put(targetVariable, value);
        return null;
    }
    

    private Map<String, Map<String, Object>> structs = new HashMap<>();

    @Override
    public Object visitStructdecl(LangParser.StructdeclContext ctx) {
        String structName = ctx.VAR().getText();
        Map<String, Object> structFields = new HashMap<>();
    
        for (LangParser.StructfieldsContext fieldCtx : ctx.structfieldList().structfields()) {
            structFields.put(fieldCtx.VAR().getText(), null);
        }
    
        structs.put(structName, structFields);
        return null;
    }
    
    @Override
    public Object visitStructdeclaration(LangParser.StructdeclarationContext ctx) {
        String structName = ctx.VAR(0).getText();
        String instanceName = ctx.VAR(1).getText();

        if (!structs.containsKey(structName)) {
            throw new RuntimeException("Error: Struct '" + structName + "' not declared.");
        }

        Map<String, Object> instance = new HashMap<>(structs.get(structName));
        memoryStack.peek().put(instanceName, instance);
        return null;
    }

    @SuppressWarnings("unchecked")
@Override
public Object visitStructaccess(LangParser.StructaccessContext ctx) {
    String structInstance = ctx.VAR(0).getText();
    String fieldName = ctx.VAR(1).getText();
    
    Map<String, Object> currentScope = memoryStack.peek();
    if (!currentScope.containsKey(structInstance)) {
        throw new RuntimeException("Struct instance not declared: " + structInstance);
    }

    Map<String, Object> instance = (Map<String, Object>) currentScope.get(structInstance);
    if (!instance.containsKey(fieldName)) {
        throw new RuntimeException("Field does not exist in struct: " + fieldName);
    }

    if (ctx.AT() != null) {
        Object value = visit(ctx.expression());
        instance.put(fieldName, value);
        return null;
    } else { 
        Object value = instance.get(fieldName);
        return value;
    }
}



    @Override 
    public Object visitUnionfields(LangParser.UnionfieldsContext ctx) {
        return null;
    }
    private Map<String, String> unionTypes = new HashMap<>();  

    @Override
    public Object visitUniondecl(LangParser.UniondeclContext ctx) {
        String unionName = ctx.VAR().getText();
        unionTypes.put(unionName, null); 
        return null;
    }
    

    private Map<String, Object> unionInstances = new HashMap<>(); 

    @Override
    public Object visitUniondeclaration(LangParser.UniondeclarationContext ctx) {
        String unionName = ctx.VAR(0).getText();
        String instanceName = ctx.VAR(1).getText();
    
        if (!unionTypes.containsKey(unionName)) {
            throw new RuntimeException("Error: Union '" + unionName + "' not declared.");
        }
    
        memoryStack.peek().put(instanceName, null);
        return null;
    }
    
    @Override
    public Object visitUnionaccess(LangParser.UnionaccessContext ctx) {
        String unionInstance = ctx.VAR(0).getText();
        String fieldName = ctx.VAR(1).getText();
        
        Map<String, Object> currentScope = memoryStack.peek();
        if (!currentScope.containsKey(unionInstance)) {
            throw new RuntimeException("Union instance not declared: " + unionInstance);
        }

        if (ctx.AT() != null) { 
            Object value = visit(ctx.expression());
            currentScope.put(unionInstance, value);
            unionTypes.put(unionInstance, fieldName);
            return null;
        } else {
            if (!unionTypes.containsKey(unionInstance)) {
                throw new RuntimeException("Union has no active field: " + unionInstance);
            }
            Object value = currentScope.get(unionInstance);
            return value;
        }
    }
    
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Object visitInput(LangParser.InputContext ctx) {
        if (ctx.SCAN() != null) {
            String format = ctx.FORMATSTRING().getText().replace("\"", "");
            List<TerminalNode> vars = ctx.VAR();
            
            for (int i = 0; i < vars.size(); i++) {
                String varName = vars.get(i).getText();
                Map<String, Object> currentScope = memoryStack.peek();
                
                if (!currentScope.containsKey(varName)) {
                    throw new RuntimeException("Error: Variable '" + varName + "' not declared");
                }
    
                System.out.print(">");
                
                try {
                    if (format.contains("%d") || format.contains("%i")) {
                        currentScope.put(varName, scanner.nextInt());
                    } else if (format.contains("%f")) {
                        currentScope.put(varName, scanner.nextDouble());
                    } else if (format.contains("%s")) {
                        currentScope.put(varName, scanner.next());
                    } else if (format.contains("%c")) {
                        currentScope.put(varName, scanner.next().charAt(0));
                    }
                } catch (InputMismatchException e) {
                    throw new RuntimeException("Error: Invalid input format for variable '" + varName + "'");
                }
            }
        } else if (ctx.GETS() != null) {
            String varName = ctx.VAR(0).getText();
            Map<String, Object> currentScope = memoryStack.peek();
            
            if (!currentScope.containsKey(varName)) {
                throw new RuntimeException("Error: Variable '" + varName + "' not declared");
            }
    
            System.out.print("");
            currentScope.put(varName, scanner.nextLine());
        }
        return null;
    }

    public void cleanup() {
        if (scanner != null) {
            scanner.close();
        }
    }

    @Override
    public Object visitOutput(LangParser.OutputContext ctx) {
        if (ctx.PRINT() != null) {
            String format = ctx.FORMATSTRING().getText().replace("\"", "");
            List<Object> values = new ArrayList<>();
            
            for (LangParser.ExpressionContext expr : ctx.expression()) {
                Object value = visit(expr);
                values.add(value);
            }

            values.removeIf(v -> v == null);
            
            if (!values.isEmpty()) {
                System.out.printf(format, values.toArray());
                System.out.println();
            } else {
                System.out.print(format);
                System.out.println();
            }
        } else if (ctx.PUTS() != null) {
            String varName = ctx.VAR().getText();
            Map<String, Object> currentScope = memoryStack.peek();
            if (!currentScope.containsKey(varName)) {
                throw new RuntimeException("Variable not declared: " + varName);
            }
            Object value = currentScope.get(varName);
            if (value != null) {
                System.out.print(value);
                System.out.println();
            }
        }
        return null;
    }

    @Override
    public Object visitIfstmt(LangParser.IfstmtContext ctx) {
        Object condResult = visit(ctx.cond());
        
        if (Boolean.TRUE.equals(condResult)) {
            visit(ctx.fnBlock(0));
        } else if (ctx.ELSE() != null) {
            visit(ctx.fnBlock(1));
        }
        return null;
    }

    @Override
    public Object visitDowhilestmt(LangParser.DowhilestmtContext ctx) {
        do {
            visit(ctx.fnBlock());
        } while ((Boolean) visit(ctx.cond()));
        return null;
    }
    

    @Override
    public Object visitWhilestmt(LangParser.WhilestmtContext ctx) {
        while (Boolean.TRUE.equals(visit(ctx.cond()))) {
            visit(ctx.fnBlock());
        }
        return null;
    }
    

    @Override
    public Object visitForstmt(LangParser.ForstmtContext ctx) {
        visit(ctx.atrib(0));  // inicialização
        
        while (true) {
            Object condResult = visit(ctx.cond());
            
            if (!(condResult instanceof Boolean && (Boolean)condResult)) {
                break;
            }
            
            visit(ctx.fnBlock());
            visit(ctx.atrib(1));  // incremento
        }
        return null;
    }

    @Override
    public Object visitSwitchstmt(LangParser.SwitchstmtContext ctx) {
        String varName = ctx.VAR().getText();
        Map<String, Object> currentScope = memoryStack.peek();
        
        if (!currentScope.containsKey(varName)) {
            throw new RuntimeException("Error: Variable '" + varName + "' not declared in switch");
        }
        
        Object switchValue = currentScope.get(varName);
        if (switchValue == null) {
            throw new RuntimeException("Error: Variable '" + varName + "' not initialized");
        }
        
        boolean breakEncountered = false;
        
        for (LangParser.CaseClauseContext caseCtx : ctx.caseClause()) {
            int caseValue = Integer.parseInt(caseCtx.NUM().getText());
            
            if (switchValue instanceof Integer && ((Integer)switchValue).intValue() == caseValue) {
                for (LangParser.LineContext lineCtx : caseCtx.line()) {
                    visit(lineCtx);
                }
                breakEncountered = true;
                break;
            }
        }
        
        if (!breakEncountered && ctx.defaultClause() != null) {
            for (LangParser.LineContext lineCtx : ctx.defaultClause().line()) {
                visit(lineCtx);
            }
        }
        
        return null;
    }
    

    @Override
    public Object visitExpression(LangParser.ExpressionContext ctx) {
        if (ctx.term() != null) {
            Object result = visit(ctx.term());
            
            for (LangParser.TermTailContext termTail : ctx.termTail()) {
                Object nextTerm = visit(termTail.term());
                String op = termTail.getStart().getText();
                
                if (result instanceof Integer && nextTerm instanceof Integer) {
                    int left = (Integer)result;
                    int right = (Integer)nextTerm;
                    switch (op) {
                        case "+": result = left + right; break;
                        case "-": result = left - right; break;
                    }
                }
            }
            return result;
        } else if (ctx.VAR() != null) {
            String varName = ctx.VAR().getText();
            Map<String, Object> currentScope = memoryStack.peek();
            
            if (!currentScope.containsKey(varName)) {
                throw new RuntimeException("Error: Variable '" + varName + "' not declared");
            }
            
            Object value = currentScope.get(varName);
            return value;
        } else if (ctx.term().factor() != null && ctx.term().factor().structaccess() != null) {
            return visit(ctx.term().factor().structaccess());
        }
        return null;
    }

    @Override
    public Object visitCond(LangParser.CondContext ctx) {
        if (ctx.RELOP() != null) {
            Object left = visit(ctx.cond(0).expression());
            Object right = visit(ctx.cond(1).expression());
            String op = ctx.RELOP().getText();
            
            if (left == null || right == null) {
                throw new RuntimeException("Error: Null value in comparison");
            }

            int l, r;
            if (left instanceof Boolean) {
                l = ((Boolean)left) ? 1 : 0;
            } else {
                l = left instanceof Integer ? (Integer)left : 0;
            }
            
            if (right instanceof Boolean) {
                r = ((Boolean)right) ? 1 : 0;
            } else {
                r = right instanceof Integer ? (Integer)right : 0;
            }
            
            boolean result;
            switch (op) {
                case "!=": result = l != r; break;
                case "==": result = l == r; break;
                case "<": result = l < r; break;
                case "<=": result = l <= r; break;
                case ">": result = l > r; break;
                case ">=": result = l >= r; break;
                default: throw new RuntimeException("Error: Unknown operator: " + op);
            }
            
            return result;
        } else if (ctx.expression() != null) {
            Object result = visit(ctx.expression());

            if (result instanceof Integer) {
                return ((Integer)result) != 0;
            } else if (result instanceof Boolean) {
                return result;
            }
            return result != null;
        }
        return false;
    }

    @Override
    public Object visitTerm(LangParser.TermContext ctx) {
        if (ctx.factor() != null) {
            Object result = visit(ctx.factor());
            
            for (LangParser.FactorTailContext factorTail : ctx.factorTail()) {
                Object factor = visit(factorTail.factor());
                
                if (result instanceof Integer && factor instanceof Integer) {
                    int left = (Integer)result;
                    int right = (Integer)factor;
                    
                    String operator = factorTail.getStart().getText();
                    
                    if (operator.equals("*")) {
                        result = left * right;
                    } else if (operator.equals("/")) {
                        if (right == 0) {
                            throw new RuntimeException("Error: Division by zero");
                        }
                        result = left / right;
                    } else if (operator.equals("%")) {
                        if (right == 0) {
                            throw new RuntimeException("Error: Modulo by zero");
                        }
                        result = left % right;
                    }
                }
            }
            return result;
        }
        return null;
    }

    @Override
    public Object visitFactor(LangParser.FactorContext ctx) {
        if (ctx.NUM() != null) {
            return Integer.parseInt(ctx.NUM().getText());
        } else if (ctx.DECIM() != null) {
            return Double.parseDouble(ctx.DECIM().getText());
        } else if (ctx.VAR() != null) {
            String varName = ctx.VAR().getText();
            Map<String, Object> currentScope = memoryStack.peek();
            
            if (currentScope.containsKey(varName)) {
                return currentScope.get(varName);
            } else if (defines.containsKey(varName)) {
                return defines.get(varName);
            }
            throw new RuntimeException("Error: Variable '" + varName + "' not found");
        } else if (ctx.expression() != null) {
            return visit(ctx.expression());
        } else if (ctx.structaccess() != null) {
            return visit(ctx.structaccess());
        } else if (ctx.unionaccess() != null) {
            return visit(ctx.unionaccess());
        }
        return null;
    }
}