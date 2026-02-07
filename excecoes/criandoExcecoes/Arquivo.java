import java.io.*;

import java.util.ArrayList;
import java.util.Formatter;

import javax.swing.JOptionPane;


public class Arquivo{
	
	public ArrayList<String> dados = new ArrayList<String>();
	public File arquivo = new File("/home/pedro/Área de Trabalho/codigos/javas/excecoes/criandoExcecoes/funcionarios");
	public String[] listas = arquivo.list();
	
	public boolean hasListas(){
		listas = arquivo.list();
		boolean resposta;

		if (listas.length >= 1)
			resposta = true;
		else
			resposta = false;

		return resposta;
	
	}
	public String showListas(){
		String diretorio = "";
		listas = arquivo.list();
		int i = 1;
		if (listas.length >= 1){

			for (String lista: listas){
				diretorio += String.format("%d - %s\n",i, lista);
				i++;
			}

		} else{
			diretorio = "Repertório vazio! Por favor, adicione listas.";
		}

		return diretorio;
	
	}
	
	public String[] getListasNames(){
		
		return arquivo.list();
			

	}
	public ArrayList<String> getListaTarefas(int indice){
		
		try {
		listas = arquivo.list();

		if (indice < 1 || indice > listas.length){
			JOptionPane.showMessageDialog(null, "Por favor, digite um indice válido.");
		} else {
			FileInputStream entrada = new FileInputStream("listas/"+listas[indice-1]);
			InputStreamReader entradaFormatada = new InputStreamReader(entrada);
			BufferedReader entradaString = new BufferedReader(entradaFormatada);
			
			String dado = entradaString.readLine();

			while(tarefa != null){
				dados.add(dado);
				dado = entradaString.readLine();
			}


		}
		} catch (IOException e){
			System.out.println("Erro: " + e.getMessage());
		}
		return this.dados;
	}

	public void createList(ArrayList<String> dados, String nomeArquivo){
		
		try {
			Formatter novoArquivo = new Formatter("listas/"+nomeArquivo+".txt");

		String textoArquivo = "";

		for (int i = 0; i < dados.size(); i++){
			textoArquivo+= dados.get(i) + "\n";
		}

		novoArquivo.format(textoArquivo);
		
		novoArquivo.close();	

		} catch (FileNotFoundException e){
			System.err.print("Arquivo não encontrado");
		}
	}
	

}
