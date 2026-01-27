import java.util.Scanner;
import java.util.Random;

public class quest{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		// questao 0 
		
		System.out.printf("Digite o raio: ");
		float raio = entrada.nextFloat();

		System.out.printf("Diâmetro: %.2f, comprimento: %.2f, área: %.2f", raio*2.0, 2*3.14*raio, 3.14*raio*raio);


	

	       //questao 1 
	
	      System.out.printf("De quantos lados você quer o dado?");

	      int lados = entrada.nextInt();

	      Random randomGenerator = new Random();

	      int num_aleatorio = randomGenerator.nextInt(10) + 1;

	     System.out.printf("Caiu o número %d\n", num_aleatorio); 
		

	     //questao 3
	     
	     System.out.printf("Quantos patinhos foram passear?");

	     int n = entrada.nextInt();

	     for (int i = n; i > 0; i--){
	     	System.out.printf("%d patinhos foram passear \n Além das montanhas \n Para brincar \n A mamãe gritou: Quá Quá Qua Quá \n Mas só %d patinhos voltaram de lá\n", i, i-1);
	     
	     }

	     System.out.printf("A mamãe patinha foi procurar \n Além das montanhas \n Na beira do mar \n A mamãe gritou: Quá Qua Quá Quá \n E os %d patinhos voltaram de lá", n);

	}

}  
