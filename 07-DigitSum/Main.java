class DigitSum {
  int getDigitSum(int num) {
    int sum = 0;
    while (num != 0) {
      int digit = num % 10;
      sum += digit;
      num /= 10;
    }
    return sum;
  }
}

public class Main {
  public static void main(String[] args) {
    DigitSum ds = new DigitSum();
    System.out.println("Sum: " + ds.getDigitSum(1234));
  }
}