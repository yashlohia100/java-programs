class Task extends Thread {
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
    Task t2 = new Task();
    t1.start();
    t2.start();
  }
}