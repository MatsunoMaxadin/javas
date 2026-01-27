public class Aluno {
	String nome;
	int idade;
	double notaMat, notaFis;
	double media;

	public Aluno(String Nome, int Idade, double NotaMat, double NotaFis){
		this.nome = Nome;
		this.idade = Idade;
		this.notaMat = NotaMat;
		this.notaFis = NotaFis;
		this.media = (this.notaMat+this.notaFis)/2.0;
		System.out.printf("nome: %s, idade: %d, nota Matemática: %.2f, nota Fisica: %.2f, média das notas: %.2f", this.nome, this.idade, this.notaMat, this.notaFis, this.media);
	
	}

}
