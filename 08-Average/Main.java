class Average {
  int a;
  int b;
  int c;

  Average(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;

    int sum = this.a + this.b + this.c;
    int avg = sum / 3;

    System.out.println("Sum: " + sum);
    System.out.println("Avg: " + avg);
  }
}

public class Main {
  public static void main(String[] args) {
    Average obj = new Average(10, 20, 10);
  }
}
