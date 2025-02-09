import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import grammar.LangParser;
import grammar.LangLexer;
import Lang.*;

public class Main {
    public static void main(String[] args) {       
        try {
            String inputFile = "input2.lang";
            
            // Carrega o arquivo
            CharStream input = CharStreams.fromFileName(inputFile);
            
            // Inicializa o Lexer
            LangLexer lexer = new LangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Inicializa o Parser com tratamento de erros personalizado
            LangParser parser = new LangParser(tokens);
            LangErrorListener errorListener = new LangErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            ParseTree tree = parser.prog();
            
            // Verifica erros sintáticos
            if (errorListener.hasErrors()) {
                System.out.println("\nErros de sintaxe encontrados:");
                for (String error : errorListener.getErrors()) {
                    System.out.println("  - " + error);
                }
                return;
            }
            SemanticLangListener semanticListener = new SemanticLangListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(semanticListener, tree);
            
            // Verifica erros semânticos
            if (semanticListener.hasErrors()) {
                System.out.println("\nErros semânticos encontrados:");
                for (String error : semanticListener.getErrors()) {
                    System.out.println("  - " + error);
                }
                return;
            }
            LangInterpreter interpreter = new LangInterpreter();
            
            // Transfere as informações do Listener para o Interpreter
            interpreter.functions = semanticListener.declaredFunctions;
            
            // Transfere structs e unions com type safety
            interpreter.structs = new HashMap<>();
            semanticListener.declaredStructs.forEach((key, value) ->interpreter.structs.put(key, new HashMap<>(value)));
            
            interpreter.unions = new HashMap<>();
            semanticListener.declaredUnions.forEach((key, value) ->interpreter.unions.put(key, new HashMap<>(value)));
            
            // Executa o interpretador
            System.out.println("=== Saída do Programa ===\n");
            interpreter.visit(tree);
            System.out.println("\n=== Fim da Execução ===");
            
        } catch (Exception e) {
            System.err.println("\nErro durante a execução:");
            System.err.println("  - " + e.getMessage());
            e.printStackTrace();
        }
    }
}