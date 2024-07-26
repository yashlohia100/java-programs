// Methods have same name but different parameters

class Sum {
  int add(int a) {
    return a + a;
  }

  int add(int a, int b) {
    return a + b;
  }

  float add(int a, float b) {
    return a + b;
  }

  String add(String a, String b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

}

public class Main {
  public static void main(String[] args) {
    Sum s = new Sum();
    System.out.println(s.add(10));
    System.out.println(s.add(10, 20));
    System.out.println(s.add(10, 10.5f));
    System.out.println(s.add("abc", "xyz"));
    System.out.println(s.add(10, 20, 30));
  }
}