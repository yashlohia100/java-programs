import java.util.Scanner;

class Larger {
  int a;
  int b;

  Larger(int a, int b) {
    this.a = a;
    this.b = b;
  }

  void inputNumbers() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    a = sc.nextInt();
    System.out.print("Enter second number: ");
    b = sc.nextInt();
    sc.close();
  }

  void findLarger() {
    if (a == b) {
      System.out.println("The numbers are equal.");
    } else if (a > b) {
      System.out.println(a + " is larger.");
    } else {
      System.out.println(b + " is larger.");
    }
  }
}

class Main {
  public static void main(String[] args) {
    Larger obj = new Larger(0, 0);
    obj.inputNumbers();
    obj.findLarger();
  }
}
