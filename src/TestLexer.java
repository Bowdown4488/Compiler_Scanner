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
            System.out.println("\t" + getTokenType(token.getType(),token.getText()) + "\t\t" + token.getText());
            token = lexer.nextToken();
        }
    }
    static String[] keywords = {"abstrakto","boorean","bureko","byto","kesu","katchu","karu","kurasu","konst","kontinu","deporuto","do","doburu","erusu","enumu","extendo","finar","finarri","furoto","foru","ifu","iku","impremento","importo","insutaof","into","intefeseru","rongu","netivu","newu","pakeju","privatto","protekto","pubriko","returno","shorto","statiku","strictofp","supa","switchu","sinkuronaizu","disu","throwu","throwsu","transento","tryu","boido","voratiru","wairu"};
    private static String getTokenType(int tokenType,String tokenString) {

        switch (tokenType) {
            case SLexer.STRING:
                if (findKeyword(tokenString)){
                    return "Keywoard";
                }else{
                    return "String";
                }
            case SLexer.LPAREN:
                return "Separators";
            case SLexer.RPAREN:
                return "Separators";
            case SLexer.LBRACK:
                return "Separators";
            case SLexer.RBRACK:
                return "Separators";
            case SLexer.EQUALS:
                return "Operator";
            case SLexer.SEMICO:
                return "Separators";
            case SLexer.ASSIGN:
                return "Operator";
            default:
                return "OTHER";
        }
    }
    private static boolean findKeyword(String s){
        for(int i=0;i<keywords.length;i++){
            if(s.equals(keywords[i]))
                return true;
        }
        return false;
    }
}