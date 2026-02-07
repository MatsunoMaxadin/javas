import java.util.Scanner;

public class Testando{
	public static void main(String [] args){
		
		Funcionario funcionario = new Funcionario("Max","Max123","123");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		String senha = entrada.nextLine();


		try {
			mostrarFuncionario(funcionario, nome, senha);
		} catch (UsuarioInexistenteException | SenhaIncorretaException e){
			System.err.print(e.getMessage());
		}
	
	}

	public static void mostrarFuncionario(Funcionario funcionario, String nome, String senha) throws UsuarioInexistenteException, SenhaIncorretaException{
		
		if (!(nome.equals(funcionario.getNome())))
			throw new UsuarioInexistenteException();
		if (!(senha.equals(funcionario.getSenha())))
			throw new SenhaIncorretaException();

		System.out.println(funcionario.toString());
	}
}
