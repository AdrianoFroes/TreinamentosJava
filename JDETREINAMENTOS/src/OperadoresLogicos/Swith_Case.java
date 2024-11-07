package OperadoresLogicos;

public class Swith_Case {

	public static void main(String[] args) {
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		int dia = 4;
		switch (dia) {
		case 1: 
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda feira");
			break;
		case 3:
			System.out.println("terca feira");
			break;
			
		    default: System.out.println("outro dia ");
		    break;
		}
			
		}

	}

