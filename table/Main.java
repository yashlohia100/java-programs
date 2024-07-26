class Table {
  synchronized static void displayTable(int n) {
    for (int i = 1; i <= 10; i++) {
      // System.out.println(n * i);
      try {
        System.out.println(n * i);
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class Task1 extends Thread {
  @Override
  public void run() {
    Table.displayTable(2);
  }
}

class Task2 extends Thread {
  @Override
  public void run() {
    Table.displayTable(5);
  }
}

public class Main {
  public static void main(String[] args) {
    Task1 t1 = new Task1();
    Task2 t2 = new Task2();
    t1.start();
    t2.start();
  }
}