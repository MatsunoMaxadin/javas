import javax.swing.JOptionPane;
import java.util.Arrays;

public class Sistema{
	public static void main (String [] args){
	double total = 0;

	FuncBack[] funcionarios = new FuncBack[5];

	String nome, Ssalario, frase;
       	double salario;

	for (int i = 0; i < 5; i++) {
		nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
		Ssalario = JOptionPane.showInputDialog("Digite o salário dele (escreva valores inteiros)");
		salario = Integer.parseInt(Ssalario.trim());

		funcionarios[i] = new FuncBack(nome, salario);
		total += salario;			
	}

	Arrays.sort(funcionarios,0,5);

	for (FuncBack funcionario: funcionarios){
		frase = String.format("Nome: %s, Função: %s, Salário: %.2f", funcionario.getNome(), funcionario.getFuncao(), funcionario.getSalario());
		JOptionPane.showMessageDialog(null, frase);

	}

	JOptionPane.showMessageDialog(null, String.format("Soma dos salários: %.2f", total));


	
}
}
