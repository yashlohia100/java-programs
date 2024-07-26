import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    FileReader in = null;
    FileWriter out = null;

    try {
      in = new FileReader("a.txt");
      out = new FileWriter("b.txt");

      int c = 0;
      while ((c = in.read()) != -1) {
        out.write(c);
        System.out.print((char) c);
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