import java.util.Scanner;

public class VinteQuatro{
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas horas de viagem?");
		double horas = entrada.nextDouble();
		System.out.print("Qual a velocidade média em que viajou?");
		double velocidade = entrada.nextDouble();

		CarroQuestao carro = new CarroQuestao(horas, velocidade);

		carro.showLitrosUsados();



	}
}
