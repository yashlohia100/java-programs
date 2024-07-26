import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      in = new FileInputStream("a.txt");
      out = new FileOutputStream("b.txt");

      int temp = 0;
      while ((temp = in.read()) != -1) {
        out.write((byte) temp);
        System.out.println((byte) temp);
      }

      System.out.println("File copied");
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      in.close();
      out.close();
    }
  }
}