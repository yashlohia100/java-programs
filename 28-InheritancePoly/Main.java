class Shape {
  void draw() {
    System.out.println("Drawing Shape...");
  }
}

class Circle extends Shape {
  @Override
  void draw() {
    System.out.println("Drawing Circle...");
  }
}

class Rectangle extends Shape {
  @Override
  void draw() {
    System.out.println("Drawing Rectangle...");
  }
}

class Triangle extends Shape {
  @Override
  void draw() {
    System.out.println("Drawing Triangle...");
  }
}

public class Main {
  public static void main(String[] args) {
    Shape s = new Circle();
    s.draw();
  }
}