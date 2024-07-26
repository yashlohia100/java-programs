class ThrowExample {
  static void checkEligibility(int age, int weight) {
    if (age < 12 && weight < 40) {
      throw new ArithmeticException("Student not eligible.");
    } else {
      System.out.println("Student is eligible.");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome.");

    try {
      ThrowExample.checkEligibility(10, 20);
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println("Have a nice day...");
  }
}