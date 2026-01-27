public enum Lanche {
 sanduiche("Sanduíche", 3.50),
 batataFrita("Batata-Frita", 2.00);

 private String nome;
 private double valor;

 private Lanche (String nome, double valor) {
 	setNome(nome);
	setValor(valor);
 
 }

 public void setNome(String nome){
 	this.nome = nome;
 }

 public void setValor(double valor){
 	this.valor = valor;
 }

 public String getNome(){
 	return this.nome;
 }

 public double getValor(){
 	return this.valor;
 }

 public String toString(){
 	return String.format("Lanche: %s, valor: %.2f", getNome(), getValor());
 }

}

