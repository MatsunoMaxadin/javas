import java.util.Scanner;

public class VinteDois{
	public static void main (String [] args){
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("a = ");
		double a = entrada.nextDouble();
		System.out.print("b = ");
		double b = entrada.nextDouble();

		try {
			showResults(a,b);
		} catch (ArithmeticException e){
			System.err.print(e.getMessage());
		}

	}

	public static void showResults(double a, double b){
		if (b == 0.0)
			throw new ArithmeticException("Erro: Não pode dividir por 0!");
		System.out.println("Quociente: " + a/b);
		System.out.println("Resto: " + a%b);

	}
}
 			
