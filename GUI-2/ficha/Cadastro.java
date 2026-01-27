import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Cadastro extends JFrame{
	
	private JLabel Nome, Idade, Cargo, Area, Linguagem;
	private JTextField textoNome = new JTextField(20);
	private JTextField textoIdade = new JTextField(20);
	private JRadioButton desing, dev, gestao, front, back, full;
	private JCheckBox java, csharp, javascript;
	private JButton botao = new JButton("Gerar Ficha");
	private JButton sair = new JButton("sair do gerador");
	private int quantosTem;
	private String[] linguagens = new String[3];
	private String area;
	private String cargo;
	private HandleRadio handleR = new HandleRadio();
	private HandleCheck handleC = new HandleCheck();
	private User user;
	private boolean isFichaHere;

	public Cadastro(){
		super("Tela de Cadastro");

		setSize(500,300);
		setLayout(new FlowLayout() );

		Nome = new JLabel("Digite seu nome: ");
		add(Nome);
		add(textoNome);
		
		Idade = new JLabel("Digite sua idade: ");
		add(Idade);
		add(textoIdade);

		Cargo = new JLabel("Qual o seu cargo?");
		add(Cargo);
		
		ButtonGroup grupoCargo = new ButtonGroup();

		desing = new JRadioButton("Desing",false);
		desing.addItemListener(handleR);
		add(desing);
		grupoCargo.add(desing);

		dev = new JRadioButton("Desenvolvedor",false);
		dev.addItemListener(handleR);
		add(dev);
		grupoCargo.add(dev);

		gestao = new JRadioButton("Gestão",false);
		gestao.addItemListener(handleR);
		add(gestao);
		grupoCargo.add(gestao);

		Area = new JLabel("Qual área é o seu projeto atual?");
		add(Area);

		ButtonGroup grupoArea = new ButtonGroup();

		front = new JRadioButton("FrontEnd",false);
		front.addItemListener(handleR);
		add(front);
		grupoArea.add(front);

		back = new JRadioButton("BackEnd",false);
		back.addItemListener(handleR);
		add(back);
		grupoArea.add(back);

		full = new JRadioButton("FullStack",false);
		full.addItemListener(handleR);
		add(full);
		grupoArea.add(full);

		Linguagem = new JLabel("Quais são as linguagens usadas no projeto?");

		java = new JCheckBox("Java");
		java.addItemListener(handleC);
		add(java);
		
		csharp = new JCheckBox("C#");
		csharp.addItemListener(handleC);
		add(csharp);

		javascript = new JCheckBox("JavaScript");
		javascript.addItemListener(handleC);
		add(javascript);



		botao.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent evento){
				if (evento.getSource() == botao){
					user = new User(textoNome.getText(), textoIdade.getText(), linguagens, area, cargo, quantosTem); 		
					isFichaHere = true;
				}
			}
		
		});
		
		add(botao);

		sair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				if(evento.getSource() == sair)
					setVisible(false);
			}
		
		});

		add(sair);	
	}

	



private class HandleRadio implements ItemListener {
	@Override
	public void itemStateChanged(ItemEvent evento){
		if(desing.isSelected())
			cargo = "Designer";
		if (dev.isSelected())
			cargo = "Desenvolvedor";
		if (gestao.isSelected())
			cargo = "gestao";
		if (front.isSelected())
			area = "FrontEnd";
		if (back.isSelected())
			area = "BackEnd";
		if (full.isSelected())
			area = "FullStack";
			
	}

} 

private class HandleCheck implements ItemListener {
	@Override

	public void itemStateChanged(ItemEvent evento){
	quantosTem = 0;

	if (java.isSelected()){
		linguagens[quantosTem] = "Java";
		quantosTem++;
	}
	if (csharp.isSelected()){
		linguagens[quantosTem] = "C#";
		quantosTem++;
	}
	if (javascript.isSelected()){
		linguagens[quantosTem] = "JavaScript";
		quantosTem++;
	}
	}

}


	public User getUser(){
                return this.user;
        }

        public boolean sendState(){
                return this.isFichaHere;

        }

}



