// fibonacci.java
public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        // Printing first two numbers
        System.out.print(a + ", " + b);

        // Print the Fibonacci series for the next 8 numbers
        for (int i = 0; i < 8; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}


// Question:

// Write a Java program to print the Fibonacci series up to n terms. The Fibonacci series starts with 0 and 1, and each subsequent term is the sum of the two preceding terms. For example, for n = 7, the Fibonacci series is:
// 0, 1, 1, 2, 3, 5, 8
