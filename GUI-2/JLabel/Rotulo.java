import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Rotulo extends JFrame{
	private JLabel label;

	public Rotulo(){
		super("ErinZinha!!");
		Icon erin = new ImageIcon("ErinPog.png");
		label = new JLabel("Erin surpresa", erin, SwingConstants.CENTER);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);


		add(label);
	}

}
