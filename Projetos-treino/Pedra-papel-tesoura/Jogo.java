import java.util.Scanner;

public class Jogo{
	public static void main (String [] args){
		Jogador[] jogadores = new Jogador[2];
		Scanner entrada = new Scanner(System.in);
		int escolha;

		for (int i = 0; i < 2; i++) {
			System.out.println("1 - Papel\n 2 - Pedra\n 3 - Tesoura");
			escolha = entrada.nextInt();

			switch (escolha) {
				case 1:
					jogadores[i] = new Papel();
					break;
				case 2:
					jogadores[i] = new Pedra();
					break;
				case 3:
					jogadores[i] = new Tesoura();
					break;
			}

		
		}

		int resultadoJogo = jogadores[0].compareTo(jogadores[1]);

		if (resultadoJogo == 1){
			System.out.println("Jogador 1 ganhou!\n");
		} else if (resultadoJogo == -1) {
			System.out.println("Jogador 1 perdeu!\n");
		} else {
			System.out.println("Empate!\n");
		}
	}
}
