import java.util.Scanner;

public class VinteTres{
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Nome do professor: ");
		String nome = entrada.nextLine();
		System.out.print("Valor-Aula: ");
		double valorHora = entrada.nextDouble();
		System.out.print("Aulas por mês: ");
		int aulasMes = entrada.nextInt();

		Professor professor = new Professor(nome, valorHora, aulasMes);

		System.out.println("Nome do professor: " + professor.getNome());
		System.out.println("Salário Liquido: " + professor.getSalarioLiquido());
	}
}
