import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import Lang.*;
import Grammar.LangParser;
import Grammar.LangLexer;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Carregar o arquivo de entrada
            String inputFile = "input.lang";
            CharStream input = CharStreams.fromFileName(inputFile);

            // Lexer
            LangLexer lexer = new LangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Parser
            LangParser parser = new LangParser(tokens);
            LangErrorListener errorListener = new LangErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Árvore de Análise
            ParseTree tree = parser.prog();

            // Verificação de erros sintáticos
            if (errorListener.hasErrors()) {
                System.out.println("Erros de sintaxe encontrados:");
                errorListener.getErrorMessages().forEach(System.out::println);
                return;
            }

            // Listener Semântico
            SemanticLangListener semanticListener = new SemanticLangListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(semanticListener, tree);

            // Verificação de erros semânticos
            if (semanticListener.hasErrors()) {
                System.out.println("Erros semânticos encontrados:");
                semanticListener.getErrorMessages().forEach(System.out::println);
                return;
            }

            // Conversão de funções declaradas para o formato esperado pelo interpretador
            Map<String, ParseTree> convertedFunctions = new HashMap<>();
            for (Map.Entry<String, LangParser.FunctionContext> entry : semanticListener.getDeclaredFunctions().entrySet()) {
                convertedFunctions.put(entry.getKey(), entry.getValue());
            }

            // Interpretador
            LangInterpreter interpreter = new LangInterpreter(convertedFunctions);
            interpreter.visit(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
