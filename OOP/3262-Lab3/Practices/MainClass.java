class HelperClass {
  void displayMessage() {
    System.out.println("Hello from HelperClass!");
  }
}

public class MainClass {
  public static void main(String[] args) {
    HelperClass helper = new HelperClass();
    helper.displayMessage(); // Calls the method from HelperClass
  }
}