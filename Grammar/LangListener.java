package Grammar;

// Generated from Lang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code progDecl}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgDecl(LangParser.ProgDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progDecl}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgDecl(LangParser.ProgDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code progFunctions}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgFunctions(LangParser.ProgFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progFunctions}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgFunctions(LangParser.ProgFunctionsContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#varDeclList}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclList(LangParser.VarDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#varDeclList}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclList(LangParser.VarDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(LangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(LangParser.VarDeclContext ctx);
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
	 * Enter a parse tree produced by the {@code inputRead}
	 * labeled alternative in {@link LangParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputRead(LangParser.InputReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputRead}
	 * labeled alternative in {@link LangParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputRead(LangParser.InputReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputWriteStr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutputWriteStr(LangParser.OutputWriteStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputWriteStr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutputWriteStr(LangParser.OutputWriteStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputWriteVar}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutputWriteVar(LangParser.OutputWriteVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputWriteVar}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutputWriteVar(LangParser.OutputWriteVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputWriteExpr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutputWriteExpr(LangParser.OutputWriteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputWriteExpr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutputWriteExpr(LangParser.OutputWriteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcInvocLine}
	 * labeled alternative in {@link LangParser#funcInvoc}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvocLine(LangParser.FuncInvocLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcInvocLine}
	 * labeled alternative in {@link LangParser#funcInvoc}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvocLine(LangParser.FuncInvocLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LangParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(LangParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(LangParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(LangParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(LangParser.TypeSpecContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#forst}.
	 * @param ctx the parse tree
	 */
	void enterForst(LangParser.ForstContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#forst}.
	 * @param ctx the parse tree
	 */
	void exitForst(LangParser.ForstContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#whilelist}.
	 * @param ctx the parse tree
	 */
	void enterWhilelist(LangParser.WhilelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#whilelist}.
	 * @param ctx the parse tree
	 */
	void exitWhilelist(LangParser.WhilelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#switchst}.
	 * @param ctx the parse tree
	 */
	void enterSwitchst(LangParser.SwitchstContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#switchst}.
	 * @param ctx the parse tree
	 */
	void exitSwitchst(LangParser.SwitchstContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(LangParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(LangParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#defClause}.
	 * @param ctx the parse tree
	 */
	void enterDefClause(LangParser.DefClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#defClause}.
	 * @param ctx the parse tree
	 */
	void exitDefClause(LangParser.DefClauseContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link LangParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor(LangParser.PreprocessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor(LangParser.PreprocessorContext ctx);
}