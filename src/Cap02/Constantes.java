package Cap02;

import java.util.Scanner;

public class Constantes {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		final Integer idadeMinima = 18;
		
		System.out.println("Informa a Idade");
		Integer idade = s.nextInt();
		
		Boolean podeTirarCateira = idade >= idadeMinima;
		
		if(podeTirarCateira) {
			System.out.println("Sim Ele(a) pode tirar Carteira ");
		}else {
			System.out.println("N�o Ele(a) n�o pode tirar Carteira");
		}
		
		
		
		s.close();

	}

}
