import javax.swing.JFrame;

public class Janela{
	public static void main(String [] args){
		
		Cadastro cadastro = new Cadastro();

		cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadastro.setSize(310, 300);
		cadastro.setVisible(true);
	}

}
