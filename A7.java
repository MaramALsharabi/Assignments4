import javax.swing.*;
//Write a program that draws two solid squares: one in pink and one in purple. Use a standard color for one of them
// and a custom color for the other. Provide a class TwoSquareViewer and a class TwoSquareComponent.
public class A7 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,400);
        frame.setTitle("two solid squares");
        frame.setVisible(true);
        TwoSquareComponent s = new TwoSquareComponent();
        frame.add(s);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
        }
