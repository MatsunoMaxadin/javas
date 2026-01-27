import java.util.Scanner;

public class Banco{

public static void main (String[] args){
 Scanner entrada = new Scanner(System.in);

 System.out.printf("Qual seu nome?\n");

 String nome = entrada.nextLine();

 System.out.printf("Qual o valor atual na sua conta?\n");

 double valor = entrada.nextDouble();

 Cliente cliente = new Cliente(nome, valor);

 int op;

	System.out.printf("Bem-vindo ao Banco da Bahia!\n");
do {
 	System.out.printf("O que você quer fazer?\n");
	System.out.printf("1- Ver extrato \n2- Sacar (%d disponíveis)\n3- Depositar\n0- Sair do aplicativo\n", cliente.getDepositos());

	op = entrada.nextInt();

	switch (op) {
		case 1:
		       	cliente.extrato();
			break;
		case 2:
			System.out.printf("Digite o valor para sacar (máximo de %.2f): ", cliente.getValor());
			cliente.sacarDinheiro(entrada.nextDouble());
			break;
		case 3:
			System.out.printf("Quanto você quer depositar?\n");
			cliente.depositarDinheiro(entrada.nextDouble());
			break;
	}

 } while (op != 0); 

 System.out.printf("Até logo!\n");

}


}
