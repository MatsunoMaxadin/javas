public class UsuarioInexistenteException extends Exception {
	
	public UsuarioInexistenteException(){
		super("Usuário não encontrado no Sistema!");
	}

}
