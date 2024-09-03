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