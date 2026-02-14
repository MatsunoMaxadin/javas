import java.util.Scanner;

public class onze{
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();

		double [] notas = new double[4];
		
		
		for (int i = 0; i < 4; i++){
			System.out.printf("Nota %d: ", i+1);
			notas[i] = entrada.nextDouble();
		}

		Aluno aluno = new Aluno (nome, notas);

		aluno.mostrarResultado();

		entrada.close();
	}
}
