package br.com.xti.logicas;

public class Fluxo_Switch {

	public static void main(String[] args) {
		
		char sexo = 'M';
		
		switch(sexo) {
		case 'M':
			System.out.println("Macho");
			break;
		case'F':
		   System.out.println("Femea");
		   break;
		default:
			System.out.println("Outros");
			
		}
		

	}

}
