Java Characters 

Characters 

  ** The char data type is used to store a single character. The character must be 
  surrounded by single quotes, like 'A' or 'c':

  Example 
    char myGrade = 'B';
    System.out.println(myGrade);

---

Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:

Example 


public class Main {
  public static void main(String[] args) {
    char myVar1 = 65, myVar2 = 66, myVar3 = 67, myVar4 = 74, myVar5 = 80, myVar6 = 99;
      System.out.println(myVar1);
      System.out.println(myVar2);
      System.out.println(myVar3);
      System.out.println(myVar4);
      System.out.println(myVar5);
      System.out.println(myVar6);
    }
}

** Tip: A list of all ASCII values can be found in our ASCII Table Reference. ** 

/*
>>> The output 
A
B
C
J
P
c
*/

// I don't have any idea about this, how this is come

---

>>> Explanation about the output 
  
Why the Output is Generated
  ** The ASCII encoding maps numbers to characters. When a char is assigned an integer, it refers to the corresponding ASCII character.

  ** The output of the program corresponds to the ASCII characters for the numbers assigned to the char variables.

Theory: ASCII and Character Representation
  ** ASCII assigns a unique numeric value (0–127) to characters.

  ** Examples:
      Numbers 65-90 correspond to uppercase letters (A-Z).
      Numbers 97-122 correspond to lowercase letters (a-z).
      Numbers 48-57 correspond to digits (0-9).

The char type in Java supports this encoding.

---


Strings

  ** The String data type is used to store a sequences of characters (text). String must be surrounded by double quotes. 

Example
  String greeting = "Hello World";
  System.out.println(greeting);

""" 
  The String type is so much used and integrated in Java, that some call it "the 
  special ninth type".

  A String in Java is actually a non-primitive data type, because it refers to an 
  object. The String object has methods that are used to perform certain operations 
  on strings. Don't worry if you don't understand the term "object" just yet. We 
  will learn more about strings and objects in a later chapter.

"""

--------------------


Java Data Types Example

Real-Life Example

Here's a real-life example of using different data types, to calculate and output the total cost of a number of items:'

Example

  // Create variables of different data types
  int items = 50;
  float costPerItem = 9.99f;
  float totalCost = items * costPerItem;
  char currency = '$';

  // Print variables
  System.out.println("Number of items: " + items);
  System.out.println("Cost per item: " + costPerItem + currency);
  System.out.println("Total cost = " + totalCost + currency);

>>> The output  
  Number of items: 50
  Cost per item: 9.99$
  Total cost = 499.50$



  