import java.awt.*;

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

    setLayout(new GridLayout(2, 3, 5, 8));
    setSize(500, 400);

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);

    setVisible(true);
  }
}

public class Main {
  public static void main(String[] args) {
    Test t = new Test();
  }
}