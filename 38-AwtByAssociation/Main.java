import java.awt.*;

class MyFrame {
  Frame f;
  Button b;

  MyFrame() {
    f = new Frame();
    b = new Button("Click Me");
    f.add(b);
    f.setVisible(true);
    f.setSize(400, 500);
    f.setLayout(new FlowLayout());
  }
}

public class Main {
  public static void main(String[] args) {
    MyFrame f = new MyFrame();
  }
}