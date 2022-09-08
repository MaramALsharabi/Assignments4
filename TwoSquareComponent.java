import javax.swing.*;
import java.awt.*;
public class TwoSquareComponent extends JComponent {
    public void paintComponent (Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        Rectangle sq1 =new Rectangle(100,100,100,100);
        g2.setColor(Color.pink);
        g2.fill(sq1);
        g2.draw(sq1);
        Rectangle sq2 =new Rectangle(250,100,100,100);
        g2.setColor(Color.pink.darker());
        g2.fill(sq2);
        g2.draw(sq2);
    }
}
