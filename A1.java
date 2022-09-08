//Write a PerimeterTester program that constructs a Rectangle object and then computes and prints its perimeter.
// Use the getWidth and getHeight methods. Also print the expected answer.
import java.awt.*;
public class A1 {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(1,2,3,4);
        System.out.println("Perimeter = "+(2*(rect.getHeight()+ rect.getWidth())));
        System.out.println("expected Perimeter = "+(2*(3+4)));


    }
}
