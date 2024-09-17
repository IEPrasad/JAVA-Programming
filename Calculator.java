// Instructions:

//     Objective: Create a command prompt-based calculator in Java.
//     Operations Included:
//         Addition
//         Subtraction
//         Multiplication
//         Division
//         Remainder (Modulus)

//     User Interaction:
//         The user will be prompted to choose an operation.
//         The user will input two numbers.
//         The calculator will perform the chosen operation and display the result.

//     Considerations:
//         Handle division by zero.
//         Use a loop to allow the user to perform multiple calculations.


// Calculator.java
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repeat;
        
        do {
            // Display options to the user
            System.out.println("Command Prompt Calculator");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Remainder (%)");
            System.out.print("Enter your choice (1/2/3/4/5): ");
            
            // Read user choice
            int choice = scanner.nextInt();
            
            // Read numbers from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            // Perform the chosen operation
            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    // Handle division by zero
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed!");
                    }
                    break;
                case 5:
                    // Handle remainder calculation
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 % num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
                    break;
            }
            
            // Ask if user wants to perform another calculation
            System.out.print("Do you want to perform another calculation? (y/n): ");
            repeat = scanner.next().charAt(0);
            
        } while (repeat == 'y' || repeat == 'Y');
        
        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
