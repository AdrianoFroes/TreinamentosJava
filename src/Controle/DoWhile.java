package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		String texto = "";
		do {
			System.out.println("Informe a palavra magica para sair do código");
			System.out.println("Quer Sair");
			texto = s.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		
	    System.out.println("Obrigado");
		s.close();
		

	}

}
