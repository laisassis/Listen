package ConsultasPsicologia;

public class ConsultaValor {
	
	
private double precoConsulta [] = {30.20, 40.30, 50.00, 60.00};

	
	public double[] getPrecoConsulta() {
	return precoConsulta;
}




public void setPrecoConsulta(double[] precoConsulta) {
	this.precoConsulta = precoConsulta;
}




	public void listaPreco() {
		
		System.out.println("\n\nOs preços ofertados pelos nossos profissionais são: ");
		for(int i = 0; i < precoConsulta.length; i++) {
			
			
			System.out.printf(" \n  %d - R$ %.2f%n ", i+1, precoConsulta[i]);
			
			
			
		}
		
}
	
}
