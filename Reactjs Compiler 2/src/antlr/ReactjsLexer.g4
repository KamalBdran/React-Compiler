lexer grammar ReactjsLexer;

// KEYWORDS
EXTENDS: 'extends';
REACT_PURE_COMPONENT: 'React.PureComponent';
RENDER: 'render';
RETURN: 'return';
EXPORT: 'export';
DEFAULT: 'default';
IF: 'if';
ELSE: 'else';
FOR: 'for';
CLASS_NAME: 'className';
VAR: 'var' | 'let';
CONST: 'const';
PROPS: 'props';
USESTATE: 'useState';
USEEFFECT: 'useEffect';
USEREF: 'useRef';
LENGTH: 'length';
PUSH: 'push';
ONCLICK: 'onClick';

// BRACKETS
OPEN_SQUARE_BRACKETS: '[';
CLOSE_SQUARE_BRACKETS: ']';

OPEN_CURLY_BRACKETS: '{';
CLOSE_CURLY_BRACKETS: '}';

OPEN_PARENTHSES: '(';
CLOSE_PARENTHSES: ')';

OPEN_TAG: '<';
CLOSE_TAG: '>';

// SYMPOLS
ARROW: '=>';
SLASH: '/';
EQUALS: '=';
DOUBLE_QUOTES: '"';
DOT: '.';
COMMA: ',';
COLON: ':';
SIMICOLON: ';';
EX: '!';
PLUS: '+';
MINUS: '-';
OR: '||';
AND: '&&';

//
BOOLEAN: 'true' | 'false';
WORD_WITH_CAPITAL: [A-Z][a-zA-Z0-9]*;
ID: [a-zA-Z]+;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;