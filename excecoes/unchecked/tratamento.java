ipublic class tratamento {
	public static void main (String [] args){
		
		try {
		divisao(1,0);
		} catch (IllegalArgumentException e){
			System.err.println(e.getMessage());
		}

	}
	
	public static float divisao(float a, float b){
		
		if (b == 0){
			throw new IllegalArgumentException("Argumento ilegal, não pode dividir por 0!");
		}

		return a/b;

	}

}
