import java.util.Scanner;

public class Sum {

  // Instance variables
  int a;
  int b;
  int c;
  static int t;

  void sum() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first no: ");
    a = sc.nextInt();
    System.out.println("Enter second no:");
    b = sc.nextInt();
    c = a + b;
    System.out.println("Sum: " + c);
    sc.close();
  }

  public static void main(String[] args) {
    // Cannot access not static variables in a static method
    // System.out.println(a);
    Sum sum = new Sum();
    sum.sum();
  }
}