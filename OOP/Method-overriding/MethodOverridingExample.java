// Main class to test method overriding 
public class MethodOverridingExample{
  public static void main(String[] args) {
    // Create an instance of Vehicle 
    Vehicle vehicle = new Vehicle();
    vehicle.move(); // Calls Vehicle's move meth


    // Create an instance of Car (Subclass)
    Vehicle car = new Car(); // Polymorphism (Car treated as Vehicle)
    car.move(); // Calls Car's overrdden move method
  }
}

