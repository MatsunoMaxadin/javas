import java.util.Scanner;
public class Arr{
	public static void main(String [] args){
		
		Scanner entrada = new Scanner(System.in);
		int tam, numAlunos;
		System.out.println("Quantas notas?");
		tam = entrada.nextInt();
		System.out.println("Quantos alunos?");
		numAlunos = entrada.nextInt();

		double[][] num = new double[numAlunos][tam];
		double[] medias = new double[numAlunos];
		double[] total = new double[numAlunos];
		
		for (int i = 0; i < numAlunos; i++){
			System.out.printf("Notas do aluno %d\n: ", i+1);

			for (int j = 0; j < tam; j++){
			num[i][j]  = entrada.nextDouble();
			}
		}

		for (int i = 0; i < numAlunos; i++) {
			for (double n: num[i]){
				total[i] += n;
			}

			medias[i] = total[i]/tam;
		}

	
		int i = 1;

		for (double media: medias){
			System.out.printf("%dº média: %.1f\n", i, media);
			i++;
		}



		
	}

}
