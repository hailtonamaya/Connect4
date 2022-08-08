
package connect4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

public class drawCircle1 extends drawCircle{
    @Override
    public void paint(Graphics g){
        Graphics2D circulo = (Graphics2D)g;
        circulo.setStroke(new BasicStroke(4.f));
        g.setColor(Color.BLACK);
        g.drawOval(5, 5, 83, 83);
        circulo.setColor(Color.RED);
        circulo.fillOval(5, 5, 83, 83);
    }

}
