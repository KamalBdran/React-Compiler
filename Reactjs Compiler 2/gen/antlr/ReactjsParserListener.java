// Generated from C:/Users/HP/Documents/Intellij/Reactjs Compiler 2/src/antlr/ReactjsParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactjsParser}.
 */
public interface ReactjsParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactjsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactjsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#pureComponent}.
	 * @param ctx the parse tree
	 */
	void enterPureComponent(ReactjsParser.PureComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#pureComponent}.
	 * @param ctx the parse tree
	 */
	void exitPureComponent(ReactjsParser.PureComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#jsxComponent}.
	 * @param ctx the parse tree
	 */
	void enterJsxComponent(ReactjsParser.JsxComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#jsxComponent}.
	 * @param ctx the parse tree
	 */
	void exitJsxComponent(ReactjsParser.JsxComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#pureComponentBody}.
	 * @param ctx the parse tree
	 */
	void enterPureComponentBody(ReactjsParser.PureComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#pureComponentBody}.
	 * @param ctx the parse tree
	 */
	void exitPureComponentBody(ReactjsParser.PureComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(ReactjsParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(ReactjsParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ReactjsParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ReactjsParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#htmlEL}.
	 * @param ctx the parse tree
	 */
	void enterHtmlEL(ReactjsParser.HtmlELContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#htmlEL}.
	 * @param ctx the parse tree
	 */
	void exitHtmlEL(ReactjsParser.HtmlELContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#componentName}.
	 * @param ctx the parse tree
	 */
	void enterComponentName(ReactjsParser.ComponentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#componentName}.
	 * @param ctx the parse tree
	 */
	void exitComponentName(ReactjsParser.ComponentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#forAtt}.
	 * @param ctx the parse tree
	 */
	void enterForAtt(ReactjsParser.ForAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#forAtt}.
	 * @param ctx the parse tree
	 */
	void exitForAtt(ReactjsParser.ForAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#normalAtt}.
	 * @param ctx the parse tree
	 */
	void enterNormalAtt(ReactjsParser.NormalAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#normalAtt}.
	 * @param ctx the parse tree
	 */
	void exitNormalAtt(ReactjsParser.NormalAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#propsAtt}.
	 * @param ctx the parse tree
	 */
	void enterPropsAtt(ReactjsParser.PropsAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#propsAtt}.
	 * @param ctx the parse tree
	 */
	void exitPropsAtt(ReactjsParser.PropsAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#varAtt}.
	 * @param ctx the parse tree
	 */
	void enterVarAtt(ReactjsParser.VarAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#varAtt}.
	 * @param ctx the parse tree
	 */
	void exitVarAtt(ReactjsParser.VarAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#onClick}.
	 * @param ctx the parse tree
	 */
	void enterOnClick(ReactjsParser.OnClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#onClick}.
	 * @param ctx the parse tree
	 */
	void exitOnClick(ReactjsParser.OnClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#insideOnClick}.
	 * @param ctx the parse tree
	 */
	void enterInsideOnClick(ReactjsParser.InsideOnClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#insideOnClick}.
	 * @param ctx the parse tree
	 */
	void exitInsideOnClick(ReactjsParser.InsideOnClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#forValue}.
	 * @param ctx the parse tree
	 */
	void enterForValue(ReactjsParser.ForValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#forValue}.
	 * @param ctx the parse tree
	 */
	void exitForValue(ReactjsParser.ForValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#varValue}.
	 * @param ctx the parse tree
	 */
	void enterVarValue(ReactjsParser.VarValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#varValue}.
	 * @param ctx the parse tree
	 */
	void exitVarValue(ReactjsParser.VarValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(ReactjsParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(ReactjsParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#propsValue}.
	 * @param ctx the parse tree
	 */
	void enterPropsValue(ReactjsParser.PropsValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#propsValue}.
	 * @param ctx the parse tree
	 */
	void exitPropsValue(ReactjsParser.PropsValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#updateVarStringValue}.
	 * @param ctx the parse tree
	 */
	void enterUpdateVarStringValue(ReactjsParser.UpdateVarStringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#updateVarStringValue}.
	 * @param ctx the parse tree
	 */
	void exitUpdateVarStringValue(ReactjsParser.UpdateVarStringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#updateVarIntValue}.
	 * @param ctx the parse tree
	 */
	void enterUpdateVarIntValue(ReactjsParser.UpdateVarIntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#updateVarIntValue}.
	 * @param ctx the parse tree
	 */
	void exitUpdateVarIntValue(ReactjsParser.UpdateVarIntValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#declString}.
	 * @param ctx the parse tree
	 */
	void enterDeclString(ReactjsParser.DeclStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#declString}.
	 * @param ctx the parse tree
	 */
	void exitDeclString(ReactjsParser.DeclStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#declInt}.
	 * @param ctx the parse tree
	 */
	void enterDeclInt(ReactjsParser.DeclIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#declInt}.
	 * @param ctx the parse tree
	 */
	void exitDeclInt(ReactjsParser.DeclIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#forVar}.
	 * @param ctx the parse tree
	 */
	void enterForVar(ReactjsParser.ForVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#forVar}.
	 * @param ctx the parse tree
	 */
	void exitForVar(ReactjsParser.ForVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(ReactjsParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(ReactjsParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#declBoolean}.
	 * @param ctx the parse tree
	 */
	void enterDeclBoolean(ReactjsParser.DeclBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#declBoolean}.
	 * @param ctx the parse tree
	 */
	void exitDeclBoolean(ReactjsParser.DeclBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#declArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclArray(ReactjsParser.DeclArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#declArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclArray(ReactjsParser.DeclArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#useState}.
	 * @param ctx the parse tree
	 */
	void enterUseState(ReactjsParser.UseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#useState}.
	 * @param ctx the parse tree
	 */
	void exitUseState(ReactjsParser.UseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#toggle}.
	 * @param ctx the parse tree
	 */
	void enterToggle(ReactjsParser.ToggleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#toggle}.
	 * @param ctx the parse tree
	 */
	void exitToggle(ReactjsParser.ToggleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#boolState}.
	 * @param ctx the parse tree
	 */
	void enterBoolState(ReactjsParser.BoolStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#boolState}.
	 * @param ctx the parse tree
	 */
	void exitBoolState(ReactjsParser.BoolStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#numberState}.
	 * @param ctx the parse tree
	 */
	void enterNumberState(ReactjsParser.NumberStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#numberState}.
	 * @param ctx the parse tree
	 */
	void exitNumberState(ReactjsParser.NumberStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#stringState}.
	 * @param ctx the parse tree
	 */
	void enterStringState(ReactjsParser.StringStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#stringState}.
	 * @param ctx the parse tree
	 */
	void exitStringState(ReactjsParser.StringStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#arrayState}.
	 * @param ctx the parse tree
	 */
	void enterArrayState(ReactjsParser.ArrayStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#arrayState}.
	 * @param ctx the parse tree
	 */
	void exitArrayState(ReactjsParser.ArrayStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ReactjsParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ReactjsParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#numObject}.
	 * @param ctx the parse tree
	 */
	void enterNumObject(ReactjsParser.NumObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#numObject}.
	 * @param ctx the parse tree
	 */
	void exitNumObject(ReactjsParser.NumObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#stringObject}.
	 * @param ctx the parse tree
	 */
	void enterStringObject(ReactjsParser.StringObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#stringObject}.
	 * @param ctx the parse tree
	 */
	void exitStringObject(ReactjsParser.StringObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void enterUseEffect(ReactjsParser.UseEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void exitUseEffect(ReactjsParser.UseEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#insideUseEffect}.
	 * @param ctx the parse tree
	 */
	void enterInsideUseEffect(ReactjsParser.InsideUseEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#insideUseEffect}.
	 * @param ctx the parse tree
	 */
	void exitInsideUseEffect(ReactjsParser.InsideUseEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#useRef}.
	 * @param ctx the parse tree
	 */
	void enterUseRef(ReactjsParser.UseRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#useRef}.
	 * @param ctx the parse tree
	 */
	void exitUseRef(ReactjsParser.UseRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#insideUseRef}.
	 * @param ctx the parse tree
	 */
	void enterInsideUseRef(ReactjsParser.InsideUseRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#insideUseRef}.
	 * @param ctx the parse tree
	 */
	void exitInsideUseRef(ReactjsParser.InsideUseRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(ReactjsParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(ReactjsParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#insideFor}.
	 * @param ctx the parse tree
	 */
	void enterInsideFor(ReactjsParser.InsideForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#insideFor}.
	 * @param ctx the parse tree
	 */
	void exitInsideFor(ReactjsParser.InsideForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactjsParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(ReactjsParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactjsParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(ReactjsParser.SpecialContext ctx);
}