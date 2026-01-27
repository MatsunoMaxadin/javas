import java.util.Random;

public class Cliente {
	
	private String nome;
	private double valor;
	private int numConta;
	private int depositos;
	
	public Cliente(String Nome, double valor){

		setNome(Nome);
		setValor(valor);
		setNumConta();
		setDepositos();
	
	
	}
	public void setNome(String Nome){
		this.nome = Nome;
	}

	public void setValor(double Valor){
		this.valor = Valor;
	}

	public void setNumConta(){

		Random randomGenerator = new Random();

		int Num = randomGenerator.nextInt(8999) + 1001;

		
		this.numConta = Num;
	}

	public int  getNumConta(){
	
	return this.numConta;
	}

	public double getValor(){

	return this.valor;

	}

	public String getNome(){
	return this.nome;
	}

	public int getDepositos(){
	return this.depositos;
	}
	
	public void setDepositos(){
		this.depositos = 5;
	
	}

	public void diminuiDeposito(){
		this.depositos -= 1;
	}

	public void sacarDinheiro(double Valor) {
	if (this.depositos >=1){
	this.valor -= Valor;
	diminuiDeposito();
	} else {
	 System.out.println("Limite de saques diários alcançado! Volte novamente amanhã.\n");
	}
	
	}

	public void extrato() {
	
		System.out.printf("Cliente: %s, Numero da conta: %d, Valor atual: %.2f\n", getNome(), getNumConta(), getValor());	}

	public void depositarDinheiro(double Valor){

		this.valor += Valor;
		
	
	}

} 
