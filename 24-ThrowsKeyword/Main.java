class Calculator {
  int divide(int a, int b) throws ArithmeticException, NumberFormatException {
    return a / b;
  }

  // int parse(String str) throws NumberFormatException {
  // return Integer.parseInt(str);
  // }
}

public class Main {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    int result = 0;

    try {
      // result = c.divide(5, 0);
      // result = c.parse("123a");
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println(result);
  }
}