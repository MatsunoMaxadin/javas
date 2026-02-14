import java.util.Scanner;

public class Fifth{
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);

		double minSalario = 1_293.20;

		double salario = entrada.nextDouble();

		System.out.printf("%.2f", salario/minSalario);

		entrada.close();
	}
}
