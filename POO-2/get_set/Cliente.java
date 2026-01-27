public class Cliente {
	private String nome;
	private int id;
	private int cpf;
	private int rg;
	
	public Cliente(){
		System.out.println("Bem vindo a nossa loja! Por favor, faça seu cadastro: ");

	}
	public void printCliente(){
		System.out.printf("Nome: %s, Id: %d\n", getName(), getId());
	}
	public void setName(String Nome){
	
		this.nome = Nome;
	}

	public void setId(int Id) {
		this.id = Id;
	}

	public String getName(){
		return this.nome;
	}

	public int getId(){
		return this.id;
	}




}
