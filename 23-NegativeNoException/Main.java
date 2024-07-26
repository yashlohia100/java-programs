import java.util.Scanner;

class ThrowExample {
  static void checkEligibility(int rollno) throws ArithmeticException {
    if (rollno < 0) {
      throw new ArithmeticException("Roll no negative.");
    }
    System.out.println("Roll no valid.");
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("Enter rollno: ");
      int rollno = sc.nextInt();
      ThrowExample.checkEligibility(rollno);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
