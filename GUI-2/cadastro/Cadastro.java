import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;

public class Cadastro extends JFrame{
	private JTextField userC, userL;
	private JPasswordField senhaC, senhaL;
	private JButton cadastro, login, limpaC, limpaL;
	private JLabel userTC, userTL, senhaTC, senhaTL, campo1, campo2;
	private String usuario, senha;
	public Cadastro(){

		super("Aplicativo de Cadastro");
		
		setLayout(new FlowLayout());

		campo1 = new JLabel("Campo para cadastro:");
		campo1.setHorizontalTextPosition(SwingConstants.CENTER);
		campo1.setVerticalTextPosition(SwingConstants.TOP);
		add(campo1);

		userTC = new JLabel("Usuário: ");
		add(userTC);
		
		userC = new JTextField("campo para digitar");
		add(userC);

		senhaTC = new JLabel("senha: ");
		add(senhaTC);

		senhaC = new JPasswordField(10);
		add(senhaC);

		cadastro = new JButton("cadastrar");
		cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento){
				if (evento.getSource() == cadastro){
					usuario = userC.getText();
					senha = senhaC.getText();
				}
			}
		
		}
		);

		add(cadastro);

		limpaC = new JButton("limpar");
		limpaC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento){
				if (evento.getSource() == limpaC){
					userC.setText("");
					senhaC.setText("");
				
				}
			}
		
		});

		add(limpaC);

		
		campo2 = new JLabel("Campo para login: ");
		campo2.setHorizontalTextPosition(SwingConstants.CENTER);
		campo2.setVerticalTextPosition(SwingConstants.TOP);
		add(campo2);

		userTL = new JLabel("Usuário: ");
		add(userTL);

		userL = new JTextField("Campo para digitar: ");
		add(userL);

		senhaTL = new JLabel("Senha:   ");
		add(senhaTL);

		senhaL = new JPasswordField(10);
		add(senhaL);

		login = new JButton("login");
		login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				if (evento.getSource() == login){
					if(usuario.equals(userL.getText()) && senha.equals(senhaL.getText())){
						JOptionPane.showMessageDialog(null, String.format("Olá, %s!", usuario));
					} else {
						JOptionPane.showMessageDialog(null, "Senha e/ou usuario incorretos!");
					}	
				}
			
			}
		
		});

		add(login);

		limpaL = new JButton("limpar");
		limpaL.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				if (evento.getSource() == limpaL){
					userL.setText("");
					senhaL.setText("");
				}
			}
		
		});

		add(limpaL);

	
	}

}
