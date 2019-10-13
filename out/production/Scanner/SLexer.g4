lexer grammar SLexer;

STRING : ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'@')+ |
         ('"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"') ;

// Skip all spaces, tabs, newlines
WS : [ \t\r\n]+ -> skip ;

// Skip comments
LINE_COMMENT : '//' ~[\r\n]* '\r'? '\n' -> skip ;

// Separators and Operators
LPAREN : '(' ;
RPAREN : ')' ;
EQUALS : '=' ;
SEMICO : ';' ;
ASSIGN : ':=' ;
LBRACK:  '{' ;
RBRACK:  '}' ;
LESSTN:  '<' ;
GESSTN:  '>' ;
NOTOPN:  '!' ;
APPROX:  '~' ;
OPTION:  '?' ;
COLON:  ':' ;
DEQUAL:  '==';
LEQUAL:  '<=';
GEQUAL:  '>=';
NEQUAL:  '!=';
ANDD:  '&&';
ORR:   '||';
INCR: '++';
DECR: '--';
ADD: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';
AND: '&';
OR: '|';
EXP: '^';
PERC: '%';
DLEFT: '<<';
RIGHT: '>>';
QRIGHT: '>>>>';
PEQUAL: '+=';
MEQUAL: '-=';
TEQUAL: '*=';
SEQUAL: '/=';
AEQUAL: '&=';
OEQUAL: '|=';
EEQUAL: '^=';
REQUAL: '%=';
DLEQUAL: '<<=';
DRQUAL: '>>=';

