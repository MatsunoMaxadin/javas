import javax.swing.JOptionPane;
import java.util.ArrayList;
public class RPG{
	public static void main(String [] args){
		ArrayList <Player> Party = new ArrayList <Player>();

		int tamParty, nivel;
		String nome, classe, Snivel;

		JOptionPane.showMessageDialog(null, "Bem vindo ao Criador de Party!\n Cadastre sua Party conosco!");
		String tam = JOptionPane.showInputDialog("Quantas pessoas tem sua Party?");
		
		tamParty = Integer.parseInt(tam.trim());

		for (int i = 0; i < tamParty; i++){
			nome = JOptionPane.showInputDialog("qual o nome do player?");
			classe = JOptionPane.showInputDialog("Com qual classe ele está jogando?");
			Snivel = JOptionPane.showInputDialog("Qual o nível do jogador?");
			nivel = Integer.parseInt(Snivel.trim());

			Player player = new Player(nome, classe, nivel);

			Party.add(player);
			
		}

		JOptionPane.showMessageDialog(null, "Mostrando a Party: ");
		
		for (int i = 0; i < tamParty; i++) {
			JOptionPane.showMessageDialog(null, Party.get(i).toString());
		}
	
	}

}
