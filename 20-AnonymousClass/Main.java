interface A {
  void display();
}

public class Main {
  public static void main(String[] args) {
    A a1 = new A() {
      @Override
      public void display() {
        System.out.println("Display method");
      }
    };

    a1.display();
  }
}