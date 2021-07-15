package ConsultasPsicologia;



public class PagamentoConsulta {
	
	 
	
	private String opcoespag [] = {"Pix", "Transferencia", "Depósito", "Internet Banking", "MercadoPago"};
	


	public String [] getOpcoespag() {
		return opcoespag;
	}

	public void setOpcoespag(String[] opcoespag) {
		this.opcoespag = opcoespag;
	}
public void opcaopagamento() {
		
		System.out.println("\n Veja aqui as nossas formas de pagamento: ");
		for(int i = 0; i < opcoespag.length ; i++) {
			
			
			System.out.printf("\n %d - %s%n ", i+1, opcoespag[i]);
		}
		
	}
	

}
        
		
		

	
			
		
    




