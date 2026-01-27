import java.util.Scanner;
public class Lanchonete {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual lanche você quer?\n1 - Sanduíche\n2 - Batata-Frita");
		
		int  op = entrada.nextInt();
		
		switch (op) {
			case 1: 
				System.out.println(Lanche.sanduiche);
				break;
			case 2:
				System.out.println(Lanche.batataFrita);
				break;
		}

		
	
	}

}
