// An enum type is a fixed set of predefined constants
// It should be use anuwhere you need to repreent a fixed set of constants

// Basic example
public enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
  FRIDAY, STURDAY, SUNDAY
}

// Inside a switch statement you can acces any key directly
// In other places is accesed by the enum name:
Day.MONDAY
