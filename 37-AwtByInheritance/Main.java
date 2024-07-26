import java.awt.*;

class MyFrame extends Frame {
  Button b;

  MyFrame() {
    b = new Button("Click Me");
    add(b);
    setVisible(true);
    setSize(400, 400);
    setLayout(new FlowLayout());
  }
}

public class Main {
  public static void main(String[] args) {
    MyFrame f = new MyFrame();
  }
}