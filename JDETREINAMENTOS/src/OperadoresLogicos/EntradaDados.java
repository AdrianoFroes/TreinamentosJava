package OperadoresLogicos;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("informo quantidade de carros "); 
		String pessoas = JOptionPane.showInputDialog("informo quantidade de pessoas "); 
		
		double carroNumero = Double.parseDouble(carros);
		double pessoNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)(carroNumero / pessoNumero);
		
		double resto = carroNumero % pessoNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao? ");
		
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao para pessoa deu "  + divisao);
			
		}
	   resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisao? ");
	   
	   if(resposta == 0) {
		   JOptionPane.showMessageDialog(null, "O resto da divisao é " + resto);
	   }

	}

}
