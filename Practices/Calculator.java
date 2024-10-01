import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // This will control the loop to allow continuous operation

        while (running) {
            // Display menu options
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit"); // Option to exit
            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();

            // Perform actions based on user choice
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    double difference = num1 - num2;
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    double product = num1 * num2;
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        double quotient = num1 / num2;
                        System.out.println("Result: " + quotient);
                    } else {
                        System.out.println("Error: Division by zero is undefined.");
                    }
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    double remainder = num1 % num2;
                    System.out.println("Result: " + remainder);
                    break;
                case 6:
                    System.out.println("Exiting the calculator. Goodbye!");
                    running = false; // Set running to false to stop the loop
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 6.");
            }
        }

        scanner.close(); // Close the scanner after the loop finishes
    }
}
