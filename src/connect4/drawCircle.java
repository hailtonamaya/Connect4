
package connect4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

public class drawCircle extends JLabel {
    @Override
    public void paint(Graphics g){
        Graphics2D circulo = (Graphics2D)g;
        circulo.setStroke(new BasicStroke(4.f));
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, 84, 84);
        circulo.setColor(Color.WHITE);
        circulo.fillOval(0, 0, 84, 84);
    }
    
}
