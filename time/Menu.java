import java.util.Scanner;


public class Menu{
	public static void main (String [] args){
		
		Scanner entrada = new Scanner (System.in);
		String sair = "n";
		int op;
		
		System.out.println("Digite o valor inicial da sua conta: ");
		double valor = entrada.nextDouble();
		Conta banco = new Conta(valor);
		while (sair.equals("n")){
			System.out.println("Que operação deseja fazer na conta?\n 1 - Deposito \n 2 - saque \n 3 - ver conta \n 0 - sair");
			op = entrada.nextInt();
			switch (op) {
				case 1:
					System.out.println("Digite o valor a depositar:");
					valor = entrada.nextDouble();
					banco.setValor(true, valor);
					break;
				case 2:
					System.out.println("Digite o valor a sacar:");
					valor = entrada.nextDouble();
					banco.setValor(false, valor);
					break;
				case 3:
					banco.verConta();
					break;
				default:
					sair = "s";
					break;
			}

			System.out.println(Data.getNowHour());
		}

		


		

		
	}
}
