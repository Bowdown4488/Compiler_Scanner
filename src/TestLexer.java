import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class TestLexer {

    public static void main(String[] args) throws Exception {
        //System.out.println("Parsing: " + args[0]);

        //FileInputStream fis = new FileInputStream(new File(args[0]));
        String filename = "test.txt";
        CharStream input = fromFileName(filename);
        SLexer lexer = new SLexer(input);

        Token token = lexer.nextToken();
        while (token.getType() != SLexer.EOF) {
            System.out.println("\t" + getTokenType(token.getType()) + "\t\t" + token.getText());
            token = lexer.nextToken();
        }
    }

    private static String getTokenType(int tokenType) {
        switch (tokenType) {
            case SLexer.STRING:
                return "STRING";
            case SLexer.LPAREN:
                return "LPAREN";
            case SLexer.RPAREN:
                return "RPAREN";
            case SLexer.EQUALS:
                return "EQUALS";
            case SLexer.SEMICO:
                return "SEMICO";
            case SLexer.ASSIGN:
                return "ASSIGN";
            default:
                return "OTHER";
        }
    }
}