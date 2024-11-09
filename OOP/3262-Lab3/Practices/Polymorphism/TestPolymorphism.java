/*
  3. Polymorphism

  Definition: Polymorphism allows one interface or method to behave differently in different contexts: There are two types of polymorhism in Java:

    * Compile-time (Method Overloading)
    ** Runtime (Method Overriding)

    * Purpose: Markes code more flexible and reusable.
    * How: Use method overloading or overriding.

*/

// Example (Method Overloading):

class Animal {
  void sound() {
    System.out.println("Animal sound");
  }
}

class Cat extends Animal {
  // @Override
  void sound() { // Method overriding 
    System.out.println("Meow");
  }
}

public class TestPolymorphism {
  public static void main(String[] args) {
    Animal a = new Cat(); // Upcasting
    a.sound(); // Calls the Cat's sound method
  }
}

// Here, sound method is overriding in Cat class.