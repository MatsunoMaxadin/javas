import java.io.*;
import java.util.Formatter;

public class Funcionario {
	
	private String nome;
	private String idade;
	private String cargo;
	
	public Funcionario (){
		System.out.println("buscando dados...");
	};
	public Funcionario (String nome, String idade, String cargo){
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
	}
	
	public String getNome(){
		return this.nome;
	}

	public String getIdade(){
		return this.idade;
	}

	public String getCargo(){
		return this.cargo;
	}


	public String toString(){
		return String.format("Nome: %s, Idade: %s, Cargo: %s", this.getNome(), this.getIdade(), this.getCargo());
	}


}
