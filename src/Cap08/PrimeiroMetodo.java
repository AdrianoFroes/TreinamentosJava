package Cap08;

import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 System.out.println("----------------------------------");
		 
		 String[] cursos = new String[] {"JAVA EE", "SPRING", "JA OO"};
		 System.out.println("Escolha dentre os cursos abaixo");
		 
		 
		 for(int i = 0; i < cursos.length;i++) {
			 System.out.println("["+ i + "]" + cursos[i]);
		 }
	  	
		 System.out.println("O curso escolhido foi: ");
		 Integer posicaoCrusoEscolhido = s.nextInt();
		 
		 Boolean posicaoValida = posicaoCrusoEscolhido >=0 && posicaoCrusoEscolhido
				 < cursos.length;
		 
		 if(!posicaoValida) {
			 System.err.println("posicao invalida");
			 System.exit(1);
			 
		 }
		 
		 System.out.println("--------------------------------------");
          
		 String[] formaPagamento = new String[] {"Cartão", "Boleto"};
		 
		 System.out.println("Escolha forma de pagamento abaixo ");
		 
		 for(int i = 0; i < formaPagamento.length; i++) {
			 System.out.println("[" + i + "]" + formaPagamento[i]);
		 }
		 
		 System.out.println("Forma pagamento escolhido: ");
		 Integer posicaoFormaPagamentoEscolhida = s.nextInt();
		 
		 posicaoValida = posicaoFormaPagamentoEscolhida >=0
				 && posicaoFormaPagamentoEscolhida < formaPagamento.length;
		 
		 
		 if(!posicaoValida) {
			 System.err.println("");
		 }
		 
		 
		 
		s.close();

	}

}
