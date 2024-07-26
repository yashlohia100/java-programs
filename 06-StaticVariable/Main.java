class Student {
  int rollNo;
  static String subject;

  // Student(int rollNo, String subject) {
  // this.rollNo = rollNo;
  // this.subject = subject;
  // }

  void printStudent() {
    System.out.println("RollNo: " + rollNo + ", Subject: " + subject);
  }
}

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollNo = 101;
    Student.subject = "Java";
    s1.printStudent();

    Student s2 = new Student();
    s2.rollNo = 102;
    Student.subject = "JavaScript";
    s2.printStudent();

    s1.printStudent();
  }
}