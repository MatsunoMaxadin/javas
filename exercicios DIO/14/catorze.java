import java.util.Scanner;

public class catorze{
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		int b = entrada.nextInt();

		int c = a;
		a = b;
		b = c;

		System.out.print(a + " "); System.out.print(b);
	}
}
