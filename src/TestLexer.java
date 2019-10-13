import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class TestLexer {

    public static void main(String[] args) throws Exception {
        //System.out.println("Parsing: " + args[0]);

        //FileInputStream fis = new FileInputStream(new File(args[0]));
        String filename = "test.txt";
        CharStream input = fromFileName(filename);
        SLexer lexer = new SLexer(input);

        Token token = lexer.nextToken();
        ArrayList<Token> tokens = new ArrayList<>();
        ArrayList<String> tokentypes = new ArrayList<>();
        while (token.getType() != SLexer.EOF) {
            //System.out.println("\t" + token.getText() + "\t\t\t\t"  + getTokenType(token.getType(),token.getText()));
            tokens.add(token);
            tokentypes.add(getTokenType(token.getType(),token.getText()));
            token = lexer.nextToken();
        }
        System.out.println(tokens.size()+" "+tokentypes.size());
        for(int i = 0;i<tokentypes.size();i++){

            if(tokentypes.get(i).equals("String")){
                boolean identifier = false;
                if(i-1>=0){
                    if(tokentypes.get(i-1).equals("Keyword")){
                        identifier = true;
                    }
                }else if(i+1!=tokens.size()){
                    if(tokentypes.get(i+1).equals("String"))
                        identifier = true;
                }

                if(identifier)
                    tokentypes.set(i,"Identifier");
                else
                    tokentypes.set(i,"Literal");
            }
            System.out.println("\t" + tokens.get(i).getText() + "\t\t\t\t"  +tokentypes.get(i));
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
            case SLexer.RPAREN:
            case SLexer.LBRACK:
            case SLexer.RBRACK:
            case SLexer.SEMICO:
                return "Separator";
            case SLexer.EQUALS:
            case SLexer.ASSIGN:
            case SLexer.LESSTN:
            case SLexer.GESSTN:
            case SLexer.NOTOPN:
            case SLexer.APPROX:
            case SLexer.OPTION:
            case SLexer.COLON:
            case SLexer.DEQUAL:
            case SLexer.LEQUAL:
            case SLexer.GEQUAL:
            case SLexer.NEQUAL:
            case SLexer.ANDD:
            case SLexer.ORR:
            case SLexer.INCR:
            case SLexer.DECR:
            case SLexer.ADD:
            case SLexer.MINUS:
            case SLexer.TIMES:
            case SLexer.DIVIDE:
            case SLexer.AND:
            case SLexer.OR:
            case SLexer.EXP:
            case SLexer.PERC:
            case SLexer.DLEFT:
            case SLexer.RIGHT:
            case SLexer.QRIGHT:
            case SLexer.PEQUAL:
            case SLexer.MEQUAL:
            case SLexer.TEQUAL:
            case SLexer.SEQUAL:
            case SLexer.AEQUAL:
            case SLexer.OEQUAL:
            case SLexer.EEQUAL:
            case SLexer.REQUAL:
            case SLexer.DLEQUAL:
            case SLexer.DRQUAL:
                return "Operator";
            default:
                return "OTHER";
        }
    }
    private static boolean findKeyword(String s){
        for(int i=0;i<keywords.length;i++){
            if(s.equalsIgnoreCase(keywords[i]))
                return true;
        }
        return false;
    }
}