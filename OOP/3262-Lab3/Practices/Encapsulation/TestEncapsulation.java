/*
  1. Encapsulation 

  Definition: Encapsulation is the practice of keeping data (attributes) and methods (functions)
  that operate on the data together withing a sigle unit. like a class.
  This hides the data and only exposes certain functionalities.

    ** Purpose: Protects data from being accessed directly, making it 
    more secure and controlled.

    ** How: Use private access modifies for attributes and provide 
    public getters and setters.


    Example: (code vvv)
*/ 

class Person {
  private String name; // private variable 

  // public getter and setter 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class TestEncapsulation {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("Alice"); // Setting name using setter
    System.out.println(p.getName()); // Accessing name using getter
  } 
}