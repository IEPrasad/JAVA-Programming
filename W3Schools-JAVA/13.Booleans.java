Java Booleans 

  ** Very often, in programming, you will need a data type that can only have one of two values, like:
    
      ** YES / NO
      ** ON / OFF
      ** TRUE / FALSE

  ** For this, Java has a boolean data type, which can store true or false values.

  Boolean Values 

    ** A boolean type is declared with the boolean keyword and can only take the values true or false:

Example 

  boolean isJavaFun = true;
  boolean isFishTasty = false;
  System.out.println(isJavaFun);    // Outputs true
  System.out.println(isFishTasty);  // Outputs false

However, it is more common to return boolean values from boolean expressions, for conditional testing (see below).

Boolean Expression

  ** A Boolean expression returns a boolean value: true or false 
  ** This is useful to build logic, and find answers.

  ** For example, you can use a comparison operator, such as the greater than ( > ) operator, to find out if an expression (or a variable) is true or false:

Example 

  int x = 10;
  int y = 9;
  System.out.println(x > y); // returns true, because 10 is higher than 9

** Or even easier: 

Example

  System.out.println(10 > 9);  // returns true, because 10 is higher than 9


** In the example below, we use the equal to ( == ) operator to evaluate an expression:

Example 
  int x = 10;
  System.out.println(x == 10);  // returns true, because the value of x is equal to 10

Example 
  System.out.println(10 == 15); // returns false, because the value 10 is not equal to 15


----

Real Life Example

  ** Let's think of a "real life example" where we need to find out if a person is old enough to vote.

  In the example below, we use the >= comparison operator to find out if the age ( 25 ) is greater than or equal to the voting age limit, which is set to 18:
'

Example 
  int myAge = 25;
  int votingAge = 18;
  System.out.println(myAge >= votingAge);


--- 
  ** Cool, An even better approach (since we are on a roll now), would to wrap the code above in an if...else statement, so we can perform different actions depending on the result:


Example 

  ** Output "Old enough to vote!" if myAge is greater than or equal to 18. Otherwise Output "Not old enough to vote.";

  int myAge = 25;
  int votingAge = 18;

  if (myAge >= votingAge) {
    System.out.println("Old enough to vote!");
  } else {
    System.out.println("Not old enough to vote.");
  }

** Booleans are the basis for all Java comparison and conditions.
** You will learn more about conditions (if...else) in the next chapter.



