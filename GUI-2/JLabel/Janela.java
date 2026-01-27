import javax.swing.JFrame;

public class Janela{

	public static void main(String [] args){
	
	Rotulo rotulo = new Rotulo();

	rotulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	rotulo.setVisible(true);
	rotulo.setSize(300,300);
	}
}
