package Lang;
import grammar.*;
import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LangInterpreter extends LangBaseVisitor<Object> {
    public Map<String, Object> variables = new HashMap<>();
    public Map<String, LangParser.FunctionContext> functions = new HashMap<>();
    public Map<String, Map<String, Object>> structs = new HashMap<>();
    public Map<String, Map<String, Object>> unions = new HashMap<>();
    public Map<String, Object> defines = new HashMap<>();
    public Scanner scanner = new Scanner(System.in);
    public boolean returnFlag = false;
    public Object returnValue = null;

    @Override
    public Object visitProg(LangParser.ProgContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        return null;
    }

    @Override
    public Object visitPreprocessorDirective(LangParser.PreprocessorDirectiveContext ctx) {
        // Handle include directives
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
    public Object visitFunction(LangParser.FunctionContext ctx) {
        String functionName = ctx.VAR() != null ? ctx.VAR().getText() : "main";
        functions.put(functionName, ctx);
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
    public Object visitAtrib(LangParser.AtribContext ctx) {
        String varName = ctx.VAR().getText();
        
        if (ctx.typeSpec() != null) {
            if (ctx.expression() != null) {
                variables.put(varName, visit(ctx.expression()));
            } else {
                variables.put(varName, null);
            }
        } else if (ctx.AT() != null) {
            variables.put(varName, visit(ctx.expression()));
        } else if (ctx.getText().contains("++")) {
            Object value = variables.get(varName);
            if (value instanceof Integer) {
                variables.put(varName, (Integer)value + 1);
            }
        } else if (ctx.getText().contains("--")) {
            Object value = variables.get(varName);
            if (value instanceof Integer) {
                variables.put(varName, (Integer)value - 1);
            }
        } else if (ctx.getText().contains("+=")) {
            Object value = variables.get(varName);
            Object exprValue = visit(ctx.expression());
            if (value instanceof Integer && exprValue instanceof Integer) {
                variables.put(varName, (Integer)value + (Integer)exprValue);
            }
        } else if (ctx.getText().contains("-=")) {
            Object value = variables.get(varName);
            Object exprValue = visit(ctx.expression());
            if (value instanceof Integer && exprValue instanceof Integer) {
                variables.put(varName, (Integer)value - (Integer)exprValue);
            }
        }
        return null;
    }

    @Override
    public Object visitArraydecl(LangParser.ArraydeclContext ctx) {
        String varName = ctx.VAR().getText();
        int size = Integer.parseInt(ctx.NUM().getText());
        Object[] array = new Object[size];
        
        if (ctx.arrayelems() != null) {
            List<LangParser.ExpressionContext> elems = ctx.arrayelems().expression();
            for (int i = 0; i < Math.min(size, elems.size()); i++) {
                array[i] = visit(elems.get(i));
            }
        }
        
        variables.put(varName, array);
        return null;
    }

    @Override
    public Object visitPointerdecl(LangParser.PointerdeclContext ctx) {
        String varName = ctx.VAR().getText();
        variables.put(varName, null);  // Initialize pointer as null
        return null;
    }

    @Override
    public Object visitPointerassign(LangParser.PointerassignContext ctx) {
        String pointerName = ctx.VAR(0).getText();
        String targetName = ctx.VAR(1).getText();
        variables.put(pointerName, variables.get(targetName));
        return null;
    }

// Substituir o método visitPointerdereference por:
    @Override
    public Object visitPointerdereference(LangParser.PointerdereferenceContext ctx) {
        String pointerName = ctx.VAR().getText();
        Object value = visit(ctx.expression());
        Object pointedValue = variables.get(pointerName);
        if (pointedValue != null) {
            variables.put((String)pointedValue, value);
        }
        return null;
    }
    @Override
    public Object visitStructdecl(LangParser.StructdeclContext ctx) {
        String structName = ctx.VAR().getText();
        Map<String, Object> fields = new HashMap<>();
        
        if (ctx.structfieldList() != null) {
            for (LangParser.StructfieldsContext field : ctx.structfieldList().structfields()) {
                String fieldName = field.VAR().getText();
                fields.put(fieldName, null);
            }
        }
        
        structs.put(structName, fields);
        return null;
    }

    @Override
    public Object visitStructdeclaration(LangParser.StructdeclarationContext ctx) {
        String structType = ctx.VAR(0).getText();
        String varName = ctx.VAR(1).getText();
        
        if (structs.containsKey(structType)) {
            Map<String, Object> newStruct = new HashMap<>(structs.get(structType));
            variables.put(varName, newStruct);
        }
        return null;
    }

    @Override 
    public Object visitUnionfields(LangParser.UnionfieldsContext ctx) {
        return null;
    }

    @Override
    public Object visitUniondecl(LangParser.UniondeclContext ctx) {
        String unionName = ctx.VAR().getText();
        Map<String, Object> fields = new HashMap<>();
        unions.put(unionName, fields);
        return null;
    }

    @Override
    public Object visitUniondeclaration(LangParser.UniondeclarationContext ctx) {
        String unionType = ctx.VAR(0).getText();
        String varName = ctx.VAR(1).getText();
        
        if (unions.containsKey(unionType)) {
            Map<String, Object> newUnion = new HashMap<>();
            variables.put(varName, newUnion);
        }
        return null;
    }

    @Override
    public Object visitInput(LangParser.InputContext ctx) {
        if (ctx.SCAN() != null) {
            String format = ctx.FORMATSTRING().getText().replace("\"", "");
            List<TerminalNode> vars = ctx.VAR();

            // Mostra prompt para o usuário saber o que está sendo pedido
            System.out.print("Digite os valores (" + format + "): ");

            // Processa cada variável na ordem
            for (int i = 0; i < vars.size(); i++) {
                String varName = vars.get(i).getText();
                
                // Verifica se a variável foi declarada
                if (!variables.containsKey(varName)) {
                    System.err.println("Erro: Variável '" + varName + "' não foi declarada.");
                    continue;
                }

                try {
                    if (format.contains("%d")) {
                        variables.put(varName, scanner.nextInt());
                    } else if (format.contains("%f")) {
                        variables.put(varName, scanner.nextDouble());
                    } else if (format.contains("%s")) {
                        variables.put(varName, scanner.next());
                    }
                    
                    // Mostra o valor lido
                    System.out.println(varName + " = " + variables.get(varName));
                    
                } catch (Exception e) {
                    System.err.println("Erro ao ler entrada para '" + varName + "': Entrada inválida.");
                    scanner.nextLine(); // Limpa o buffer
                }
            }
        }

        if (ctx.GETS() != null) {
            String varName = ctx.VAR().get(0).getText();
            
            if (!variables.containsKey(varName)) {
                System.err.println("Erro: Variável '" + varName + "' não foi declarada.");
                return null;
            }

            System.out.print("Digite um texto para " + varName + ": ");
            variables.put(varName, scanner.nextLine());
            
            // Mostra o valor lido
            System.out.println(varName + " = " + variables.get(varName));
        }

        return null;
    }
        
    
    @Override
    public Object visitOutput(LangParser.OutputContext ctx) {
        if (ctx.PRINT() != null) {
            String format = ctx.FORMATSTRING().getText().replace("\"", "");
            List<Object> values = new ArrayList<>();
            
            // Coleta e mostra os valores das expressões
            for (LangParser.ExpressionContext expr : ctx.expression()) {
                Object value = visit(expr);
                values.add(value);
                
                // Mostra cada valor sendo processado
                System.out.println("Processando valor: " + value);
            }

            try {
                // Mostra a saída formatada
                System.out.print("Saída: ");
                System.out.printf(format, values.toArray());
                System.out.println(); // Nova linha após a impressão
                
            } catch (Exception e) {
                System.err.println("Erro ao processar PRINTF: " + e.getMessage());
            }

        } else if (ctx.PUTS() != null) {
            String varName = ctx.VAR().getText();
            if (variables.containsKey(varName)) {
                Object value = variables.get(varName);
                System.out.println("PUTS " + varName + ": " + value);
            } else {
                System.err.println("Erro: Variável '" + varName + "' não foi declarada.");
            }
        }
        return null;
    }
        

    @Override
    public Object visitIfstmt(LangParser.IfstmtContext ctx) {
        Boolean condition = (Boolean) visit(ctx.cond());
        if (condition) {
            return visit(ctx.fnBlock(0));
        } else if (ctx.ELSE() != null) {
            return visit(ctx.fnBlock(1));
        }
        return null;
    }

    @Override
    public Object visitDowhilestmt(LangParser.DowhilestmtContext ctx) {
        do {
            visit(ctx.fnBlock());
            if (returnFlag) break;
        } while ((Boolean) visit(ctx.cond()));
        return null;
    }

    @Override
    public Object visitWhilestmt(LangParser.WhilestmtContext ctx) {
        while ((Boolean) visit(ctx.cond())) {
            visit(ctx.fnBlock());
            if (returnFlag) break;
        }
        return null;
    }

    @Override
    public Object visitForstmt(LangParser.ForstmtContext ctx) {
        visit(ctx.atrib(0));  // Initialization
        while ((Boolean) visit(ctx.cond())) {
            visit(ctx.fnBlock());
            if (returnFlag) break;
            visit(ctx.atrib(1));  // Increment/Update
        }
        return null;
    }

    @Override
    public Object visitSwitchstmt(LangParser.SwitchstmtContext ctx) {
        Object switchValue = variables.get(ctx.VAR().getText());
        boolean matched = false;
        
        if (ctx.caseClause() != null) {
            for (LangParser.CaseClauseContext caseCtx : ctx.caseClause()) {
                if (!matched && switchValue.equals(Integer.parseInt(caseCtx.NUM().getText()))) {
                    matched = true;
                    for (LangParser.LineContext line : caseCtx.line()) {
                        visit(line);
                        if (returnFlag) return null;
                    }
                }
            }
        }
        
        if (!matched && ctx.defaultClause() != null) {
            for (LangParser.LineContext line : ctx.defaultClause().line()) {
                visit(line);
                if (returnFlag) return null;
            }
        }
        
        return null;
    }

    @Override
    public Object visitCond(LangParser.CondContext ctx) {
        if (ctx.RELOP() != null) {
            Object left = visit(ctx.cond(0));
            Object right = visit(ctx.cond(1));
            String op = ctx.RELOP().getText();
            
            if (left instanceof Integer && right instanceof Integer) {
                int l = (Integer)left;
                int r = (Integer)right;
                switch (op) {
                    case "==": return l == r;
                    case "!=": return l != r;
                    case "<": return l < r;
                    case "<=": return l <= r;
                    case ">": return l > r;
                    case ">=": return l >= r;
                }
            }
        } else if (ctx.AND() != null) {
            return (Boolean)visit(ctx.cond(0)) && (Boolean)visit(ctx.cond(1));
        } else if (ctx.OR() != null) {
            return (Boolean)visit(ctx.cond(0)) || (Boolean)visit(ctx.cond(1));
        } else if (ctx.NOT() != null) {
            return !(Boolean)visit(ctx.cond(0));
        } else if (ctx.expression() != null) {
            Object result = visit(ctx.expression());
            if (result instanceof Integer) {
                return (Integer)result != 0;
            }
            return result != null;
        }
        return false;
    }

    @Override
    public Object visitExpression(LangParser.ExpressionContext ctx) {
        if (ctx.term() != null && !ctx.term().isEmpty()) {
            Object result = visit(ctx.term());
            
            for (int i = 0; i < ctx.termTail().size(); i++) {
                LangParser.TermContext nextTerm = ctx.term();
                Object term = visit(nextTerm);
                String op = ctx.termTail().get(i).getText();
                
                if (result instanceof Integer && term instanceof Integer) {
                    if (op.contains("+")) {
                        result = (Integer)result + (Integer)term;
                    } else if (op.contains("-")) {
                        result = (Integer)result - (Integer)term;
                    }
                } else if (result instanceof Double || term instanceof Double) {
                    double leftVal = (result instanceof Double) ? (Double)result : ((Integer)result).doubleValue();
                    double rightVal = (term instanceof Double) ? (Double)term : ((Integer)term).doubleValue();
                    
                    if (op.contains("+")) {
                        result = leftVal + rightVal;
                    } else if (op.contains("-")) {
                        result = leftVal - rightVal;
                    }
                }
            }
            return result;
        }
        
        if (ctx.VAR() != null) {
            String varName = ctx.VAR().getText();
            if (ctx.getText().contains("++")) {
                Object value = variables.get(varName);
                if (value instanceof Integer) {
                    variables.put(varName, (Integer)value + 1);
                    return value; // Return original value for post-increment
                }
            } else if (ctx.getText().contains("--")) {
                Object value = variables.get(varName);
                if (value instanceof Integer) {
                    variables.put(varName, (Integer)value - 1);
                    return value; // Return original value for post-decrement
                }
            }
        }
        return null;
    }

    @Override
    public Object visitTerm(LangParser.TermContext ctx) {
        if (ctx.factor() != null && !ctx.factor().isEmpty()) {
            Object result = visit(ctx.factor());
            
            for (int i = 0; i < ctx.factorTail().size(); i++) {
                LangParser.FactorContext nextFactor = ctx.factor();
                Object factor = visit(nextFactor);
                String op = ctx.factorTail(i).getText();
                
                if (result instanceof Integer && factor instanceof Integer) {
                    switch (op) {
                        case "*":
                            result = (Integer)result * (Integer)factor;
                            break;
                        case "/":
                            if ((Integer)factor != 0) {
                                result = (Integer)result / (Integer)factor;
                            } else {
                                throw new ArithmeticException("Division by zero");
                            }
                            break;
                        case "%":
                            if ((Integer)factor != 0) {
                                result = (Integer)result % (Integer)factor;
                            } else {
                                throw new ArithmeticException("Modulo by zero");
                            }
                            break;
                    }
                } else if (result instanceof Double || factor instanceof Double) {
                    double leftVal = (result instanceof Double) ? (Double)result : ((Integer)result).doubleValue();
                    double rightVal = (factor instanceof Double) ? (Double)factor : ((Integer)factor).doubleValue();
                    
                    switch (op) {
                        case "*":
                            result = leftVal * rightVal;
                            break;
                        case "/":
                            if (rightVal != 0) {
                                result = leftVal / rightVal;
                            } else {
                                throw new ArithmeticException("Division by zero");
                            }
                            break;
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
            if (variables.containsKey(varName)) {
                return variables.get(varName);
            } else if (defines.containsKey(varName)) {
                return defines.get(varName);
            }
            throw new RuntimeException("Variable not found: " + varName);
        } else if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        return null;
    }

    @Override
    public Object visitFuncinvoc(LangParser.FuncinvocContext ctx) {
        String functionName = ctx.VAR().getText();
        List<Object> args = new ArrayList<>();
        
        if (ctx.argumentos() != null) {
            for (LangParser.ExpressionContext expr : ctx.argumentos().expression()) {
                args.add(visit(expr));
            }
        }
        
        return executeFunction(functionName, args);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object visitStructaccess(LangParser.StructaccessContext ctx) {
        String structVar = ctx.VAR(0).getText();
        String field = ctx.VAR(1).getText();
        
        if (variables.containsKey(structVar)) {
            Map<String, Object> struct = (Map<String, Object>)variables.get(structVar);
            if (ctx.expression() != null) {
                struct.put(field, visit(ctx.expression()));
            }
            return struct.get(field);
        }
        throw new RuntimeException("Struct not found: " + structVar);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object visitUnionaccess(LangParser.UnionaccessContext ctx) {
        String unionVar = ctx.VAR(0).getText();
        String field = ctx.VAR(1).getText();
        
        if (variables.containsKey(unionVar)) {
            Map<String, Object> union = (Map<String, Object>)variables.get(unionVar);
            if (ctx.expression() != null) {
                Object value = visit(ctx.expression());
                union.clear();  // Clear all fields in union
                union.put(field, value);
            }
            return union.get(field);
        }
        throw new RuntimeException("Union not found: " + unionVar);
    }

    public Object executeFunction(String functionName, List<Object> args) {
        LangParser.FunctionContext functionCtx = functions.get(functionName);
        if (functionCtx == null) {
            throw new RuntimeException("Function " + functionName + " not found");
        }

        Map<String, Object> localVars = new HashMap<>();
        if (functionCtx.params() != null) {
            List<TerminalNode> paramVars = functionCtx.params().VAR();
            for (int i = 0; i < paramVars.size(); i++) {
                localVars.put(paramVars.get(i).getText(), args.get(i));
            }
        }

        Map<String, Object> oldVars = new HashMap<>(variables);
        variables.putAll(localVars);
        
        returnFlag = false;
        returnValue = null;
        
        visit(functionCtx.fnBlock());
        
        variables = oldVars;
        
        return returnValue;
    }
}