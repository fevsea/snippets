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
