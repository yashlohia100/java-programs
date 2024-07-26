class A {

  String name = "Yash";

  A() {
    System.out.println("A constructor called");
  }

  A(int a) {
    System.out.println("A parameter constructor: " + a);
  }

  void display() {
    System.out.println("Display A");
  }
}

class B extends A {

  B() {
    // super(); // Called implicitly
    // 1. Calling the parent class constructor
    super(10);
    System.out.println("B constructor called");
  }

  void print() {
    System.out.println("Print: " + super.name);
    super.display();
  }
}

public class Main {
  public static void main(String[] args) {
    // A constructor called
    // B constructor called
    B b1 = new B();
    b1.print();
  }
}