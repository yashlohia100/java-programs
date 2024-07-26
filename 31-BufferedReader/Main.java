import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    FileReader in = null;
    FileWriter out = null;
    BufferedReader br = null;

    try {
      in = new FileReader("a.txt");
      br = new BufferedReader(in);

      out = new FileWriter("b.txt");

      String str = "";
      while ((str = br.readLine()) != null) {
        System.out.println(str);
        System.out.println(str.replaceAll("[AEIOUaeiou]", ""));
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