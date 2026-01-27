public class User{
	
	private String nome;
	private String cpf;
	private String senha;
	private int idade;

	User(String Nome, String Cpf, String Senha, int Idade){
		this.nome = Nome;
		this.cpf = Cpf;
		this.senha = Senha;
		this.idade = Idade;
	}

	public String getNome(){
		return this.nome;
	}

	public String getCpf(){
		return this.cpf;
	}

	public String getSenha(){
		return this.senha;
	}

	public int getIdade(){
		return this.idade;
	 }



	public String toString(){
		return String.format("Usuário: %s, cpf: %s, idade: %d", getNome(), getCpf(), getIdade());
	}

}
