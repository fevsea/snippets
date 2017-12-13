// Case-sensitive with Unicode

// Variablres
// Global: declared outside function, accesyble anywhere in the file
// Local: declared inside function, accesible anywhere inside function
// BLock-scope: declared inside block, accesible only insithe that block

var x = 42;  // Global or local
let y = 13;  // BLock-scope Variablres

var a;  // a == undefined
// undefined eval as fañse nut is converned to NaN in numerical context

const PI = 3.14;  // Same scope as let, must be iniciaized
/*
* Constants var cannot change or be redeclared
*  but the properties of objects are not protected
*/


/*
*  Data types
*  Booleadn: true |  false
*  Null: null
*  Number: 42 | 3.1415
*  Undefined: undefined
*  String: "js"
*  Symbol
*/

// Literals

var coffees = ['French Roast', "Colombian", 'Kona'];
var fish = ["Lion", , 'Angel'];  // fish[1] == undefined
['home', , ,'school', ,].length == 5
var re = /ab+c/;  / Regex

/*
* 0, 117 and -345 (decimal, base 10)
* 015, 0001 and -0o77 (octal, base 8)
* 0x1123, 0x00111 and -0xF1A7 (hexadecimal, "hex" or base 16)
* 0b11, 0b0011,  -0b11 (binary, base 2)
/*

/*
* 3.1415926
* -.123456789
* -3.1E+12
* .1e-23
*/

// Strings
// Basic literal string creation
`In JavaScript '\n' is a line-feed.`

// Multiline strings
`In JavaScript template strings can run
 over multiple lines, but double and single
 quoted strings cannot.`

// String interpolation
var name = 'Bob', time = 'today';
`Hello ${name}, how are you ${time}?`


// Conversions
x = 'The answer is ' + 42 // "The answer is 42"
y = 42 + ' is the answer' // "42 is the answer"
'37' - 7 // 30
'37' + 7 // "377"

parseInt()
parseFloat()

// objects
var car = { myCar: 'Saturn', getCar: carTypes('Honda'), special: sales };

var car = { manyCars: {a: 'Saab', 'b': 'Jeep'}, 7: 'Mazda' };
console.log(car.manyCars.b); // Jeep
console.log(car[7]); // Mazda



/*
*  Controll flow
*/

// evaluates to false; false undefined null 0 NaN ""

if (condition_1) {
  statement_1;
} else if (condition_2) {
  statement_2;
} else if (condition_n) {
  statement_n;
} else {
  statement_last;
}


switch (expression) {
  case label_1:
    statements_1
    [break;]
  case label_2:
    statements_2
    [break;]
    ...
  default:
    statements_def
    [break;]
}

var a =  condición ? expr1 : expr2
// Lops and iterations

for ([initialExpression]; [condition]; [incrementExpression])
  statement

// Iterates a specified variable over all the enumerable properties of an object
for (variable in object)  // Do not use in arrays
  statements

// Iterates over iterable objects (Arraus, Map, Set, arguments...)
for (variable of object)
  statement


do
  statement
while (condition);

while (condition)
  statement

labelName:
loopStructure(expression){
  break labelName;
  continue labelName;
}
