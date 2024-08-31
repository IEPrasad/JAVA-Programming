public class Function_Example{
  
  // Define a function to add to numbers 
  public static int addTwoNumbers(int num1, int num2) {
    int sum = num1 + num2; // Calculate the sum 
    return sum; // Return the result 
  }

  public static void main(String[] args) {
    // Call the function and store the result
    int result = addTwoNumbers(5, 10);

    // Print the result 
    System.out.println("The sum of two numbers is: " + result);
    System.out.printf("The sum of two numbers is: " + result);
    System.out.print("The sum of two numbers is: " + result);
  }
}



