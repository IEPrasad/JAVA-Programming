Java Strings 

  ** Strings are used for storing text.
  ** A String variable of type String and assign it a value:

    String greeting = "Hello";


String Length 

  ** A String in a Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method.


Example 

  String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  System.out.println("The length of the text string is: " + txt.length());

---

More String Methods

  ** There are many string methods available, for example toUpperCase() and toLowerCase():

Example 

  String txt = "Hello World";
  System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
  System.out.prinltn(txt.toLowerCase());   // Outputs "hello world"

---

Finding a Character in a String 

  ** The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):


Example

  String txt = "Please locate where 'locate' occurs!";
  System.out.println(txt.indexOf("locate"));   // Outputs 7


---
  Java counts position from zero.
  0 is the first position in a string, 1 is second, 2 is the third ...
---

Completing String Reference 

  ** For a complete reference of String methods, got our Java String Methods Reference.
  https://www.w3schools.com/java/java_ref_string.asp_

  The reference contains descriptions and examples of all string methods.

----------------------

Java String Concatenation 
  
  ** The + operator can be used between strings to combine them. This is called concatenation:

Example 
  String firstName = "John";
  String lastName = "Doe";
  System.out.println(firstName + " " + lastName);

---

You can also use the concat() method to concatenate two strings:

  Example
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));

---

-----------------


Java Numbers and Strings 

Adding Numbers and Strings 

WARNING!
  ** Java uses the + operator for both addition and concatenation.
  Numbers are added. Strings are concatenated.


If you add two numbers, the result will be a number:

Example 
  int x = 10;
  int y = 20;
  int z = x + y;   // z will be 30 (an integer/number)

If you add two strings, the result will be a string concatenation:

Example   
  String x = "10";
  String y = "20";
  String z = x + y;   // z will be 1020 (a String)

----------------


Strings - Special Characters 

   ** Because strings must be written within quotes, Java will misunderstand this string, and generate an error:

    String txt = "We care the so-called "Vikings" from the north.";

The solution to avoid this problem, is to use the backslash escape character.
The backslash ( \ ) escape character turns special character into string character:

Escape character      Result                Description 


\'                      '                   Single quote
\"                      "                   Double quote
\\                      \                   backslash

The sequence \ " inserts a double quote in a string: 
"
Example 
  String txt = "We care the so-called \"Vikings\" from the north.";


The sequence \' insert a single quote in a string:
'

Example 
  String txt = "It\'s alright.";

---

The sequence \\ insert a single backslash in a string:

Example 
  String txt = "The character \\ is called backslash."
    >>> The character \ is called backslash
  
-----------


Other common escape sequences that are valid in Java are:

Code                  Result                    

\n                    New Line 
\r                    Carriage Return 
\t                    Tab
\b                    Backspace 
\f                    From Feed 