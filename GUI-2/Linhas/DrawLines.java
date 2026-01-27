import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLines extends JPanel {

	public void paintComponent (Graphics g ) {
		
		super.paintComponent( g );

		g.drawLine (0, 0, getWidth(), getHeight());
		g.drawLine(getWidth(), 0, 0, getHeight());
		
		g.drawRect(getWidth()/2 - getWidth()/20, getHeight()/2 - getHeight()/20, getWidth()/10, getHeight()/10);
	
	}

}
