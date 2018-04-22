// Classes -> Blueprints from witch individuals objects are created

class Bicycle {

  int cadence = 0;

  void changeCadence(int newCadence){
    this.cadence = newCadence;
  }

  void printCadence(){
    System.out.println("cadence: " + this.cadence)
  }
}

// Main class
class BicycleDemo {
  publi c static void main(String[] args) {
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    bike1.changeCadence(2);
    bike1.printCadence();

  }
}

interface IMountainBike {
  // Will be required by the compiler
  void changeGear(int newGear);
}

class MountainBike extends Bicycle implements IMountainBike {
  // New fields & methods to add to Bicycle class

  int gear = 2;

  void changeGear(int newGear){
    this.gear = newGear;
  }

}
