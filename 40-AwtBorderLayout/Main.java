import java.awt.*;

import javax.swing.border.Border;

class Test extends Frame {
  Button b1;
  Button b2;
  Button b3;
  Button b4;
  Button b5;

  Test() {
    b1 = new Button("Click 1");
    b2 = new Button("Click 2");
    b3 = new Button("Click 3");
    b4 = new Button("Click 4");
    b5 = new Button("Click 5");

    setLayout(new BorderLayout());

    add(b1, BorderLayout.NORTH);
    add(b2, BorderLayout.WEST);
    add(b3, BorderLayout.EAST);
    add(b4, BorderLayout.SOUTH);
    add(b5, BorderLayout.CENTER);

    setSize(500, 400);
    setVisible(true);
  }
}

public class Main {
  public static void main(String[] args) {
    Test t = new Test();
  }
}