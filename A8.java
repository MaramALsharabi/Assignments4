import javax.swing.*;
//Write a graphics program that draws your name in red, contained inside a blue rectangle. Provide a class
//NameViewer and a class NameComponent.
public class A8 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(1000,1000);
        frame.setTitle("My Name");
        frame.setVisible(true);
        NameComponent NC=new NameComponent();
        frame.add(NC);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

}
