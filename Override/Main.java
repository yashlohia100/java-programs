class Person {
  String name;
  String occ;

  void occupation() {
    System.out.println("Person occupation: " + occ);
  }
}

class Employee extends Person {
  String empId;

  void occupation() {
    System.out.println("Employee occupation: " + super.occ);
  }
}

public class Main {
  public static void main(String[] args) {
    Employee emp = new Employee();
    emp.name = "Yash";
    emp.occ = "Software Developer";

    emp.occupation();
  }
}