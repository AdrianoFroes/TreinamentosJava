package OperadoresLogicos;

public class While_do_While {

	public static void main(String[] args) {

		int numero = 0;
		while (numero <= 5) {
			System.out.println("O numero atual é " + numero);
			numero++;
		}
		
		System.out.println("-----------------------------------------");
		
		int numero2 = 0;
		do {
			System.out.println("o numero atual é " + numero2);
			numero2++;
			
		}while(numero2 <= 10);
	}

}
