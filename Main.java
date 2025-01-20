import Grammar.LangLexer;
import Grammar.LangParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import Lang.LangErrorListener;
import Lang.LangInterpreter;
import Lang.SemanticLangListener;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Você pode mudar o caminho do arquivo se quiser recebê-lo via args.
        String fileName = "input.lang";
        try {
            // 1. Criar o input stream a partir do arquivo
            CharStream inputStream = CharStreams.fromFileName(fileName);

            // 2. Criar o lexer
            LangLexer lexer = new LangLexer(inputStream);

            // 3. Criar o token stream
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            // 4. Criar o parser
            LangParser parser = new LangParser(tokenStream);

            // 5. Criar e registrar o errorListener
            LangErrorListener errorListener = new LangErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Se quiser, pode configurar a estratégia de erro:
            // parser.setErrorHandler(new DefaultErrorStrategy());
            // parser.setErrorHandler(new BailErrorStrategy());

            // 6. Criar e registrar o semanticListener
            SemanticLangListener semanticListener = new SemanticLangListener();
            // remover outros parse listeners, se houver
            parser.removeParseListeners();
            // registrar
            parser.addParseListener(semanticListener);

            // 7. Invocar a regra inicial do parser (prog)
            ParseTree tree = parser.prog();

            // 8. Verificar se houve erros de sintaxe
            if (errorListener.hasErrors()) {
                System.out.println("Errors!");
                for (String msg : errorListener.getErrorMessages()) {
                    System.out.println(msg);
                }
                return; // não prosseguir
            }

            // 9. Verificar erros semânticos
            if (semanticListener.hasErrors()) {
                System.out.println("Semantic Errors!");
                for (String msg : semanticListener.getErrorMessages()) {
                    System.out.println(msg);
                }
                return; // não prosseguir
            }

            // 10. Se não houve erros, criar o interpretador e visitar a árvore
            LangInterpreter interpreter = new LangInterpreter(semanticListener.getFunctions());
            interpreter.visit(tree);

        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        } catch (Exception e) {
            // qualquer outra exceção
            e.printStackTrace();
        }
    }
}
