class Car {
  // Attributes of the class 
  String model;
  int year;

  // Constructor 
  Car(String model, int year) {
    this.model = model;
    this.year = year;
  }


  // Method 
  void displayDetails() {
    System.out.println("Model: " + model + ", Year: " + year);

  }

}

public class Main{
  public static void main(String[] args) {
    // Creating an object (or instance) of the car class
    Car myCar = new Car("Toyota", 2020);

    // Using the object
    myCar.displayDetails();
  }

}


