grammar Lang;

prog        : functions line+         #progLine 
            ;

functions   : function functions
            //empty
            ;

function    : FUNCTION VAR '('params')' fnBlock
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
            VAR
            | VAR SEP params
            | //empty
            ;

line        :
              stmt EOL
            | ifst
            // | whilelist
            // | forst
            |EOL
            ;

funcInvoc   :
            VAR '('params')'
            ;

stmt        :
              atrib
            | input
            | output
            | funcInvoc
            ;

input       : 
               SCANF VAR
            ;

output      :
              PRINTF VAR
            | PRINTF STR
            | PRINTF expr
            ;

ifst:
	  IF '(' cond ')' THEN block                  # ifstIf
	| IF '(' cond ')' THEN b1=block ELSE b2=block # ifstIfElse
    ;
 
block:
     '{' line+ '}'                # blockLine
    ;

cond: 
      expr                        # condExpr
    | e1=expr RELOP=(EQ|NE|LT|GT|LE|GE) e2=expr       # condRelop
    | c1=cond AND c2=cond         # condAnd
    | c1=cond OR c2=cond          # condOr
    | NOT cond                    # condNot
    ;

atrib: 
     VAR '=' expr            # atribVar
    ;

expr: 
      term '+' expr         # exprPlus
    | term '-' expr         # exprMinus
    | term                  # exprTerm
    ;

term: 
      factor '*' term       # termMult
    | factor '/' term       # termDiv
    | factor                # termFactor
    ;           

factor: 
     '(' expr ')'           # factorExpr
    | VAR                   # factorVar
    | NUM                   # factorNum
    ;



OE: '(';
CE: ')';
OB: '{';
CB: '}';
AT: '=';
SEP: ',';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
AND: '&&';
OR: '||';
NOT: '!';
EQ : '==';
LT : '<';
GT : '>';
LE : '<=';
GE : '>=';
NE : '!=';
BOOL_TRUE: 'true';
BOL_FALSE: 'false';
INT : [0-9]+;
FLOAT : [0-9]+'.'[0-9]+;
DOUBLE : [dD][oO][uU][bB][lL][eE];
CHAR : [cC][hH][aA][rR];
VOID : [vV][oO][iI][dD];
WHILE: [wW][hH][iI][lL][eE];
FOR: [fF][oO][rR];
IF: [iI][fF];
FUNCTION: [fF][uU][nN][cC][tT][iI][oO][nN];
RETURN: [rR][eE][tT][uU][rR][nN];
THEN: [tT][hH][eE][nN];
ELSE: [eE][lL][sS][eE];
PRINTF: [pP][rR][iI][nN][tT][fF];
SCANF: [sS][cC][aA][nN][fF];
STR: '"' ~["]* '"';
EOL: ';';
NUM: [0-9]+ (.([0-9]+))?;
VAR: [a-zA-Z_][a-zA-Z0-9_]*;
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\n\r]+ -> skip;