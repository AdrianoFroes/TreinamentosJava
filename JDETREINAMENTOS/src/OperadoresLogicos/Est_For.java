package OperadoresLogicos;

public class Est_For {

	public static void main(String[] args) {
		
		
		for(int numero = 0; numero <=10; numero++) {
			//System.out.println("o numero atual é " + numero);
			
			if(numero % 2 == 0) {
				System.out.println("numero " + numero + " é par ");
			}else {
				System.out.println("numero " + numero + " é impar ");
			}
		}

	}

}
