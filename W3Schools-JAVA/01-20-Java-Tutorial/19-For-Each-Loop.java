For Each Loop

  ** There is also a "for-each" loop, which is used exclusively to loop through elements in an array. (or other data sets):

Syntax 

  for (type variableName : arrayName) {
    // code block to be executed 
  }

** The following example outputs all elements in the cars array, using a "for-each" loop:

Example 

  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
  for (String i : cars) {
    System.out.println(i);
  }



  ** Note: Don't worry if you don't understand the example above. You will learn more about Array in the Java Arrays Chapter.

    >> https://www.w3schools.com/java/java_arrays.asp

Exercise 

  What is the output of the following code?

  int[] myNumbers = {1, 2, 3, 4, 5};
  for (int i : myNumbers) {
    System.out.println(i);
  }

-------------------------------------------------------------------------------------------------

  ----------------------

Java For Loop Examples 

Real-Life Examples 

  ** To demonstrate a practical example of the for loop, let's create a program that counts to 100 by tens:'

Example 

  for (int i = 0; i <= 100; i += 10) {
    System.out.println(i);
  }


** In this example, we create a program that only print even values between 0 and 10:

Example

  public class Main{
    public static void main(String[] args) {
      for (int i = 0; i <= 10; i += 2) {
        System.out.println(i);
      }
    }
  }

---

** And in this example, we create a program that prints the multiplication table for a specified number:

Example
  
  public class Main {
    public static void main(String[] args) {
      int number = 2;

      // Print the multiplication table for the number 2
      for (int i = 1; i <= 10; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
      }
    }
  }