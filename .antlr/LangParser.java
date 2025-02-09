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
		T__9=10, T__10=11, T__11=12, INCLUDE=13, DEFINE=14, EOL=15, LIB=16, COMMENTLINE=17, 
		COMMENTBLOCK=18, INT=19, FLOAT=20, CHAR=21, DOUBLE=22, VOID=23, MAIN=24, 
		RETURN=25, SCAN=26, PRINT=27, GETS=28, PUTS=29, STRUCT=30, UNION=31, IF=32, 
		ELSE=33, SWITCH=34, CASE=35, BREAK=36, DEFAULT=37, WHILE=38, FOR=39, DO=40, 
		VAR=41, NUM=42, DECIM=43, PLUS=44, MINUS=45, MULT=46, DIV=47, MOD=48, 
		AND=49, OR=50, NOT=51, RELOP=52, AT=53, SEP=54, DOT=55, FORMATSTRING=56, 
		WS=57;
	public static final int
		RULE_prog = 0, RULE_preprocessorDirective = 1, RULE_declaration = 2, RULE_globalVariable = 3, 
		RULE_function = 4, RULE_fnBlock = 5, RULE_fnBodyList = 6, RULE_fnBodyItem = 7, 
		RULE_params = 8, RULE_line = 9, RULE_stmt = 10, RULE_atrib = 11, RULE_arraydecl = 12, 
		RULE_arrayelems = 13, RULE_pointerdecl = 14, RULE_pointerassign = 15, 
		RULE_pointerdereference = 16, RULE_structdeclaration = 17, RULE_structaccess = 18, 
		RULE_uniondeclaration = 19, RULE_unionaccess = 20, RULE_input = 21, RULE_output = 22, 
		RULE_ifstmt = 23, RULE_dowhilestmt = 24, RULE_whilestmt = 25, RULE_forstmt = 26, 
		RULE_switchstmt = 27, RULE_caseClause = 28, RULE_defaultClause = 29, RULE_cond = 30, 
		RULE_expression = 31, RULE_termTail = 32, RULE_term = 33, RULE_factorTail = 34, 
		RULE_factor = 35, RULE_structdecl = 36, RULE_structfieldList = 37, RULE_structfields = 38, 
		RULE_uniondecl = 39, RULE_unionfieldList = 40, RULE_unionfields = 41, 
		RULE_typeSpec = 42, RULE_funcinvoc = 43, RULE_argumentos = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "preprocessorDirective", "declaration", "globalVariable", "function", 
			"fnBlock", "fnBodyList", "fnBodyItem", "params", "line", "stmt", "atrib", 
			"arraydecl", "arrayelems", "pointerdecl", "pointerassign", "pointerdereference", 
			"structdeclaration", "structaccess", "uniondeclaration", "unionaccess", 
			"input", "output", "ifstmt", "dowhilestmt", "whilestmt", "forstmt", "switchstmt", 
			"caseClause", "defaultClause", "cond", "expression", "termTail", "term", 
			"factorTail", "factor", "structdecl", "structfieldList", "structfields", 
			"uniondecl", "unionfieldList", "unionfields", "typeSpec", "funcinvoc", 
			"argumentos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'{'", "'}'", "'++'", "'--'", "'+='", 
			"'-='", "'&'", "':'", "'#include'", "'#define'", "';'", null, null, null, 
			"'int'", "'float'", "'char'", "'double'", "'void'", "'main'", "'return'", 
			"'scanf'", "'printf'", "'gets'", "'puts'", "'struct'", "'union'", "'if'", 
			"'else'", "'switch'", "'case'", "'break'", "'default'", "'while'", "'for'", 
			"'do'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", 
			"'||'", "'!'", null, "'='", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INCLUDE", "DEFINE", "EOL", "LIB", "COMMENTLINE", "COMMENTBLOCK", 
			"INT", "FLOAT", "CHAR", "DOUBLE", "VOID", "MAIN", "RETURN", "SCAN", "PRINT", 
			"GETS", "PUTS", "STRUCT", "UNION", "IF", "ELSE", "SWITCH", "CASE", "BREAK", 
			"DEFAULT", "WHILE", "FOR", "DO", "VAR", "NUM", "DECIM", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "AND", "OR", "NOT", "RELOP", "AT", "SEP", "DOT", 
			"FORMATSTRING", "WS"
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
		public List<PreprocessorDirectiveContext> preprocessorDirective() {
			return getRuleContexts(PreprocessorDirectiveContext.class);
		}
		public PreprocessorDirectiveContext preprocessorDirective(int i) {
			return getRuleContext(PreprocessorDirectiveContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3237502976L) != 0)) {
				{
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INCLUDE:
					{
					setState(90);
					preprocessorDirective();
					}
					break;
				case DEFINE:
				case INT:
				case FLOAT:
				case CHAR:
				case DOUBLE:
				case VOID:
				case STRUCT:
				case UNION:
					{
					setState(91);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(96);
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
	public static class PreprocessorDirectiveContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(LangParser.INCLUDE, 0); }
		public TerminalNode LIB() { return getToken(LangParser.LIB, 0); }
		public PreprocessorDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessorDirective; }
	}

	public final PreprocessorDirectiveContext preprocessorDirective() throws RecognitionException {
		PreprocessorDirectiveContext _localctx = new PreprocessorDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preprocessorDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(INCLUDE);
			setState(98);
			match(LIB);
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
	public static class DeclarationContext extends ParserRuleContext {
		public StructdeclContext structdecl() {
			return getRuleContext(StructdeclContext.class,0);
		}
		public UniondeclContext uniondecl() {
			return getRuleContext(UniondeclContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public GlobalVariableContext globalVariable() {
			return getRuleContext(GlobalVariableContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				structdecl();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				uniondecl();
				}
				break;
			case INT:
			case FLOAT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				function();
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				globalVariable();
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
	public static class GlobalVariableContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(LangParser.DEFINE, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public GlobalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariable; }
	}

	public final GlobalVariableContext globalVariable() throws RecognitionException {
		GlobalVariableContext _localctx = new GlobalVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(DEFINE);
			setState(107);
			match(VAR);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(108);
				match(T__0);
				setState(109);
				match(NUM);
				setState(110);
				match(T__1);
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9022592417529864L) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(113);
					match(AT);
					}
				}

				setState(116);
				expression();
				}
			}

			setState(119);
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
	public static class FunctionContext extends ParserRuleContext {
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
		public TerminalNode MAIN() { return getToken(LangParser.MAIN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				typeSpec();
				setState(122);
				match(VAR);
				setState(123);
				match(T__2);
				setState(124);
				params();
				setState(125);
				match(T__3);
				setState(126);
				fnBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				typeSpec();
				setState(129);
				match(MAIN);
				setState(130);
				match(T__2);
				setState(131);
				match(T__3);
				setState(132);
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
		public FnBodyListContext fnBodyList() {
			return getRuleContext(FnBodyListContext.class,0);
		}
		public FnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBlock; }
	}

	public final FnBlockContext fnBlock() throws RecognitionException {
		FnBlockContext _localctx = new FnBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__4);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 74517665316896L) != 0)) {
				{
				setState(137);
				fnBodyList();
				}
			}

			setState(140);
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
	public static class FnBodyListContext extends ParserRuleContext {
		public List<FnBodyItemContext> fnBodyItem() {
			return getRuleContexts(FnBodyItemContext.class);
		}
		public FnBodyItemContext fnBodyItem(int i) {
			return getRuleContext(FnBodyItemContext.class,i);
		}
		public FnBodyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBodyList; }
	}

	public final FnBodyListContext fnBodyList() throws RecognitionException {
		FnBodyListContext _localctx = new FnBodyListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fnBodyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				fnBodyItem();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74517665316896L) != 0) );
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
	public static class FnBodyItemContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FnBodyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBodyItem; }
	}

	public final FnBodyItemContext fnBodyItem() throws RecognitionException {
		FnBodyItemContext _localctx = new FnBodyItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fnBodyItem);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case EOL:
			case INT:
			case FLOAT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case SCAN:
			case PRINT:
			case GETS:
			case PUTS:
			case STRUCT:
			case UNION:
			case IF:
			case SWITCH:
			case WHILE:
			case FOR:
			case DO:
			case VAR:
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				line();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(RETURN);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788872L) != 0)) {
					{
					setState(149);
					expression();
					}
				}

				setState(152);
				match(EOL);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(LangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LangParser.VAR, i);
		}
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				typeSpec();
				setState(156);
				match(VAR);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(157);
					match(SEP);
					setState(158);
					typeSpec();
					setState(159);
					match(VAR);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
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
	public static class LineContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public DowhilestmtContext dowhilestmt() {
			return getRuleContext(DowhilestmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public SwitchstmtContext switchstmt() {
			return getRuleContext(SwitchstmtContext.class,0);
		}
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case SCAN:
			case PRINT:
			case GETS:
			case PUTS:
			case STRUCT:
			case UNION:
			case VAR:
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				stmt();
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(170);
					match(EOL);
					}
					break;
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				ifstmt();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				dowhilestmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				whilestmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				forstmt();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				switchstmt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				fnBlock();
				}
				break;
			case EOL:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				match(EOL);
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
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public ArraydeclContext arraydecl() {
			return getRuleContext(ArraydeclContext.class,0);
		}
		public PointerdeclContext pointerdecl() {
			return getRuleContext(PointerdeclContext.class,0);
		}
		public PointerassignContext pointerassign() {
			return getRuleContext(PointerassignContext.class,0);
		}
		public PointerdereferenceContext pointerdereference() {
			return getRuleContext(PointerdereferenceContext.class,0);
		}
		public StructdeclarationContext structdeclaration() {
			return getRuleContext(StructdeclarationContext.class,0);
		}
		public StructaccessContext structaccess() {
			return getRuleContext(StructaccessContext.class,0);
		}
		public UniondeclarationContext uniondeclaration() {
			return getRuleContext(UniondeclarationContext.class,0);
		}
		public UnionaccessContext unionaccess() {
			return getRuleContext(UnionaccessContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public FuncinvocContext funcinvoc() {
			return getRuleContext(FuncinvocContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				atrib();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				arraydecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				pointerdecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				pointerassign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				pointerdereference();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				structdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				structaccess();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(189);
				uniondeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(190);
				unionaccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(191);
				input();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(192);
				output();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(193);
				funcinvoc();
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
	public static class AtribContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atrib);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				typeSpec();
				setState(197);
				match(VAR);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(198);
					match(AT);
					setState(199);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(VAR);
				setState(203);
				match(AT);
				setState(204);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(VAR);
				setState(206);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(VAR);
				setState(208);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(VAR);
				setState(210);
				match(T__8);
				setState(211);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(VAR);
				setState(213);
				match(T__9);
				setState(214);
				expression();
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
	public static class ArraydeclContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ArrayelemsContext arrayelems() {
			return getRuleContext(ArrayelemsContext.class,0);
		}
		public ArraydeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydecl; }
	}

	public final ArraydeclContext arraydecl() throws RecognitionException {
		ArraydeclContext _localctx = new ArraydeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arraydecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			typeSpec();
			setState(218);
			match(VAR);
			setState(219);
			match(T__0);
			setState(220);
			match(NUM);
			setState(221);
			match(T__1);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(222);
				match(AT);
				setState(223);
				match(T__4);
				setState(224);
				arrayelems();
				setState(225);
				match(T__5);
				}
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
	public static class ArrayelemsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public ArrayelemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayelems; }
	}

	public final ArrayelemsContext arrayelems() throws RecognitionException {
		ArrayelemsContext _localctx = new ArrayelemsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayelems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			expression();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(230);
				match(SEP);
				setState(231);
				expression();
				}
				}
				setState(236);
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
	public static class PointerdeclContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LangParser.MULT, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public PointerdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerdecl; }
	}

	public final PointerdeclContext pointerdecl() throws RecognitionException {
		PointerdeclContext _localctx = new PointerdeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pointerdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			typeSpec();
			setState(238);
			match(MULT);
			setState(239);
			match(VAR);
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
	public static class PointerassignContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(LangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LangParser.VAR, i);
		}
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public PointerassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerassign; }
	}

	public final PointerassignContext pointerassign() throws RecognitionException {
		PointerassignContext _localctx = new PointerassignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pointerassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(VAR);
			setState(242);
			match(AT);
			setState(243);
			match(T__10);
			setState(244);
			match(VAR);
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
	public static class PointerdereferenceContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(LangParser.MULT, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PointerdereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerdereference; }
	}

	public final PointerdereferenceContext pointerdereference() throws RecognitionException {
		PointerdereferenceContext _localctx = new PointerdereferenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pointerdereference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(MULT);
			setState(247);
			match(VAR);
			setState(248);
			match(AT);
			setState(249);
			expression();
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
	public static class StructdeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(LangParser.STRUCT, 0); }
		public List<TerminalNode> VAR() { return getTokens(LangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LangParser.VAR, i);
		}
		public StructdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structdeclaration; }
	}

	public final StructdeclarationContext structdeclaration() throws RecognitionException {
		StructdeclarationContext _localctx = new StructdeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_structdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(STRUCT);
			setState(252);
			match(VAR);
			setState(253);
			match(VAR);
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
	public static class StructaccessContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(LangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LangParser.VAR, i);
		}
		public TerminalNode DOT() { return getToken(LangParser.DOT, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structaccess; }
	}

	public final StructaccessContext structaccess() throws RecognitionException {
		StructaccessContext _localctx = new StructaccessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structaccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(VAR);
			setState(256);
			match(DOT);
			setState(257);
			match(VAR);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(258);
				match(AT);
				setState(259);
				expression();
				}
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
	public static class UniondeclarationContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(LangParser.UNION, 0); }
		public List<TerminalNode> VAR() { return getTokens(LangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LangParser.VAR, i);
		}
		public UniondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniondeclaration; }
	}

	public final UniondeclarationContext uniondeclaration() throws RecognitionException {
		UniondeclarationContext _localctx = new UniondeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_uniondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(UNION);
			setState(263);
			match(VAR);
			setState(264);
			match(VAR);
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
	public static class UnionaccessContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(LangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LangParser.VAR, i);
		}
		public TerminalNode DOT() { return getToken(LangParser.DOT, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnionaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionaccess; }
	}

	public final UnionaccessContext unionaccess() throws RecognitionException {
		UnionaccessContext _localctx = new UnionaccessContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unionaccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(VAR);
			setState(267);
			match(DOT);
			setState(268);
			match(VAR);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(269);
				match(AT);
				setState(270);
				expression();
				}
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
		public TerminalNode SCAN() { return getToken(LangParser.SCAN, 0); }
		public TerminalNode FORMATSTRING() { return getToken(LangParser.FORMATSTRING, 0); }
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public List<TerminalNode> VAR() { return getTokens(LangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LangParser.VAR, i);
		}
		public TerminalNode GETS() { return getToken(LangParser.GETS, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_input);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(SCAN);
				setState(274);
				match(T__2);
				setState(275);
				match(FORMATSTRING);
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(276);
					match(SEP);
					setState(277);
					match(T__10);
					setState(278);
					match(VAR);
					}
					}
					setState(281); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEP );
				setState(283);
				match(T__3);
				}
				break;
			case GETS:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(GETS);
				setState(285);
				match(T__2);
				setState(286);
				match(VAR);
				setState(287);
				match(T__3);
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
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public TerminalNode FORMATSTRING() { return getToken(LangParser.FORMATSTRING, 0); }
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PUTS() { return getToken(LangParser.PUTS, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_output);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(PRINT);
				setState(291);
				match(T__2);
				setState(292);
				match(FORMATSTRING);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(293);
					match(SEP);
					setState(294);
					expression();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(T__3);
				}
				break;
			case PUTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(PUTS);
				setState(302);
				match(T__2);
				setState(303);
				match(VAR);
				setState(304);
				match(T__3);
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
	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<FnBlockContext> fnBlock() {
			return getRuleContexts(FnBlockContext.class);
		}
		public FnBlockContext fnBlock(int i) {
			return getRuleContext(FnBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(IF);
			setState(308);
			match(T__2);
			setState(309);
			cond(0);
			setState(310);
			match(T__3);
			setState(311);
			fnBlock();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(312);
				match(ELSE);
				setState(313);
				fnBlock();
				}
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
	public static class DowhilestmtContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(LangParser.DO, 0); }
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public DowhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhilestmt; }
	}

	public final DowhilestmtContext dowhilestmt() throws RecognitionException {
		DowhilestmtContext _localctx = new DowhilestmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dowhilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(DO);
			setState(317);
			fnBlock();
			setState(318);
			match(WHILE);
			setState(319);
			match(T__2);
			setState(320);
			cond(0);
			setState(321);
			match(T__3);
			setState(322);
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
	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(WHILE);
			setState(325);
			match(T__2);
			setState(326);
			cond(0);
			setState(327);
			match(T__3);
			setState(328);
			fnBlock();
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
	public static class ForstmtContext extends ParserRuleContext {
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
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(FOR);
			setState(331);
			match(T__2);
			setState(332);
			atrib();
			setState(333);
			match(EOL);
			setState(334);
			cond(0);
			setState(335);
			match(EOL);
			setState(336);
			atrib();
			setState(337);
			match(T__3);
			setState(338);
			fnBlock();
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
	public static class SwitchstmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(LangParser.SWITCH, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public SwitchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstmt; }
	}

	public final SwitchstmtContext switchstmt() throws RecognitionException {
		SwitchstmtContext _localctx = new SwitchstmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(SWITCH);
			setState(341);
			match(T__2);
			setState(342);
			match(VAR);
			setState(343);
			match(T__3);
			setState(344);
			match(T__4);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(345);
				caseClause();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(351);
				defaultClause();
				}
			}

			setState(354);
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
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
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
		enterRule(_localctx, 56, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(CASE);
			setState(357);
			match(NUM);
			setState(358);
			match(T__11);
			setState(360); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				line();
				}
				}
				setState(362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74517631762464L) != 0) );
			setState(364);
			match(BREAK);
			setState(365);
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
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(LangParser.DEFAULT, 0); }
		public TerminalNode BREAK() { return getToken(LangParser.BREAK, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(DEFAULT);
			setState(368);
			match(T__11);
			setState(370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(369);
				line();
				}
				}
				setState(372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74517631762464L) != 0) );
			setState(374);
			match(BREAK);
			setState(375);
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
	public static class CondContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(LangParser.RELOP, 0); }
		public TerminalNode AND() { return getToken(LangParser.AND, 0); }
		public TerminalNode OR() { return getToken(LangParser.OR, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case VAR:
			case NUM:
			case DECIM:
				{
				setState(378);
				expression();
				}
				break;
			case NOT:
				{
				setState(379);
				match(NOT);
				setState(380);
				cond(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(383);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(384);
						match(RELOP);
						setState(385);
						cond(6);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(386);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(387);
						match(AND);
						setState(388);
						cond(4);
						}
						break;
					case 3:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(389);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(390);
						match(OR);
						setState(391);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<TermTailContext> termTail() {
			return getRuleContexts(TermTailContext.class);
		}
		public TermTailContext termTail(int i) {
			return getRuleContext(TermTailContext.class,i);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			int _alt;
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				term();
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						termTail();
						}
						} 
					}
					setState(403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(VAR);
				setState(405);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				match(VAR);
				setState(407);
				match(T__7);
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
	public static class TermTailContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(LangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(LangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LangParser.MINUS, i);
		}
		public TermTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termTail; }
	}

	public final TermTailContext termTail() throws RecognitionException {
		TermTailContext _localctx = new TermTailContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_termTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			term();
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<FactorTailContext> factorTail() {
			return getRuleContexts(FactorTailContext.class);
		}
		public FactorTailContext factorTail(int i) {
			return getRuleContext(FactorTailContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			factor();
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(419);
					factorTail();
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
	public static class FactorTailContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TerminalNode> MULT() { return getTokens(LangParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(LangParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(LangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(LangParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(LangParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(LangParser.MOD, i);
		}
		public FactorTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorTail; }
	}

	public final FactorTailContext factorTail() throws RecognitionException {
		FactorTailContext _localctx = new FactorTailContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_factorTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581209243648L) != 0)) {
				{
				{
				setState(425);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581209243648L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			factor();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public TerminalNode DECIM() { return getToken(LangParser.DECIM, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_factor);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(T__2);
				setState(434);
				expression();
				setState(435);
				match(T__3);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(VAR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(NUM);
				}
				break;
			case DECIM:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
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
	public static class StructdeclContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(LangParser.STRUCT, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public StructfieldListContext structfieldList() {
			return getRuleContext(StructfieldListContext.class,0);
		}
		public StructdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structdecl; }
	}

	public final StructdeclContext structdecl() throws RecognitionException {
		StructdeclContext _localctx = new StructdeclContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(STRUCT);
			setState(443);
			match(VAR);
			setState(444);
			match(T__4);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) {
				{
				setState(445);
				structfieldList();
				}
			}

			setState(448);
			match(T__5);
			setState(449);
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
	public static class StructfieldListContext extends ParserRuleContext {
		public List<StructfieldsContext> structfields() {
			return getRuleContexts(StructfieldsContext.class);
		}
		public StructfieldsContext structfields(int i) {
			return getRuleContext(StructfieldsContext.class,i);
		}
		public StructfieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structfieldList; }
	}

	public final StructfieldListContext structfieldList() throws RecognitionException {
		StructfieldListContext _localctx = new StructfieldListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_structfieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(451);
				structfields();
				}
				}
				setState(454); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0) );
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
	public static class StructfieldsContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public StructfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structfields; }
	}

	public final StructfieldsContext structfields() throws RecognitionException {
		StructfieldsContext _localctx = new StructfieldsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structfields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			typeSpec();
			setState(457);
			match(VAR);
			setState(458);
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
	public static class UniondeclContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(LangParser.UNION, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public UnionfieldListContext unionfieldList() {
			return getRuleContext(UnionfieldListContext.class,0);
		}
		public UniondeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniondecl; }
	}

	public final UniondeclContext uniondecl() throws RecognitionException {
		UniondeclContext _localctx = new UniondeclContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_uniondecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(UNION);
			setState(461);
			match(VAR);
			setState(462);
			match(T__4);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) {
				{
				setState(463);
				unionfieldList();
				}
			}

			setState(466);
			match(T__5);
			setState(467);
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
	public static class UnionfieldListContext extends ParserRuleContext {
		public List<UnionfieldsContext> unionfields() {
			return getRuleContexts(UnionfieldsContext.class);
		}
		public UnionfieldsContext unionfields(int i) {
			return getRuleContext(UnionfieldsContext.class,i);
		}
		public UnionfieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionfieldList; }
	}

	public final UnionfieldListContext unionfieldList() throws RecognitionException {
		UnionfieldListContext _localctx = new UnionfieldListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unionfieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(469);
				unionfields();
				}
				}
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0) );
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
	public static class UnionfieldsContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public UnionfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionfields; }
	}

	public final UnionfieldsContext unionfields() throws RecognitionException {
		UnionfieldsContext _localctx = new UnionfieldsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unionfields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			typeSpec();
			setState(475);
			match(VAR);
			setState(476);
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
	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LangParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(LangParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(LangParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(LangParser.VOID, 0); }
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) ) {
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
	public static class FuncinvocContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public FuncinvocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcinvoc; }
	}

	public final FuncinvocContext funcinvoc() throws RecognitionException {
		FuncinvocContext _localctx = new FuncinvocContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_funcinvoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(VAR);
			setState(481);
			match(T__2);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788872L) != 0)) {
				{
				setState(482);
				argumentos();
				}
			}

			setState(485);
			match(T__3);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			expression();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(488);
				match(SEP);
				setState(489);
				expression();
				}
				}
				setState(494);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u01f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000`\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002i\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003p\b\u0003\u0001\u0003\u0003\u0003s\b\u0003"+
		"\u0001\u0003\u0003\u0003v\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0087\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u008b\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006\u0090\b\u0006\u000b"+
		"\u0006\f\u0006\u0091\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0097"+
		"\b\u0007\u0001\u0007\u0003\u0007\u009a\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u00a2\b\b\n\b\f\b\u00a5\t\b\u0001\b\u0003"+
		"\b\u00a8\b\b\u0001\t\u0001\t\u0003\t\u00ac\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b5\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00c3\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00c9\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d8\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00e4\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u00e9\b\r\n\r\f\r\u00ec\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0105\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0110\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u0118\b\u0015\u000b\u0015\f\u0015\u0119\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0121\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0128"+
		"\b\u0016\n\u0016\f\u0016\u012b\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0132\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u013b\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u015b\b\u001b\n\u001b\f\u001b\u015e\t\u001b\u0001"+
		"\u001b\u0003\u001b\u0161\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u0169\b\u001c\u000b\u001c\f"+
		"\u001c\u016a\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0004\u001d\u0173\b\u001d\u000b\u001d\f\u001d\u0174\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u017e\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0189\b\u001e\n\u001e\f\u001e\u018c\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0190\b\u001f\n\u001f\f\u001f\u0193\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0199\b\u001f\u0001 \u0005"+
		" \u019c\b \n \f \u019f\t \u0001 \u0001 \u0001!\u0001!\u0005!\u01a5\b!"+
		"\n!\f!\u01a8\t!\u0001\"\u0005\"\u01ab\b\"\n\"\f\"\u01ae\t\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01b9\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u01bf\b$\u0001$\u0001$\u0001$\u0001%\u0004"+
		"%\u01c5\b%\u000b%\f%\u01c6\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u01d1\b\'\u0001\'\u0001\'\u0001\'\u0001(\u0004"+
		"(\u01d7\b(\u000b(\f(\u01d8\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0003+\u01e4\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0005"+
		",\u01eb\b,\n,\f,\u01ee\t,\u0001,\u0000\u0001<-\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVX\u0000\u0003\u0001\u0000,-\u0001\u0000.0\u0001\u0000"+
		"\u0013\u0017\u020a\u0000^\u0001\u0000\u0000\u0000\u0002a\u0001\u0000\u0000"+
		"\u0000\u0004h\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\b"+
		"\u0086\u0001\u0000\u0000\u0000\n\u0088\u0001\u0000\u0000\u0000\f\u008f"+
		"\u0001\u0000\u0000\u0000\u000e\u0099\u0001\u0000\u0000\u0000\u0010\u00a7"+
		"\u0001\u0000\u0000\u0000\u0012\u00b4\u0001\u0000\u0000\u0000\u0014\u00c2"+
		"\u0001\u0000\u0000\u0000\u0016\u00d7\u0001\u0000\u0000\u0000\u0018\u00d9"+
		"\u0001\u0000\u0000\u0000\u001a\u00e5\u0001\u0000\u0000\u0000\u001c\u00ed"+
		"\u0001\u0000\u0000\u0000\u001e\u00f1\u0001\u0000\u0000\u0000 \u00f6\u0001"+
		"\u0000\u0000\u0000\"\u00fb\u0001\u0000\u0000\u0000$\u00ff\u0001\u0000"+
		"\u0000\u0000&\u0106\u0001\u0000\u0000\u0000(\u010a\u0001\u0000\u0000\u0000"+
		"*\u0120\u0001\u0000\u0000\u0000,\u0131\u0001\u0000\u0000\u0000.\u0133"+
		"\u0001\u0000\u0000\u00000\u013c\u0001\u0000\u0000\u00002\u0144\u0001\u0000"+
		"\u0000\u00004\u014a\u0001\u0000\u0000\u00006\u0154\u0001\u0000\u0000\u0000"+
		"8\u0164\u0001\u0000\u0000\u0000:\u016f\u0001\u0000\u0000\u0000<\u017d"+
		"\u0001\u0000\u0000\u0000>\u0198\u0001\u0000\u0000\u0000@\u019d\u0001\u0000"+
		"\u0000\u0000B\u01a2\u0001\u0000\u0000\u0000D\u01ac\u0001\u0000\u0000\u0000"+
		"F\u01b8\u0001\u0000\u0000\u0000H\u01ba\u0001\u0000\u0000\u0000J\u01c4"+
		"\u0001\u0000\u0000\u0000L\u01c8\u0001\u0000\u0000\u0000N\u01cc\u0001\u0000"+
		"\u0000\u0000P\u01d6\u0001\u0000\u0000\u0000R\u01da\u0001\u0000\u0000\u0000"+
		"T\u01de\u0001\u0000\u0000\u0000V\u01e0\u0001\u0000\u0000\u0000X\u01e7"+
		"\u0001\u0000\u0000\u0000Z]\u0003\u0002\u0001\u0000[]\u0003\u0004\u0002"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0001"+
		"\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\r\u0000\u0000"+
		"bc\u0005\u0010\u0000\u0000c\u0003\u0001\u0000\u0000\u0000di\u0003H$\u0000"+
		"ei\u0003N\'\u0000fi\u0003\b\u0004\u0000gi\u0003\u0006\u0003\u0000hd\u0001"+
		"\u0000\u0000\u0000he\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000i\u0005\u0001\u0000\u0000\u0000jk\u0005\u000e"+
		"\u0000\u0000ko\u0005)\u0000\u0000lm\u0005\u0001\u0000\u0000mn\u0005*\u0000"+
		"\u0000np\u0005\u0002\u0000\u0000ol\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pu\u0001\u0000\u0000\u0000qs\u00055\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0003"+
		">\u001f\u0000ur\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0005\u000f\u0000\u0000x\u0007\u0001\u0000\u0000"+
		"\u0000yz\u0003T*\u0000z{\u0005)\u0000\u0000{|\u0005\u0003\u0000\u0000"+
		"|}\u0003\u0010\b\u0000}~\u0005\u0004\u0000\u0000~\u007f\u0003\n\u0005"+
		"\u0000\u007f\u0087\u0001\u0000\u0000\u0000\u0080\u0081\u0003T*\u0000\u0081"+
		"\u0082\u0005\u0018\u0000\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083"+
		"\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0003\n\u0005\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086y\u0001\u0000\u0000\u0000\u0086\u0080\u0001"+
		"\u0000\u0000\u0000\u0087\t\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0005"+
		"\u0000\u0000\u0089\u008b\u0003\f\u0006\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u0006\u0000\u0000\u008d\u000b\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0003\u000e\u0007\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\r\u0001\u0000\u0000\u0000"+
		"\u0093\u009a\u0003\u0012\t\u0000\u0094\u0096\u0005\u0019\u0000\u0000\u0095"+
		"\u0097\u0003>\u001f\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0005\u000f\u0000\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0094"+
		"\u0001\u0000\u0000\u0000\u009a\u000f\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0003T*\u0000\u009c\u00a3\u0005)\u0000\u0000\u009d\u009e\u00056\u0000"+
		"\u0000\u009e\u009f\u0003T*\u0000\u009f\u00a0\u0005)\u0000\u0000\u00a0"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7"+
		"\u009b\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u0011\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\u0014\n\u0000\u00aa\u00ac"+
		"\u0005\u000f\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b5\u0001\u0000\u0000\u0000\u00ad\u00b5"+
		"\u0003.\u0017\u0000\u00ae\u00b5\u00030\u0018\u0000\u00af\u00b5\u00032"+
		"\u0019\u0000\u00b0\u00b5\u00034\u001a\u0000\u00b1\u00b5\u00036\u001b\u0000"+
		"\u00b2\u00b5\u0003\n\u0005\u0000\u00b3\u00b5\u0005\u000f\u0000\u0000\u00b4"+
		"\u00a9\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b4"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u0013\u0001\u0000\u0000\u0000\u00b6\u00c3\u0003\u0016\u000b\u0000\u00b7"+
		"\u00c3\u0003\u0018\f\u0000\u00b8\u00c3\u0003\u001c\u000e\u0000\u00b9\u00c3"+
		"\u0003\u001e\u000f\u0000\u00ba\u00c3\u0003 \u0010\u0000\u00bb\u00c3\u0003"+
		"\"\u0011\u0000\u00bc\u00c3\u0003$\u0012\u0000\u00bd\u00c3\u0003&\u0013"+
		"\u0000\u00be\u00c3\u0003(\u0014\u0000\u00bf\u00c3\u0003*\u0015\u0000\u00c0"+
		"\u00c3\u0003,\u0016\u0000\u00c1\u00c3\u0003V+\u0000\u00c2\u00b6\u0001"+
		"\u0000\u0000\u0000\u00c2\u00b7\u0001\u0000\u0000\u0000\u00c2\u00b8\u0001"+
		"\u0000\u0000\u0000\u00c2\u00b9\u0001\u0000\u0000\u0000\u00c2\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c2\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2\u00be\u0001"+
		"\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u0015\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0003T*\u0000\u00c5\u00c8\u0005)\u0000"+
		"\u0000\u00c6\u00c7\u00055\u0000\u0000\u00c7\u00c9\u0003>\u001f\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005)\u0000\u0000\u00cb\u00cc"+
		"\u00055\u0000\u0000\u00cc\u00d8\u0003>\u001f\u0000\u00cd\u00ce\u0005)"+
		"\u0000\u0000\u00ce\u00d8\u0005\u0007\u0000\u0000\u00cf\u00d0\u0005)\u0000"+
		"\u0000\u00d0\u00d8\u0005\b\u0000\u0000\u00d1\u00d2\u0005)\u0000\u0000"+
		"\u00d2\u00d3\u0005\t\u0000\u0000\u00d3\u00d8\u0003>\u001f\u0000\u00d4"+
		"\u00d5\u0005)\u0000\u0000\u00d5\u00d6\u0005\n\u0000\u0000\u00d6\u00d8"+
		"\u0003>\u001f\u0000\u00d7\u00c4\u0001\u0000\u0000\u0000\u00d7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d7\u00cd\u0001\u0000\u0000\u0000\u00d7\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d8\u0017\u0001\u0000\u0000\u0000\u00d9\u00da\u0003"+
		"T*\u0000\u00da\u00db\u0005)\u0000\u0000\u00db\u00dc\u0005\u0001\u0000"+
		"\u0000\u00dc\u00dd\u0005*\u0000\u0000\u00dd\u00e3\u0005\u0002\u0000\u0000"+
		"\u00de\u00df\u00055\u0000\u0000\u00df\u00e0\u0005\u0005\u0000\u0000\u00e0"+
		"\u00e1\u0003\u001a\r\u0000\u00e1\u00e2\u0005\u0006\u0000\u0000\u00e2\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u0019\u0001\u0000\u0000\u0000\u00e5\u00ea"+
		"\u0003>\u001f\u0000\u00e6\u00e7\u00056\u0000\u0000\u00e7\u00e9\u0003>"+
		"\u001f\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u001b\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0003T*\u0000\u00ee\u00ef\u0005.\u0000\u0000"+
		"\u00ef\u00f0\u0005)\u0000\u0000\u00f0\u001d\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0005)\u0000\u0000\u00f2\u00f3\u00055\u0000\u0000\u00f3\u00f4\u0005"+
		"\u000b\u0000\u0000\u00f4\u00f5\u0005)\u0000\u0000\u00f5\u001f\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005.\u0000\u0000\u00f7\u00f8\u0005)\u0000\u0000"+
		"\u00f8\u00f9\u00055\u0000\u0000\u00f9\u00fa\u0003>\u001f\u0000\u00fa!"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u001e\u0000\u0000\u00fc\u00fd"+
		"\u0005)\u0000\u0000\u00fd\u00fe\u0005)\u0000\u0000\u00fe#\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005)\u0000\u0000\u0100\u0101\u00057\u0000\u0000"+
		"\u0101\u0104\u0005)\u0000\u0000\u0102\u0103\u00055\u0000\u0000\u0103\u0105"+
		"\u0003>\u001f\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105%\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u001f"+
		"\u0000\u0000\u0107\u0108\u0005)\u0000\u0000\u0108\u0109\u0005)\u0000\u0000"+
		"\u0109\'\u0001\u0000\u0000\u0000\u010a\u010b\u0005)\u0000\u0000\u010b"+
		"\u010c\u00057\u0000\u0000\u010c\u010f\u0005)\u0000\u0000\u010d\u010e\u0005"+
		"5\u0000\u0000\u010e\u0110\u0003>\u001f\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110)\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005\u001a\u0000\u0000\u0112\u0113\u0005\u0003\u0000\u0000"+
		"\u0113\u0117\u00058\u0000\u0000\u0114\u0115\u00056\u0000\u0000\u0115\u0116"+
		"\u0005\u000b\u0000\u0000\u0116\u0118\u0005)\u0000\u0000\u0117\u0114\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u0121\u0005\u0004\u0000\u0000\u011c\u011d\u0005"+
		"\u001c\u0000\u0000\u011d\u011e\u0005\u0003\u0000\u0000\u011e\u011f\u0005"+
		")\u0000\u0000\u011f\u0121\u0005\u0004\u0000\u0000\u0120\u0111\u0001\u0000"+
		"\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0121+\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0005\u001b\u0000\u0000\u0123\u0124\u0005\u0003\u0000"+
		"\u0000\u0124\u0129\u00058\u0000\u0000\u0125\u0126\u00056\u0000\u0000\u0126"+
		"\u0128\u0003>\u001f\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012b"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012c\u0132\u0005\u0004\u0000\u0000\u012d\u012e"+
		"\u0005\u001d\u0000\u0000\u012e\u012f\u0005\u0003\u0000\u0000\u012f\u0130"+
		"\u0005)\u0000\u0000\u0130\u0132\u0005\u0004\u0000\u0000\u0131\u0122\u0001"+
		"\u0000\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0132-\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005 \u0000\u0000\u0134\u0135\u0005\u0003\u0000"+
		"\u0000\u0135\u0136\u0003<\u001e\u0000\u0136\u0137\u0005\u0004\u0000\u0000"+
		"\u0137\u013a\u0003\n\u0005\u0000\u0138\u0139\u0005!\u0000\u0000\u0139"+
		"\u013b\u0003\n\u0005\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b/\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"(\u0000\u0000\u013d\u013e\u0003\n\u0005\u0000\u013e\u013f\u0005&\u0000"+
		"\u0000\u013f\u0140\u0005\u0003\u0000\u0000\u0140\u0141\u0003<\u001e\u0000"+
		"\u0141\u0142\u0005\u0004\u0000\u0000\u0142\u0143\u0005\u000f\u0000\u0000"+
		"\u01431\u0001\u0000\u0000\u0000\u0144\u0145\u0005&\u0000\u0000\u0145\u0146"+
		"\u0005\u0003\u0000\u0000\u0146\u0147\u0003<\u001e\u0000\u0147\u0148\u0005"+
		"\u0004\u0000\u0000\u0148\u0149\u0003\n\u0005\u0000\u01493\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0005\'\u0000\u0000\u014b\u014c\u0005\u0003\u0000"+
		"\u0000\u014c\u014d\u0003\u0016\u000b\u0000\u014d\u014e\u0005\u000f\u0000"+
		"\u0000\u014e\u014f\u0003<\u001e\u0000\u014f\u0150\u0005\u000f\u0000\u0000"+
		"\u0150\u0151\u0003\u0016\u000b\u0000\u0151\u0152\u0005\u0004\u0000\u0000"+
		"\u0152\u0153\u0003\n\u0005\u0000\u01535\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005\"\u0000\u0000\u0155\u0156\u0005\u0003\u0000\u0000\u0156\u0157"+
		"\u0005)\u0000\u0000\u0157\u0158\u0005\u0004\u0000\u0000\u0158\u015c\u0005"+
		"\u0005\u0000\u0000\u0159\u015b\u00038\u001c\u0000\u015a\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000"+
		"\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0161\u0003:\u001d"+
		"\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0006\u0000"+
		"\u0000\u01637\u0001\u0000\u0000\u0000\u0164\u0165\u0005#\u0000\u0000\u0165"+
		"\u0166\u0005*\u0000\u0000\u0166\u0168\u0005\f\u0000\u0000\u0167\u0169"+
		"\u0003\u0012\t\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0005"+
		"$\u0000\u0000\u016d\u016e\u0005\u000f\u0000\u0000\u016e9\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0005%\u0000\u0000\u0170\u0172\u0005\f\u0000\u0000"+
		"\u0171\u0173\u0003\u0012\t\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0005$\u0000\u0000\u0177\u0178\u0005\u000f\u0000\u0000\u0178;\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0006\u001e\uffff\uffff\u0000\u017a\u017e"+
		"\u0003>\u001f\u0000\u017b\u017c\u00053\u0000\u0000\u017c\u017e\u0003<"+
		"\u001e\u0001\u017d\u0179\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000"+
		"\u0000\u0000\u017e\u018a\u0001\u0000\u0000\u0000\u017f\u0180\n\u0005\u0000"+
		"\u0000\u0180\u0181\u00054\u0000\u0000\u0181\u0189\u0003<\u001e\u0006\u0182"+
		"\u0183\n\u0003\u0000\u0000\u0183\u0184\u00051\u0000\u0000\u0184\u0189"+
		"\u0003<\u001e\u0004\u0185\u0186\n\u0002\u0000\u0000\u0186\u0187\u0005"+
		"2\u0000\u0000\u0187\u0189\u0003<\u001e\u0003\u0188\u017f\u0001\u0000\u0000"+
		"\u0000\u0188\u0182\u0001\u0000\u0000\u0000\u0188\u0185\u0001\u0000\u0000"+
		"\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b=\u0001\u0000\u0000\u0000"+
		"\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u0191\u0003B!\u0000\u018e\u0190"+
		"\u0003@ \u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u0192\u0199\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0005)\u0000\u0000\u0195\u0199\u0005\u0007\u0000"+
		"\u0000\u0196\u0197\u0005)\u0000\u0000\u0197\u0199\u0005\b\u0000\u0000"+
		"\u0198\u018d\u0001\u0000\u0000\u0000\u0198\u0194\u0001\u0000\u0000\u0000"+
		"\u0198\u0196\u0001\u0000\u0000\u0000\u0199?\u0001\u0000\u0000\u0000\u019a"+
		"\u019c\u0007\u0000\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c"+
		"\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0003B!\u0000\u01a1A\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a6\u0003F#\u0000\u01a3\u01a5\u0003D\"\u0000"+
		"\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a7C\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9"+
		"\u01ab\u0007\u0001\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ac\u0001\u0000\u0000\u0000\u01af\u01b0\u0003F#\u0000\u01b0E\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0005\u0003\u0000\u0000\u01b2\u01b3\u0003"+
		">\u001f\u0000\u01b3\u01b4\u0005\u0004\u0000\u0000\u01b4\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b9\u0005)\u0000\u0000\u01b6\u01b9\u0005*\u0000\u0000"+
		"\u01b7\u01b9\u0005+\u0000\u0000\u01b8\u01b1\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b9G\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0005\u001e\u0000\u0000\u01bb\u01bc\u0005)\u0000\u0000\u01bc\u01be\u0005"+
		"\u0005\u0000\u0000\u01bd\u01bf\u0003J%\u0000\u01be\u01bd\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0005\u0006\u0000\u0000\u01c1\u01c2\u0005\u000f\u0000"+
		"\u0000\u01c2I\u0001\u0000\u0000\u0000\u01c3\u01c5\u0003L&\u0000\u01c4"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"K\u0001\u0000\u0000\u0000\u01c8\u01c9\u0003T*\u0000\u01c9\u01ca\u0005"+
		")\u0000\u0000\u01ca\u01cb\u0005\u000f\u0000\u0000\u01cbM\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0005\u001f\u0000\u0000\u01cd\u01ce\u0005)\u0000\u0000"+
		"\u01ce\u01d0\u0005\u0005\u0000\u0000\u01cf\u01d1\u0003P(\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\u0006\u0000\u0000\u01d3\u01d4"+
		"\u0005\u000f\u0000\u0000\u01d4O\u0001\u0000\u0000\u0000\u01d5\u01d7\u0003"+
		"R)\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d9Q\u0001\u0000\u0000\u0000\u01da\u01db\u0003T*\u0000\u01db"+
		"\u01dc\u0005)\u0000\u0000\u01dc\u01dd\u0005\u000f\u0000\u0000\u01ddS\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0007\u0002\u0000\u0000\u01dfU\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0005)\u0000\u0000\u01e1\u01e3\u0005\u0003\u0000"+
		"\u0000\u01e2\u01e4\u0003X,\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0005\u0004\u0000\u0000\u01e6W\u0001\u0000\u0000\u0000\u01e7\u01ec"+
		"\u0003>\u001f\u0000\u01e8\u01e9\u00056\u0000\u0000\u01e9\u01eb\u0003>"+
		"\u001f\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01edY\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000"+
		"\u0000.\\^horu\u0086\u008a\u0091\u0096\u0099\u00a3\u00a7\u00ab\u00b4\u00c2"+
		"\u00c8\u00d7\u00e3\u00ea\u0104\u010f\u0119\u0120\u0129\u0131\u013a\u015c"+
		"\u0160\u016a\u0174\u017d\u0188\u018a\u0191\u0198\u019d\u01a6\u01ac\u01b8"+
		"\u01be\u01c6\u01d0\u01d8\u01e3\u01ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}