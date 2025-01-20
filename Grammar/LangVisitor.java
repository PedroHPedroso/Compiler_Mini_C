package Grammar;

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
	 * Visit a parse tree produced by the {@code progDecl}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgDecl(LangParser.ProgDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code progFunctions}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgFunctions(LangParser.ProgFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code progLine}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgLine(LangParser.ProgLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(LangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#varDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclList(LangParser.VarDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(LangParser.VarDeclContext ctx);
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
	 * Visit a parse tree produced by the {@code blockLine}
	 * labeled alternative in {@link LangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockLine(LangParser.BlockLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(LangParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputRead}
	 * labeled alternative in {@link LangParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputRead(LangParser.InputReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outputWriteStr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputWriteStr(LangParser.OutputWriteStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outputWriteVar}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputWriteVar(LangParser.OutputWriteVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outputWriteExpr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputWriteExpr(LangParser.OutputWriteExprContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(LangParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(LangParser.TypeSpecContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#forst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForst(LangParser.ForstContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#whilelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilelist(LangParser.WhilelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#switchst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchst(LangParser.SwitchstContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link LangParser#preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor(LangParser.PreprocessorContext ctx);
}