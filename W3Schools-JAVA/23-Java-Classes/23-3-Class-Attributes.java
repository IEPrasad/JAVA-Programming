Java Class Attributes

Java Class Attributes

  ** In the previous chapter, we used term "variable" for x in the example (as shown below). It is actually an attribute of class. Or you could say that class attributes are variables within a class:

Example 
  ** Create a class called "Main" with two attributes: x and y :

  public class Main {
    int x = 5;
    int y = 3;
  }

** Another term for class attributes is fields.

---

Accessing Attributes

  ** You can access attributes by creating an object of the class, and by using the dot syntax (.):

  ** The following example will create an object of the Main class, with the name 
  myObj. We use the x attribute on the object to print its value:


Example 

  ** Create an object called "myObj" and print the value of x:

  public class Main {
    int x = 5;

    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println(myObj.x);
    }
  }

---

Modify Attributes

  ** You also can modify attribute values:

Example 

  ** Set the value of x to 40:

  public class Main {
    int x; // Now there is no value for x 

    public static void main(String[] args) {
      Main myObj = new Main();
      myObj.x = 40;

      System.out.println(myObj.x);
    }
  }

  
  ** Or override existing values:

Example 
  ** Change the value of x to 25:

  public class Main {
    int x = 10;

    public static void main(String[] args) {
      Main myObj = new Main();
      myObj.x = 25;   // x is now 25
      System.out.println(myObj.x);
    }
  }

  ** If you don't want the ability to override existing values, declare the attribute as final: '

Example 

  public class Main {
    final int x = 10;

    public static void main(String[] args) {
      Main myObj = new Main();
      myObj.x = 25;   // will generate an error: cannot assign a value to a final variable
      System.out.println(myObj.x);
    }
  }

---

  ** The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

  ** The final keyword is called a "modifier". You will learn more about these in the Java Modifiers Chapter.

    >> https://www.w3schools.com/java/java_modifiers.asp

---

Multiple Objects 

  ** If you create multiple objects of one class, you can change the attribute 
  values in one object, without affecting the attribute values in the other:

Example

  ** Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

  public class Main {
    int x = 5;

    public static void main(String[] args) {
      Main myObj1 = new Main();
      Main myObj2 = new Main();
      myObj2.x = 25;
      System.out.println(myOb1.x)   // Outputs 5
      System.out.println(myObj2.x)  // Outputs 25 
    }
  }

--- 

Multiple Attributes

  ** You can specify as many attributes as you want:

Example 

  public class Main {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println("Name: " + myObj.fname + " " + myObj.lname);
      System.out.println("Age: " + myObj.age);
    }
  }

  ** The next chapter will teach you how to create class methods and how to access them with objects.
