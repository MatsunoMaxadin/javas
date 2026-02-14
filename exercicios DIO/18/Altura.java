public class Altura{
	private String nome;
	private double altura;
	private double crescimento;

	public Altura(String nome, double altura, double crescimento){
		this.nome = nome;
		this.altura = altura;
		this.crescimento = crescimento;
	}

	public void crescer(){
		this.altura += this.crescimento;
	}

	public double getAltura(){
		return this.altura;
	}
}
