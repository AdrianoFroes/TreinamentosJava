package Cap05;

public class EstruturaIf {

	public static void main(String[] args) {
	 
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		//Boolean movimentaMetadeValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean contaTemTempoAbertura = true;
		Boolean temNomeLimpo = true;
		
		
		//Boolean liberarEmprestimo = movimentaMetadeValor
			//	&& contaTemTempoAbertura && temNomeLimpo;
		
			
		if(((movimentacaoMedia * 2)>=emprestimo) 
			&& contaTemTempoAbertura && temNomeLimpo) {
			System.out.println("Sim pode liberar emprestimo ");
		}else {
			System.out.println("Não pode liberar empréstimo ");
			
		}
		  
	}

}
