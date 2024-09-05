// Car class demonstrating encapsulation 
public class Car {
  // Private fields (encapsulation data)
  private String model;
  private int year;
  private double price;


  // Constructor to initialize Car object
  public Car(String model, int year, double price) {
    this.model = model;
    this.year = year;
    this.price = price;
  }

  // Getter for model 
  public String getModel() {
    return model;
  }

  // Setter for model;
  public void setModel(String model) {
    this.model = model;
  }

  // Getter for year 
  public int getYear() {
    return year;
  }

  // Setter for year with validation 
  public void setYear(int year) {
    if (year > 1885) { // The first car was  made in 1885!
      this.year = year;

    }
  }

  // Getter for price 
  public double getPrice() {
    return price;
  }

  // Setter for price with validation 
  public void setPrice(double price) {
    if (price > 0) {
      this.price = price;
    }
  }

  // Method to display car details 
  public void displayCarInfo() {
    System.out.println("Car Model: " +model+ ", Year: " +year+ ", Price: $" +price);
  }
}

