public abstract class Funcionario implements Comparable {

	protected String nome;
	protected double salario;
	
	public Funcionario(String nome){
		this.nome = nome;
	}
	public Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	public Funcionario(String nome, double salario, double bonus){
		this.nome = nome;
		this.salario = salario*bonus;
	}

	public String getNome(){
		return this.nome;
	}

	public double getSalario(){
		return this.salario;
	} 

	public int compareTo(Object o){
		Funcionario func = (Funcionario) o;

		int resultado;

		if (getSalario() > func.getSalario()){
			resultado = 1;
		} else if (getSalario() < func.getSalario()){
			resultado = -1;
			} else {
				resultado = 0;
			}

		return resultado;
	}

	public String getFuncao(){
		return "abstrato";
	} 


}
