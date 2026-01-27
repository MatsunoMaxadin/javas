import java.util.Scanner;

public class raiz{
	
	public static void main(String[] args){
		float a, b, c;
		Scanner entrada = new Scanner(System.in);


		System.out.printf("Digite o coeficiente A: ");
		a = entrada.nextFloat();
		System.out.printf("Digite o coeficiente B: ");
		b = entrada.nextFloat();
		System.out.printf("Digite o coeficiente C: ");
		c = entrada.nextFloat();

		if (a !=  0){
			float delta = b*b - 4*a*c;
			if (delta >= 0) {
				float sqrtdelta = (float)Math.sqrt(delta);

				float X1 = (-b + sqrtdelta)/(2*a);
				float X2 = (-b - sqrtdelta)/(2*a);
				if (delta > 0) {

					System.out.printf("Raízes: x' = %.2f, x'' = %.2f", X1, X2);
			
					} else {
						System.out.printf("só temos apenas uma raíz, que é %.2f", X1);	
					}
		} else{
			System.out.printf("O sistema não possui raízes reais.");
		}} else {
			System.out.printf("Isso aí não é equação de segundo grau");
		}
			
	}
}
