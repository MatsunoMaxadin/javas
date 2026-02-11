import java.util.Scanner;

public class Local {
	
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu e-mail: ");
		StringBuilder email = new StringBuilder();
		email.append(entrada.nextLine());
		String simbolo = "@";
		email.delete(email.indexOf("@"), email.length());

		System.out.println("Seu nome local do e-mail é: " + email);
	}


}
