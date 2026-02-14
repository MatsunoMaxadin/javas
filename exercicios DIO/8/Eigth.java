import java.util.Arrays;
import java.util.Scanner;

public class Eigth{
	public static void main (String [] args){
		int[] numeros = new int[3];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++){
			numeros[i] = entrada.nextInt();
		}

		Arrays.sort(numeros);
		
		for (int i = 2; i >= 0; i--){
			System.out.println(numeros[i]);
		}

		entrada.close();
	}
}
