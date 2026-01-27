public class FuncBack extends Funcionario{
	
	protected double bonus = 1.6;

	public FuncBack(String nome, double salario){
		super(nome);
		this.salario = salario*getBonus();
	}

	public double getBonus(){
		return this.bonus;
	}
	
	@Override
	public String getFuncao(){
		return "Back-end";
	}
}
