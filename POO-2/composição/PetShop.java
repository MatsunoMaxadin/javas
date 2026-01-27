import java.util.Scanner;

public class PetShop {
	public static void main (String [] args){
	
	String nome; 
	int idade;
	String responsavel;
	String nomePet;
	int idadePet;

	Scanner entrada = new Scanner(System.in);
	System.out.printf("Bem-vindo ao petshop!\nPor favor, faça seu cadastro:\n");
	System.out.printf("Qual seu nome?\n");
	
	nome = entrada.nextLine();

	System.out.printf("Qual sua idade?\n");

	idade = entrada.nextInt();
	entrada.nextLine();
	
	Person cliente = new Person(nome, idade);
	if (idade < 18) {
		System.out.printf("Você é de menor. Quem é seu responsável?\n");
		responsavel = entrada.nextLine();
		cliente.setParent(responsavel);
	}

	System.out.println(cliente);

	System.out.println("Agora, vamos cadastrar seu pet!");
	System.out.println("Nome do Pet: ");

	nomePet = entrada.nextLine();

	System.out.println("idade do Pet: ");
	idadePet = entrada.nextInt();

	Animal pet = new Animal(nomePet, idadePet, cliente);
	
	cliente.setPetName(pet);
	System.out.println(cliente);
	System.out.println(pet);




	
}
}
