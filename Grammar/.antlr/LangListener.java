// Generated from c:/Users/pedro/OneDrive/Área de Trabalho/Compilador/Grammar/Lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code progLine}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgLine(LangParser.ProgLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progLine}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgLine(LangParser.ProgLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(LangParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(LangParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#fnBlock}.
	 * @param ctx the parse tree
	 */
	void enterFnBlock(LangParser.FnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#fnBlock}.
	 * @param ctx the parse tree
	 */
	void exitFnBlock(LangParser.FnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void enterFnBody(LangParser.FnBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void exitFnBody(LangParser.FnBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LangParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LangParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LangParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LangParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#funcInvoc}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvoc(LangParser.FuncInvocContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#funcInvoc}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvoc(LangParser.FuncInvocContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(LangParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(LangParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(LangParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(LangParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(LangParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(LangParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstIf}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 */
	void enterIfstIf(LangParser.IfstIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstIf}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 */
	void exitIfstIf(LangParser.IfstIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstIfElse}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 */
	void enterIfstIfElse(LangParser.IfstIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstIfElse}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 */
	void exitIfstIfElse(LangParser.IfstIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockLine}
	 * labeled alternative in {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockLine(LangParser.BlockLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockLine}
	 * labeled alternative in {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockLine(LangParser.BlockLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condRelop}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondRelop(LangParser.CondRelopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condRelop}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondRelop(LangParser.CondRelopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(LangParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(LangParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(LangParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(LangParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(LangParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(LangParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(LangParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(LangParser.CondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribVar}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtribVar(LangParser.AtribVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribVar}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtribVar(LangParser.AtribVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(LangParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(LangParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(LangParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(LangParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTerm(LangParser.ExprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTerm(LangParser.ExprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termMult}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMult(LangParser.TermMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termMult}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMult(LangParser.TermMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermDiv(LangParser.TermDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermDiv(LangParser.TermDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termFactor}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermFactor(LangParser.TermFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termFactor}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermFactor(LangParser.TermFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpr(LangParser.FactorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpr(LangParser.FactorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorVar}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorVar(LangParser.FactorVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorVar}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorVar(LangParser.FactorVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorNum}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNum(LangParser.FactorNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNum}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNum(LangParser.FactorNumContext ctx);
}