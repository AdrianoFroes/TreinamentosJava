package Cap02;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorProduto = s.nextDouble();
		
		System.out.println("Informe o tipo do pagamento[1 = A vista / 2 = A prazo: ] ");
		Integer tipoPagamento = s.nextInt();
		
		Boolean pagamentoAvista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		if(!pagamentoAvista) {
			juros = 10.0;
			
		}
		
		Double acrescimo = valorProduto * juros /100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + valorTotal);
		
		s.close();

	}

}
