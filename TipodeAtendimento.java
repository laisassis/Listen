package ConsultasPsicologia;


public class TipodeAtendimento  {
	
	Paciente paciente1 = new Paciente();
	
	
	private String[] tipoAtendimento = {"Google Meet",
			"Discord", "Zoom"};  
	
	
	public String[] getTipoAtendimento() {
		return tipoAtendimento;
	}


	public void setTipoAtendimento(String[] tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}


	public void listaTiposAtedimentos() {
		
	System.out.println("\nNossas formas de Atendimento são: ");
		
		for(int i = 0; i < tipoAtendimento.length; i++)
		{
			
			
			System.out.printf(" \n %d %s%n ", i+1, tipoAtendimento[i]);
			
			
		}
		
		
		
	}
	 

   }


	


