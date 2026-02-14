import java.util.Scanner;

public class dezesseis{
	public static void main (String [] args){
		
		Scanner entrada = new Scanner(System.in);

		Triangulo triangulo = new Triangulo(entrada.nextInt(), entrada.nextInt(), entrada.nextInt());

		triangulo.tipoTriangulo();

		entrada.close();
	}
}
