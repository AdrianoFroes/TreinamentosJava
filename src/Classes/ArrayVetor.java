package Classes;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {

		String posicoes = JOptionPane.showInputDialog("Quantas posi��es deve ter o Array");
		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual valor da nota na posi��o " + pos);
			notas[pos] = Double.valueOf(valor);

		}

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " � = " + notas[pos]);

		}
		
	}

}
