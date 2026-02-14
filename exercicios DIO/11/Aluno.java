import java.util.Arrays;

public class Aluno{
	
	private String name;
	private double[] notas;
	private double media;

	public Aluno(String Name, double[] Notas){
		this.name = Name;
		this.notas = Notas;
		this.media = Arrays.stream(Notas).sum()/4;
		
	}

	public void mostrarResultado(){
		System.out.println("Aluno: " + this.name);
		System.out.println("Media: " + this.media);
		if (media >= 7.0)
			System.out.println("Aprovado!");
		else
			System.out.println("Reprovado!");
	}
}
