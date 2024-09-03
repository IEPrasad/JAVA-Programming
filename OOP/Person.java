// Person class demonstrating encapsulation 
public class Person {
  // Private fields 
  private String name;
  private int age;


  // Public constructor 
  public Person(String name, int age) {
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
    System.out.println("Name: " + name + ", Age: " + age); 
  }




  // Main class to test encapsulation

  public static void main(String[] args) {
    // Create an instance of Person
    Person persn = new Person("John Doe", 30);

    // Access and modify data using getter and setter methods
    persn.setName("John Doe");
    persn.setAge(28);
  

    // Display the updated person information
    persn.displayInfo();
  }

}can you give me the code for the encapsulation in the JAVA 
with file name 