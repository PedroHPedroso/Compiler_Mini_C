// Generated from Lang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code progLine}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgLine(LangParser.ProgLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(LangParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#fnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnBlock(LangParser.FnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnBody(LangParser.FnBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LangParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#funcInvoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInvoc(LangParser.FuncInvocContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(LangParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(LangParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(LangParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstIf}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstIf(LangParser.IfstIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstIfElse}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstIfElse(LangParser.IfstIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockLine}
	 * labeled alternative in {@link LangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockLine(LangParser.BlockLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condRelop}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondRelop(LangParser.CondRelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(LangParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAnd(LangParser.CondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOr(LangParser.CondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNot(LangParser.CondNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribVar}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribVar(LangParser.AtribVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(LangParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(LangParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTerm(LangParser.ExprTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMult}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMult(LangParser.TermMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDiv(LangParser.TermDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termFactor}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermFactor(LangParser.TermFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpr(LangParser.FactorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorVar}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorVar(LangParser.FactorVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorNum}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNum(LangParser.FactorNumContext ctx);
}