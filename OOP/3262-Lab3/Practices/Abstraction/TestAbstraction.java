/*
 4. Abstraction 

 Definition: Abstraction is the concept of hiding details and showing 
 only essential information. In Java, abstraction can be achieved with 
 abstract classes and interfaces.

 * Purpose: Simplifies code complexity and increase code readability.
 * How: Use abstract keyword for abstract classes and methods or define
   interface

 */

// Example (Using Abstract Class):

abstract class Vehicle {
  abstract void start(); // abstract method (no body)

  void fuelUp() { // regular method
    System.out.println("Fueling up...");
  }
}

class Car extends Vehicle {
  @Override 
  void start() { // Providing implementation
    System.out.println("Car starting...");
  }
}

public class TestAbstraction {
  public static void main(String[] args) {
    Vehicle v = new Car();
    v.start();
    v.fuelUp();
  }
}

// In this example, Vehicle is an abstract class, and Car provides implementation for the start method.