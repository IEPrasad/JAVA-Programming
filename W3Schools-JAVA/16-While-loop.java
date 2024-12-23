Java While Loop 

Loops 
  ** Loops can execute block of code as long as specified condition is reached.
  ** Loops are handy because they save time, reduce errors, and they make code more readable.

Java While Loop
  ** The while loop loops through a block of code as long as specified condition is true:

Syntax 
  while (condition) {
    // Code block to be executed
  }

** In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5:

Example 

  int i = 0;
  while (i < 5) {
    System.out.println(i);
    i++;
  }

  Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!

