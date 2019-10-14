// Generated from D:/IdeaProjects/Compiler_Scanner-master/src\SLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLexerParser}.
 */
public interface SLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLexerParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SLexerParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLexerParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SLexerParser.KeywordContext ctx);
}