// Generated from D:/IdeaProjects/Compiler_Scanner-master/src\SLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, STRING=50, WS=51, LINE_COMMENT=52, 
		LPAREN=53, RPAREN=54, EQUALS=55, SEMICO=56, ASSIGN=57, LBRACK=58, RBRACK=59, 
		LESSTN=60, GESSTN=61, NOTOPN=62, APPROX=63, OPTION=64, COLON=65, DEQUAL=66, 
		LEQUAL=67, GEQUAL=68, NEQUAL=69, ANDD=70, ORR=71, INCR=72, DECR=73, ADD=74, 
		MINUS=75, TIMES=76, DIVIDE=77, AND=78, OR=79, EXP=80, PERC=81, DLEFT=82, 
		RIGHT=83, QRIGHT=84, PEQUAL=85, MEQUAL=86, TEQUAL=87, SEQUAL=88, AEQUAL=89, 
		OEQUAL=90, EEQUAL=91, REQUAL=92, DLEQUAL=93, DRQUAL=94, Identifier=95, 
		IntegerLiteral=96, FloatingPointLiteral=97, BooleanLiteral=98, CharacterLiteral=99, 
		StringLiteral=100, NullLiteral=101;
	public static final int
		RULE_keyword = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"keyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstrakto'", "'boorean'", "'bureko'", "'byto'", "'kesu'", "'katchu'", 
			"'karu'", "'kurasu'", "'konst'", "'kontinu'", "'deporuto'", "'do'", "'doburu'", 
			"'erusu'", "'enumu'", "'extendo'", "'finar'", "'finarri'", "'furoto'", 
			"'foru'", "'ifu'", "'iku'", "'impremento'", "'importo'", "'insutaof'", 
			"'into'", "'intefeseru'", "'rongu'", "'netivu'", "'newu'", "'pakeju'", 
			"'privatto'", "'protekto'", "'pubriko'", "'returno'", "'shorto'", "'statiku'", 
			"'strictofp'", "'supa'", "'switchu'", "'sinkuronaizu'", "'disu'", "'throwu'", 
			"'throwsu'", "'transento'", "'tryu'", "'boido'", "'voratiru'", "'wairu'", 
			null, null, null, "'('", "')'", "'='", "';'", "':='", "'{'", "'}'", "'<'", 
			"'>'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'<<'", "'>>'", "'>>>>'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'%='", "'<<='", "'>>='", null, null, null, null, null, 
			null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "WS", "LINE_COMMENT", "LPAREN", "RPAREN", "EQUALS", 
			"SEMICO", "ASSIGN", "LBRACK", "RBRACK", "LESSTN", "GESSTN", "NOTOPN", 
			"APPROX", "OPTION", "COLON", "DEQUAL", "LEQUAL", "GEQUAL", "NEQUAL", 
			"ANDD", "ORR", "INCR", "DECR", "ADD", "MINUS", "TIMES", "DIVIDE", "AND", 
			"OR", "EXP", "PERC", "DLEFT", "RIGHT", "QRIGHT", "PEQUAL", "MEQUAL", 
			"TEQUAL", "SEQUAL", "AEQUAL", "OEQUAL", "EEQUAL", "REQUAL", "DLEQUAL", 
			"DRQUAL", "Identifier", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
			"CharacterLiteral", "StringLiteral", "NullLiteral"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLexerListener ) ((SLexerListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLexerListener ) ((SLexerListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLexerVisitor ) return ((SLexerVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3g\7\4\2\t\2\3\2\3"+
		"\2\3\2\2\2\3\2\2\3\3\2\3\63\2\5\2\4\3\2\2\2\4\5\t\2\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}