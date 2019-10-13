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
            System.out.println("\t" + token.getText() + "\t\t\t\t"  + getTokenType(token.getType(),token.getText()));
            token = lexer.nextToken();
        }
    }
    static String[] keywords = {"abstrakto","boorean","bureko","byto","kesu","katchu","karu","kurasu","konst","kontinu","deporuto","do","doburu","erusu","enumu","extendo","finar","finarri","furoto","foru","ifu","iku","impremento","importo","insutaof","into","intefeseru","rongu","netivu","newu","pakeju","privatto","protekto","pubriko","returno","shorto","statiku","strictofp","supa","switchu","sinkuronaizu","disu","throwu","throwsu","transento","tryu","boido","voratiru","wairu"};
    private static String getTokenType(int tokenType,String tokenString) {

        switch (tokenType) {
            case SLexer.STRING:
                if (findKeyword(tokenString)){
                    return "Keyword";
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
            case SLexer.LESSTN:
                return "Operator";
            case SLexer.GESSTN:
                return "Operator";
            case SLexer.NOTOPN:
                return "Operator";
            case SLexer.APPROX:
                return "Operator";
            case SLexer.OPTION:
                return "Operator";
            case SLexer.COLON:
                return "Operator";
            case SLexer.DEQUAL:
                return "Operator";
            case SLexer.LEQUAL:
                return "Operator";
            case SLexer.GEQUAL:
                return "Operator";
            case SLexer.NEQUAL:
                return "Operator";
            case SLexer.ANDD:
                return "Operator";
            case SLexer.ORR:
                return "Operator";
            case SLexer.INCR:
                return "Operator";
            case SLexer.DECR:
                return "Operator";
            case SLexer.ADD:
                return "Operator";
            case SLexer.MINUS:
                return "Operator";
            case SLexer.TIMES:
                return "Operator";
            case SLexer.DIVIDE:
                return "Operator";
            case SLexer.AND:
                return "Operator";
            case SLexer.OR:
                return "Operator";
            case SLexer.EXP:
                return "Operator";
            case SLexer.PERC:
                return "Operator";
            case SLexer.DLEFT:
                return "Operator";
            case SLexer.RIGHT:
                return "Operator";
            case SLexer.QRIGHT:
                return "Operator";
            case SLexer.PEQUAL:
                return "Operator";
            case SLexer.MEQUAL:
                return "Operator";
            case SLexer.TEQUAL:
                return "Operator";
            case SLexer.SEQUAL:
                return "Operator";
            case SLexer.AEQUAL:
                return "Operator";
            case SLexer.OEQUAL:
                return "Operator";
            case SLexer.EEQUAL:
                return "Operator";
            case SLexer.REQUAL:
                return "Operator";
            case SLexer.DLEQUAL:
                return "Operator";
            case SLexer.DRQUAL:
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