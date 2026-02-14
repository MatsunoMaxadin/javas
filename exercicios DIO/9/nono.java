import java.util.Scanner;

public class nono {
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);

		System.out.print("peso: ");
		double peso = entrada.nextDouble();
		System.out.print("altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura*altura);

		System.out.println("IMC: " + imc);
		
		if (imc <= 18.5)
			System.out.println("Abaixo do peso!");
		else if (imc >= 18.6 && imc <= 24.9)
			System.out.println("Peso ideal");
		else if (imc >= 25.0 && imc <= 29.9)
			System.out.println("Levemente acima do peso");
		else if (imc >= 30.0 && imc <= 34.9)
			System.out.println("Obesidade grau 1");
		else if (imc >= 35.0 && imc <= 39.9)
			System.out.println("Obesidade grau 2 (severa)");
		else
			System.out.println("Obesidade grau 3 (mórbida)");
		entrada.close(); 
	}
}
 			
 			
