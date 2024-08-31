class School {
  String school;
  String name;
  int age;
  int grade;
  double marks;


  void about_student() {
    System.out.println("The school is: "+school);
    System.out.println("The name is : " + name);
    System.out.println("The age of " + name+" is: " +age);
    System.out.println("The grade of " +name+ " is: " +grade);
    System.out.println("The marks of " +name+ " is: " +marks);
  }
}


public class oop_sample {
  public static void main(String[] args) {
    
    // Create an object for the School class 
    School st1 = new School();

    // Set the properties of the st1 object 
    st1.school = "St.Thomas College";
    st1.name = "Dhananjaya";
    st1. age = 22;
    st1.grade = 12;
    st1.marks = 84.59;

    st1.about_student();
  }


}