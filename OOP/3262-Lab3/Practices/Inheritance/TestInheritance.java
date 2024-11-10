/*
  2. Inheritance 

  Definition: Inheritance allows a class (child class) to inherit properties and methods from another class(parent class)

    * Purpose: Promotes code reuse and establishes a relationship between classes. 

    * How: Use the extends keyword to inherit from another class.

*/

class Animal {
  void eat() {
    System.out.println("Eating...");
  }
}

class Dog extends Animal { // Dog inherits from Animal
  void bark() {
    System.out.println("Barking...");
  }
}

public class TestInheritance {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.eat(); // inherited method
    d.bark();
  }
}


// In this example, Dog inherits the eat method from Animal.