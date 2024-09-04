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



/*
 * Notes on Java Compilation and Encapsulation:
 *
 * 1. Encapsulation:
 *    - Encapsulation involves wrapping data (fields) and methods that operate on the data into a single unit, i.e., a class.
 *    - Fields are typically declared as private to restrict direct access.
 *    - Public getter and setter methods are used to access and modify private fields.
 *
 * 2. File Naming and Compilation:
 *    - Each public class should be in its own file, named after the class (e.g., Person.java).
 *    - When you compile a Java file (e.g., PersonEncapsulation.java), the compiler automatically compiles other dependent classes in the same directory.
 *    - This ensures all related .class files are generated without the need for separate compilation commands.
 *
 * 3. Running the Program:
 *    - After successful compilation, run the program using `java ClassName` (e.g., java PersonEncapsulation).
 *    - Ensure that the .class files are in the correct directory or classpath for execution.
 */


