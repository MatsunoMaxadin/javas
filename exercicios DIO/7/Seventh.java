import java.util.Scanner;

public class Seventh{
	public static void main (String [] args){
		
		Scanner entrada = new Scanner(System.in);

		boolean a = entrada.nextBoolean();
		boolean b = entrada.nextBoolean();

		if ((a && b) || !(a || b))
			System.out.println("Ambos são " + a);
		else
			System.out.println("São diferentes.");

		entrada.close();
	}
}
