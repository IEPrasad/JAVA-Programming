Java Variables

** Variables are containers for storing data values.

String 
int
float 
char 
boolean 

---

Declaring (Creating) Variables 

To create a variale, you must specify the type and assign it a value:

Syntax
  
  type variableName = value;

Example:

  String name = "John";
  System.out.println(name);

---

Final Variables 

  **  If you don't want others (or yourself) to overwrite existing values, use the 
      final keyword (this will declare the variable as "final" or "constant", 
      which means unchangeable and read-only):'

Example 

  final int myNum = 15;
  myNum = 20; // will generate an error: cannot assign a value to a final variable


---

Other Types 

Example 

  int myNum = 5;
  float myFloatNum = 5.99f;
  char myLetter = 'D';
  boolean myBool = true;
  String myText = "Hello";

  // In Java, char values must use single quotations (' ').
  // Double quotations (" ") are for String values.

