import javax.swing.*;
import java.awt.*;
// Write a graphical program that draws a traffic light.
public class A9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
        TrafficLight tl=new TrafficLight();
        frame.add(tl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
