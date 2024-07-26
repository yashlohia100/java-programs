class MyException extends Exception {
  MyException(String message) {
    super(message);
  }
}

public class Main {
  public static void main(String[] args) {
    try {
      if (10 < 12) {
        throw new MyException("This is custom exception");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}