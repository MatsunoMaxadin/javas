import java.util.Scanner;
import javax.swing.JOptionPane;

public class Caixa{
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);


		String frase = JOptionPane.showInputDialog("Que texto você quer que apareça?");

		JOptionPane.showMessageDialog(null, frase);
	}
}
