public class Player{
	
	private String nome;
	private String classe;
	private int nivel;

	Player(String nome, String classe, int nivel){
		setNome(nome);
		setClasse(classe);
		setNivel(nivel);
	}

	public void setNome(String Nome){
		this.nome = Nome;
	}

	public void setClasse(String Classe){
		this.classe = Classe;
	}

	public void setNivel(int Nivel){
		this.nivel = Nivel;
	}

	public String getNome(){
		return this.nome;
	}

	public String getClasse(){
		return this.classe;
	}

	public int getNivel(){
		return this.nivel;
	}

	public String toString(){
		return String.format("Jogador: %s, Classe: %s, Nível: %d\n", getNome(), getClasse(), getNivel());

	}

}
