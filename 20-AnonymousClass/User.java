interface A {
  void display();
}

public class User implements A {
  @Override
  public void display() {
    System.out.println("Display method");
  }

  public static void main(String[] args) {
    User u = new User();
    u.display();
  }
}