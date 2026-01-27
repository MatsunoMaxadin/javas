import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

public class DrawLines extends JPanel {
	
	public void paintComponent( Graphics g ) {
		
		super.paintComponent( g );
		int[] xValues = { 30, 45, 35, 25, 15};
		int[] yValues = { 30, 45, 60, 60, 45};
		Polygon poligono = new Polygon(xValues, yValues, 5);
		g.fillPolygon( poligono );
		g.drawPolygon( poligono );

		
	}

}
