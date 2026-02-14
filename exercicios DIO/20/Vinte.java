import java.util.Scanner;

public class Vinte{
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);

		int i = entrada.nextInt();

		for (int j = 1; j <= 10; j++)
			System.out.printf("%d x %d = %d\n", i, j, i*j);
	}
}
