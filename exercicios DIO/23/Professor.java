public class Professor{
	private String nome;
	private double valorHora;
	private int numeroDeAulas;
	private double descontoINSS = 0.14;
	private double salario;
	private double salarioLiquido;

	public Professor(String nome, double valorHora, int numeroDeAulas){
		this.nome = nome;
		this.valorHora = valorHora;
		this.numeroDeAulas = numeroDeAulas;
		this.setSalario();
		this.setSalarioLiquido();


	}

	private void setSalario(){
		this.salario = valorHora*numeroDeAulas;
	}

	private void setSalarioLiquido(){
		this.salarioLiquido = salario*(1.0 - descontoINSS);
	}

	public String getNome(){
		return this.nome;
	}

	public double getSalarioLiquido(){
		return this.salarioLiquido;
	}
}
