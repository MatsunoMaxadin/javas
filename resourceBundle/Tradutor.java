import java.util.Scanner;
import java.util.ResourceBundle;
import java.util.Locale;

public class Tradutor{
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		Locale local;

		System.out.println("Qual lingua você fala? (which language do you speak?) \n1 - Português \n2 - English");

		int op = entrada.nextInt();
		entrada.nextLine();

		if (op == 1){
			local = new Locale("pt","BR");
		} else {
			local = new Locale("en","US");
		}

		ResourceBundle tradutor = ResourceBundle.getBundle("message",local);				

		System.out.println(tradutor.getString("whats.your.name"));
		nome = entrada.nextLine();
		System.out.println(tradutor.getString("Hi") + " " + tradutor.getString("my.name.is") + " " + nome + ", " + tradutor.getString("im.from") + " " + tradutor.getString("country"));


	}

}
