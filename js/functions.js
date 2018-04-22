function square(number) {
  return number * number;
}
// Equivalento to function expression
var square = function(number) { return number * number; };

// We can provide a name to refere inside the function
var factorial = function fac(n) { return n < 2 ? 1 : n * fac(n - 1); };

// Function hosting do exist when declared like
function funcName(){}

// Primitive arguments passed by value
// Compley tyoes like objects by reference

// We can pass more arguments than declared, if so ther'll be in
arguments[i]; // Array like
// or with Rest parameters
function f(a, b, ...theArgs) {}  // Actuall array

// Default parameters do exist
function multiply(a, b = 1) {}

// Clousures
function outside(x) {
  function inside(y) {
    return x + y;
  }
  return inside;
}
fn_inside = outside(3); // Think of it like: give me a function that adds 3 to whatever you give it
result = fn_inside(5); // returns 8

result1 = outside(3)(5); // returns 8


// Arrow functions
var a2 = a.map(function(s) { return s.length; });
var a3 = a.map(s => s.length);

// Top level functions
eval()  // Evaulate string as JS code
isFinite()
isNaN()
parseFloat()
parseInt()
decodeURI()
decodeURI()
encodeURI()
encodeURIComponent()
