public class Funcionario {
	
	private String Nome;
	private String Senha;
	private String Numero;

	public Funcionario(String nome, String senha, String numero){
		this.Nome = nome;
		this.Senha = senha;
		this.Numero = numero;
	}

	public String getNome(){
		return this.Nome;
	}

	public String getSenha(){
		return this.Senha;
	}

	public String getNumero(){
		return this.Numero;
	}

	public String toString(){
		return String.format("%s\n%s", this.getNome(), this.getNumero());
	}
}
