public class Carro{
	
	private double hora;
	private double velocidade;
	private double distancia;
	private double litrosPorKm;
	private double litrosUsados;

	public Carro(double hora, double velocidade, double litrosPorKm){
		this.hora = hora;
		this.velocidade = velocidade;
		this.litrosPorKm = litrosPorKm;
		this.setDistancia();
		this.setLitrosUsados();
	}

	public void setDistancia(){
		this.distancia = hora*velocidade;
	}

	public void setLitrosUsados(){
			this.litrosUsados = this.distancia/this.litrosPorKm;
		}

	public void showLitrosUsados(){
		System.out.print("Litros Usados: " + this.litrosUsados);
	}
}		
