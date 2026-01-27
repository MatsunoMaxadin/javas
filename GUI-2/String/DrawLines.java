import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class DrawLines extends JPanel{
	
	public void paintComponent( Graphics g) {
		super.paintComponent(g);
		g.setColor( Color.RED);
		g.setFont( new Font("Serif", Font.BOLD, 15) );
		g.drawString("VERMELHOOOOO", 20,30);
	
	}

}
