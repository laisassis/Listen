package ConsultasPsicologia;

import java.util.Scanner;

public class EscolhaTipodeAtendimento extends TipodeAtendimento {
	
	

	TipodeAtendimento tiposatendimentos = new TipodeAtendimento();
	
	private int plataforma = 0;
	private String plataformaEscolhida;
	
	
	
public TipodeAtendimento getTiposatendimentos() {
		return tiposatendimentos;
	}



	public void setTiposatendimentos(TipodeAtendimento tiposatendimentos) {
		this.tiposatendimentos = tiposatendimentos;
	}



	public int getPlataforma() {
		return plataforma;
	}



	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}



public void escolhaTipoAtendimentoPaciente(Scanner leitor) {
	
		
		System.out.println("\nQual plataforma deseja realizar sua consulta? ");
		plataforma = leitor.nextInt();
		
		if (plataforma > 3 || plataforma < 1) {
			
			System.out.println("Por favor, escolha uma das opções disponíveis na lista!");
			escolhaTipoAtendimentoPaciente(leitor);
		}
		else {
			
			plataformaEscolhida = tiposatendimentos.getTipoAtendimento()[plataforma-1];
			System.out.printf("\n ** Você escolheu a plataforma %s **",
			tiposatendimentos.getTipoAtendimento()[plataforma-1]);
		
		
		}
		
		
		
		}



public String getPlataformaEscolhida() {
	return plataformaEscolhida;
}



public void setPlataformaEscolhida(String plataformaEscolhida) {
	this.plataformaEscolhida = plataformaEscolhida;
}

}
