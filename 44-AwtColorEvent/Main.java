import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class Example extends JFrame implements ActionListener {
  JLabel l = null;
  JButton b = null;

  Example() {
    l = new JLabel();
    b = new JButton("Click Here");
    setLayout(new FlowLayout());
    setSize(500, 400);
    setVisible(true);
    add(l);
    add(b);
    b.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b) {
      l.setText("Welcome to java swing");
      // l.setBackground(Color.RED);
      getContentPane().setBackground(Color.GREEN);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    new Example();
  }
}