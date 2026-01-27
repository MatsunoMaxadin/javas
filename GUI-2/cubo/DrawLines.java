import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLines extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawRect(getWidth()/10, getHeight()/10, 100, 100);
		g.drawRect(getWidth()/10 + 50, getHeight()/10 + 50, 100, 100);		
		g.drawLine(getWidth()/10, getHeight()/10, getWidth()/10 + 50, getHeight()/10 + 50);
		g.drawLine(getWidth()/10 + 100, getHeight()/10, getWidth()/10 + 150, getHeight()/10 + 50);
		g.drawLine(getWidth()/10, getHeight()/10 + 100, getWidth()/10 + 50, getHeight()/10 + 150);
		g.drawLine(getWidth()/10 + 100, getHeight()/10 + 100, getWidth()/10 + 150, getHeight()/10 + 150); 
	}
}
