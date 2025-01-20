package Lang;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

public class LangErrorListener extends BaseErrorListener {

    private boolean hasErrors = false;
    private final List<String> errorMessages = new ArrayList<>();

    public boolean hasErrors() {
        return hasErrors;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        hasErrors = true;
        // Mensagem de erro adaptada para o contexto da gramática "Lang"
        errorMessages.add("Erro de sintaxe na linha " 
                          + line 
                          + ", posição " 
                          + charPositionInLine 
                          + ": " 
                          + msg);
    }
}
