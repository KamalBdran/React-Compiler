// Generated from C:/Users/HP/Documents/Intellij/Reactjs Compiler 2/src/antlr/ReactjsParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactjsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactjsParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactjsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#pureComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureComponent(ReactjsParser.PureComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#jsxComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxComponent(ReactjsParser.JsxComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#pureComponentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureComponentBody(ReactjsParser.PureComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(ReactjsParser.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ReactjsParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#htmlEL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlEL(ReactjsParser.HtmlELContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#componentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentName(ReactjsParser.ComponentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#forAtt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForAtt(ReactjsParser.ForAttContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#normalAtt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAtt(ReactjsParser.NormalAttContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#propsAtt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsAtt(ReactjsParser.PropsAttContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#varAtt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAtt(ReactjsParser.VarAttContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#onClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClick(ReactjsParser.OnClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#insideOnClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideOnClick(ReactjsParser.InsideOnClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#forValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForValue(ReactjsParser.ForValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#varValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarValue(ReactjsParser.VarValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(ReactjsParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#propsValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsValue(ReactjsParser.PropsValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#updateVarStringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateVarStringValue(ReactjsParser.UpdateVarStringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#updateVarIntValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateVarIntValue(ReactjsParser.UpdateVarIntValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#declString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclString(ReactjsParser.DeclStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#declInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclInt(ReactjsParser.DeclIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#forVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVar(ReactjsParser.ForVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(ReactjsParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#declBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclBoolean(ReactjsParser.DeclBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#declArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArray(ReactjsParser.DeclArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#useState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseState(ReactjsParser.UseStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#toggle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToggle(ReactjsParser.ToggleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#boolState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolState(ReactjsParser.BoolStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#numberState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberState(ReactjsParser.NumberStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#stringState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringState(ReactjsParser.StringStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#arrayState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayState(ReactjsParser.ArrayStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ReactjsParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#numObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumObject(ReactjsParser.NumObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#stringObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringObject(ReactjsParser.StringObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(ReactjsParser.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#insideUseEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideUseEffect(ReactjsParser.InsideUseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ReactjsParser.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#insideUseRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideUseRef(ReactjsParser.InsideUseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(ReactjsParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#insideFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideFor(ReactjsParser.InsideForContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactjsParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(ReactjsParser.SpecialContext ctx);
}