import java.io.*;

public class Leitura {
	public static void main (String [] args) throws IOException{
		FileInputStream entrada = new FileInputStream("file.txt");
		InputStreamReader entradaFormatada = new InputStreamReader(entrada);
		BufferedReader entradaString = new BufferedReader(entradaFormatada);
		FileInputStream entradaSegredo = new FileInputStream("segredo.txt");
		InputStreamReader segredo = new InputStreamReader(entradaSegredo);
		System.out.println(entradaString.readLine());
		System.out.println(segredo.read());
	
	}
}
