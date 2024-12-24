Java Method Overloading 

Method Overloading 

  ** With method overloading, multiple methods can have the same name with 
  different parameters:

Example

  int myMethod(int x)
  float myMethod(float x)
  double myMethod(double x, double y)

** Consider the following example, which has two methods that add numbers of different type:

--- ( **(from chatgpt: Method overloading is determined by the number and/or type of parameters, not the return type.) ) ---

Example

  static int pulsMethodInt(int x, int y) {
    return x + y;
  }

  static double pulsMethodDouble(double x, double y) {
    return x + y;
  }

  public static void main(String[] args) {
    int myNum1 = pulsMethodInt(8, 5);
    double myNum2 = pulsMethodDouble(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2); 
  } 


** Instead of defining two methods that should do the same thing, it is better to overload one.

In the example below, we overload the pulsMethod method to work for both int and double:

Example 

  static int pulsMethod(int x, int y) {
    return x + y;
  }

  static double pulsMethod(double x, double y) {
    return x + y;
  }

  public static void main(String[] args) {
    int myNum1 = pulsMethod(8, 5);
    double myNum2 = pulsMethod(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }  

--- 

** Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.

