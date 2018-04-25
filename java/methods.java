modifiers returnType setName(typeA nameA, typeB nameB) {

}

// Java has method overloading
// The compiler does not consider return type when differentiating methods
// Constructors can be overloaded
public void draw(String s) {
  ...
}

public void draw(int i) {
  ...
}

// Arbitrary number of arguments
public PrintStream printf(String format, Object... args);
// args is accesed like an array of object

// Primitive arguments (int, float...) are passed into methods by value
// Objects (position) are also passed by value.
