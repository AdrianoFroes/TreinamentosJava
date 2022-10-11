package Cap02;

import java.util.Scanner;

public class CalcularValorTroco {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorProduto = s.nextDouble();

		System.out.print("Informe a quantidade passado pelo cliente ");
		Double valorPassadoCliente = s.nextDouble();
		
		Double resultado = valorPassadoCliente - valorProduto;
		
		System.out.print("Valor troco cliente " + resultado);
		s.close();
		
	}

}
