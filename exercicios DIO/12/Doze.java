import java.util.Scanner;

public class Doze{
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Preço do produto: ");
		double produto = entrada.nextDouble();
		System.out.print("Qual a forma de pagamento?\n");
		System.out.print("1 - À vista em dinheiro ou pix\n2 - À vista no cartão de crédito\n3 - parcelado em duas vezes\n4 - parcelado em três ou mais vezes\n");
		int op = entrada.nextInt();
		double precoFinal = 0.0;
		switch (op){
			case 1: 
				precoFinal = Produto.VistaDinheiroPix.calcularPreco(produto);
				break;
			case 2:
				precoFinal = Produto.VistaCredito.calcularPreco(produto);
				break;
			case 3: precoFinal = Produto.ParceladoDuasVezes.calcularPreco(produto);
				break;
			case 4: precoFinal = Produto.ParceladoMaisVezes.calcularPreco(produto);
		}

		System.out.println("Preço final: " + precoFinal);
		
	}
}
