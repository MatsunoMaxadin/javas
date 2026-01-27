import javax.swing.JOptionPane;

public class Soma{
	public static void main (String [] args){
		String valor, resultado;
		int num1, num2;
		
		
		valor = JOptionPane.showInputDialog("Digite o primeiro numero");
		num1 = Integer.parseInt(valor.trim());
		valor = JOptionPane.showInputDialog("Digite o segundo numero");
		num2 = Integer.parseInt(valor.trim());

		int soma = num1 + num2;

		resultado = String.format("%d + %d = %d !", num1, num2, soma);

		JOptionPane.showMessageDialog(null, resultado);

	}
}
