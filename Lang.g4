grammar Lang;

prog        : 
              decl          #progDecl
            | functions     #progFunctions
            | line+         #progLine 
            ;
          
decl        :
              typeSpec varDeclList EOL
            ;

varDeclList :
              varDecl (',' varDecl)*
            ;

varDecl     :
              VAR ('[' NUM ']')? ('=' expr)?
            ;                   

functions   : function functions
            | //empty
            ;

function    : 
              typeSpec VAR '('params')' fnBlock
            ;

fnBlock     : 
            '{'fnBody'}'
            ;

fnBody      :
            line
            | line fnBody
            | RETURN expr EOL
            | RETURN EOL
            ;

params      : 
              typeSpec VAR
            | typeSpec VAR SEP params
            | //empty
            ;

line        :
              stmt EOL
            | ifst
            | whilelist
            | forst
            | switchst
            | block
            | EOL
            ;

funcInvoc   :
            VAR '(' args? ')'
            ;

args        :
              expr (SEP expr)*
            ;

stmt        :
              atrib
            | input
            | output
            | funcInvoc
            | pointer
            ;

input       : 
               SCANF '(' '&' VAR ')'
            ;

output      :
              PRINTF '(' STR (SEP expr)* ')'
            ;

pointer     : 
              VAR AT '&' VAR
            | '*' VAR AT expr 
            ;

typeSpec    : 
              'int'
            | 'float'
            | 'char'
            | 'void'
            ;

ifst        :
             IF '(' cond ')' block elseif?
            ;

elseif      : 
             ELSE IF '(' cond ')' block elseif?
            | ELSE block
            ;

forst       :
              FOR '(' atrib EOL cond EOL atrib ')' block
            ;  

whilelist   :
              WHILE '(' cond ')' block  
            ; 

switchst    : 
              SWITCH '(' VAR ')' '{' caseClause* defClause? '}'
            ;

caseClause  :
              CASE expr ':' line+ BREAK EOL
            ;

defClause   :
              DEFAULT ':' line+ BREAK EOL
            ;

block       :
             '{' line+ '}'          # blockLine
            ;

cond        : 
              expr                  # condExpr
            | e1=expr RELOP=(EQ|NE|LT|GT|LE|GE) e2=expr       # condRelop
            | c1=cond AND c2=cond   # condAnd
            | c1=cond OR c2=cond    # condOr
            | NOT cond              # condNot
            ;

atrib       : 
             VAR AT expr            # atribVar
            ;

expr        : 
              term PLUS expr        # exprPlus
            | term MINUS expr       # exprMinus
            | term                  # exprTerm
            ;

term        : 
              factor MULT term      # termMult
            | factor DIV term       # termDiv
            | factor                # termFactor
            ;           

factor      : 
             '(' expr ')'           # factorExpr
            | VAR                   # factorVar
            | NUM                   # factorNum
            ;

preprocessor : 
              '#include' '<' VAR '>'
            | '#DEFINE' VAR expr
            ;    

OE          : '(' ;
CE          : ')' ;
OB          : '{' ;
CB          : '}' ;
AT          : '=' ;
SEP         : ',' ;
PLUS        : '+' ;
MINUS       : '-' ;
MULT        : '*' ;
DIV         : '/' ;
AND         : '&&' ;
OR          : '||' ;
NOT         : '!' ;
EQ          : '==' ;
LT          : '<' ;
GT          : '>' ;
LE          : '<=' ;
GE          : '>=' ;
NE          : '!=' ;
WHILE       : [wW][hH][iI][lL][eE] ;
FOR         : [fF][oO][rR] ;
IF          : [iI][fF] ;
RETURN      : [rR][eE][tT][uU][rR][nN] ;
ELSE        : [eE][lL][sS][eE] ;
SWITCH      : [sS][wW][iI][tT][cC][hH];
CASE        : [cC][aA][sS][eE] ;
DEFAULT     : [dD][eE][fF][aA][uU][lL];
BREAK       : [bB][rR][eE][aA][kK];
PRINTF      : [pP][rR][iI][nN][tT][fF] ;
SCANF       : [sS][cC][aA][nN][fF] ;
STR         : '"' ~["]* '"' ;
EOL         : ';' ;
NUM         : [0-9]+ ('.' [0-9]+)? ;
VAR         : [a-zA-Z_][a-zA-Z0-9_]* ;
COMMENT     : '//' ~[\r\n]* -> skip ;
WS          : [ \t\n\r]+ -> skip ;
