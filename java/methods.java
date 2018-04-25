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


// Returns
return;  // If the function does not return nothing, a final return is opcional
// If a function declares a return type, always have to retun something

// If the return type is a class, an object of this class of any subclass
// should be returned -> Covariant return type


this  // keyword can be used within a method or Constructor
// is used to refernce the current object
// Inside a constructor can be used as a call to other constrructor in the same Class
this(other_constructor_arguments);
