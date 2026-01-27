import javax.swing.JFrame;

public class Janela {

	public static void main (String [] args) {
	DrawLines painel = new DrawLines();

	JFrame janela = new JFrame("vermelho");

	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setSize(250,250);
	janela.setVisible(true);
	janela.add(painel);
	}

}
