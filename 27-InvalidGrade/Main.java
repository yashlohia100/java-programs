class InvalidGradeException extends Exception {
  InvalidGradeException(String message) {
    super(message);
  }
}

class Student {
  void checkGrade(int marks) throws InvalidGradeException {
    if (marks >= 0 && marks <= 100) {
      System.out.println("Marks are valid.");
    } else {
      throw new InvalidGradeException("Marks are invalid.");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Student s = new Student();
    try {
      s.checkGrade(101);
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println("Program ended.");
  }
}