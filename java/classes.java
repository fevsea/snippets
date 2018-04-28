// Classes -> Blueprints from witch individuals objects are created

// Class declaration
class Bicycle {
  // static declarations
  static {
    // static initiallization block
    // if static variables need some complex initialization, goes here
  }

  {
    // if present this code will be copied to every constructor
  }

  // the Bicycle class has
  // three fields
  public int cadence;
  public int gear;
  public int speed;

  // Constructor
  public Bicycle(int startCadence, int startSpeed, int startGear) {
    // The compiler automatically provides a no argument, default constructor if none is declared.
    // This constructor will call the no-argument constructor of the superclass.
    // If the superclass does not have it, the compiler will complain.

    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
    }

  // the Bicycle class has
  // two methods
  void changeCadence(int newCadence){
    this.cadence = newCadence;
  }

  void printCadence(){
    System.out.println("cadence: " + this.cadence)
  }
}

// Interfaces can be declared inside clases, but only on static context (no inner)
interface IMountainBike {
  // Will be required by the compiler
  void changeGear(int newGear);
}

class MountainBike extends Bicycle implements IMountainBike {
  // New fields & methods to add to Bicycle class

public MountainBike(int startHeight, int startCadence,
                    int startSpeed, int startGear) {
      super(startCadence, startSpeed, startGear);
      seatHeight = startHeight;
  }

  int gear = 2;

  void changeGear(int newGear){
    this.gear = newGear;
  }

}

// Main class
class BicycleDemo {
  public static void main(String[] args) {
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    bike1.changeCadence(2);
    bike1.printCadence();

  }
}


/* Nested clases
Those defined inside another class.
Can be Static nested clases, or Inner classes

Static nested classes are like any top-level class that have meen nested for packagin convenience.
Can only be declared throw the class.


Inner classes can be declared with any visibility.
Have acces to all members of the enclosing class, even if pricate.
Can obnly be declared throw an object.
Serialization of inner classes are discorage, as can vary allong compilers.

Local classes are those defined inside a block.
Can access local variables and parameters of the enclosing block that are
final or effectively final.
Cannot define any static methods (unless final)

SUM UP
Local class - Declred inside a block. It-s an inner class and have acces to local vars
Anonymous class - To declare fields or additional methods
Lambda expression - Sinfle unit, or an instance of a functional interface.
Static nested class - Only have acces to public fields. Similar to normal classes
Inner class - Can only exist withing an instance of super. Can acces to all members
*/

// Shadowing problem
public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String... args) {
       ShadowTest st = new ShadowTest();
       ShadowTest.FirstLevel fl = st.new FirstLevel();
       fl.methodInFirstLevel(23);
   }
}


// Anonymous Classes
HelloWorld frenchGreeting = new HelloWorld() {
           String name = "tout le monde";
           public void greet() {
               greetSomeone("tout le monde");
           }
           public void greetSomeone(String someone) {
               name = someone;
               System.out.println("Salut " + name);
           }
       };

new InterfaceOrSuperclass(construct args) {
  method implementation;
}


// A funtional interfaces is witch only contains one abstract method,
// (and some defauld or static methods) -> Lambda expressions capable
// Java util functions -> https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

/* Syntax of lambda expressions

*/

(a, b) -> {return a}  // Input params type can be ommited.
a -> a    //  If only one arg, optional paremeters.
// If the body has a sinbgle expresion. ot value is returned. You can unse return.
// Lambdas work on the same level of scoping where thay are declared.
// As withing inner classes, lambdas can only acces final or effective final local variables.

public static void printPersonsWithPredicate(
    List<Person> roster, Predicate<Person> tester) {
    for (Person p : roster) {
        if (tester.test(p)) {
            p.printPerson();
        }
    }
}

printPersonsWithPredicate(
    roster,
    p -> p.getGender() == Person.Sex.MALE
        && p.getAge() >= 18
        && p.getAge() <= 25
);

/* Method preference
Kind 	                                      Example
Reference to a static method 	              ContainingClass::staticMethodName
Reference to an instance method of
  a particular object 	                    containingObject::instanceMethodName
Reference to an instance method of
  an arbitrary object of a particular type 	ContainingType::methodName
Reference to a constructor 	                ClassName::new
*/
// Those are equivalent
(a, b) -> Person.compareByAge(a, b)
Person::compareByAge
