public class Student {
  int rollNo;

  Student() {
    this("Hello");
    System.out.println("1. Inside non-parameterised constructor");
    // this("Hello");
  }

  Student(int a) {
    this(20, 30);
    System.out.println("2. Inside single parameterised constructor: " + a);
  }

  Student(int a, int b) {
    System.out.println("3. Inside double parameterised constructor: " + a + b);
  }

  Student(String str) {
    this(10);
    System.out.println("4. Inside string constructor: " + str);
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    // 3, 2, 4, 1
  }
}