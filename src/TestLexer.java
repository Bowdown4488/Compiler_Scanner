import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class TestLexer {

    public static void main(String[] args) throws Exception {
        //FileInputStream fis = new FileInputStream(new File(args[0]));
        String filename = "test.txt";
        CharStream input = fromFileName(filename);
        SLexer lexer = new SLexer(input);

        Token token = lexer.nextToken();
        ArrayList<Token> tokens = new ArrayList<>();
        ArrayList<String> tokentypes = new ArrayList<>();
        while (token.getType() != SLexer.EOF) {
            tokens.add(token);
            tokentypes.add(getTokenType(token.getType(),token.getText()));
            token = lexer.nextToken();
        }
    }

    private static String getTokenType(int tokenType,String tokenString) {

        switch (tokenType) {
            case SLexer.KEYWORD:
                System.out.println("\t" +  tokenString + "\t\t" + "Keyword");
                return "Keyword";
            case SLexer.SEPARATOR:
                System.out.println("\t" +  tokenString + "\t\t" + "Separator");
                return "Separator";
            case SLexer.OPERATOR:
                System.out.println("\t" +  tokenString + "\t\t" + "Operator");
                return "Operator";
            case SLexer.Identifier:
                System.out.println("\t" +  tokenString + "\t\t" + "Identifier");
                return "Identifier";
            case SLexer.LITERAL:
                System.out.println("\t" +  tokenString + "\t\t" + "Literal");
                return "Literal";
            default:
                System.out.println("\t" +  tokenString + "\t\t" + "Other");
                return "Other";
        }
    }
}