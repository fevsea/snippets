/*
Expressions
A construct made up of variables, operatos and method invocation that evaluates to a single value.

Statements
Complete unite of execution ~ a line ending with ;
We can differenciate expression statements (assignments, invocations, instantiations...), declaration statements, control flow statements...

Blocks
A group of zero or more statements between balanced braces that can be used anywhere a single statements is allowed.
*/


// Control flow Statements

// Blocks optionals if only need one statement.

// if-elif-else
if (boolean_statementA) {
  pass();
} else if (boolean_statementB) {
  pass();
} else {
  pass();
}

// switch
// Works with byte, shsort, char, int, String and enumerated types
// Always test if vatiable is null
switch (variable){
  case value_1: pass();
                pass();
                break;
  case value_2: case value_3:
  case value_4:
        pass();
        pass();
        break;
  default: break;
}

// while
while (condition) {
  statement(s);
}

// do while
do {
  statemen(s);
} while (expression);

// for
// all 3 expresions are optional
for (initialization; termination; incremant) {
  statement(s);
}

// for collections and Arrays
// use whenever possible
for (T item : array) {
  process(item);
}


// branching Statements
// for, while, do-while, shttps://www.vayagif.com/witch

// unlabeled break
break; // terminates the innermost statement

// unlabeled continue
continue;  // terminates the current iteration of the innermost statement

// labeled
label_name:
  iterative_statement {
    continue label_name;
    break label_name;
  }


// Conditional assignment
someBool ? doSomethingTrue() : doSomethingElseFalse();
var = condition ? valueTrue : valueFalse;
