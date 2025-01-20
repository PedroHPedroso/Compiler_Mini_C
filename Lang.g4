grammar Lang;

//--------------------
// Regras de alto nível
//--------------------
prog
  : decl          #progDecl
  | functions     #progFunctions
  | line+         #progLine
  ;

decl
  : typeSpec varDeclList EOL
  ;

varDeclList
  : 
   varDecl 
  |varDecl (',' varDecl)*
  ;

varDecl
  : VAR ('[' NUM ']')? ('=' expr)?
  ;

//--------------------
// FUNÇÕES
//--------------------
functions
  : function functions
  | // vazio
  ;

function
  : typeSpec VAR '(' params ')' fnBlock
  ;

fnBlock
  : '{' fnBody '}'
  ;

fnBody
  : line
  | line fnBody
  | RETURN expr EOL
  | RETURN EOL
  ;

params
  : typeSpec VAR
  | typeSpec VAR SEP params
  | // vazio
  ;

//--------------------
// LINHAS / BLOCOS
//--------------------
line
  : 
    decl EOL
  | stmt EOL
  | ifst
  | whilelist
  | forst
  | switchst
  | block
  | EOL
  ;

block
  : '{' line+ '}'          #blockLine
  ;

//--------------------
// STATEMENTS
//--------------------
stmt
  : atrib
  | input
  | output
  | funcInvoc
  | pointer
  ;

// 1) Input rotulado
input 
  : SCANF '(' '&' VAR ')'  #inputRead
  ;

// 2) Output com 3 subalternativas rotuladas
output
  : PRINTF '(' STR (SEP expr)* ')'  #outputWriteStr
  | PRINTF '(' VAR ')'              #outputWriteVar
  | PRINTF '(' expr ')'             #outputWriteExpr
  ;

//--------------------
// FUNC INVOC
//--------------------
funcInvoc
  : VAR '(' args? ')'  #funcInvocLine
  ;

args
  : expr (SEP expr)*
  ;

//--------------------
// PONTEIRO
//--------------------
pointer
  : VAR AT '&' VAR
  | MULT VAR AT expr
  ;

//--------------------
// ATRIBUIÇÃO
//--------------------
typeSpec
  : 'int'
  | 'float'
  | 'char'
  | 'void'
  ;

//--------------------
// IF / ELSE
//--------------------
ifst
  : IF '(' cond ')' b1=block                    #ifstIf
  | IF '(' cond ')' b1=block ELSE b2=block      #ifstIfElse
  ;


//--------------------
// FOR
//--------------------
forst
  : FOR '(' atrib EOL cond EOL atrib ')' block
  ;

//--------------------
// WHILE
//--------------------
whilelist
  : WHILE '(' cond ')' block
  ;

//--------------------
// SWITCH
//--------------------
switchst
  : SWITCH '(' VAR ')' '{' caseClause* defClause? '}'
  ;

caseClause
  : CASE expr ':' line+ BREAK EOL
  ;

defClause
  : DEFAULT ':' line+ BREAK EOL
  ;

//--------------------
// EXP / COND
//--------------------
cond
  : expr                                           #condExpr
  | e1=expr op=(EQ|NE|LT|GT|LE|GE) e2=expr         #condRelop
  | c1=cond AND c2=cond                            #condAnd
  | c1=cond OR c2=cond                             #condOr
  | NOT cond                                       #condNot
  ;

atrib
  : VAR AT expr           #atribVar
  ;

expr
  : term PLUS expr        #exprPlus
  | term MINUS expr       #exprMinus
  | term                  #exprTerm
  ;

term
  : factor MULT term      #termMult
  | factor DIV term       #termDiv
  | factor                #termFactor
  ;

factor
  : '(' expr ')'          #factorExpr
  | VAR                   #factorVar
  | NUM                   #factorNum
  ;

//--------------------
// DIRETIVAS (opcional)
//--------------------
preprocessor
  : '#include' '<' VAR '>'
  | '#DEFINE' VAR expr
  ;

//=========================
// LÉXICO
//=========================
WHILE       : [wW][hH][iI][lL][eE] ;
FOR         : [fF][oO][rR] ;
IF          : [iI][fF] ;
RETURN      : [rR][eE][tT][uU][rR][nN] ;
ELSE        : [eE][lL][sS][eE] ;
SWITCH      : [sS][wW][iI][tT][cC][hH] ;
CASE        : [cC][aA][sS][eE] ;
DEFAULT     : [dD][eE][fF][aA][uU][lL] ;
BREAK       : [bB][rR][eE][aA][kK] ;
PRINTF      : [pP][rR][iI][nN][tT][fF] ;
SCANF       : [sS][cC][aA][nN][fF] ;

// TOKENS NOMEADOS (para condRelop)
EQ          : '==';
NE          : '!=';
LT          : '<';
GT          : '>';
LE          : '<=';
GE          : '>=';

// TOKENS de operadores lógicos / aritméticos
AND         : '&&';
OR          : '||';
NOT         : '!';
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';

// OUTROS
AT          : '=';
SEP         : ',';
EOL         : ';';

// LITERAIS
STR         : '"' ~["]* '"' ;
NUM         : [0-9]+ ('.' [0-9]+)? ;
VAR         : [a-zA-Z_][a-zA-Z0-9_]* ;

// COMENTÁRIOS e ESPAÇOS
COMMENT     : '//' ~[\r\n]* -> skip ;
WS          : [ \t\n\r]+ -> skip ;
