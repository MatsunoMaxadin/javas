public class FuncFront extends Funcionario {
	
	private double bonus = 1.2;

	public FuncFront (String nome, double salario){
		super(nome);
		this.salario = salario*getBonus();
		
	}

	public double getBonus(){
		return this.bonus;
	}
	
 	@Override
	public String getFuncao(){
		return "Front-end";
	}	

}
