// Main class to test encapsulation
public class PersonEncapsulation {
  public static void main(String[] args) {
    // Create an instance of Person
    Person person = new Person("John Doe", 30);

    // Access and modify data using getter and setter methods
    person.setName("Jane Done");
    person.setAge(28);

    // Display the updated person information 
    person.displayInfo();
  }
}



