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

  // Public setter for age with validation
  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    }
  }


  // Method to display person details
  public void displayInfo() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}
