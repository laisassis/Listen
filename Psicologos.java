package ConsultasPsicologia;

import java.util.ArrayList;
import java.util.Scanner;

public class Psicologos extends ConsultaValor  {
	
	ConsultaValor consultavalor = new ConsultaValor();
	Scanner leitor = new Scanner(System.in);
	
	private int marcarConsulta = 0;
	String psicologoConfirmado;
	
	
	private String[] nomespsicologos= {"Dra. Jaqueline Marques", "Dr. Jeff Silva", "Dra. Milena Rodrigues","Dr. Jeremias Lopes","Dra Fiona Encantada",
			"Dr Woody","Dr Jucicleido Alves","Dra Gertrudes","Dr Hans Chucrutes", "Dr Dô Thor"};
	private int[] valorpsicologo = {1,2,3,2,1,3,2,4,4,4};
	                               //0 1 2 3 4 5 6 
	public void listaPsicologos(int opcaoValor, double valorEscolhido) {
		
		ArrayList<Integer> psicologoOpcoes = new ArrayList<Integer>();
		
		System.out.println("\n\nProfissionais da Psicologia que atendem "
				+ "neste preço são:  ");
	
	for(int i = 0; i < nomespsicologos.length; i++)
	{
		if (valorpsicologo[i] == opcaoValor) {
			System.out.printf(" \n %d - %s%n ", i+1, nomespsicologos[i]);
			psicologoOpcoes.add(i+1);
		}
		
		
		
	}

//System.out.println(psicologoOpcoes);

	marcarConsultaProfissional(valorEscolhido, psicologoOpcoes);
	
	
	}
	
	
	public void marcarConsultaProfissional(double valorEscolhido,  ArrayList<Integer> psicologoOpcoes) {
		
		System.out.println("\nQual profissional da lista deseja marcar sua consulta?"
				+ " Escolha conforme a opção disponível na numeração ");
		this.marcarConsulta = leitor.nextInt();
		
		for(int i = 0; i < psicologoOpcoes.size(); i++ ) {
			int cont = psicologoOpcoes.size();
			//System.out.println(cont);
			if(marcarConsulta == psicologoOpcoes.get(i) ) {
				
				System.out.printf("\n** Você escolheu: %s%n" 
						+ "e o preço da consulta é de R$ %.2f **",
						nomespsicologos[this.marcarConsulta-1], valorEscolhido);
						psicologoConfirmado = nomespsicologos[this.marcarConsulta-1];
				   break;
				
			}else if(i == cont-1) {
					System.out.println("Não conseguimos localizar profissionais "
							+ " na faixa preço escolhida! Por favor, escolha uma das opções disponíveis!");
					
					marcarConsultaProfissional(valorEscolhido,  psicologoOpcoes);
				
	
			} 
			
			
		}
			
		
	}

	
}
	
	
	

	



	
	
