package ConsultasPsicologia;

import java.util.Scanner;

public class ConsultaHorarios extends HorariosDisponivel {

	 private int consultaHorario = 0;
	 private String consultaEscolhida;
	 
	 HorariosDisponivel horariosdisponivel = new HorariosDisponivel();

	
public void escolhaConsultaHorario(Scanner leitor) {
	
		
		System.out.println("\nQual data e horário deseja marcar sua consulta? ");
		consultaHorario = leitor.nextInt();
		
		if(consultaHorario > 5) {
			
			System.out.println("Por favor, escolha uma das opções"
					+ "de horários disponíveis!");
			escolhaConsultaHorario(leitor);
		}else {
		consultaEscolhida = horariosdisponivel.gethorarios()[consultaHorario - 1];
		}



	}


public String getConsultaEscolhida() {
	return consultaEscolhida;
}


public void setConsultaEscolhida(String consultaEscolhida) {
	this.consultaEscolhida = consultaEscolhida;
}



} 




