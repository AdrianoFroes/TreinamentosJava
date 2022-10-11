package Lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		
		Calculo calculo = new Soma();
		System.out.println("Soma " + calculo.executar(2,3));

		calculo  = new Multiplicar();
		System.out.println("Multiplicação " + calculo.executar(2,3));

	}

}
