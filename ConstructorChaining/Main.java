class Person {
  int id;
  String name;

  Person(int id, String name) {
    this.id = id;
    this.name = name;
  }
}

class Employee extends Person {
  int salary;

  Employee(int id, String name, int salary) {
    super(id, name);
    this.salary = salary;
  }

  void display() {
    System.out.println(id + " " + name + " " + salary);
  }
}

public class Main {
  public static void main(String[] args) {
    Employee emp = new Employee(101, "Yash", 100000);
    emp.display();
  }
}
