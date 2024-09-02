// Base class
class Animal {
  // Field 
  String name;

  // Constructor 
  Animal(String name) {
    this.name = name;
  } 

  // Method
  void eat() {
    System.out.println(name + " is eating.");
  }
} 

// Derived class inheriting from Animal 
class Dog extends Animal {
  // Constructor for Dog
  Dog(String name) {
    super(name); // Call the constructor of the superclass (Animals)
  }

  void bark() {
    System.out.println(name + " is barking.");
  }
}

// Main class to test the inheritance 
public class inheritance{
  public static void main(String[] args) {
    // Create an instance of Dog
    Dog myDog = new Dog("Buddy");
  

    // Call methods 
    myDog.eat(); // Method from the Animal class
    myDog.bark(); // Method from the Dog class
  }
}

