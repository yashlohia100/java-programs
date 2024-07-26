class Employee {
  private String name;
  private int salary;
  private String dateOfJoining;

  Employee(String name, int salary, String dateOfJoining) {
    this.name = name;
    this.salary = salary;
    this.dateOfJoining = dateOfJoining;
  }

  void displayEmployee() {
    System.out.println("Name: " + name + ", Salary: " + salary + ", Date: " + dateOfJoining);
  }
}

public class Main {
  public static void main(String[] args) {
    Employee arr[] = new Employee[5];
    arr[0] = new Employee("Akash", 5000, "2024-01-01");
    arr[1] = new Employee("Bhavya", 6000, "2024-02-01");
    arr[2] = new Employee("Akash", 4000, "2024-01-01");
    arr[3] = new Employee("Akash", 2000, "2024-02-01");
    arr[4] = new Employee("Akash", 6000, "2024-01-01");

    for (int i = 0; i < 5; i++) {
      arr[i].displayEmployee();
    }

    // for (Employee emp : arr) {
    // emp.displayEmployee();
    // }
  }
}