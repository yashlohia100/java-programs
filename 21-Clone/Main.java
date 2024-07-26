class Student implements Cloneable {
  String name;
  int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student("Yash", 22);
    // Creates a reference
    Student s2 = s1;

    s2.setName("Ayush");

    System.out.println(s1.getName());
    System.out.println(s2.getName());

    try {
      Student s3 = new Student("Yash", 22);
      Student s4 = (Student) s3.clone();

      s4.setName("Ayush");

      System.out.println(s3.getName());
      System.out.println(s4.getName());
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}