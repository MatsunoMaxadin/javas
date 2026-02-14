import java.util.Scanner;
import java.util.Arrays;
public class dez{
	public static void main (String [] args){
		
		Scanner entrada = new Scanner (System.in);
		double[] notas = new double[3];
		
		for (int i = 0; i < 3; i++){
			
			notas[i] = entrada.nextDouble();
		}

		double media = Arrays.stream(notas).sum()/3;

		System.out.println(media);


	}
}
