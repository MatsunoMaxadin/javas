import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Ficha extends JFrame {
	
	private JLabel titulo, nome, idade, cargo, linguagens, area;
	private JButton voltar;
	private User user;

	public Ficha(User user){
		super("Ficha De Funcionário");
		setSize(400,100);
		setLayout( new FlowLayout() );
		
		this.user = user;
		titulo = new JLabel("Dados do Funcionário");
		add(titulo);

		nome = new JLabel(String.format("Funcionário: %s", user.nome));
		add(nome);

		idade = new JLabel(String.format("Idade: %s", user.idade));
		add(idade);	

		cargo = new JLabel(String.format("Cargo: %s", user.cargo));
		add(cargo);

		linguagens = new JLabel(String.format("Linguagens utilizadas no projeto: %s", user.linguagens));
		add(linguagens);

		area = new JLabel(String.format("Area do projeto: %s", user.area));
		add(area);

		voltar = new JButton("fechar Ficha");
		voltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				if (evento.getSource() == voltar){
					setVisible(false);
				}	
			}
		
		});
		
	}

	public void setUser(User user){
		this.user = user;
	}
}
