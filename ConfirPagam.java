package ConsultasPsicologia;

import java.util.Scanner;

public class ConfirPagam extends PagamentoConsulta{
	
	int  escolhaopcao = 0;
	PagamentoConsulta confirmPagamento = new PagamentoConsulta();
	private String pagamentoEscolhido;
	
public void corfirmeOpcao(Scanner leitor) {
	
		
		System.out.println("\nDigite a opção para o pagamento: ");
		escolhaopcao = leitor.nextInt();
		if(escolhaopcao > 5 ||  escolhaopcao < 1 ) {
			
			System.out.println("Opção inválida! Escolha uma das formas de pagamento"
					+ " dispoíveis para pagamento!");
			corfirmeOpcao(leitor);
		} else {
			
			pagamentoEscolhido = confirmPagamento.getOpcoespag()[escolhaopcao-1];
		
		}
	}

public String getPagamentoEscolhido() {
	return pagamentoEscolhido;
}

public void setPagamentoEscolhido(String pagamentoEscolhido) {
	this.pagamentoEscolhido = pagamentoEscolhido;
}

}
