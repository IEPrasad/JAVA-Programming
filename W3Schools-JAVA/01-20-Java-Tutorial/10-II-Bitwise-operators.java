Bitwise Operators 

** Bitwise operators in Java are used to perform operations on individual bits of integer types. 
Here's a list of bitwise operators in Java:'

1. AND ( & )

  ** Performs a bitwise AND operations.
  ** Example:
      int result = 5 & 3; // 0101 & 0011 = 0001 ( 1 in decimal )

2. OR ( | )

  ** Performs a bitwise OR operations.
  ** Example:
      int result = 5 | 3; // 0101 | 0011 = 0111 ( 7 in decimal)

3. XOR ( ^ )
  ** Performs a bitwise exclusive OR operations.
  ** Example:
      int result = 5 ^ 3; // 0101 ^ 0011 = 0110 ( 6 in decimal)

4. Complement ( ~ )
  ** Flips all bits (bitwise NOT)
  ** Example:
      int result = ~5; // ~0101 = 1010 (-6 in decimal, two's complement representation)

5. Left Shift ( << )  
  ** Shifts bits to the left, filling with zeros from the right.
  ** Example:
      int result = 5 << 1; // 0101 << 1 = 1010 (10 in decimal)

6. Right Shift ( >> )
  ** Shifts bits to the right, preserving the sign bit for negative numbers.
  ** Example:
      int result = 5 >> 1 ; // 0101 >> 1 = 0010 (2 in decimal)

7. Unsigned Right Shift ( >>> )
  ** Shifts bits to the right, filling with zeros (ignores the sign bit).
  ** Example:
      int result = -5 >>> 1; // For -5, shifts and fills with zeros.

---------

Application in Java:

Bitwise Operators are often used in:

    ** Cryptography 
    ** Compression algorithms
    ** Graphic programming 
    ** Manipulating low-level data

---------

Example Java Program that demonstrates the use of all the bitwise operators:

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); // 1

        // Bitwise OR
        System.out.println("a | b = " + (a | b)); // 7

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b)); // 6

        // Bitwise Complement
        System.out.println("~a = " + (~a)); // -6

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); // 10

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); // 2

        // Unsigned Right Shift
        int negativeNumber = -5; 
        System.out.println("negativeNumber >>> 1 = " + (negativeNumber >>> 1));
    }
}


>>>

a & b = 1
a | b = 7
a ^ b = 6
~a = -6
a << 1 = 10
a >> 1 = 2
negativeNumber >>> 1 = 2147483645
