import java.util.Scanner;

public class Conc{
	public static void main (String [] args){
		String teste;
		int op;
		Scanner entrada = new Scanner(System.in);
		StringBuilder frase = new StringBuilder();
		do{
			teste = entrada.nextLine();
			StringBuilder Conc = new StringBuilder(teste);

			frase.append(Conc);

			System.out.println(frase.toString());

			System.out.println("Deseja continuar?");

			op = entrada.nextInt();

			entrada.nextLine();	
		
		
		
		}while(op != 0);
	}
}
