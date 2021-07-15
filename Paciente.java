package ConsultasPsicologia;

import java.util.Scanner;

public class Paciente {
	
	
	private String nome; 
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	public void contato(Scanner leitor) {
		
		System.out.println("Qual é o seu nome? ");
		nome = leitor.next();
		
		System.out.println("\nDigite o seu email: ");
		email = leitor.next();
	}

}
	
