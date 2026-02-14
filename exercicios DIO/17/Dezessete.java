import java.util.Scanner;

public class Dezessete{
	public static void main (String [] args){

		Scanner entrada = new Scanner(System.in);

		double Fahrenheit = entrada.nextDouble();

		double Celsius = (5 * (Fahrenheit - 32)/9);

		System.out.printf("Fahrenheit : %.1f, Celsius : %.1f", Fahrenheit, Celsius);


	}
}
