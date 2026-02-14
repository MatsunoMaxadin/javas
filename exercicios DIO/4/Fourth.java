import java.util.Scanner;

public class Fourth{
	public static void main (String [] args){
		
		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();

		System.out.printf("%d, %d", a-1, a+1);

		entrada.close();
	}
}
