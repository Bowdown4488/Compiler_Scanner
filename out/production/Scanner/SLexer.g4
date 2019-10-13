lexer grammar SLexer;

// Define string values - either unquoted or quoted
STRING : ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'@')+ |
         ('"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"') ;

// Skip all spaces, tabs, newlines
WS : [ \t\r\n]+ -> skip ;

// Skip comments
LINE_COMMENT : '//' ~[\r\n]* '\r'? '\n' -> skip ;

// Define punctuations
LPAREN : '(' ;
RPAREN : ')' ;
LBRACK:  '{' ;
RBRACK:  '}' ;
EQUALS : '=' ;
SEMICO : ';' ;
ASSIGN : ':=' ;