class Task1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      // System.out.println(i);
      try {
        System.out.println(i + 1);
        // Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class Task2 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      try {
        System.out.println((char) (i + 65));
      } catch (Exception e) {
        System.out.println(e);
      }
    }
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