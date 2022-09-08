import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
// Run the following program:
// import java.awt.Color;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// public class FrameViewer {
// public static void main(String[] args) {
// JFrame frame = new JFrame();
// frame.setSize(200, 200);
// JLabel label = new JLabel("Hello, World!");
// label.setOpaque(true);
// label.setBackground(Color.PINK);
// frame.add(label);
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setVisible(true); } }
// Modify the program as follows:
//• Double the frame size.
//• Change the greeting to “Hello, your name!”.
// • Change the background color to pale green (see Exercise E2.10).
// • For extra credit, add an image of yourself. (Hint: Construct an ImageIcon.)
public class FrameViewer {
 public static void main(String[] args) {
 JFrame frame = new JFrame();
 frame.setSize(400, 400);
 JLabel label = new JLabel("Hello, Maram!");
 label.setOpaque(true);
 label.setBackground(Color.green.brighter());
 frame.add(label);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
frame.add(new JLabel(new ImageIcon( "image (1).jfif")));

 }
}
