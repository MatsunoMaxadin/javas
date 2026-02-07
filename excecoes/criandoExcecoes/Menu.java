import java.util.Scanner;
import java.util.ArrayList;
import java.util.Formatter;
import java.io.*;


public class Menu{
	public static void main(String [] args){
		
	ArrayList<String> dados = new ArrayList<String>();
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("1-criar funcionario, 2-entrar na conta");
	int op = entrada.nextInt();

	if (op == 1){
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		System.out.println("Digite sua senha");
		String senha = entrada.nextLine();
		System.out.println("Digite seu numero");
		String numero = entrada.nextLine();

		
		
		dados.add(nome);
		dados.add(senha);
		dados.add(numero);

		Arquivo arquivo = new Arquivo();

		arquivo.createList(dados, nome);
		
	} if (op == 2){
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		Arquivo arquivo = new Arquivo();
		
		String[] nomes = arquivo.getListasNames();

		Arrays.sort(nomes);
		if (!(Arrays.binarySearch(nomes, nome))){
			
		}



		
	}
	

	}

	public static void printFuncionario(String[] nomes, String nome){
		
		Arrays.sort(nomes);
		if (!(Arrays.binarySearch(nomes, nome))){
			throws new UsuarioInexistenteException();
		} else {
					
		}
	}

	
}

