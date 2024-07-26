class Student {
  private int rollNo;
  String name;

  void printStudent() {
    System.out.println("RollNo: " + rollNo + ", Name: " + name);
  }
}

public class Main {
  public static void main(String[] args) {
    Student s = new Student();
    System.out.println(s.rollNo);
    System.out.println(s.name);
  }
}