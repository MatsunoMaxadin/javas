import java.util.Scanner;

public class First{
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);
		int a, b, c;

		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();

		int soma = a + b;
		
		String resposta = soma < c ? "a soma é menor que c" : "a soma não é menor que c";
		System.out.printf(resposta);
	}
}
