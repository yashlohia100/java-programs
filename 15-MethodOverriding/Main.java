class A {

  void display() {
    System.out.println("Display A");
  }
}

class B extends A {

  void display() {
    System.out.println("Display B");
  }
}

public class Main {
  public static void main(String[] args) {
    B b1 = new B();
    b1.display();
  }
}