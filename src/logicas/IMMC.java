package br.com.xti.logicas;

import javax.swing.JOptionPane;

public class IMMC {

	public static void main(String[] args) {
		
		
		String peso = JOptionPane.showInputDialog("Qual seu peso em kilo");
		String altura = JOptionPane.showInputDialog("Qual sua altura em metros ");
		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros= Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		String msg = 
        (imc >=20 && imc <= 25) ? "Peso Ideal": "fora do peso ideal";
		
		msg = "O indice de massa corporal é: " + imc + " \n" + msg;
		JOptionPane.showMessageDialog(null,msg);
		System.out.println("IMC " + imc);
		System.out.println(msg);

	}

}
