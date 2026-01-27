import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Handler implements ActionListener {
	private JButton entrada, saida;
	private String nome = null;

	public Handler(JButton entrada, JButton saida){
		this.entrada = entrada;
		this.saida = saida;
	}

	public void actionPerformed(ActionEvent evento) {
			
		if (evento.getSource() == entrada){
		nome = JOptionPane.showInputDialog("Digite seu nome");
		} else if (evento.getSource() == saida){
				if (nome == null){
					JOptionPane.showMessageDialog(null,"por favor, se cadastre antes!");

				} else {
					JOptionPane.showMessageDialog(null, String.format("Olá, %s!", nome));
				}
			}
		}
	
	
}
