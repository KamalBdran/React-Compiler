// Generated from C:/Users/HP/Documents/Intellij/Reactjs Compiler 2/src/antlr/ReactjsParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactjsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXTENDS=1, REACT_PURE_COMPONENT=2, RENDER=3, RETURN=4, EXPORT=5, DEFAULT=6, 
		IF=7, ELSE=8, FOR=9, CLASS_NAME=10, VAR=11, CONST=12, PROPS=13, USESTATE=14, 
		USEEFFECT=15, USEREF=16, LENGTH=17, PUSH=18, ONCLICK=19, OPEN_SQUARE_BRACKETS=20, 
		CLOSE_SQUARE_BRACKETS=21, OPEN_CURLY_BRACKETS=22, CLOSE_CURLY_BRACKETS=23, 
		OPEN_PARENTHSES=24, CLOSE_PARENTHSES=25, OPEN_TAG=26, CLOSE_TAG=27, ARROW=28, 
		SLASH=29, EQUALS=30, DOUBLE_QUOTES=31, DOT=32, COMMA=33, COLON=34, SIMICOLON=35, 
		EX=36, PLUS=37, MINUS=38, OR=39, AND=40, BOOLEAN=41, WORD_WITH_CAPITAL=42, 
		ID=43, NUMBER=44, WS=45, CLASS=46;
	public static final int
		RULE_program = 0, RULE_pureComponent = 1, RULE_jsxComponent = 2, RULE_pureComponentBody = 3, 
		RULE_componentBody = 4, RULE_returnStatement = 5, RULE_htmlEL = 6, RULE_componentName = 7, 
		RULE_forAtt = 8, RULE_normalAtt = 9, RULE_propsAtt = 10, RULE_varAtt = 11, 
		RULE_onClick = 12, RULE_insideOnClick = 13, RULE_forValue = 14, RULE_varValue = 15, 
		RULE_attributeValue = 16, RULE_propsValue = 17, RULE_updateVarStringValue = 18, 
		RULE_updateVarIntValue = 19, RULE_declString = 20, RULE_declInt = 21, 
		RULE_forVar = 22, RULE_arrayLength = 23, RULE_declBoolean = 24, RULE_declArray = 25, 
		RULE_useState = 26, RULE_toggle = 27, RULE_boolState = 28, RULE_numberState = 29, 
		RULE_stringState = 30, RULE_arrayState = 31, RULE_object = 32, RULE_numObject = 33, 
		RULE_stringObject = 34, RULE_useEffect = 35, RULE_insideUseEffect = 36, 
		RULE_useRef = 37, RULE_insideUseRef = 38, RULE_forLoop = 39, RULE_insideFor = 40, 
		RULE_special = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "pureComponent", "jsxComponent", "pureComponentBody", "componentBody", 
			"returnStatement", "htmlEL", "componentName", "forAtt", "normalAtt", 
			"propsAtt", "varAtt", "onClick", "insideOnClick", "forValue", "varValue", 
			"attributeValue", "propsValue", "updateVarStringValue", "updateVarIntValue", 
			"declString", "declInt", "forVar", "arrayLength", "declBoolean", "declArray", 
			"useState", "toggle", "boolState", "numberState", "stringState", "arrayState", 
			"object", "numObject", "stringObject", "useEffect", "insideUseEffect", 
			"useRef", "insideUseRef", "forLoop", "insideFor", "special"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'extends'", "'React.PureComponent'", "'render'", "'return'", "'export'", 
			"'default'", "'if'", "'else'", "'for'", "'className'", null, "'const'", 
			"'props'", "'useState'", "'useEffect'", "'useRef'", "'length'", "'push'", 
			"'onClick'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'<'", "'>'", 
			"'=>'", "'/'", "'='", "'\"'", "'.'", "','", "':'", "';'", "'!'", "'+'", 
			"'-'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EXTENDS", "REACT_PURE_COMPONENT", "RENDER", "RETURN", "EXPORT", 
			"DEFAULT", "IF", "ELSE", "FOR", "CLASS_NAME", "VAR", "CONST", "PROPS", 
			"USESTATE", "USEEFFECT", "USEREF", "LENGTH", "PUSH", "ONCLICK", "OPEN_SQUARE_BRACKETS", 
			"CLOSE_SQUARE_BRACKETS", "OPEN_CURLY_BRACKETS", "CLOSE_CURLY_BRACKETS", 
			"OPEN_PARENTHSES", "CLOSE_PARENTHSES", "OPEN_TAG", "CLOSE_TAG", "ARROW", 
			"SLASH", "EQUALS", "DOUBLE_QUOTES", "DOT", "COMMA", "COLON", "SIMICOLON", 
			"EX", "PLUS", "MINUS", "OR", "AND", "BOOLEAN", "WORD_WITH_CAPITAL", "ID", 
			"NUMBER", "WS", "CLASS"
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
	public String getGrammarFileName() { return "ReactjsParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactjsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactjsParser.EOF, 0); }
		public List<DeclIntContext> declInt() {
			return getRuleContexts(DeclIntContext.class);
		}
		public DeclIntContext declInt(int i) {
			return getRuleContext(DeclIntContext.class,i);
		}
		public List<DeclStringContext> declString() {
			return getRuleContexts(DeclStringContext.class);
		}
		public DeclStringContext declString(int i) {
			return getRuleContext(DeclStringContext.class,i);
		}
		public List<DeclBooleanContext> declBoolean() {
			return getRuleContexts(DeclBooleanContext.class);
		}
		public DeclBooleanContext declBoolean(int i) {
			return getRuleContext(DeclBooleanContext.class,i);
		}
		public List<PureComponentContext> pureComponent() {
			return getRuleContexts(PureComponentContext.class);
		}
		public PureComponentContext pureComponent(int i) {
			return getRuleContext(PureComponentContext.class,i);
		}
		public List<JsxComponentContext> jsxComponent() {
			return getRuleContexts(JsxComponentContext.class);
		}
		public JsxComponentContext jsxComponent(int i) {
			return getRuleContext(JsxComponentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					declInt();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					declString();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					declBoolean();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(102);
				pureComponent();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(108);
				jsxComponent();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(EOF);
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
	public static class PureComponentContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ReactjsParser.CLASS, 0); }
		public ComponentNameContext componentName() {
			return getRuleContext(ComponentNameContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ReactjsParser.EXTENDS, 0); }
		public TerminalNode REACT_PURE_COMPONENT() { return getToken(ReactjsParser.REACT_PURE_COMPONENT, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public PureComponentBodyContext pureComponentBody() {
			return getRuleContext(PureComponentBodyContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public PureComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterPureComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitPureComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitPureComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureComponentContext pureComponent() throws RecognitionException {
		PureComponentContext _localctx = new PureComponentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pureComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CLASS);
			setState(117);
			componentName();
			setState(118);
			match(EXTENDS);
			setState(119);
			match(REACT_PURE_COMPONENT);
			setState(120);
			match(OPEN_CURLY_BRACKETS);
			setState(121);
			pureComponentBody();
			setState(122);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class JsxComponentContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactjsParser.CONST, 0); }
		public ComponentNameContext componentName() {
			return getRuleContext(ComponentNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public TerminalNode ARROW() { return getToken(ReactjsParser.ARROW, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public TerminalNode PROPS() { return getToken(ReactjsParser.PROPS, 0); }
		public JsxComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterJsxComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitJsxComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitJsxComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxComponentContext jsxComponent() throws RecognitionException {
		JsxComponentContext _localctx = new JsxComponentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jsxComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(CONST);
			setState(125);
			componentName();
			setState(126);
			match(EQUALS);
			setState(127);
			match(OPEN_PARENTHSES);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROPS) {
				{
				setState(128);
				match(PROPS);
				}
			}

			setState(131);
			match(CLOSE_PARENTHSES);
			setState(132);
			match(ARROW);
			setState(133);
			match(OPEN_CURLY_BRACKETS);
			setState(134);
			componentBody();
			setState(135);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class PureComponentBodyContext extends ParserRuleContext {
		public TerminalNode RENDER() { return getToken(ReactjsParser.RENDER, 0); }
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public PureComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureComponentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterPureComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitPureComponentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitPureComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureComponentBodyContext pureComponentBody() throws RecognitionException {
		PureComponentBodyContext _localctx = new PureComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pureComponentBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(RENDER);
			setState(138);
			match(OPEN_PARENTHSES);
			setState(139);
			match(CLOSE_PARENTHSES);
			setState(140);
			match(OPEN_CURLY_BRACKETS);
			setState(141);
			componentBody();
			setState(142);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class ComponentBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<DeclArrayContext> declArray() {
			return getRuleContexts(DeclArrayContext.class);
		}
		public DeclArrayContext declArray(int i) {
			return getRuleContext(DeclArrayContext.class,i);
		}
		public List<DeclStringContext> declString() {
			return getRuleContexts(DeclStringContext.class);
		}
		public DeclStringContext declString(int i) {
			return getRuleContext(DeclStringContext.class,i);
		}
		public List<DeclIntContext> declInt() {
			return getRuleContexts(DeclIntContext.class);
		}
		public DeclIntContext declInt(int i) {
			return getRuleContext(DeclIntContext.class,i);
		}
		public List<DeclBooleanContext> declBoolean() {
			return getRuleContexts(DeclBooleanContext.class);
		}
		public DeclBooleanContext declBoolean(int i) {
			return getRuleContext(DeclBooleanContext.class,i);
		}
		public List<UpdateVarStringValueContext> updateVarStringValue() {
			return getRuleContexts(UpdateVarStringValueContext.class);
		}
		public UpdateVarStringValueContext updateVarStringValue(int i) {
			return getRuleContext(UpdateVarStringValueContext.class,i);
		}
		public List<UpdateVarIntValueContext> updateVarIntValue() {
			return getRuleContexts(UpdateVarIntValueContext.class);
		}
		public UpdateVarIntValueContext updateVarIntValue(int i) {
			return getRuleContext(UpdateVarIntValueContext.class,i);
		}
		public List<UseStateContext> useState() {
			return getRuleContexts(UseStateContext.class);
		}
		public UseStateContext useState(int i) {
			return getRuleContext(UseStateContext.class,i);
		}
		public List<UseEffectContext> useEffect() {
			return getRuleContexts(UseEffectContext.class);
		}
		public UseEffectContext useEffect(int i) {
			return getRuleContext(UseEffectContext.class,i);
		}
		public List<UseRefContext> useRef() {
			return getRuleContexts(UseRefContext.class);
		}
		public UseRefContext useRef(int i) {
			return getRuleContext(UseRefContext.class,i);
		}
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitComponentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093061632L) != 0)) {
				{
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(144);
					declArray();
					}
					break;
				case 2:
					{
					setState(145);
					declString();
					}
					break;
				case 3:
					{
					setState(146);
					declInt();
					}
					break;
				case 4:
					{
					setState(147);
					declBoolean();
					}
					break;
				case 5:
					{
					setState(148);
					updateVarStringValue();
					}
					break;
				case 6:
					{
					setState(149);
					updateVarIntValue();
					}
					break;
				case 7:
					{
					setState(150);
					useState();
					}
					break;
				case 8:
					{
					setState(151);
					useEffect();
					}
					break;
				case 9:
					{
					setState(152);
					useRef();
					}
					break;
				case 10:
					{
					setState(153);
					forLoop();
					}
					break;
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			returnStatement();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ReactjsParser.RETURN, 0); }
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public HtmlELContext htmlEL() {
			return getRuleContext(HtmlELContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(RETURN);
			setState(162);
			match(OPEN_PARENTHSES);
			setState(163);
			htmlEL();
			setState(164);
			match(CLOSE_PARENTHSES);
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
	public static class HtmlELContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_TAG() { return getTokens(ReactjsParser.OPEN_TAG); }
		public TerminalNode OPEN_TAG(int i) {
			return getToken(ReactjsParser.OPEN_TAG, i);
		}
		public List<TerminalNode> CLOSE_TAG() { return getTokens(ReactjsParser.CLOSE_TAG); }
		public TerminalNode CLOSE_TAG(int i) {
			return getToken(ReactjsParser.CLOSE_TAG, i);
		}
		public TerminalNode SLASH() { return getToken(ReactjsParser.SLASH, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public List<TerminalNode> WORD_WITH_CAPITAL() { return getTokens(ReactjsParser.WORD_WITH_CAPITAL); }
		public TerminalNode WORD_WITH_CAPITAL(int i) {
			return getToken(ReactjsParser.WORD_WITH_CAPITAL, i);
		}
		public List<ForAttContext> forAtt() {
			return getRuleContexts(ForAttContext.class);
		}
		public ForAttContext forAtt(int i) {
			return getRuleContext(ForAttContext.class,i);
		}
		public List<NormalAttContext> normalAtt() {
			return getRuleContexts(NormalAttContext.class);
		}
		public NormalAttContext normalAtt(int i) {
			return getRuleContext(NormalAttContext.class,i);
		}
		public List<PropsAttContext> propsAtt() {
			return getRuleContexts(PropsAttContext.class);
		}
		public PropsAttContext propsAtt(int i) {
			return getRuleContext(PropsAttContext.class,i);
		}
		public List<VarAttContext> varAtt() {
			return getRuleContexts(VarAttContext.class);
		}
		public VarAttContext varAtt(int i) {
			return getRuleContext(VarAttContext.class,i);
		}
		public TerminalNode ONCLICK() { return getToken(ReactjsParser.ONCLICK, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public OnClickContext onClick() {
			return getRuleContext(OnClickContext.class,0);
		}
		public List<ForValueContext> forValue() {
			return getRuleContexts(ForValueContext.class);
		}
		public ForValueContext forValue(int i) {
			return getRuleContext(ForValueContext.class,i);
		}
		public List<HtmlELContext> htmlEL() {
			return getRuleContexts(HtmlELContext.class);
		}
		public HtmlELContext htmlEL(int i) {
			return getRuleContext(HtmlELContext.class,i);
		}
		public List<PropsValueContext> propsValue() {
			return getRuleContexts(PropsValueContext.class);
		}
		public PropsValueContext propsValue(int i) {
			return getRuleContext(PropsValueContext.class,i);
		}
		public List<VarValueContext> varValue() {
			return getRuleContexts(VarValueContext.class);
		}
		public VarValueContext varValue(int i) {
			return getRuleContext(VarValueContext.class,i);
		}
		public List<SpecialContext> special() {
			return getRuleContexts(SpecialContext.class);
		}
		public SpecialContext special(int i) {
			return getRuleContext(SpecialContext.class,i);
		}
		public HtmlELContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlEL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterHtmlEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitHtmlEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitHtmlEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlELContext htmlEL() throws RecognitionException {
		HtmlELContext _localctx = new HtmlELContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlEL);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(OPEN_TAG);
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==WORD_WITH_CAPITAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(168);
					forAtt();
					}
					break;
				case 2:
					{
					setState(169);
					normalAtt();
					}
					break;
				case 3:
					{
					setState(170);
					propsAtt();
					}
					break;
				case 4:
					{
					setState(171);
					varAtt();
					}
					break;
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONCLICK) {
				{
				setState(177);
				match(ONCLICK);
				setState(178);
				match(EQUALS);
				setState(179);
				onClick();
				}
			}

			setState(182);
			match(CLOSE_TAG);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(183);
						forValue();
						}
						break;
					case 2:
						{
						setState(184);
						htmlEL();
						}
						break;
					case 3:
						{
						setState(185);
						match(ID);
						}
						break;
					case 4:
						{
						setState(186);
						propsValue();
						}
						break;
					case 5:
						{
						setState(187);
						varValue();
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_CURLY_BRACKETS) {
				{
				{
				setState(193);
				special();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(OPEN_TAG);
			setState(200);
			match(SLASH);
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==WORD_WITH_CAPITAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			match(CLOSE_TAG);
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
	public static class ComponentNameContext extends ParserRuleContext {
		public TerminalNode WORD_WITH_CAPITAL() { return getToken(ReactjsParser.WORD_WITH_CAPITAL, 0); }
		public ComponentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterComponentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitComponentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitComponentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentNameContext componentName() throws RecognitionException {
		ComponentNameContext _localctx = new ComponentNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_componentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(WORD_WITH_CAPITAL);
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
	public static class ForAttContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public ForValueContext forValue() {
			return getRuleContext(ForValueContext.class,0);
		}
		public ForAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterForAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitForAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitForAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForAttContext forAtt() throws RecognitionException {
		ForAttContext _localctx = new ForAttContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forAtt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ID);
			setState(207);
			match(EQUALS);
			setState(208);
			forValue();
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
	public static class NormalAttContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public NormalAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterNormalAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitNormalAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitNormalAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAttContext normalAtt() throws RecognitionException {
		NormalAttContext _localctx = new NormalAttContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_normalAtt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(211);
			match(EQUALS);
			setState(212);
			attributeValue();
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
	public static class PropsAttContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public PropsValueContext propsValue() {
			return getRuleContext(PropsValueContext.class,0);
		}
		public PropsAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterPropsAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitPropsAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitPropsAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsAttContext propsAtt() throws RecognitionException {
		PropsAttContext _localctx = new PropsAttContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propsAtt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ID);
			setState(215);
			match(EQUALS);
			setState(216);
			propsValue();
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
	public static class VarAttContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public VarAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterVarAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitVarAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitVarAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAttContext varAtt() throws RecognitionException {
		VarAttContext _localctx = new VarAttContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varAtt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ID);
			setState(219);
			match(EQUALS);
			setState(220);
			match(OPEN_CURLY_BRACKETS);
			setState(221);
			match(ID);
			setState(222);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class OnClickContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_CURLY_BRACKETS() { return getTokens(ReactjsParser.OPEN_CURLY_BRACKETS); }
		public TerminalNode OPEN_CURLY_BRACKETS(int i) {
			return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, i);
		}
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public TerminalNode ARROW() { return getToken(ReactjsParser.ARROW, 0); }
		public InsideOnClickContext insideOnClick() {
			return getRuleContext(InsideOnClickContext.class,0);
		}
		public List<TerminalNode> CLOSE_CURLY_BRACKETS() { return getTokens(ReactjsParser.CLOSE_CURLY_BRACKETS); }
		public TerminalNode CLOSE_CURLY_BRACKETS(int i) {
			return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, i);
		}
		public OnClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterOnClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitOnClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitOnClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClickContext onClick() throws RecognitionException {
		OnClickContext _localctx = new OnClickContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(OPEN_CURLY_BRACKETS);
			setState(225);
			match(OPEN_PARENTHSES);
			setState(226);
			match(CLOSE_PARENTHSES);
			setState(227);
			match(ARROW);
			setState(228);
			match(OPEN_CURLY_BRACKETS);
			setState(229);
			insideOnClick();
			setState(230);
			match(CLOSE_CURLY_BRACKETS);
			setState(231);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class InsideOnClickContext extends ParserRuleContext {
		public List<UpdateVarStringValueContext> updateVarStringValue() {
			return getRuleContexts(UpdateVarStringValueContext.class);
		}
		public UpdateVarStringValueContext updateVarStringValue(int i) {
			return getRuleContext(UpdateVarStringValueContext.class,i);
		}
		public List<ToggleContext> toggle() {
			return getRuleContexts(ToggleContext.class);
		}
		public ToggleContext toggle(int i) {
			return getRuleContext(ToggleContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(ReactjsParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(ReactjsParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ReactjsParser.MINUS, 0); }
		public InsideOnClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insideOnClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterInsideOnClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitInsideOnClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitInsideOnClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsideOnClickContext insideOnClick() throws RecognitionException {
		InsideOnClickContext _localctx = new InsideOnClickContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insideOnClick);
		int _la;
		try {
			int _alt;
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						updateVarStringValue();
						}
						} 
					}
					setState(238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(239);
					toggle();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(ID);
				setState(246);
				match(EQUALS);
				setState(247);
				match(ID);
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				match(NUMBER);
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
	public static class ForValueContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public ForVarContext forVar() {
			return getRuleContext(ForVarContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public ForValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterForValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitForValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitForValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForValueContext forValue() throws RecognitionException {
		ForValueContext _localctx = new ForValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(OPEN_CURLY_BRACKETS);
			setState(253);
			forVar();
			setState(254);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class VarValueContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public VarValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitVarValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarValueContext varValue() throws RecognitionException {
		VarValueContext _localctx = new VarValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(OPEN_CURLY_BRACKETS);
			setState(257);
			match(ID);
			setState(258);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class AttributeValueContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTES() { return getTokens(ReactjsParser.DOUBLE_QUOTES); }
		public TerminalNode DOUBLE_QUOTES(int i) {
			return getToken(ReactjsParser.DOUBLE_QUOTES, i);
		}
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(DOUBLE_QUOTES);
			setState(261);
			match(ID);
			setState(262);
			match(DOUBLE_QUOTES);
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
	public static class PropsValueContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode PROPS() { return getToken(ReactjsParser.PROPS, 0); }
		public TerminalNode DOT() { return getToken(ReactjsParser.DOT, 0); }
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public PropsValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterPropsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitPropsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitPropsValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsValueContext propsValue() throws RecognitionException {
		PropsValueContext _localctx = new PropsValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_propsValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(OPEN_CURLY_BRACKETS);
			setState(265);
			match(PROPS);
			setState(266);
			match(DOT);
			setState(267);
			match(ID);
			setState(268);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class UpdateVarStringValueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public ForVarContext forVar() {
			return getRuleContext(ForVarContext.class,0);
		}
		public UpdateVarStringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateVarStringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterUpdateVarStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitUpdateVarStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitUpdateVarStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateVarStringValueContext updateVarStringValue() throws RecognitionException {
		UpdateVarStringValueContext _localctx = new UpdateVarStringValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_updateVarStringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(271);
			match(EQUALS);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(272);
				match(ID);
				}
				break;
			case 2:
				{
				setState(273);
				forVar();
				}
				break;
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
	public static class UpdateVarIntValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(ReactjsParser.NUMBER, 0); }
		public ForVarContext forVar() {
			return getRuleContext(ForVarContext.class,0);
		}
		public UpdateVarIntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateVarIntValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterUpdateVarIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitUpdateVarIntValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitUpdateVarIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateVarIntValueContext updateVarIntValue() throws RecognitionException {
		UpdateVarIntValueContext _localctx = new UpdateVarIntValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_updateVarIntValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			setState(277);
			match(EQUALS);
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(278);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(279);
				forVar();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class DeclStringContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode VAR() { return getToken(ReactjsParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactjsParser.CONST, 0); }
		public DeclStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterDeclString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitDeclString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitDeclString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclStringContext declString() throws RecognitionException {
		DeclStringContext _localctx = new DeclStringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(283);
			match(ID);
			setState(284);
			match(EQUALS);
			setState(285);
			match(ID);
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
	public static class DeclIntContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode VAR() { return getToken(ReactjsParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactjsParser.CONST, 0); }
		public TerminalNode NUMBER() { return getToken(ReactjsParser.NUMBER, 0); }
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public DeclIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterDeclInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitDeclInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitDeclInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclIntContext declInt() throws RecognitionException {
		DeclIntContext _localctx = new DeclIntContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(288);
			match(ID);
			setState(289);
			match(EQUALS);
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(290);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(291);
				arrayLength();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ForVarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode OPEN_SQUARE_BRACKETS() { return getToken(ReactjsParser.OPEN_SQUARE_BRACKETS, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKETS() { return getToken(ReactjsParser.CLOSE_SQUARE_BRACKETS, 0); }
		public TerminalNode DOT() { return getToken(ReactjsParser.DOT, 0); }
		public ForVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterForVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitForVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitForVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForVarContext forVar() throws RecognitionException {
		ForVarContext _localctx = new ForVarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ID);
			setState(295);
			match(OPEN_SQUARE_BRACKETS);
			setState(296);
			match(ID);
			setState(297);
			match(CLOSE_SQUARE_BRACKETS);
			setState(298);
			match(DOT);
			setState(299);
			match(ID);
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
	public static class ArrayLengthContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode DOT() { return getToken(ReactjsParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(ReactjsParser.LENGTH, 0); }
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitArrayLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			setState(302);
			match(DOT);
			setState(303);
			match(LENGTH);
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
	public static class DeclBooleanContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode BOOLEAN() { return getToken(ReactjsParser.BOOLEAN, 0); }
		public TerminalNode VAR() { return getToken(ReactjsParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactjsParser.CONST, 0); }
		public DeclBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterDeclBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitDeclBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitDeclBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclBooleanContext declBoolean() throws RecognitionException {
		DeclBooleanContext _localctx = new DeclBooleanContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(306);
			match(ID);
			setState(307);
			match(EQUALS);
			setState(308);
			match(BOOLEAN);
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
	public static class DeclArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode OPEN_SQUARE_BRACKETS() { return getToken(ReactjsParser.OPEN_SQUARE_BRACKETS, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKETS() { return getToken(ReactjsParser.CLOSE_SQUARE_BRACKETS, 0); }
		public TerminalNode VAR() { return getToken(ReactjsParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactjsParser.CONST, 0); }
		public DeclArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterDeclArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitDeclArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitDeclArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclArrayContext declArray() throws RecognitionException {
		DeclArrayContext _localctx = new DeclArrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(311);
			match(ID);
			setState(312);
			match(EQUALS);
			setState(313);
			match(OPEN_SQUARE_BRACKETS);
			setState(314);
			match(CLOSE_SQUARE_BRACKETS);
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
	public static class UseStateContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactjsParser.CONST, 0); }
		public TerminalNode OPEN_SQUARE_BRACKETS() { return getToken(ReactjsParser.OPEN_SQUARE_BRACKETS, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(ReactjsParser.COMMA, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKETS() { return getToken(ReactjsParser.CLOSE_SQUARE_BRACKETS, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode USESTATE() { return getToken(ReactjsParser.USESTATE, 0); }
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public BoolStateContext boolState() {
			return getRuleContext(BoolStateContext.class,0);
		}
		public NumberStateContext numberState() {
			return getRuleContext(NumberStateContext.class,0);
		}
		public StringStateContext stringState() {
			return getRuleContext(StringStateContext.class,0);
		}
		public ArrayStateContext arrayState() {
			return getRuleContext(ArrayStateContext.class,0);
		}
		public UseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterUseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitUseState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitUseState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateContext useState() throws RecognitionException {
		UseStateContext _localctx = new UseStateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_useState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(CONST);
			setState(317);
			match(OPEN_SQUARE_BRACKETS);
			setState(318);
			match(ID);
			setState(319);
			match(COMMA);
			setState(320);
			match(ID);
			setState(321);
			match(CLOSE_SQUARE_BRACKETS);
			setState(322);
			match(EQUALS);
			setState(323);
			match(USESTATE);
			setState(324);
			match(OPEN_PARENTHSES);
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				{
				setState(325);
				boolState();
				}
				break;
			case NUMBER:
				{
				setState(326);
				numberState();
				}
				break;
			case DOUBLE_QUOTES:
				{
				setState(327);
				stringState();
				}
				break;
			case OPEN_SQUARE_BRACKETS:
				{
				setState(328);
				arrayState();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(331);
			match(CLOSE_PARENTHSES);
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
	public static class ToggleContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public TerminalNode EX() { return getToken(ReactjsParser.EX, 0); }
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public ToggleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toggle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterToggle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitToggle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitToggle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToggleContext toggle() throws RecognitionException {
		ToggleContext _localctx = new ToggleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_toggle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ID);
			setState(334);
			match(OPEN_PARENTHSES);
			setState(335);
			match(EX);
			setState(336);
			match(ID);
			setState(337);
			match(CLOSE_PARENTHSES);
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
	public static class BoolStateContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ReactjsParser.BOOLEAN, 0); }
		public BoolStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterBoolState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitBoolState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitBoolState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolStateContext boolState() throws RecognitionException {
		BoolStateContext _localctx = new BoolStateContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_boolState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(BOOLEAN);
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
	public static class NumberStateContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ReactjsParser.NUMBER, 0); }
		public NumberStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterNumberState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitNumberState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitNumberState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberStateContext numberState() throws RecognitionException {
		NumberStateContext _localctx = new NumberStateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_numberState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(NUMBER);
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
	public static class StringStateContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTES() { return getTokens(ReactjsParser.DOUBLE_QUOTES); }
		public TerminalNode DOUBLE_QUOTES(int i) {
			return getToken(ReactjsParser.DOUBLE_QUOTES, i);
		}
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public StringStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterStringState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitStringState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitStringState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringStateContext stringState() throws RecognitionException {
		StringStateContext _localctx = new StringStateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stringState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(DOUBLE_QUOTES);
			setState(344);
			match(ID);
			setState(345);
			match(DOUBLE_QUOTES);
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
	public static class ArrayStateContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKETS() { return getToken(ReactjsParser.OPEN_SQUARE_BRACKETS, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKETS() { return getToken(ReactjsParser.CLOSE_SQUARE_BRACKETS, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public ArrayStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterArrayState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitArrayState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitArrayState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayStateContext arrayState() throws RecognitionException {
		ArrayStateContext _localctx = new ArrayStateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(OPEN_SQUARE_BRACKETS);
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				object();
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_CURLY_BRACKETS );
			setState(353);
			match(CLOSE_SQUARE_BRACKETS);
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public TerminalNode COMMA() { return getToken(ReactjsParser.COMMA, 0); }
		public List<StringObjectContext> stringObject() {
			return getRuleContexts(StringObjectContext.class);
		}
		public StringObjectContext stringObject(int i) {
			return getRuleContext(StringObjectContext.class,i);
		}
		public List<NumObjectContext> numObject() {
			return getRuleContexts(NumObjectContext.class);
		}
		public NumObjectContext numObject(int i) {
			return getRuleContext(NumObjectContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(OPEN_CURLY_BRACKETS);
			setState(358); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(356);
					stringObject();
					}
					break;
				case 2:
					{
					setState(357);
					numObject();
					}
					break;
				}
				}
				setState(360); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(362);
			match(CLOSE_CURLY_BRACKETS);
			setState(363);
			match(COMMA);
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
	public static class NumObjectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ReactjsParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(ReactjsParser.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(ReactjsParser.COMMA, 0); }
		public NumObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterNumObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitNumObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitNumObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumObjectContext numObject() throws RecognitionException {
		NumObjectContext _localctx = new NumObjectContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ID);
			setState(366);
			match(COLON);
			setState(367);
			match(NUMBER);
			setState(368);
			match(COMMA);
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
	public static class StringObjectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(ReactjsParser.COLON, 0); }
		public List<TerminalNode> DOUBLE_QUOTES() { return getTokens(ReactjsParser.DOUBLE_QUOTES); }
		public TerminalNode DOUBLE_QUOTES(int i) {
			return getToken(ReactjsParser.DOUBLE_QUOTES, i);
		}
		public TerminalNode COMMA() { return getToken(ReactjsParser.COMMA, 0); }
		public StringObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterStringObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitStringObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitStringObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringObjectContext stringObject() throws RecognitionException {
		StringObjectContext _localctx = new StringObjectContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stringObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ID);
			setState(371);
			match(COLON);
			setState(372);
			match(DOUBLE_QUOTES);
			setState(373);
			match(ID);
			setState(374);
			match(DOUBLE_QUOTES);
			setState(375);
			match(COMMA);
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
	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode USEEFFECT() { return getToken(ReactjsParser.USEEFFECT, 0); }
		public List<TerminalNode> OPEN_PARENTHSES() { return getTokens(ReactjsParser.OPEN_PARENTHSES); }
		public TerminalNode OPEN_PARENTHSES(int i) {
			return getToken(ReactjsParser.OPEN_PARENTHSES, i);
		}
		public List<TerminalNode> CLOSE_PARENTHSES() { return getTokens(ReactjsParser.CLOSE_PARENTHSES); }
		public TerminalNode CLOSE_PARENTHSES(int i) {
			return getToken(ReactjsParser.CLOSE_PARENTHSES, i);
		}
		public TerminalNode ARROW() { return getToken(ReactjsParser.ARROW, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public InsideUseEffectContext insideUseEffect() {
			return getRuleContext(InsideUseEffectContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_useEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(USEEFFECT);
			setState(378);
			match(OPEN_PARENTHSES);
			setState(379);
			match(OPEN_PARENTHSES);
			setState(380);
			match(CLOSE_PARENTHSES);
			setState(381);
			match(ARROW);
			setState(382);
			match(OPEN_CURLY_BRACKETS);
			setState(383);
			insideUseEffect();
			setState(384);
			match(CLOSE_CURLY_BRACKETS);
			setState(385);
			match(CLOSE_PARENTHSES);
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
	public static class InsideUseEffectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public InsideUseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insideUseEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterInsideUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitInsideUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitInsideUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsideUseEffectContext insideUseEffect() throws RecognitionException {
		InsideUseEffectContext _localctx = new InsideUseEffectContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_insideUseEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(ID);
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
	public static class UseRefContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactjsParser.CONST, 0); }
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode USEREF() { return getToken(ReactjsParser.USEREF, 0); }
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public InsideUseRefContext insideUseRef() {
			return getRuleContext(InsideUseRefContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_useRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(CONST);
			setState(390);
			match(ID);
			setState(391);
			match(EQUALS);
			setState(392);
			match(USEREF);
			setState(393);
			match(OPEN_PARENTHSES);
			setState(394);
			insideUseRef();
			setState(395);
			match(CLOSE_PARENTHSES);
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
	public static class InsideUseRefContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ReactjsParser.NUMBER, 0); }
		public List<TerminalNode> DOUBLE_QUOTES() { return getTokens(ReactjsParser.DOUBLE_QUOTES); }
		public TerminalNode DOUBLE_QUOTES(int i) {
			return getToken(ReactjsParser.DOUBLE_QUOTES, i);
		}
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public InsideUseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insideUseRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterInsideUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitInsideUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitInsideUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsideUseRefContext insideUseRef() throws RecognitionException {
		InsideUseRefContext _localctx = new InsideUseRefContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_insideUseRef);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(NUMBER);
				}
				break;
			case DOUBLE_QUOTES:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(DOUBLE_QUOTES);
				setState(399);
				match(ID);
				setState(400);
				match(DOUBLE_QUOTES);
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ReactjsParser.FOR, 0); }
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public TerminalNode VAR() { return getToken(ReactjsParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(ReactjsParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(ReactjsParser.NUMBER, 0); }
		public List<TerminalNode> SIMICOLON() { return getTokens(ReactjsParser.SIMICOLON); }
		public TerminalNode SIMICOLON(int i) {
			return getToken(ReactjsParser.SIMICOLON, i);
		}
		public TerminalNode OPEN_TAG() { return getToken(ReactjsParser.OPEN_TAG, 0); }
		public List<TerminalNode> PLUS() { return getTokens(ReactjsParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ReactjsParser.PLUS, i);
		}
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public InsideForContext insideFor() {
			return getRuleContext(InsideForContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(FOR);
			setState(404);
			match(OPEN_PARENTHSES);
			setState(405);
			match(VAR);
			setState(406);
			match(ID);
			setState(407);
			match(EQUALS);
			setState(408);
			match(NUMBER);
			setState(409);
			match(SIMICOLON);
			setState(410);
			match(ID);
			setState(411);
			match(OPEN_TAG);
			setState(412);
			match(ID);
			setState(413);
			match(SIMICOLON);
			setState(414);
			match(ID);
			setState(415);
			match(PLUS);
			setState(416);
			match(PLUS);
			setState(417);
			match(CLOSE_PARENTHSES);
			setState(418);
			match(OPEN_CURLY_BRACKETS);
			setState(419);
			insideFor();
			setState(420);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class InsideForContext extends ParserRuleContext {
		public HtmlELContext htmlEL() {
			return getRuleContext(HtmlELContext.class,0);
		}
		public TerminalNode ID() { return getToken(ReactjsParser.ID, 0); }
		public TerminalNode DOT() { return getToken(ReactjsParser.DOT, 0); }
		public TerminalNode PUSH() { return getToken(ReactjsParser.PUSH, 0); }
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public InsideForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insideFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterInsideFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitInsideFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitInsideFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsideForContext insideFor() throws RecognitionException {
		InsideForContext _localctx = new InsideForContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_insideFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(422);
				match(ID);
				}
			}

			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(425);
				match(DOT);
				}
			}

			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUSH) {
				{
				setState(428);
				match(PUSH);
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHSES) {
				{
				setState(431);
				match(OPEN_PARENTHSES);
				}
			}

			setState(434);
			htmlEL();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PARENTHSES) {
				{
				setState(435);
				match(CLOSE_PARENTHSES);
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
	public static class SpecialContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ReactjsParser.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode OPEN_PARENTHSES() { return getToken(ReactjsParser.OPEN_PARENTHSES, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactjsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactjsParser.ID, i);
		}
		public TerminalNode OR() { return getToken(ReactjsParser.OR, 0); }
		public TerminalNode EX() { return getToken(ReactjsParser.EX, 0); }
		public TerminalNode CLOSE_PARENTHSES() { return getToken(ReactjsParser.CLOSE_PARENTHSES, 0); }
		public TerminalNode AND() { return getToken(ReactjsParser.AND, 0); }
		public HtmlELContext htmlEL() {
			return getRuleContext(HtmlELContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ReactjsParser.CLOSE_CURLY_BRACKETS, 0); }
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactjsParserListener ) ((ReactjsParserListener)listener).exitSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactjsParserVisitor ) return ((ReactjsParserVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_special);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(OPEN_CURLY_BRACKETS);
			setState(439);
			match(OPEN_PARENTHSES);
			setState(440);
			match(ID);
			setState(441);
			match(OR);
			setState(442);
			match(EX);
			setState(443);
			match(ID);
			setState(444);
			match(CLOSE_PARENTHSES);
			setState(445);
			match(AND);
			setState(446);
			htmlEL();
			setState(447);
			match(CLOSE_CURLY_BRACKETS);
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
		"\u0004\u0001.\u01c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0005\u0000V\b\u0000\n\u0000\f\u0000"+
		"Y\t\u0000\u0001\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000_\t\u0000\u0001"+
		"\u0000\u0005\u0000b\b\u0000\n\u0000\f\u0000e\t\u0000\u0001\u0000\u0005"+
		"\u0000h\b\u0000\n\u0000\f\u0000k\t\u0000\u0001\u0000\u0005\u0000n\b\u0000"+
		"\n\u0000\f\u0000q\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0082\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u009b\b\u0004\n\u0004\f\u0004\u009e\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00ad\b\u0006\n\u0006\f\u0006\u00b0\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00b5\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00bd\b\u0006\n\u0006"+
		"\f\u0006\u00c0\t\u0006\u0001\u0006\u0005\u0006\u00c3\b\u0006\n\u0006\f"+
		"\u0006\u00c6\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0005"+
		"\r\u00eb\b\r\n\r\f\r\u00ee\t\r\u0001\r\u0005\r\u00f1\b\r\n\r\f\r\u00f4"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fb\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0113\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0119\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0125\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u014a\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0004\u001f\u015e\b\u001f\u000b\u001f\f\u001f\u015f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0004 \u0167\b \u000b \f \u0168\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0003&\u0192\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0003(\u01a8\b(\u0001(\u0003(\u01ab\b(\u0001(\u0003(\u01ae\b"+
		"(\u0001(\u0003(\u01b1\b(\u0001(\u0001(\u0003(\u01b5\b(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0000"+
		"\u0000*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000\u0003\u0001\u0000"+
		"*+\u0001\u0000%&\u0001\u0000\u000b\f\u01c4\u0000W\u0001\u0000\u0000\u0000"+
		"\u0002t\u0001\u0000\u0000\u0000\u0004|\u0001\u0000\u0000\u0000\u0006\u0089"+
		"\u0001\u0000\u0000\u0000\b\u009c\u0001\u0000\u0000\u0000\n\u00a1\u0001"+
		"\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000\u0000\u000e\u00cc\u0001\u0000"+
		"\u0000\u0000\u0010\u00ce\u0001\u0000\u0000\u0000\u0012\u00d2\u0001\u0000"+
		"\u0000\u0000\u0014\u00d6\u0001\u0000\u0000\u0000\u0016\u00da\u0001\u0000"+
		"\u0000\u0000\u0018\u00e0\u0001\u0000\u0000\u0000\u001a\u00fa\u0001\u0000"+
		"\u0000\u0000\u001c\u00fc\u0001\u0000\u0000\u0000\u001e\u0100\u0001\u0000"+
		"\u0000\u0000 \u0104\u0001\u0000\u0000\u0000\"\u0108\u0001\u0000\u0000"+
		"\u0000$\u010e\u0001\u0000\u0000\u0000&\u0114\u0001\u0000\u0000\u0000("+
		"\u011a\u0001\u0000\u0000\u0000*\u011f\u0001\u0000\u0000\u0000,\u0126\u0001"+
		"\u0000\u0000\u0000.\u012d\u0001\u0000\u0000\u00000\u0131\u0001\u0000\u0000"+
		"\u00002\u0136\u0001\u0000\u0000\u00004\u013c\u0001\u0000\u0000\u00006"+
		"\u014d\u0001\u0000\u0000\u00008\u0153\u0001\u0000\u0000\u0000:\u0155\u0001"+
		"\u0000\u0000\u0000<\u0157\u0001\u0000\u0000\u0000>\u015b\u0001\u0000\u0000"+
		"\u0000@\u0163\u0001\u0000\u0000\u0000B\u016d\u0001\u0000\u0000\u0000D"+
		"\u0172\u0001\u0000\u0000\u0000F\u0179\u0001\u0000\u0000\u0000H\u0183\u0001"+
		"\u0000\u0000\u0000J\u0185\u0001\u0000\u0000\u0000L\u0191\u0001\u0000\u0000"+
		"\u0000N\u0193\u0001\u0000\u0000\u0000P\u01a7\u0001\u0000\u0000\u0000R"+
		"\u01b6\u0001\u0000\u0000\u0000TV\u0003*\u0015\u0000UT\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000X]\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0003"+
		"(\u0014\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^c\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`b\u00030\u0018\u0000a`\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000di\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fh\u0003\u0002"+
		"\u0001\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jo\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000ln\u0003\u0004\u0002\u0000ml\u0001\u0000\u0000"+
		"\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005"+
		"\u0000\u0000\u0001s\u0001\u0001\u0000\u0000\u0000tu\u0005.\u0000\u0000"+
		"uv\u0003\u000e\u0007\u0000vw\u0005\u0001\u0000\u0000wx\u0005\u0002\u0000"+
		"\u0000xy\u0005\u0016\u0000\u0000yz\u0003\u0006\u0003\u0000z{\u0005\u0017"+
		"\u0000\u0000{\u0003\u0001\u0000\u0000\u0000|}\u0005\f\u0000\u0000}~\u0003"+
		"\u000e\u0007\u0000~\u007f\u0005\u001e\u0000\u0000\u007f\u0081\u0005\u0018"+
		"\u0000\u0000\u0080\u0082\u0005\r\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0019\u0000\u0000\u0084\u0085\u0005\u001c\u0000"+
		"\u0000\u0085\u0086\u0005\u0016\u0000\u0000\u0086\u0087\u0003\b\u0004\u0000"+
		"\u0087\u0088\u0005\u0017\u0000\u0000\u0088\u0005\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0005\u0018\u0000\u0000"+
		"\u008b\u008c\u0005\u0019\u0000\u0000\u008c\u008d\u0005\u0016\u0000\u0000"+
		"\u008d\u008e\u0003\b\u0004\u0000\u008e\u008f\u0005\u0017\u0000\u0000\u008f"+
		"\u0007\u0001\u0000\u0000\u0000\u0090\u009b\u00032\u0019\u0000\u0091\u009b"+
		"\u0003(\u0014\u0000\u0092\u009b\u0003*\u0015\u0000\u0093\u009b\u00030"+
		"\u0018\u0000\u0094\u009b\u0003$\u0012\u0000\u0095\u009b\u0003&\u0013\u0000"+
		"\u0096\u009b\u00034\u001a\u0000\u0097\u009b\u0003F#\u0000\u0098\u009b"+
		"\u0003J%\u0000\u0099\u009b\u0003N\'\u0000\u009a\u0090\u0001\u0000\u0000"+
		"\u0000\u009a\u0091\u0001\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000"+
		"\u0000\u009a\u0093\u0001\u0000\u0000\u0000\u009a\u0094\u0001\u0000\u0000"+
		"\u0000\u009a\u0095\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000"+
		"\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0003\n\u0005\u0000\u00a0\t\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005\u0004\u0000\u0000\u00a2\u00a3\u0005\u0018\u0000\u0000"+
		"\u00a3\u00a4\u0003\f\u0006\u0000\u00a4\u00a5\u0005\u0019\u0000\u0000\u00a5"+
		"\u000b\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u001a\u0000\u0000\u00a7"+
		"\u00ae\u0007\u0000\u0000\u0000\u00a8\u00ad\u0003\u0010\b\u0000\u00a9\u00ad"+
		"\u0003\u0012\t\u0000\u00aa\u00ad\u0003\u0014\n\u0000\u00ab\u00ad\u0003"+
		"\u0016\u000b\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0013\u0000\u0000\u00b2\u00b3\u0005\u001e\u0000\u0000\u00b3\u00b5\u0003"+
		"\u0018\f\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00be\u0005\u001b"+
		"\u0000\u0000\u00b7\u00bd\u0003\u001c\u000e\u0000\u00b8\u00bd\u0003\f\u0006"+
		"\u0000\u00b9\u00bd\u0005+\u0000\u0000\u00ba\u00bd\u0003\"\u0011\u0000"+
		"\u00bb\u00bd\u0003\u001e\u000f\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c3\u0003R)\u0000\u00c2\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005\u001a\u0000\u0000\u00c8\u00c9\u0005\u001d\u0000\u0000\u00c9\u00ca"+
		"\u0007\u0000\u0000\u0000\u00ca\u00cb\u0005\u001b\u0000\u0000\u00cb\r\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005*\u0000\u0000\u00cd\u000f\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005+\u0000\u0000\u00cf\u00d0\u0005\u001e\u0000"+
		"\u0000\u00d0\u00d1\u0003\u001c\u000e\u0000\u00d1\u0011\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005+\u0000\u0000\u00d3\u00d4\u0005\u001e\u0000\u0000"+
		"\u00d4\u00d5\u0003 \u0010\u0000\u00d5\u0013\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005+\u0000\u0000\u00d7\u00d8\u0005\u001e\u0000\u0000\u00d8\u00d9"+
		"\u0003\"\u0011\u0000\u00d9\u0015\u0001\u0000\u0000\u0000\u00da\u00db\u0005"+
		"+\u0000\u0000\u00db\u00dc\u0005\u001e\u0000\u0000\u00dc\u00dd\u0005\u0016"+
		"\u0000\u0000\u00dd\u00de\u0005+\u0000\u0000\u00de\u00df\u0005\u0017\u0000"+
		"\u0000\u00df\u0017\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0016\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0018\u0000\u0000\u00e2\u00e3\u0005\u0019\u0000"+
		"\u0000\u00e3\u00e4\u0005\u001c\u0000\u0000\u00e4\u00e5\u0005\u0016\u0000"+
		"\u0000\u00e5\u00e6\u0003\u001a\r\u0000\u00e6\u00e7\u0005\u0017\u0000\u0000"+
		"\u00e7\u00e8\u0005\u0017\u0000\u0000\u00e8\u0019\u0001\u0000\u0000\u0000"+
		"\u00e9\u00eb\u0003$\u0012\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f2\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f1\u00036\u001b\u0000\u00f0\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00fb"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0005+\u0000\u0000\u00f6\u00f7\u0005\u001e\u0000\u0000\u00f7\u00f8\u0005"+
		"+\u0000\u0000\u00f8\u00f9\u0007\u0001\u0000\u0000\u00f9\u00fb\u0005,\u0000"+
		"\u0000\u00fa\u00ec\u0001\u0000\u0000\u0000\u00fa\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fb\u001b\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0016\u0000"+
		"\u0000\u00fd\u00fe\u0003,\u0016\u0000\u00fe\u00ff\u0005\u0017\u0000\u0000"+
		"\u00ff\u001d\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0016\u0000\u0000"+
		"\u0101\u0102\u0005+\u0000\u0000\u0102\u0103\u0005\u0017\u0000\u0000\u0103"+
		"\u001f\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u001f\u0000\u0000\u0105"+
		"\u0106\u0005+\u0000\u0000\u0106\u0107\u0005\u001f\u0000\u0000\u0107!\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0005\u0016\u0000\u0000\u0109\u010a\u0005"+
		"\r\u0000\u0000\u010a\u010b\u0005 \u0000\u0000\u010b\u010c\u0005+\u0000"+
		"\u0000\u010c\u010d\u0005\u0017\u0000\u0000\u010d#\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0005+\u0000\u0000\u010f\u0112\u0005\u001e\u0000\u0000\u0110"+
		"\u0113\u0005+\u0000\u0000\u0111\u0113\u0003,\u0016\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113%\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005+\u0000\u0000\u0115\u0118\u0005\u001e\u0000"+
		"\u0000\u0116\u0119\u0005,\u0000\u0000\u0117\u0119\u0003,\u0016\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119"+
		"\'\u0001\u0000\u0000\u0000\u011a\u011b\u0007\u0002\u0000\u0000\u011b\u011c"+
		"\u0005+\u0000\u0000\u011c\u011d\u0005\u001e\u0000\u0000\u011d\u011e\u0005"+
		"+\u0000\u0000\u011e)\u0001\u0000\u0000\u0000\u011f\u0120\u0007\u0002\u0000"+
		"\u0000\u0120\u0121\u0005+\u0000\u0000\u0121\u0124\u0005\u001e\u0000\u0000"+
		"\u0122\u0125\u0005,\u0000\u0000\u0123\u0125\u0003.\u0017\u0000\u0124\u0122"+
		"\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125+\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005+\u0000\u0000\u0127\u0128\u0005\u0014"+
		"\u0000\u0000\u0128\u0129\u0005+\u0000\u0000\u0129\u012a\u0005\u0015\u0000"+
		"\u0000\u012a\u012b\u0005 \u0000\u0000\u012b\u012c\u0005+\u0000\u0000\u012c"+
		"-\u0001\u0000\u0000\u0000\u012d\u012e\u0005+\u0000\u0000\u012e\u012f\u0005"+
		" \u0000\u0000\u012f\u0130\u0005\u0011\u0000\u0000\u0130/\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0007\u0002\u0000\u0000\u0132\u0133\u0005+\u0000\u0000"+
		"\u0133\u0134\u0005\u001e\u0000\u0000\u0134\u0135\u0005)\u0000\u0000\u0135"+
		"1\u0001\u0000\u0000\u0000\u0136\u0137\u0007\u0002\u0000\u0000\u0137\u0138"+
		"\u0005+\u0000\u0000\u0138\u0139\u0005\u001e\u0000\u0000\u0139\u013a\u0005"+
		"\u0014\u0000\u0000\u013a\u013b\u0005\u0015\u0000\u0000\u013b3\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0005\f\u0000\u0000\u013d\u013e\u0005\u0014\u0000"+
		"\u0000\u013e\u013f\u0005+\u0000\u0000\u013f\u0140\u0005!\u0000\u0000\u0140"+
		"\u0141\u0005+\u0000\u0000\u0141\u0142\u0005\u0015\u0000\u0000\u0142\u0143"+
		"\u0005\u001e\u0000\u0000\u0143\u0144\u0005\u000e\u0000\u0000\u0144\u0149"+
		"\u0005\u0018\u0000\u0000\u0145\u014a\u00038\u001c\u0000\u0146\u014a\u0003"+
		":\u001d\u0000\u0147\u014a\u0003<\u001e\u0000\u0148\u014a\u0003>\u001f"+
		"\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0019\u0000"+
		"\u0000\u014c5\u0001\u0000\u0000\u0000\u014d\u014e\u0005+\u0000\u0000\u014e"+
		"\u014f\u0005\u0018\u0000\u0000\u014f\u0150\u0005$\u0000\u0000\u0150\u0151"+
		"\u0005+\u0000\u0000\u0151\u0152\u0005\u0019\u0000\u0000\u01527\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0005)\u0000\u0000\u01549\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0005,\u0000\u0000\u0156;\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0005\u001f\u0000\u0000\u0158\u0159\u0005+\u0000\u0000\u0159\u015a\u0005"+
		"\u001f\u0000\u0000\u015a=\u0001\u0000\u0000\u0000\u015b\u015d\u0005\u0014"+
		"\u0000\u0000\u015c\u015e\u0003@ \u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0005\u0015\u0000\u0000\u0162?\u0001\u0000\u0000\u0000\u0163"+
		"\u0166\u0005\u0016\u0000\u0000\u0164\u0167\u0003D\"\u0000\u0165\u0167"+
		"\u0003B!\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005\u0017\u0000\u0000\u016b\u016c\u0005!\u0000"+
		"\u0000\u016cA\u0001\u0000\u0000\u0000\u016d\u016e\u0005+\u0000\u0000\u016e"+
		"\u016f\u0005\"\u0000\u0000\u016f\u0170\u0005,\u0000\u0000\u0170\u0171"+
		"\u0005!\u0000\u0000\u0171C\u0001\u0000\u0000\u0000\u0172\u0173\u0005+"+
		"\u0000\u0000\u0173\u0174\u0005\"\u0000\u0000\u0174\u0175\u0005\u001f\u0000"+
		"\u0000\u0175\u0176\u0005+\u0000\u0000\u0176\u0177\u0005\u001f\u0000\u0000"+
		"\u0177\u0178\u0005!\u0000\u0000\u0178E\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0005\u000f\u0000\u0000\u017a\u017b\u0005\u0018\u0000\u0000\u017b\u017c"+
		"\u0005\u0018\u0000\u0000\u017c\u017d\u0005\u0019\u0000\u0000\u017d\u017e"+
		"\u0005\u001c\u0000\u0000\u017e\u017f\u0005\u0016\u0000\u0000\u017f\u0180"+
		"\u0003H$\u0000\u0180\u0181\u0005\u0017\u0000\u0000\u0181\u0182\u0005\u0019"+
		"\u0000\u0000\u0182G\u0001\u0000\u0000\u0000\u0183\u0184\u0005+\u0000\u0000"+
		"\u0184I\u0001\u0000\u0000\u0000\u0185\u0186\u0005\f\u0000\u0000\u0186"+
		"\u0187\u0005+\u0000\u0000\u0187\u0188\u0005\u001e\u0000\u0000\u0188\u0189"+
		"\u0005\u0010\u0000\u0000\u0189\u018a\u0005\u0018\u0000\u0000\u018a\u018b"+
		"\u0003L&\u0000\u018b\u018c\u0005\u0019\u0000\u0000\u018cK\u0001\u0000"+
		"\u0000\u0000\u018d\u0192\u0005,\u0000\u0000\u018e\u018f\u0005\u001f\u0000"+
		"\u0000\u018f\u0190\u0005+\u0000\u0000\u0190\u0192\u0005\u001f\u0000\u0000"+
		"\u0191\u018d\u0001\u0000\u0000\u0000\u0191\u018e\u0001\u0000\u0000\u0000"+
		"\u0192M\u0001\u0000\u0000\u0000\u0193\u0194\u0005\t\u0000\u0000\u0194"+
		"\u0195\u0005\u0018\u0000\u0000\u0195\u0196\u0005\u000b\u0000\u0000\u0196"+
		"\u0197\u0005+\u0000\u0000\u0197\u0198\u0005\u001e\u0000\u0000\u0198\u0199"+
		"\u0005,\u0000\u0000\u0199\u019a\u0005#\u0000\u0000\u019a\u019b\u0005+"+
		"\u0000\u0000\u019b\u019c\u0005\u001a\u0000\u0000\u019c\u019d\u0005+\u0000"+
		"\u0000\u019d\u019e\u0005#\u0000\u0000\u019e\u019f\u0005+\u0000\u0000\u019f"+
		"\u01a0\u0005%\u0000\u0000\u01a0\u01a1\u0005%\u0000\u0000\u01a1\u01a2\u0005"+
		"\u0019\u0000\u0000\u01a2\u01a3\u0005\u0016\u0000\u0000\u01a3\u01a4\u0003"+
		"P(\u0000\u01a4\u01a5\u0005\u0017\u0000\u0000\u01a5O\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a8\u0005+\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ab\u0005 \u0000\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ae\u0005\u0012\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af"+
		"\u01b1\u0005\u0018\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b4\u0003\f\u0006\u0000\u01b3\u01b5\u0005\u0019\u0000\u0000\u01b4\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5Q\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0005\u0016\u0000\u0000\u01b7\u01b8\u0005"+
		"\u0018\u0000\u0000\u01b8\u01b9\u0005+\u0000\u0000\u01b9\u01ba\u0005\'"+
		"\u0000\u0000\u01ba\u01bb\u0005$\u0000\u0000\u01bb\u01bc\u0005+\u0000\u0000"+
		"\u01bc\u01bd\u0005\u0019\u0000\u0000\u01bd\u01be\u0005(\u0000\u0000\u01be"+
		"\u01bf\u0003\f\u0006\u0000\u01bf\u01c0\u0005\u0017\u0000\u0000\u01c0S"+
		"\u0001\u0000\u0000\u0000\u001eW]cio\u0081\u009a\u009c\u00ac\u00ae\u00b4"+
		"\u00bc\u00be\u00c4\u00ec\u00f2\u00fa\u0112\u0118\u0124\u0149\u015f\u0166"+
		"\u0168\u0191\u01a7\u01aa\u01ad\u01b0\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}