// Generated from Lang.g4 by ANTLR 4.13.2
package Grammar;

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
	 * Visit a parse tree produced by the {@code randomFunction}
	 * labeled alternative in {@link LangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomFunction(LangParser.RandomFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainFunction}
	 * labeled alternative in {@link LangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(LangParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fnBlockLine}
	 * labeled alternative in {@link LangParser#fnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnBlockLine(LangParser.FnBlockLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fnBodyLine}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnBodyLine(LangParser.FnBodyLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fnBodyLineMore}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnBodyLineMore(LangParser.FnBodyLineMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fnReturnExprLine}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnReturnExprLine(LangParser.FnReturnExprLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fnReturnLine}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnReturnLine(LangParser.FnReturnLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineStmt}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStmt(LangParser.LineStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineIf}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineIf(LangParser.LineIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineDoWhile}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineDoWhile(LangParser.LineDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineWhile}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineWhile(LangParser.LineWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineFor}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineFor(LangParser.LineForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineSwitch}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineSwitch(LangParser.LineSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineBlock}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineBlock(LangParser.LineBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineEOL}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineEOL(LangParser.LineEOLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineComment}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineComment(LangParser.LineCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockComment}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockComment(LangParser.BlockCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAtrib}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAtrib(LangParser.StmtAtribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtInput}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtInput(LangParser.StmtInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtOutput}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtOutput(LangParser.StmtOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtFuncInvoc}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFuncInvoc(LangParser.StmtFuncInvocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcInvocLine}
	 * labeled alternative in {@link LangParser#funcInvoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInvocLine(LangParser.FuncInvocLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LangParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputRead}
	 * labeled alternative in {@link LangParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputRead(LangParser.InputReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputReadVarStr}
	 * labeled alternative in {@link LangParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputReadVarStr(LangParser.InputReadVarStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outputVar}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputVar(LangParser.OutputVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outputWrite}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputWrite(LangParser.OutputWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outPutWriteStr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutPutWriteStr(LangParser.OutPutWriteStrContext ctx);
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
	 * Visit a parse tree produced by the {@code dowhilestDoWhile}
	 * labeled alternative in {@link LangParser#dowhilest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhilestDoWhile(LangParser.DowhilestDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whilestWhile}
	 * labeled alternative in {@link LangParser#whilest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestWhile(LangParser.WhilestWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forstFor}
	 * labeled alternative in {@link LangParser#forst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstFor(LangParser.ForstForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStmt}
	 * labeled alternative in {@link LangParser#switchst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(LangParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(LangParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#defClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefClause(LangParser.DefClauseContext ctx);
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
	 * Visit a parse tree produced by the {@code atribDecl}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribDecl(LangParser.AtribDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribChar}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribChar(LangParser.AtribCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribArray}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribArray(LangParser.AtribArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribAssign}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribAssign(LangParser.AtribAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribIncrement}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribIncrement(LangParser.AtribIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribDecrement}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribDecrement(LangParser.AtribDecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(LangParser.TypeSpecContext ctx);
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
	/**
	 * Visit a parse tree produced by the {@code factorDecim}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorDecim(LangParser.FactorDecimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code includeDirective}
	 * labeled alternative in {@link LangParser#preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeDirective(LangParser.IncludeDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineDirective}
	 * labeled alternative in {@link LangParser#preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineDirective(LangParser.DefineDirectiveContext ctx);
}