package br.com.xti.logicas;

public class Fluxo_If {

	public static void main(String[] args) {
		
		int idade = 21;
		if(idade <=11) {
			System.out.println("Criança");
		}else if (idade > 11 && idade <=18){
			System.out.println("Adolecente");
		}else if(idade > 18 && idade <=10) {
			System.out.println("Adulto");
		}else {
			System.out.println("Melhor idade");
		}

	}

}
