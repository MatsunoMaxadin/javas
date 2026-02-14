import java.util.Scanner;

public class Treze{
	public static void main (String [] args){
		
		Scanner entrada = new Scanner(System.in);

		Pessoa pessoa = new Pessoa(entrada.nextLine(), entrada.nextDouble(), entrada.nextInt());
		pessoa.isDeMaior();

		entrada.close();
	}	


private static class Pessoa{
	private String nome;
	private double peso;
	private int idade;

	public Pessoa (String Nome, double Peso, int Idade){
		this.nome = Nome;
		this.peso = Peso;
		this.idade = Idade;
	}

	public void isDeMaior(){
		if (this.idade >= 18)
			System.out.println("é de maior");
		else
			System.out.println("é de menor");
	}
}
}
