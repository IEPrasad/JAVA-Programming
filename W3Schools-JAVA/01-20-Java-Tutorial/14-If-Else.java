Java If....Else

Java Conditions and If Statements

You already know that Java supports the usual logical from mathematics:

    - Less than: a < b
    - Less than or equal to: a <= b
    - Greater than: a > b
    - Greater than or equal to: a >= b
    - Equal to a == b
    - Not Equal to: a != b

You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

  ** Use if to specify a block of code to be executed, if a specified condition is true 

  ** Use else to specify a block of code to be executed, if the same condition is false

  ** Use else if to specify a new condition to test, if the first condition is false 

  ** Use switch to specify many alternative blocks of code be executed

---


The if Statement 

  ** Use the if statement to specify a block of Java code to be executed if a condition is true.

Syntax 

  if (condition) {
    // block of code to be executed if the condition is true
  }

** Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.


  ** In the example below, we test two values to find out if 20 is greater than 18. If the condition is true, print some text:

  if (20 > 18) {
    System.out.println("20 is greater than 18");
  }

---
  ** We can also test variable:

Example 
  int x = 20;
  int y = 18;
  if (x > y) {
    System.out.println("X is greater than y");
  }

Example explained
In the example above we use two variables, x and y, to test whether x is greater than y (using the > operator). As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".

-----------

Java Else 

The else Statement
  ** Use the else statement to specify a block of code to be executed if the condition is false

SyntaxGet your own Java Server
  
  if (condition) {
    // block of code to be executed if the condition is true
  } else {
    // block of code to be executed if the condition is false
  }


Example 

  int time = 20;
  if (time < 18) {
    System.out.println("Good day.");
  } else {
    System.out.println("Good evening.");
  }
  // Outputs "Good evening."

----

Java Else If 

The else if Statement 
  ** Use the else if statement to specify a new condition if the condition is false.

  Syntax 

    if (condition1) {
      // block of code to be executed if condition1 is true
    } else if (condition2) {
      // block of code to be executed if the condition1 is false and condition2 is true
    } else {
      // block of code to be executed if the condition1 is false and condition2 is false
    }

Example 

  int time = 22;
  if (time < 10) {
    System.out.println("Good morning.");
  } else if (time < 18) {
    System.out.println("Good day.");
  } else {
    System.out.println("Good evening.");
  }

  // Outputs "Good evening."


Example explained 

Example explained
  * In the example above, time (22) is greater than 10, so the first condition is 
  false. The next condition, in the else if statement, is also false, so we move 
  on to the else condition since condition1 and condition2 is both false - and 
  print to the screen "Good evening".

However, if the time was 14, our program would print "Good day."

-------------------------------------------------------------


Short Hand if...else

There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

Syntax 

  variable = (condition) ? expressionTrue : expressionFalse;

Instead of writing:

Example 
  int time = 20;
  if (time < 18) {
    System.out.println("Good day.");
  } else {
    System.out.println("Good evening.");
  }

You can simply write:

  int time = 20;
  String result = (time < 18) ? "Good day." : "Good evening.";
  System.out.println(result);


---


Real Life Examples

This example shows how you can use if...else to "open a door" if the enters the correct code:

Example 
  int doorCode = 1337;

  if (doorCode == 1337) {
    System.out.println("Correct code. The door is now open.");
  } else {
    System.out.println("Wrong code. The door remains closed.");
  }

This example shows how you can use if...else to find out if a number is positive or negative:

Example 

  int myNum = 10; // Is this a positive or negative number?

  if (myNum > 0) {
    System.out.println("The value is a positive number.");
  } else if (myNum < 0) {
    System.out.println("The value is a negative number.");
  } else {
    System.out.println("The value is 0.");
  }

---


Example 

  Find out if a number is even or odd:

  int myNum = 5;

  if (myNum % 2 == 0) {
    System.out.println(myNum + " is even");
  } else {
    System.out.println(myNum + " is odd");
  } 