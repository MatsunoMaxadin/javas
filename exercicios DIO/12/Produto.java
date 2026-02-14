public enum Produto{
	VistaDinheiroPix(0.85),
	VistaCredito(0.9),
	ParceladoDuasVezes(1.0),
	ParceladoMaisVezes(1.1);
	
	private double desconto;
	Produto(double desconto){
		this.desconto = desconto;

	}

	public double calcularPreco(double preco){
		return this.desconto*preco;
	}
}
 			
