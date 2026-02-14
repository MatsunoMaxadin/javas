import java.util.Scanner;

public class Second{
	
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();

		if (numero%2 == 0)
			System.out.println("O número é par!");
		else
			System.out.println("O número é impar!");

		if (numero < 0) 
			System.out.println("O número é negativo!");
		else
			System.out.println("O número é positivo!");

		entrada.close();
	}
	
}
