import java.util.Scanner;

public class teste {
	
	public static String frase (String Frase){

		return Frase + "? Foi o que ela disse";

	}	


	public static void main (String[] args){
	
	Scanner entrada = new Scanner(System.in);

	String ela = entrada.nextLine();	
	System.out.printf(frase(ela));

	}

}
