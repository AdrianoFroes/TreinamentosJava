package OperadoresLogicos;

public class OperadoresTernarios {

	public static void main(String[] args) {
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 10;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		String resultado;
		
		resultado = media >=70 ? "Aluno Aprovado Media " + media : (media >=40 && media <=69) ? "Aluno em recuperação Media " + media : "Aluno aprovado Media " + media;
		
		System.out.println(resultado);

	}

}
