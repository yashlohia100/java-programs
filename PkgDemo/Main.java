package PkgDemo;

class Student {
  private int rollNo = 10;

  void getRollNo() {
    System.out.println("Rollno: " + rollNo);
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("hello");
    Student s1 = new Student();
    s1.getRollNo();
  }
}
