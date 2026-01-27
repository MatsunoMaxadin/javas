import javax.swing.JOptionPane;
import java.util.Formatter;
import java.io.*;


public class Menu{
	public static void main (String [] args) throws IOException{


		
		String opS = JOptionPane.showInputDialog("Deseja (1) ler arquiv, ou (2) criar um arquivo?");
		int op = Integer.parseInt(opS.trim());
		if (op == 1){
			String funcionario = JOptionPane.showInputDialog("Qual o nome do funcionário?");
			String caminho = funcionario + ".txt";
			FileInputStream entradaFile = new FileInputStream(caminho);
			InputStreamReader entradaFileFormatada = new InputStreamReader(entradaFile);
			BufferedReader entradaString = new BufferedReader(entradaFileFormatada);
			
			JOptionPane.showMessageDialog(null, entradaString.readLine());
			entradaFile.close();
		} else { 
			String nome = JOptionPane.showInputDialog("Digite o nome do funcionario");
			String idade = JOptionPane.showInputDialog("Digite a idade do funcionario");
			String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionario");
			Funcionario func = new Funcionario(nome, idade, cargo);
			String nomeArquivo = func.getNome() + ".txt";
	                Formatter arquivo = new Formatter(nomeArquivo);
			String texto = func.toString();
        	        arquivo.format(texto);
			arquivo.close();


		}	
	}	


}
