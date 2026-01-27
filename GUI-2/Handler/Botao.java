import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Botao extends JFrame {
	private JButton entrada;
	private JButton saida;
	private Handler handler;
	private JLabel foto;

	public Botao(){

		super("Cadastro legal");
		
		setLayout(new FlowLayout());

		Icon erin = new ImageIcon("erin.png");
		foto = new JLabel("logo da empresa", erin,SwingConstants.LEFT);

		add(foto);

		entrada = new JButton("Cadastro");
		saida = new JButton("login");
		handler = new Handler(entrada, saida);


		

		entrada.addActionListener(handler);
		add(entrada);
		
		saida.addActionListener(handler);
		add(saida);

	}

}

