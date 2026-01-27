import java.util.Scanner;

public class loja {
	
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.printf("Digite seu nome:\n");

		String nome = entrada.nextLine();

		System.out.printf("Digite seu id: \n");

		int id = entrada.nextInt();

		cliente.setName(nome);
		cliente.setId(id);

		cliente.printCliente();




	}

} 
