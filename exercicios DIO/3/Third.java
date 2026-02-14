import java.util.Scanner;

public class Third{
	public static void main(String [] args){
		
		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		int b = entrada.nextInt();

		int c = a == b ? a + b : a * b;

		System.out.println(c);
	}
}
