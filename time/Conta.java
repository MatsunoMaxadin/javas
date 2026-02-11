import java.util.Locale;
import java.text.Format;
import java.text.NumberFormat;

public class Conta{
	
	private double valorAtual;
	private double divida;
	private boolean isIndividado;
	

	public Conta(double ValorAtual){
		this.valorAtual = ValorAtual;
		this.divida = 0;
	}

	public void setValor(boolean isAdicionando, double valorNovo){
		
		double ValorAtualizado = this.valorAtual;
		
		
		if (isAdicionando)
			ValorAtualizado+=valorNovo;
		else
			ValorAtualizado-=valorNovo;

		if(isIndividado && ValorAtualizado > 0.0){
			double dividaAtual = divida;
			divida -= ValorAtualizado;
			ValorAtualizado -= dividaAtual;	
			if (divida > 0.0){
				ValorAtualizado -= divida;
			} else {
				divida = 0.0;
				isIndividado = false;
			}
		}
			
		
		
		if (ValorAtualizado < 0.0) {
			isIndividado = true;
			divida += (valorNovo - this.valorAtual);
			ValorAtualizado = 0.0;
		}

		this.valorAtual = ValorAtualizado;
	}
	
	public void verConta(){
		
		NumberFormat number = NumberFormat.getCurrencyInstance(Locale.getDefault());
		System.out.println("SALDO ATUAL DA CONTA: " + number.format(this.valorAtual) + " " + "DIVIDA COM O BANCO: " + number.format(this.divida)); 
	}
}
