import java.util.Scanner;

class Student {
  int rollNo;
  String name;
  int hindiMarks;
  int englishMarks;
  int mathsMarks;

  Student() {
  }

  Student(int rollNo, String name, int hindiMarks, int englishMarks, int mathsMarks) {
    this.rollNo = rollNo;
    this.name = name;
    this.hindiMarks = hindiMarks;
    this.englishMarks = englishMarks;
    this.mathsMarks = mathsMarks;
  }

  void inputStudent() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter rollno: ");
    rollNo = sc.nextInt();

    System.out.print("Enter name: ");
    name = sc.next();
    // name = sc.nextLine();

    System.out.print("Enter marks in hindi: ");
    hindiMarks = sc.nextInt();

    System.out.print("Enter marks in english: ");
    englishMarks = sc.nextInt();

    System.out.print("Enter marks in maths: ");
    mathsMarks = sc.nextInt();

    // sc.close();
  }

  void printStudent() {
    int average = (hindiMarks + englishMarks + mathsMarks) / 3;
    System.out.println("RollNo: " + rollNo + ", Name: " + name + ", Average: " + average);
  }
}

public class Main {

  public static void main(String[] args) {
    Student arr[] = new Student[2];

    for (int i = 0; i < 2; i++) {
      arr[i] = new Student();
    }

    for (int i = 0; i < 2; i++) {
      arr[i].inputStudent();
    }

    for (int i = 0; i < 2; i++) {
      arr[i].printStudent();
    }
  }
}