import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends Frame implements ActionListener {
  TextField t1, t2, t3;
  Label l1, l2;
  Button b1, b2;

  Calculator() {
    t1 = new TextField();
    t2 = new TextField();
    t3 = new TextField();
    l1 = new Label("Enter first number: ");
    l2 = new Label("Enter second number: ");
    b1 = new Button("ADD");
    b2 = new Button("SUB");
    setLayout(new FlowLayout());
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(b1);
    add(b2);
    add(t3);
    setSize(600, 500);
    setVisible(true);

    // Register the component
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      int a = Integer.parseInt(t1.getText());
      int b = Integer.parseInt(t2.getText());
      int c = a + b;
      t3.setText(String.valueOf(c));
    } else if (e.getSource() == b2) {
      int a = Integer.parseInt(t1.getText());
      int b = Integer.parseInt(t2.getText());
      int c = a - b;
      t3.setText(String.valueOf(c));
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Calculator c = new Calculator();
  }
}