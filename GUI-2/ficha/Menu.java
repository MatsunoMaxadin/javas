import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class Menu extends JFrame {
	
	private JButton botaoCadastro, botaoFicha;
	private JLabel frase;
	private Cadastro cadastro;
	private Ficha ficha;
	private boolean isFichaHere = false;
	private User user;

	public Menu(Cadastro Cadastro){
		super("Menu da Empresa");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		setLayout( new FlowLayout() );
		
		this.cadastro = Cadastro;

		frase = new JLabel("Olá! Seja bem-vindo(a) ao Menu da Empresa!");	
		add(frase);	
		botaoCadastro = new JButton("Cadastrar Ficha");
		botaoCadastro.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent evento){
				if (evento.getSource() == botaoCadastro)
					cadastro.setVisible(true);
			}
		
		});
		add(botaoCadastro);

		botaoFicha = new JButton("Ver Ficha");
		add(botaoFicha);
		botaoFicha.addActionListener(new ActionListener (){
		
			public void actionPerformed(ActionEvent evento){
				if (evento.getSource() == botaoFicha){
					isFichaHere = cadastro.sendState();
					if(isFichaHere){
						ficha = new Ficha(cadastro.getUser());
						ficha.setVisible(true); 
						}else{

						JOptionPane.showMessageDialog(null,"Crie uma ficha antes de visualizar!");}
				}
			}
		
		});
	}

}
