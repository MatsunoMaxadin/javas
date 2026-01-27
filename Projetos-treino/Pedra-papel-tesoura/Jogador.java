public class Jogador implements Comparable {
	
	String sinal;
	String sinalMelhor;
	String sinalPior;

	public Jogador (String sinal, String sinalMelhor, String sinalPior){
		this.sinal = sinal;
		this.sinalMelhor = sinalMelhor;
		this.sinalPior = sinalPior;
	}

	public int compareTo(Object o){
		Jogador adversario = (Jogador) o;

		String sinalAdversario = adversario.sinal;
		
		int resultado;
		if (sinalAdversario.equals(this.sinalMelhor)){
			resultado = -1;
		} else if (sinalAdversario.equals(this.sinalPior)){
				resultado = 1;
			} else {
				resultado = 0;
			}

		return resultado;
	}
}
