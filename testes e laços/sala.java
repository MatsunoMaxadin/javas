import java.util.Scanner;

public class sala {

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite sua nota: ");

		float nota = entrada.nextFloat();
		if (nota <= 10.0 && nota >= 0.0){
		if (nota >= 7.0) {
			System.out.printf("Passou direto!\n");
		} else if (nota >= 5.0) {
			System.out.printf("faça recuperação\n ");
		} else {
			System.out.printf("reprovou\n");
		}} else {
			System.out.printf("valor inválido\n");
		}

	
	}

}
