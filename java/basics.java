// Inline comments
/*
Multiline
comments
*/

// Variables
/*
Case-sensitive
First char a character, subsequent char, number, $, _

## Kind of variable:
* Instance Variables (Non-Static Fields) -> Insatance-related variable
* Class Variable (Static field) -> class-related variable
* Local Variable -> Method-related variable
* Parameter -> Variable in the declaration of a function, class...
* Argument -> Actual value passe to a function (parameter)
*/

// Primiive data types
byte    // 8-bit signed [-128, 127]
short   // 16-bit signed [-32.768, 32.767]
int     // 32-bit signed
long    // 64-bit signed
float   // 32-bit floating point (rarely used)
double  // 64-bit double precission. Never for precise stuff -> BigDecimal)
boolean // Represents one bit of information -> true false
char    // 16-bit Unicode character

String  // Inmutable array-like character Data Type

/*
Literals

Source code representation of a fixed value.

26       // Decimal literal
0x1a     // Hdxadecimal literal
0b11010  // Binary literal

123.4   // Double literal (implicit)
123.4d  // Double literla [bad style]
1.234e2 // Scientific notation, Double
123.4f  // Float literal

Underscore can be used as literal separato
Never at a beginning or end of a number, or near a nonnumber symbol

12_111_111f  // Valid example
*/


/*
Default values

Unitialized fields got a default value by the compiler, usually 0.
Do not rellay on it
*/


/*
Arrays

Container objects that hold a fixed number of values of a single type.
Each item is called an element, and is accesed by a numerical index starting at 0.

A list is an ordered collection.
A collection is an objects that group multiples elements.
*/

// Array declararion
int[] anArray = new int[10];
int[] initAray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

// Multidimensional Array
String[][] names = {
  {"Mr. ", "Mrs. ", "Ms. "},
  {"Smith", "Jones"}
};

// Utils
anArray.length  // 10
Arrays.sort(anArray);  // In place
Arrays.parallelSort(anArray)  // Usefull for >~ 5000 elements

System.arraycopy(Object src, int srcPos, Object dest, int destPos, int lenght);
int[] = java.utils.copyOfRange(T[] origina, int from, int to);
java.utils.fill(T[] a, int fromIndex, int toIndext, T value);  // void
java.utils.equals(Object[] a, Object a2);  // boolean


// Operators preference

expr++ expr--                  // postfix
++expr --expr +expr -expr ~ !  // unary
* / %                          // multiplicative
+ -                            // additive
<< >> >>>                      // shift
< > <= >= instanceof           // relational
== !=                          // equality
&                              // bitwise AND
^                              // bitwise OR
|                              // bitwise exclusive OR
&&                             // logical AND
||                             // logical OR
? :                            // ternary
= += -+ *= /= %= &= ^= |= <<=  // assignment


/* Modifiers

Acces levels

Modifier    Class   Package Subclass    World

public      Y       Y       Y           Y
protected   Y       Y       Y           N
no modifier Y       Y       N           N       // aka Package-privative
private     Y       N       N           N

A class (top level) can be public or package-privative
At a member level all acces levels are possible


static  // modifier is used to design a class-level field

final   // modifiers marks a variable that does not change
a final method cannot be overrided (usefull during instance initialization)

*/
