public class Verifica{
	public static int cpfValido(String cpf){

                int cpfCerto;

                if (cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")){
                        cpfCerto = 1;
                } else {
                        cpfCerto = 0;
                }

                return cpfCerto;
        }


	public static int senhaValida(String senha){
                int senhaCerta;

                if (senha.length() >=  6){
                        senhaCerta = 1;
                } else {
                        senhaCerta = 0;
                }

                return senhaCerta;
        }

 	public static int VerificaDado(String Dado, String Input){
		int resposta;

		if (Dado.equals(Input)){
			resposta = 1;
		} else {
			resposta = 0;
		}

		return resposta;
	} 
	
	


}
