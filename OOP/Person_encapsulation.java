public class Person_encapsulation {
  // Private fields to encapsulate the data
  private String name;
  private int age;

  // Public constructor 

  public Person_encapsulation(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Public getter for name 
  public String getName() {
    return name;
  }

  // Public setter for name 
  public void setName(String name) {
    this.name = name;
  }

  // Public getter for age 
  public int getAge() {
    return age;
  }

  // Public setter for age 
  public void setAge(int age) {
    if (age > 0) { // Validation example
      this.age = age;
    }
  }

  // Method to display person details
  public void displayInfo() {
    System.out.println("Name: " + name + ", Age" + age);
  }

  // Main method to test encapsulation
  public static void main(String[] args) {
    // Create an instance of Person_encapsulation
    Person_encapsulation person = new Person_encapsulation("John Doe", 30);
  

  // Access and modify data using getter and setter methods
  person.setName("Jane Doe");
  person.setAge(28);

  // Display the updated person information
  person.displayInfo();


  }
}


/*
Explanation:

    Private Fields: name and age are private, meaning they cannot be accessed directly from outside the class.
    Getters and Setters: Public methods that provide controlled access to the private fields.
    Main Method: Used to create an instance of Person_encapsulation, modify its fields, and display the results.

Steps to Compile and Run:

    Save the code in a file named Person_encapsulation.java.
    Open your terminal and navigate to the directory containing Person_encapsulation.java.
    Compile the file:

    bash

javac Person_encapsulation.java

Run the compiled class:

bash

    java Person_encapsulation

This will compile and run the program, displaying the updated person information.

*/