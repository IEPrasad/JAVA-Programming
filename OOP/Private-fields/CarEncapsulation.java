// Main class to test encapsulation 
public class CarEncapsulation {
  public static void main(String[] args) {
    // Create an instance oor Car
    Car car = new Car("Tesla Model S", 2022, 79999.99);

    // Access and modify data using getter and setter methods
    car.setModel("Tesla Model X");
    car.setYear(2023);
    car.setPrice(89999.99);

    // Display the update car information
    car.displayCarInfo();
  }
}

