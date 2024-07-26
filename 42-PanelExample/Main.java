
import java.awt.*;
import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 400);

    // Create mail panel with BorderLayout
    JPanel mainPanel = new JPanel(new BorderLayout());

    // Create a panel for top section
    JPanel topPanel = new JPanel();
    topPanel.setBackground(Color.RED);
    JLabel topLabel = new JLabel("Top Label");
    topPanel.add(topLabel);

    // Create a panel for left section
    JPanel leftPanel = new JPanel(new GridLayout(3, 1));
    leftPanel.setBackground(Color.BLUE);
    leftPanel.add(new JButton("Button 1"));
    leftPanel.add(new JButton("Button 2"));
    leftPanel.add(new JButton("Button 3"));

    // Create a panel for center section
    JPanel centerPanel = new JPanel();
    centerPanel.setBackground(Color.GREEN);
    centerPanel.add(new JTextArea("This is center panel"));

    // Create a panel for right section
    JPanel rightPanel = new JPanel();
    rightPanel.setBackground(Color.PINK);
    rightPanel.add(new JButton("Right side"));

    // Create a panel for botton section
    JPanel bottomPanel = new JPanel();
    bottomPanel.setBackground(Color.ORANGE);
    bottomPanel.add(new JLabel("Bottom panel"));

    // Add panels to main panel
    mainPanel.add(topPanel, BorderLayout.NORTH);
    mainPanel.add(leftPanel, BorderLayout.WEST);
    mainPanel.add(centerPanel, BorderLayout.CENTER);
    mainPanel.add(rightPanel, BorderLayout.EAST);
    mainPanel.add(bottomPanel, BorderLayout.SOUTH);

    // Add main panel to frame
    frame.add(mainPanel);
    frame.setVisible(true);
  }
}