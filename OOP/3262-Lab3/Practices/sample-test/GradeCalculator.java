import java.util.Scanner;

public class GradeCalculator {

  public static void main(String[] args) {
    
    // Create a Scanner object for user input
    Scanner sc = new Scanner(System.in);

    // Prompt user for student name and mark
    System.out.print("Enter student's name: ");
    String s_name = sc.nextLine();

    System.out.print("Enter student's mark (0 - 100): ");
    int s_mark = sc.nextInt();


    // Determine the grade based on the mark
    String grade;
    if (s_mark >= 75 && s_mark <= 100) {
      grade = "A";
    } else if (s_mark >= 65 && s_mark < 75) {
      grade = "B";
    } else if (s_mark >= 55 && s_mark < 65) {
      grade = "C";
    } else if (s_mark >= 40 && s_mark < 55) {
      grade = "D";
    } else if (s_mark >= 0 && s_mark < 40) {
      grade = "F";
    } else {
      grade = "Invalid mark"; // Handles cases where mark is out of range
    }

    // Display the result 
    System.out.println("\nStudent Name: " + s_name);
    System.out.println("Student Mark: " + s_mark);
    System.out.println("Grade: " + grade);

    // Close the scanner 
    sc.close();

  }

}