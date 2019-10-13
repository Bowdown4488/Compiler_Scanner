//lexer grammar SLexer;
lexer grammar SLexer;

/*
ABSTRACT : 'abstrakto';
BOOLEAN : 'boorean';
BREAK : 'bureko';
BYTE : 'byto';
CASE : 'kesu';
CATCH : 'katchu';
CHAR : 'karu';
CLASS : 'kurasu';
CONST : 'konst';
CONTINUE : 'kontinu';
DEFAULT : 'deporuto';
DO : 'do';
DOUBLE : 'doburu';
ELSE : 'erusu';
ENUM : 'enumu';
EXTENDS : 'extendo';
FINAL : 'finar';
FINALLY : 'finarri';
FLOAT : 'furoto';
FOR : 'foru';
IF : 'ifu';
GOTO : 'iku';
IMPLEMENTS : 'impremento';
IMPORT : 'importo';
INSTANCEOF : 'insutaof';
INT : 'into';
INTERFACE : 'intefeseru';
LONG : 'rongu';
NATIVE : 'netivu';
NEW : 'newu';
PACKAGE : 'pakeju';
PRIVATE : 'privatto';
PROTECTED : 'protekto';
PUBLIC : 'pubriko';
RETURN : 'returno';
SHORT : 'shorto';
STATIC : 'statiku';
STRICTFP : 'strictofp';
SUPER : 'supa';
SWITCH : 'switchu';
SYNCHRONIZED : 'sinkuronaizu';
THIS : 'disu';
THROW : 'throwu';
THROWS : 'throwsu';
TRANSIENT : 'transento';
TRY : 'tryu';
VOID : 'boido';
VOLATILE : 'voratiru';
WHILE : 'wairu';
*/
STRING : ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'@'|'.')+ |
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

