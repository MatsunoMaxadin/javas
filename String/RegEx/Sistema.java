import javax.swing.JOptionPane;

public class Sistema{

	

	
	public static void main(String [] args){
		String nome, cpf, senha, Sidade;
		int idade, cpfCerto, senhaCerta;

		JOptionPane.showMessageDialog(null,"Bem-Vindo ao sistema daora!\n vamos fazer seu cadastro!");
		
		nome = JOptionPane.showInputDialog("Digite seu nome");
		
		Sidade = JOptionPane.showInputDialog("Digite sua idade");
		
		idade = Integer.parseInt(Sidade.trim());

		
		cpf = JOptionPane.showInputDialog("Digite seu cpf (na forma xxx.xxx.xx-xx)");
		cpfCerto = Verifica.cpfValido(cpf);

		while (cpfCerto == 0){
			cpf = JOptionPane.showInputDialog("cpf inválido! digite novamente.");	
			cpfCerto = Verifica.cpfValido(cpf);
		}

		
		senha = JOptionPane.showInputDialog("Digite sua senha (ela deve ter pelo menos 6 digitos)");
		
		senhaCerta = Verifica.senhaValida(senha);

		while (senhaCerta == 0){
			senha = JOptionPane.showInputDialog("senha muito curta!\n no mínimo, use 6 caracteres");

			senhaCerta = Verifica.senhaValida(senha);
		}

		User user = new User(nome, cpf, senha, idade);

		JOptionPane.showMessageDialog(null, "Cadastro Completo!\n entre na sua conta:");

		cpf = JOptionPane.showInputDialog("Digite seu cpf (na forma xxx.xxx.xxx-xx)");
		cpfCerto = Verifica.VerificaDado(cpf, user.getCpf());

		while(cpfCerto == 0){
			cpf = JOptionPane.showInputDialog("cpf incorreto! Tente novamente.");
			cpfCerto = Verifica.VerificaDado(cpf, user.getCpf());
		}

		senha = JOptionPane.showInputDialog("Digite sua senha");

		senhaCerta = Verifica.VerificaDado(senha, user.getSenha());

		while(senhaCerta == 0){
			senha = JOptionPane.showInputDialog("Senha incorreta! Tente novamente.");
			senhaCerta = Verifica.VerificaDado(senha, user.getSenha());
		}
		
		JOptionPane.showMessageDialog(null, String.format("Bem-vindo(a), %s!", user.getNome()));
		JOptionPane.showMessageDialog(null, user.toString());

		
	
	}
}
