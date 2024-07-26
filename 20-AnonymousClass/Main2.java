interface A {
  void display();
}

class Student implements A {
  @Override
  public void display() {
    System.out.println("Display method");
  }
}

public class Main2 {
  public static void main(String[] args) {
    Student s = new Student();
    s.display();
  }
}