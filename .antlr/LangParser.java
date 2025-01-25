// Generated from c:/Users/pedro/OneDrive/Área de Trabalho/Compilador/Lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, DO=19, WHILE=20, FOR=21, IF=22, RETURN=23, ELSE=24, SWITCH=25, 
		CASE=26, DEFAULT=27, BREAK=28, PRINTF=29, PUTS=30, SCANF=31, GETS=32, 
		EQ=33, NE=34, LT=35, GT=36, LE=37, GE=38, AND=39, OR=40, NOT=41, PLUS=42, 
		MINUS=43, MULT=44, DIV=45, AT=46, SEP=47, EOL=48, STR=49, NUM=50, DECIM=51, 
		VAR=52, COMMENT_LINE=53, COMMENT_BLOCK=54, WS=55;
	public static final int
		RULE_prog = 0, RULE_functions = 1, RULE_function = 2, RULE_fnBlock = 3, 
		RULE_fnBody = 4, RULE_params = 5, RULE_line = 6, RULE_stmt = 7, RULE_funcInvoc = 8, 
		RULE_args = 9, RULE_input = 10, RULE_output = 11, RULE_ifst = 12, RULE_dowhilest = 13, 
		RULE_whilest = 14, RULE_forst = 15, RULE_switchst = 16, RULE_caseClause = 17, 
		RULE_defClause = 18, RULE_block = 19, RULE_cond = 20, RULE_atrib = 21, 
		RULE_typeSpec = 22, RULE_expr = 23, RULE_term = 24, RULE_factor = 25, 
		RULE_preprocessor = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "functions", "function", "fnBlock", "fnBody", "params", "line", 
			"stmt", "funcInvoc", "args", "input", "output", "ifst", "dowhilest", 
			"whilest", "forst", "switchst", "caseClause", "defClause", "block", "cond", 
			"atrib", "typeSpec", "expr", "term", "factor", "preprocessor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'int'", "'main'", "'{'", "'}'", "'&'", "':'", "'['", 
			"']'", "'++'", "'--'", "'float'", "'double'", "'char'", "'void'", "'#include'", 
			"'#define'", "'do'", "'while'", "'for'", "'if'", "'return'", "'else'", 
			"'switch'", "'case'", "'default'", "'break'", "'printf'", "'puts'", "'scanf'", 
			"'gets'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", 
			"'!'", "'+'", "'-'", "'*'", "'/'", "'='", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "DO", "WHILE", "FOR", "IF", 
			"RETURN", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "PRINTF", "PUTS", 
			"SCANF", "GETS", "EQ", "NE", "LT", "GT", "LE", "GE", "AND", "OR", "NOT", 
			"PLUS", "MINUS", "MULT", "DIV", "AT", "SEP", "EOL", "STR", "NUM", "DECIM", 
			"VAR", "COMMENT_LINE", "COMMENT_BLOCK", "WS"
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgLineContext extends ProgContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public List<PreprocessorContext> preprocessor() {
			return getRuleContexts(PreprocessorContext.class);
		}
		public PreprocessorContext preprocessor(int i) {
			return getRuleContext(PreprocessorContext.class,i);
		}
		public ProgLineContext(ProgContext ctx) { copyFrom(ctx); }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__17) {
				{
				{
				setState(54);
				preprocessor();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			functions();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				function();
				setState(63);
				functions();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RandomFunctionContext extends FunctionContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public RandomFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MainFunctionContext extends FunctionContext {
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public MainFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new RandomFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				typeSpec();
				setState(69);
				match(VAR);
				setState(70);
				match(T__0);
				setState(71);
				params();
				setState(72);
				match(T__1);
				setState(73);
				fnBlock();
				}
				break;
			case 2:
				_localctx = new MainFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__2);
				setState(76);
				match(T__3);
				setState(77);
				match(T__0);
				setState(78);
				match(T__1);
				setState(79);
				fnBlock();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FnBlockContext extends ParserRuleContext {
		public FnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBlock; }
	 
		public FnBlockContext() { }
		public void copyFrom(FnBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBlockLineContext extends FnBlockContext {
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public FnBlockLineContext(FnBlockContext ctx) { copyFrom(ctx); }
	}

	public final FnBlockContext fnBlock() throws RecognitionException {
		FnBlockContext _localctx = new FnBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fnBlock);
		try {
			_localctx = new FnBlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__4);
			setState(83);
			fnBody();
			setState(84);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyContext extends ParserRuleContext {
		public FnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBody; }
	 
		public FnBodyContext() { }
		public void copyFrom(FnBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnReturnLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public FnReturnLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyLineContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnReturnExprLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public FnReturnExprLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyLineMoreContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public FnBodyLineMoreContext(FnBodyContext ctx) { copyFrom(ctx); }
	}

	public final FnBodyContext fnBody() throws RecognitionException {
		FnBodyContext _localctx = new FnBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fnBody);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new FnBodyLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				line();
				}
				break;
			case 2:
				_localctx = new FnBodyLineMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				line();
				setState(88);
				fnBody();
				}
				break;
			case 3:
				_localctx = new FnReturnExprLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(RETURN);
				setState(91);
				expr();
				setState(92);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new FnReturnLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(RETURN);
				setState(95);
				match(EOL);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode SEP() { return getToken(LangParser.SEP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				typeSpec();
				setState(99);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				typeSpec();
				setState(102);
				match(VAR);
				setState(103);
				match(SEP);
				setState(104);
				params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineWhileContext extends LineContext {
		public WhilestContext whilest() {
			return getRuleContext(WhilestContext.class,0);
		}
		public LineWhileContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineEOLContext extends LineContext {
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineEOLContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineStmtContext extends LineContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineStmtContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockCommentContext extends LineContext {
		public TerminalNode COMMENT_BLOCK() { return getToken(LangParser.COMMENT_BLOCK, 0); }
		public BlockCommentContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineIfContext extends LineContext {
		public IfstContext ifst() {
			return getRuleContext(IfstContext.class,0);
		}
		public LineIfContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineDoWhileContext extends LineContext {
		public DowhilestContext dowhilest() {
			return getRuleContext(DowhilestContext.class,0);
		}
		public LineDoWhileContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineSwitchContext extends LineContext {
		public SwitchstContext switchst() {
			return getRuleContext(SwitchstContext.class,0);
		}
		public LineSwitchContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineBlockContext extends LineContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LineBlockContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineCommentContext extends LineContext {
		public TerminalNode COMMENT_LINE() { return getToken(LangParser.COMMENT_LINE, 0); }
		public LineCommentContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineForContext extends LineContext {
		public ForstContext forst() {
			return getRuleContext(ForstContext.class,0);
		}
		public LineForContext(LineContext ctx) { copyFrom(ctx); }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_line);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case PRINTF:
			case PUTS:
			case SCANF:
			case GETS:
			case VAR:
				_localctx = new LineStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				stmt();
				setState(110);
				match(EOL);
				}
				break;
			case IF:
				_localctx = new LineIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				ifst();
				}
				break;
			case DO:
				_localctx = new LineDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				dowhilest();
				}
				break;
			case WHILE:
				_localctx = new LineWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				whilest();
				}
				break;
			case FOR:
				_localctx = new LineForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				forst();
				}
				break;
			case SWITCH:
				_localctx = new LineSwitchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				switchst();
				}
				break;
			case T__4:
				_localctx = new LineBlockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				block();
				}
				break;
			case EOL:
				_localctx = new LineEOLContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				match(EOL);
				}
				break;
			case COMMENT_LINE:
				_localctx = new LineCommentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				match(COMMENT_LINE);
				}
				break;
			case COMMENT_BLOCK:
				_localctx = new BlockCommentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				match(COMMENT_BLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtOutputContext extends StmtContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StmtOutputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtInputContext extends StmtContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public StmtInputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAtribContext extends StmtContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public StmtAtribContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtFuncInvocContext extends StmtContext {
		public FuncInvocContext funcInvoc() {
			return getRuleContext(FuncInvocContext.class,0);
		}
		public StmtFuncInvocContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StmtAtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				atrib();
				}
				break;
			case 2:
				_localctx = new StmtInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				input();
				}
				break;
			case 3:
				_localctx = new StmtOutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				output();
				}
				break;
			case 4:
				_localctx = new StmtFuncInvocContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				funcInvoc();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncInvocContext extends ParserRuleContext {
		public FuncInvocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvoc; }
	 
		public FuncInvocContext() { }
		public void copyFrom(FuncInvocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncInvocLineContext extends FuncInvocContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncInvocLineContext(FuncInvocContext ctx) { copyFrom(ctx); }
	}

	public final FuncInvocContext funcInvoc() throws RecognitionException {
		FuncInvocContext _localctx = new FuncInvocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcInvoc);
		int _la;
		try {
			_localctx = new FuncInvocLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(VAR);
			setState(130);
			match(T__0);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898370L) != 0)) {
				{
				setState(131);
				args();
				}
			}

			setState(134);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			expr();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(137);
				match(SEP);
				setState(138);
				expr();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputReadVarStrContext extends InputContext {
		public TerminalNode GETS() { return getToken(LangParser.GETS, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public InputReadVarStrContext(InputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputReadContext extends InputContext {
		public TerminalNode SCANF() { return getToken(LangParser.SCANF, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public List<TerminalNode> VAR() { return getTokens(LangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LangParser.VAR, i);
		}
		public InputReadContext(InputContext ctx) { copyFrom(ctx); }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_input);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCANF:
				_localctx = new InputReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(SCANF);
				setState(145);
				match(T__0);
				setState(146);
				match(STR);
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					match(SEP);
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(148);
						match(T__6);
						}
						}
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(154);
					match(VAR);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEP );
				setState(159);
				match(T__1);
				}
				break;
			case GETS:
				_localctx = new InputReadVarStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(GETS);
				setState(161);
				match(T__0);
				setState(162);
				match(VAR);
				setState(163);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	 
		public OutputContext() { }
		public void copyFrom(OutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutPutWriteStrContext extends OutputContext {
		public TerminalNode PUTS() { return getToken(LangParser.PUTS, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public OutPutWriteStrContext(OutputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteContext extends OutputContext {
		public TerminalNode PRINTF() { return getToken(LangParser.PRINTF, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OutputWriteContext(OutputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputVarContext extends OutputContext {
		public TerminalNode PRINTF() { return getToken(LangParser.PRINTF, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public OutputVarContext(OutputContext ctx) { copyFrom(ctx); }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new OutputVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(PRINTF);
				setState(167);
				match(T__0);
				setState(168);
				match(VAR);
				setState(169);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new OutputWriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(PRINTF);
				setState(171);
				match(T__0);
				setState(172);
				match(STR);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(173);
					match(SEP);
					setState(174);
					expr();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new OutPutWriteStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(PUTS);
				setState(182);
				match(T__0);
				setState(183);
				match(VAR);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(184);
					match(T__1);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfstContext extends ParserRuleContext {
		public IfstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifst; }
	 
		public IfstContext() { }
		public void copyFrom(IfstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstIfElseContext extends IfstContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfstIfElseContext(IfstContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstIfContext extends IfstContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfstIfContext(IfstContext ctx) { copyFrom(ctx); }
	}

	public final IfstContext ifst() throws RecognitionException {
		IfstContext _localctx = new IfstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifst);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IfstIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(IF);
				setState(193);
				match(T__0);
				setState(194);
				cond(0);
				setState(195);
				match(T__1);
				setState(196);
				block();
				}
				break;
			case 2:
				_localctx = new IfstIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(IF);
				setState(199);
				match(T__0);
				setState(200);
				cond(0);
				setState(201);
				match(T__1);
				setState(202);
				((IfstIfElseContext)_localctx).b1 = block();
				setState(203);
				match(ELSE);
				setState(204);
				((IfstIfElseContext)_localctx).b2 = block();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DowhilestContext extends ParserRuleContext {
		public DowhilestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhilest; }
	 
		public DowhilestContext() { }
		public void copyFrom(DowhilestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DowhilestDoWhileContext extends DowhilestContext {
		public TerminalNode DO() { return getToken(LangParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public DowhilestDoWhileContext(DowhilestContext ctx) { copyFrom(ctx); }
	}

	public final DowhilestContext dowhilest() throws RecognitionException {
		DowhilestContext _localctx = new DowhilestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dowhilest);
		try {
			_localctx = new DowhilestDoWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DO);
			setState(209);
			match(T__4);
			setState(210);
			block();
			setState(211);
			match(T__5);
			setState(212);
			match(WHILE);
			setState(213);
			match(T__0);
			setState(214);
			cond(0);
			setState(215);
			match(T__1);
			setState(216);
			match(EOL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhilestContext extends ParserRuleContext {
		public WhilestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilest; }
	 
		public WhilestContext() { }
		public void copyFrom(WhilestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestWhileContext extends WhilestContext {
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestWhileContext(WhilestContext ctx) { copyFrom(ctx); }
	}

	public final WhilestContext whilest() throws RecognitionException {
		WhilestContext _localctx = new WhilestContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whilest);
		try {
			_localctx = new WhilestWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(WHILE);
			setState(219);
			match(T__0);
			setState(220);
			cond(0);
			setState(221);
			match(T__1);
			setState(222);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForstContext extends ParserRuleContext {
		public ForstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forst; }
	 
		public ForstContext() { }
		public void copyFrom(ForstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForstForContext extends ForstContext {
		public TerminalNode FOR() { return getToken(LangParser.FOR, 0); }
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(LangParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(LangParser.EOL, i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForstForContext(ForstContext ctx) { copyFrom(ctx); }
	}

	public final ForstContext forst() throws RecognitionException {
		ForstContext _localctx = new ForstContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forst);
		try {
			_localctx = new ForstForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(FOR);
			setState(225);
			match(T__0);
			setState(226);
			atrib();
			setState(227);
			match(EOL);
			setState(228);
			cond(0);
			setState(229);
			match(EOL);
			setState(230);
			atrib();
			setState(231);
			match(T__1);
			setState(232);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchstContext extends ParserRuleContext {
		public SwitchstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchst; }
	 
		public SwitchstContext() { }
		public void copyFrom(SwitchstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtContext extends SwitchstContext {
		public TerminalNode SWITCH() { return getToken(LangParser.SWITCH, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public DefClauseContext defClause() {
			return getRuleContext(DefClauseContext.class,0);
		}
		public SwitchStmtContext(SwitchstContext ctx) { copyFrom(ctx); }
	}

	public final SwitchstContext switchst() throws RecognitionException {
		SwitchstContext _localctx = new SwitchstContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchst);
		int _la;
		try {
			_localctx = new SwitchStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(SWITCH);
			setState(235);
			match(T__0);
			setState(236);
			match(VAR);
			setState(237);
			match(T__1);
			setState(238);
			match(T__4);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(239);
				caseClause();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(245);
				defClause();
				}
			}

			setState(248);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(LangParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(LangParser.BREAK, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(CASE);
			setState(251);
			expr();
			setState(252);
			match(T__7);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31806680462909480L) != 0)) {
				{
				{
				setState(253);
				line();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(BREAK);
			setState(260);
			match(EOL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(LangParser.DEFAULT, 0); }
		public TerminalNode BREAK() { return getToken(LangParser.BREAK, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public DefClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defClause; }
	}

	public final DefClauseContext defClause() throws RecognitionException {
		DefClauseContext _localctx = new DefClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(DEFAULT);
			setState(263);
			match(T__7);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31806680462909480L) != 0)) {
				{
				{
				setState(264);
				line();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(BREAK);
			setState(271);
			match(EOL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockLineContext extends BlockContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockLineContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			_localctx = new BlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__4);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31806680462909480L) != 0)) {
				{
				{
				setState(274);
				line();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondRelopContext extends CondContext {
		public ExprContext e1;
		public Token RELOP;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public TerminalNode NE() { return getToken(LangParser.NE, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode LE() { return getToken(LangParser.LE, 0); }
		public TerminalNode GE() { return getToken(LangParser.GE, 0); }
		public CondRelopContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExprContext extends CondContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExprContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondAndContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode AND() { return getToken(LangParser.AND, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondOrContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode OR() { return getToken(LangParser.OR, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondNotContext extends CondContext {
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new CondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(283);
				expr();
				}
				break;
			case 2:
				{
				_localctx = new CondRelopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				((CondRelopContext)_localctx).e1 = expr();
				setState(285);
				((CondRelopContext)_localctx).RELOP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
					((CondRelopContext)_localctx).RELOP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				((CondRelopContext)_localctx).e2 = expr();
				}
				break;
			case 3:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(NOT);
				setState(289);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(292);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(293);
						match(AND);
						setState(294);
						((CondAndContext)_localctx).c2 = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(295);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(296);
						match(OR);
						setState(297);
						((CondOrContext)_localctx).c2 = cond(3);
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribCharContext extends AtribContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public AtribCharContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribIncrementContext extends AtribContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public AtribIncrementContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribAssignContext extends AtribContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribAssignContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribVarContext extends AtribContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public AtribVarContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribDeclContext extends AtribContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribDeclContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribDecrementContext extends AtribContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public AtribDecrementContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribArrayContext extends AtribContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AtribArrayContext(AtribContext ctx) { copyFrom(ctx); }
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atrib);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new AtribVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				typeSpec();
				setState(304);
				match(VAR);
				}
				break;
			case 2:
				_localctx = new AtribDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				typeSpec();
				setState(307);
				match(VAR);
				setState(308);
				match(AT);
				setState(309);
				expr();
				}
				break;
			case 3:
				_localctx = new AtribCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				typeSpec();
				setState(312);
				match(VAR);
				setState(313);
				match(AT);
				setState(314);
				match(STR);
				}
				break;
			case 4:
				_localctx = new AtribArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				typeSpec();
				setState(317);
				match(VAR);
				setState(318);
				match(T__8);
				setState(319);
				factor();
				setState(320);
				match(T__9);
				}
				break;
			case 5:
				_localctx = new AtribAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				match(VAR);
				setState(323);
				match(AT);
				setState(324);
				expr();
				}
				break;
			case 6:
				_localctx = new AtribIncrementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				match(VAR);
				setState(326);
				match(T__10);
				}
				break;
			case 7:
				_localctx = new AtribDecrementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				match(VAR);
				setState(328);
				match(T__11);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecContext extends ParserRuleContext {
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122888L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPlusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMinusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				term();
				setState(334);
				match(PLUS);
				setState(335);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				term();
				setState(338);
				match(MINUS);
				setState(339);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				term();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermDivContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermMultContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LangParser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermFactorContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new TermMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				factor();
				setState(345);
				match(MULT);
				setState(346);
				term();
				}
				break;
			case 2:
				_localctx = new TermDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				factor();
				setState(349);
				match(DIV);
				setState(350);
				term();
				}
				break;
			case 3:
				_localctx = new TermFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				factor();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public FactorNumContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorVarContext extends FactorContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public FactorVarContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorDecimContext extends FactorContext {
		public TerminalNode DECIM() { return getToken(LangParser.DECIM, 0); }
		public FactorDecimContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorExprContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorExprContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__0);
				setState(356);
				expr();
				setState(357);
				match(T__1);
				}
				break;
			case VAR:
				_localctx = new FactorVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(VAR);
				}
				break;
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(NUM);
				}
				break;
			case DECIM:
				_localctx = new FactorDecimContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				match(DECIM);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorContext extends ParserRuleContext {
		public PreprocessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor; }
	 
		public PreprocessorContext() { }
		public void copyFrom(PreprocessorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineDirectiveContext extends PreprocessorContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefineDirectiveContext(PreprocessorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludeDirectiveContext extends PreprocessorContext {
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public IncludeDirectiveContext(PreprocessorContext ctx) { copyFrom(ctx); }
	}

	public final PreprocessorContext preprocessor() throws RecognitionException {
		PreprocessorContext _localctx = new PreprocessorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_preprocessor);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new IncludeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(T__16);
				setState(365);
				match(LT);
				setState(366);
				match(VAR);
				setState(367);
				match(GT);
				}
				break;
			case T__17:
				_localctx = new DefineDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(T__17);
				setState(369);
				match(VAR);
				setState(370);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0176\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"Q\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005l\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006z\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0080\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0085\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u008c\b\t\n\t\f\t\u008f\t\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u0096\b\n\n\n\f\n\u0099\t\n\u0001\n\u0004\n\u009c"+
		"\b\n\u000b\n\f\n\u009d\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u00a5\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b0\b\u000b"+
		"\n\u000b\f\u000b\u00b3\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00ba\b\u000b\n\u000b\f\u000b\u00bd\t\u000b"+
		"\u0003\u000b\u00bf\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00cf\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00f1\b\u0010\n\u0010\f\u0010\u00f4\t\u0010\u0001\u0010\u0003\u0010"+
		"\u00f7\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00ff\b\u0011\n\u0011\f\u0011\u0102\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u010a\b\u0012\n\u0012\f\u0012\u010d\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0114\b\u0013\n\u0013"+
		"\f\u0013\u0117\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0123\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u012b\b\u0014\n\u0014\f\u0014\u012e"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u014a\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0157\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0162\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u016b\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0174\b\u001a\u0001\u001a\u0000"+
		"\u0001(\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0002\u0001\u0000!&\u0002\u0000"+
		"\u0003\u0003\r\u0010\u018f\u00009\u0001\u0000\u0000\u0000\u0002B\u0001"+
		"\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000"+
		"\u0000\b`\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\fy\u0001"+
		"\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u0081\u0001"+
		"\u0000\u0000\u0000\u0012\u0088\u0001\u0000\u0000\u0000\u0014\u00a4\u0001"+
		"\u0000\u0000\u0000\u0016\u00be\u0001\u0000\u0000\u0000\u0018\u00ce\u0001"+
		"\u0000\u0000\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c\u00da\u0001"+
		"\u0000\u0000\u0000\u001e\u00e0\u0001\u0000\u0000\u0000 \u00ea\u0001\u0000"+
		"\u0000\u0000\"\u00fa\u0001\u0000\u0000\u0000$\u0106\u0001\u0000\u0000"+
		"\u0000&\u0111\u0001\u0000\u0000\u0000(\u0122\u0001\u0000\u0000\u0000*"+
		"\u0149\u0001\u0000\u0000\u0000,\u014b\u0001\u0000\u0000\u0000.\u0156\u0001"+
		"\u0000\u0000\u00000\u0161\u0001\u0000\u0000\u00002\u016a\u0001\u0000\u0000"+
		"\u00004\u0173\u0001\u0000\u0000\u000068\u00034\u001a\u000076\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<=\u0003\u0002\u0001\u0000=\u0001\u0001\u0000\u0000\u0000>?\u0003\u0004"+
		"\u0002\u0000?@\u0003\u0002\u0001\u0000@C\u0001\u0000\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"C\u0003\u0001\u0000\u0000\u0000DE\u0003,\u0016\u0000EF\u00054\u0000\u0000"+
		"FG\u0005\u0001\u0000\u0000GH\u0003\n\u0005\u0000HI\u0005\u0002\u0000\u0000"+
		"IJ\u0003\u0006\u0003\u0000JQ\u0001\u0000\u0000\u0000KL\u0005\u0003\u0000"+
		"\u0000LM\u0005\u0004\u0000\u0000MN\u0005\u0001\u0000\u0000NO\u0005\u0002"+
		"\u0000\u0000OQ\u0003\u0006\u0003\u0000PD\u0001\u0000\u0000\u0000PK\u0001"+
		"\u0000\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000RS\u0005\u0005\u0000"+
		"\u0000ST\u0003\b\u0004\u0000TU\u0005\u0006\u0000\u0000U\u0007\u0001\u0000"+
		"\u0000\u0000Va\u0003\f\u0006\u0000WX\u0003\f\u0006\u0000XY\u0003\b\u0004"+
		"\u0000Ya\u0001\u0000\u0000\u0000Z[\u0005\u0017\u0000\u0000[\\\u0003.\u0017"+
		"\u0000\\]\u00050\u0000\u0000]a\u0001\u0000\u0000\u0000^_\u0005\u0017\u0000"+
		"\u0000_a\u00050\u0000\u0000`V\u0001\u0000\u0000\u0000`W\u0001\u0000\u0000"+
		"\u0000`Z\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000a\t\u0001\u0000"+
		"\u0000\u0000bc\u0003,\u0016\u0000cd\u00054\u0000\u0000dl\u0001\u0000\u0000"+
		"\u0000ef\u0003,\u0016\u0000fg\u00054\u0000\u0000gh\u0005/\u0000\u0000"+
		"hi\u0003\n\u0005\u0000il\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000"+
		"kb\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0003\u000e\u0007\u0000no\u0005"+
		"0\u0000\u0000oz\u0001\u0000\u0000\u0000pz\u0003\u0018\f\u0000qz\u0003"+
		"\u001a\r\u0000rz\u0003\u001c\u000e\u0000sz\u0003\u001e\u000f\u0000tz\u0003"+
		" \u0010\u0000uz\u0003&\u0013\u0000vz\u00050\u0000\u0000wz\u00055\u0000"+
		"\u0000xz\u00056\u0000\u0000ym\u0001\u0000\u0000\u0000yp\u0001\u0000\u0000"+
		"\u0000yq\u0001\u0000\u0000\u0000yr\u0001\u0000\u0000\u0000ys\u0001\u0000"+
		"\u0000\u0000yt\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000\u0000yv\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000"+
		"z\r\u0001\u0000\u0000\u0000{\u0080\u0003*\u0015\u0000|\u0080\u0003\u0014"+
		"\n\u0000}\u0080\u0003\u0016\u000b\u0000~\u0080\u0003\u0010\b\u0000\u007f"+
		"{\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u000f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u00054\u0000\u0000\u0082\u0084\u0005\u0001\u0000"+
		"\u0000\u0083\u0085\u0003\u0012\t\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u0002\u0000\u0000\u0087\u0011\u0001\u0000\u0000\u0000"+
		"\u0088\u008d\u0003.\u0017\u0000\u0089\u008a\u0005/\u0000\u0000\u008a\u008c"+
		"\u0003.\u0017\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\u001f\u0000\u0000\u0091\u0092\u0005"+
		"\u0001\u0000\u0000\u0092\u009b\u00051\u0000\u0000\u0093\u0097\u0005/\u0000"+
		"\u0000\u0094\u0096\u0005\u0007\u0000\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009c\u00054\u0000\u0000"+
		"\u009b\u0093\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a5\u0005\u0002\u0000\u0000"+
		"\u00a0\u00a1\u0005 \u0000\u0000\u00a1\u00a2\u0005\u0001\u0000\u0000\u00a2"+
		"\u00a3\u00054\u0000\u0000\u00a3\u00a5\u0005\u0002\u0000\u0000\u00a4\u0090"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a5\u0015"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u001d\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0001\u0000\u0000\u00a8\u00a9\u00054\u0000\u0000\u00a9\u00bf\u0005"+
		"\u0002\u0000\u0000\u00aa\u00ab\u0005\u001d\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0001\u0000\u0000\u00ac\u00b1\u00051\u0000\u0000\u00ad\u00ae\u0005/\u0000"+
		"\u0000\u00ae\u00b0\u0003.\u0017\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00bf\u0005\u0002\u0000\u0000"+
		"\u00b5\u00b6\u0005\u001e\u0000\u0000\u00b6\u00b7\u0005\u0001\u0000\u0000"+
		"\u00b7\u00bb\u00054\u0000\u0000\u00b8\u00ba\u0005\u0002\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be"+
		"\u00a6\u0001\u0000\u0000\u0000\u00be\u00aa\u0001\u0000\u0000\u0000\u00be"+
		"\u00b5\u0001\u0000\u0000\u0000\u00bf\u0017\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0016\u0000\u0000\u00c1\u00c2\u0005\u0001\u0000\u0000\u00c2"+
		"\u00c3\u0003(\u0014\u0000\u00c3\u00c4\u0005\u0002\u0000\u0000\u00c4\u00c5"+
		"\u0003&\u0013\u0000\u00c5\u00cf\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005"+
		"\u0016\u0000\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8\u00c9\u0003"+
		"(\u0014\u0000\u00c9\u00ca\u0005\u0002\u0000\u0000\u00ca\u00cb\u0003&\u0013"+
		"\u0000\u00cb\u00cc\u0005\u0018\u0000\u0000\u00cc\u00cd\u0003&\u0013\u0000"+
		"\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00c0\u0001\u0000\u0000\u0000"+
		"\u00ce\u00c6\u0001\u0000\u0000\u0000\u00cf\u0019\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0005\u0013\u0000\u0000\u00d1\u00d2\u0005\u0005\u0000\u0000"+
		"\u00d2\u00d3\u0003&\u0013\u0000\u00d3\u00d4\u0005\u0006\u0000\u0000\u00d4"+
		"\u00d5\u0005\u0014\u0000\u0000\u00d5\u00d6\u0005\u0001\u0000\u0000\u00d6"+
		"\u00d7\u0003(\u0014\u0000\u00d7\u00d8\u0005\u0002\u0000\u0000\u00d8\u00d9"+
		"\u00050\u0000\u0000\u00d9\u001b\u0001\u0000\u0000\u0000\u00da\u00db\u0005"+
		"\u0014\u0000\u0000\u00db\u00dc\u0005\u0001\u0000\u0000\u00dc\u00dd\u0003"+
		"(\u0014\u0000\u00dd\u00de\u0005\u0002\u0000\u0000\u00de\u00df\u0003&\u0013"+
		"\u0000\u00df\u001d\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0015\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0001\u0000\u0000\u00e2\u00e3\u0003*\u0015\u0000"+
		"\u00e3\u00e4\u00050\u0000\u0000\u00e4\u00e5\u0003(\u0014\u0000\u00e5\u00e6"+
		"\u00050\u0000\u0000\u00e6\u00e7\u0003*\u0015\u0000\u00e7\u00e8\u0005\u0002"+
		"\u0000\u0000\u00e8\u00e9\u0003&\u0013\u0000\u00e9\u001f\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005\u0019\u0000\u0000\u00eb\u00ec\u0005\u0001\u0000"+
		"\u0000\u00ec\u00ed\u00054\u0000\u0000\u00ed\u00ee\u0005\u0002\u0000\u0000"+
		"\u00ee\u00f2\u0005\u0005\u0000\u0000\u00ef\u00f1\u0003\"\u0011\u0000\u00f0"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f7\u0003$\u0012\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0005\u0006\u0000\u0000\u00f9!\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u001a\u0000\u0000\u00fb\u00fc\u0003.\u0017\u0000\u00fc\u0100\u0005\b"+
		"\u0000\u0000\u00fd\u00ff\u0003\f\u0006\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u001c\u0000"+
		"\u0000\u0104\u0105\u00050\u0000\u0000\u0105#\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005\u001b\u0000\u0000\u0107\u010b\u0005\b\u0000\u0000\u0108\u010a"+
		"\u0003\f\u0006\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005\u001c\u0000\u0000\u010f\u0110\u0005"+
		"0\u0000\u0000\u0110%\u0001\u0000\u0000\u0000\u0111\u0115\u0005\u0005\u0000"+
		"\u0000\u0112\u0114\u0003\f\u0006\u0000\u0113\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0006\u0000\u0000"+
		"\u0119\'\u0001\u0000\u0000\u0000\u011a\u011b\u0006\u0014\uffff\uffff\u0000"+
		"\u011b\u0123\u0003.\u0017\u0000\u011c\u011d\u0003.\u0017\u0000\u011d\u011e"+
		"\u0007\u0000\u0000\u0000\u011e\u011f\u0003.\u0017\u0000\u011f\u0123\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0005)\u0000\u0000\u0121\u0123\u0003(\u0014"+
		"\u0001\u0122\u011a\u0001\u0000\u0000\u0000\u0122\u011c\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u012c\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\n\u0003\u0000\u0000\u0125\u0126\u0005\'\u0000\u0000"+
		"\u0126\u012b\u0003(\u0014\u0004\u0127\u0128\n\u0002\u0000\u0000\u0128"+
		"\u0129\u0005(\u0000\u0000\u0129\u012b\u0003(\u0014\u0003\u012a\u0124\u0001"+
		"\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000\u012b\u012e\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d)\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0003,\u0016\u0000\u0130\u0131\u00054\u0000\u0000"+
		"\u0131\u014a\u0001\u0000\u0000\u0000\u0132\u0133\u0003,\u0016\u0000\u0133"+
		"\u0134\u00054\u0000\u0000\u0134\u0135\u0005.\u0000\u0000\u0135\u0136\u0003"+
		".\u0017\u0000\u0136\u014a\u0001\u0000\u0000\u0000\u0137\u0138\u0003,\u0016"+
		"\u0000\u0138\u0139\u00054\u0000\u0000\u0139\u013a\u0005.\u0000\u0000\u013a"+
		"\u013b\u00051\u0000\u0000\u013b\u014a\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0003,\u0016\u0000\u013d\u013e\u00054\u0000\u0000\u013e\u013f\u0005\t"+
		"\u0000\u0000\u013f\u0140\u00032\u0019\u0000\u0140\u0141\u0005\n\u0000"+
		"\u0000\u0141\u014a\u0001\u0000\u0000\u0000\u0142\u0143\u00054\u0000\u0000"+
		"\u0143\u0144\u0005.\u0000\u0000\u0144\u014a\u0003.\u0017\u0000\u0145\u0146"+
		"\u00054\u0000\u0000\u0146\u014a\u0005\u000b\u0000\u0000\u0147\u0148\u0005"+
		"4\u0000\u0000\u0148\u014a\u0005\f\u0000\u0000\u0149\u012f\u0001\u0000"+
		"\u0000\u0000\u0149\u0132\u0001\u0000\u0000\u0000\u0149\u0137\u0001\u0000"+
		"\u0000\u0000\u0149\u013c\u0001\u0000\u0000\u0000\u0149\u0142\u0001\u0000"+
		"\u0000\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000"+
		"\u0000\u0000\u014a+\u0001\u0000\u0000\u0000\u014b\u014c\u0007\u0001\u0000"+
		"\u0000\u014c-\u0001\u0000\u0000\u0000\u014d\u014e\u00030\u0018\u0000\u014e"+
		"\u014f\u0005*\u0000\u0000\u014f\u0150\u0003.\u0017\u0000\u0150\u0157\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u00030\u0018\u0000\u0152\u0153\u0005+\u0000"+
		"\u0000\u0153\u0154\u0003.\u0017\u0000\u0154\u0157\u0001\u0000\u0000\u0000"+
		"\u0155\u0157\u00030\u0018\u0000\u0156\u014d\u0001\u0000\u0000\u0000\u0156"+
		"\u0151\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157"+
		"/\u0001\u0000\u0000\u0000\u0158\u0159\u00032\u0019\u0000\u0159\u015a\u0005"+
		",\u0000\u0000\u015a\u015b\u00030\u0018\u0000\u015b\u0162\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u00032\u0019\u0000\u015d\u015e\u0005-\u0000\u0000\u015e"+
		"\u015f\u00030\u0018\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u0162"+
		"\u00032\u0019\u0000\u0161\u0158\u0001\u0000\u0000\u0000\u0161\u015c\u0001"+
		"\u0000\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u01621\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0005\u0001\u0000\u0000\u0164\u0165\u0003.\u0017"+
		"\u0000\u0165\u0166\u0005\u0002\u0000\u0000\u0166\u016b\u0001\u0000\u0000"+
		"\u0000\u0167\u016b\u00054\u0000\u0000\u0168\u016b\u00052\u0000\u0000\u0169"+
		"\u016b\u00053\u0000\u0000\u016a\u0163\u0001\u0000\u0000\u0000\u016a\u0167"+
		"\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016b3\u0001\u0000\u0000\u0000\u016c\u016d\u0005"+
		"\u0011\u0000\u0000\u016d\u016e\u0005#\u0000\u0000\u016e\u016f\u00054\u0000"+
		"\u0000\u016f\u0174\u0005$\u0000\u0000\u0170\u0171\u0005\u0012\u0000\u0000"+
		"\u0171\u0172\u00054\u0000\u0000\u0172\u0174\u0003.\u0017\u0000\u0173\u016c"+
		"\u0001\u0000\u0000\u0000\u0173\u0170\u0001\u0000\u0000\u0000\u01745\u0001"+
		"\u0000\u0000\u0000\u001d9BP`ky\u007f\u0084\u008d\u0097\u009d\u00a4\u00b1"+
		"\u00bb\u00be\u00ce\u00f2\u00f6\u0100\u010b\u0115\u0122\u012a\u012c\u0149"+
		"\u0156\u0161\u016a\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}