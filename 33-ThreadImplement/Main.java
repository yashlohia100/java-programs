class A {
  int a;
}

class Task implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      // System.out.println(i);
      try {
        System.out.println(i);
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Task t1 = new Task();
    Thread th1 = new Thread(t1);
    th1.start();

    Task t2 = new Task();
    Thread th2 = new Thread(t2);
    th2.start();
  }
}