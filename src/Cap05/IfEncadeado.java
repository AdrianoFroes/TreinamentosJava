package Cap05;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Informe o peso: ");
		Double peso = s.nextDouble();

		Boolean pesoLeve = peso <= 60;
		// Boolean pesoMedio = (peso > 60) && (peso <= 90);
		// Boolean pesoPesado = peso > 90;

		if (pesoLeve) {
			System.out.println("O lutador é peso leve ");
		} else {
			Boolean pesoMedio = (peso > 60) && (peso <= 90);

			if (pesoMedio) {
				System.out.println("O lutador é peso medio ");
			} else {
				Boolean pesoPesado = peso > 90;

				if (pesoPesado) {
					System.out.println("O lutador é peso pesado ");
				}

			}
		}
		s.close();

	}

}
