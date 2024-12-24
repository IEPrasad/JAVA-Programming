Java Return 

Return Values 

  ** In the previous page, we used the void keyword in all examples, which 
  indicates that the method should not return a value.
  
  ** If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:

Example 
  
  public class Main {
    static int myMethod(int x) {
      return 5 + x;
    }

    public static void main(String[] args) {
      System.out.println(myMethod(3));
    }
  }

  >>> Outputs 8 (5 + 3)

** This example returns the sum of a method's two parameters. '

Example 

  public class Main {
    static int myMethod(int x, int y) {
      return x + y;
    }

    public static void main(String[] args) {
      System.out.println(5, 3);
    }
  }

  // Outputs 8 (5 + 3)

---

** You can also store the result in a variable (recommended, as it easier to read and maintain):

Example 

  public class Main {
    static int myMethod(int x, int y) {
      return x + y;
    }

    public static void main(String[] args) {
      int x = myMethod(5, 3);
      System.out.println(z);
    } 
  }

  >>> Outputs 8 (5 + 3)

  