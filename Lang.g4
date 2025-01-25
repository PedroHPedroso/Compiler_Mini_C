grammar Lang;

//RELATORIO GERAL
/*
  Revisar tudo.
  Arrumar input.
  Arrumar output.
  Arrumar/Revisar STR.
  Revisar typeSpec CHAR.
  Tentar implementar ponteiros, structs, unions.
*/


//--------------------
// Regras de alto nível
//--------------------
prog
  : preprocessor* functions               #progLine
  ;

functions
  : function functions
  | //empty
  ;

function
  : typeSpec VAR '(' params ')' fnBlock   #randomFunction
  | 'int' 'main' '(' ')' fnBlock          #mainFunction
  ;

fnBlock
  : '{' fnBody '}'                       #fnBlockLine
  ;

fnBody
  : line                                 #fnBodyLine
  | line fnBody                          #fnBodyLineMore
  | RETURN expr EOL                      #fnReturnExprLine
  | RETURN EOL                           #fnReturnLine
  ;

params
  : typeSpec VAR
  | typeSpec VAR SEP params
  | // vazio
  ;

line
  : stmt EOL                             #lineStmt
  | ifst                                 #lineIf
  | dowhilest                            #lineDoWhile
  | whilest                              #lineWhile
  | forst                                #lineFor
  | switchst                             #lineSwitch
  | block                                #lineBlock
  | EOL                                  #lineEOL
  | COMMENT_LINE                         #lineComment
  | COMMENT_BLOCK                        #blockComment
  ;

stmt
  : atrib                                #stmtAtrib
  | input                                #stmtInput
  | output                               #stmtOutput
  | funcInvoc                            #stmtFuncInvoc
  ;

funcInvoc
  : VAR '(' args? ')'                    #funcInvocLine
  ;

args
  : expr (SEP expr)*
  ;

input
  : SCANF '(' STR (SEP '&'* VAR)+ ')'     #inputRead
  | GETS '(' VAR ')'                      #inputReadVarStr
  ;

output
  : PRINTF '(' VAR ')'                    #outputVar
  | PRINTF '(' STR (SEP expr)* ')'        #outputWrite
  | PUTS '(' VAR ')' *                    #outPutWriteStr
  ;

ifst
  : IF '(' cond ')' block                       #ifstIf
  | IF '(' cond ')' b1=block ELSE b2=block      #ifstIfElse
  ;

dowhilest
  : DO '{' block '}' WHILE '(' cond ')' EOL     #dowhilestDoWhile
  ;

whilest
  : WHILE '(' cond ')' block                    #whilestWhile
  ;

forst
  : FOR '(' atrib EOL cond EOL atrib ')' block  #forstFor
  ;

switchst
  : SWITCH '(' VAR ')' '{' caseClause* defClause? '}'  #switchStmt
  ;

caseClause
  : CASE expr ':' line* BREAK EOL
  ;

defClause
  : DEFAULT ':' line* BREAK EOL
  ;

block
  : '{' line* '}'                                #blockLine
  ;

cond
  : expr                                         #condExpr
  | e1=expr RELOP=(EQ|NE|LT|GT|LE|GE) e2=expr    #condRelop
  | c1=cond AND c2=cond                          #condAnd
  | c1=cond OR c2=cond                           #condOr
  | NOT cond                                     #condNot
  ;

atrib
  : typeSpec VAR                                  #atribVar
  | typeSpec VAR AT expr                          #atribDecl
  | typeSpec VAR AT STR                           #atribChar
  | typeSpec VAR '[' factor ']'                   #atribArray
  | VAR AT expr                                   #atribAssign
  | VAR '++'                                      #atribIncrement
  | VAR '--'                                      #atribDecrement
  ;

typeSpec
  : 'int'
  | 'float'
  | 'double'
  | 'char'
  | 'void'
  ;

expr
  : term PLUS expr                               #exprPlus
  | term MINUS expr                              #exprMinus
  | term                                         #exprTerm
  ;

term
  : factor MULT term                             #termMult
  | factor DIV term                              #termDiv
  | factor                                       #termFactor
  ;

factor
  : '(' expr ')'                                 #factorExpr
  | VAR                                          #factorVar
  | NUM                                          #factorNum
  | DECIM                                        #factorDecim
  ;

//--------------------
// Diretivas de pré-processador
//--------------------
preprocessor
  : '#include' '<' VAR '>'                       #includeDirective
  | '#define' VAR expr                           #defineDirective
  ;

//=========================
// Regras Léxicas
//=========================
DO           : 'do';
WHILE        : 'while';
FOR          : 'for';
IF           : 'if';
RETURN       : 'return';
ELSE         : 'else';
SWITCH       : 'switch';
CASE         : 'case';
DEFAULT      : 'default';
BREAK        : 'break';
PRINTF       : 'printf';
PUTS         : 'puts';
SCANF        : 'scanf';
GETS         : 'gets';
EQ           : '==';
NE           : '!=';
LT           : '<';
GT           : '>';
LE           : '<=';
GE           : '>=';
AND          : '&&';
OR           : '||';
NOT          : '!';
PLUS         : '+';
MINUS        : '-';
MULT         : '*';
DIV          : '/';
AT           : '=';
SEP          : ',';
EOL          : ';';
STR          : '"' (~["\\])* '"';
NUM          : [0-9]+;
DECIM        : [0-9]+ '.' [0-9]+;
VAR          : [a-zA-Z_][a-zA-Z0-9_]*;
COMMENT_LINE : '//' ~[\r\n]* -> skip;
COMMENT_BLOCK: '/*' .*? '*/' -> skip;
WS           : [ \t\n\r]+ -> skip;