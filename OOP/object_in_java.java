// Define the Car class
class Car {
  
  // Properties (attributes) of the Car class
  String color;
  String model;

  // Method (behavior) of the Car class
  void startEngine() {
    System.out.println("Engine started.");
  }
}

// Main class to execute the program
public class object_in_java{
  public static void main(String[] args) {
    // Create an object of the Car class
    Car myCar = new Car();

    // Set the properties of the Car object
    myCar.color = "Red";
    myCar.model = "Tesla Model S";

    // Access and print the properties of the Car object
    
    System.out.println("Car Color: " + myCar.color);
    System.out.println("Car Model: " + myCar.model);

    // Call the startEngine method
    myCar.startEngine();
  }
}

