class Teacher {
  private int name;

  void display() {
    System.out.println("Teacher display");
  }

  class Subject {
    private int code;

    void display() {
      System.out.println("Subject display");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    Teacher.Subject subject = teacher.new Subject();
    subject.display();
  }
}