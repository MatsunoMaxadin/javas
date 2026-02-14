public class Triangulo{
	private int a;
	private int b;
	private int c;
	private String tipoTriangulo;

	public Triangulo(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isValid(){
		return ((a < b + c) && (b < a + c) && (c < a + b));
	}

	public void tipoTriangulo(){
		if (this.isValid()){
			if ((a == b) && (b == c))
				this.tipoTriangulo = "Equilatero";
			else if ((a == b) || (b == c) || (a == c))
				this.tipoTriangulo = "Isósceles";
			else
				this.tipoTriangulo = "Escaleno";

			System.out.println("Este triangulo é " + this.tipoTriangulo);
		} else {
			System.out.println("Triangulo inválido!");
		}

	}
}		
