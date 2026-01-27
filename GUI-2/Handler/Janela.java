import javax.swing.JFrame;

public class Janela{

	public static void main (String [] args){
	Botao botao = new Botao();

	botao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	botao.setSize(500,500);
	botao.setVisible(true);
	}
}
