package Cap07;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {

//		String[] cardapio = new String[] { "Calabresa", "Atun", "Queijo", "Presunto" };
//
//		System.out.println("Escolha o sabor");
//
//		for (int i = 0; i < cardapio.length; i++) {
//			System.out.println("[" + i + "]" + cardapio[i]);
//		}
//
//		Scanner s = new Scanner(System.in);
//		System.out.print("Digite o numero referente ao sabor: ");
//		Integer saborEsolhido = s.nextInt();
//
//		System.out.println("Sabor escolhido: " + cardapio[saborEsolhido]);
//
//		s.close();
		
		String[] cardapio = new String[] { "Calabresa", "Atun", "Queijo", "Presunto" };
         
		cardapio[3] = "Frango"; 
		
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]);
		}


	}

}
