public class Student {
  int rollNo;

  Student(int rollNo) {
    this.rollNo = rollNo;
  }

  public static void main(String[] args) {
    Student s1 = new Student(10);
    System.out.println(s1.rollNo);
  }
}

// We cannot access not static instance variable inside static method (main)
// Local variables needs to be initialised
// Instance variable are initialised to default values