public class User{
	
	public String nome;
	public String idade;
	public String area;
	public String linguagens;
	public String cargo;
	
	public User(){}

	public User(String nome, String idade, String[] linguagens, String area, String cargo, int num){
		this.nome = nome;
		this.idade = idade;
		this.area = area;
		
		this.cargo = cargo;
		this.linguagens = linguagens[0];
		for (int i = 0; i < num; i++){
			this.linguagens = ", " + linguagens[i];
		}
		
		
			
		
	}



}
 		
