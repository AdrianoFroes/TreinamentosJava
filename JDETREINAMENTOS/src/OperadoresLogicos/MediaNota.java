package OperadoresLogicos;

import javax.swing.JOptionPane;

public class MediaNota {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno para calculo da media ");
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) /4;
		
		if(media >=50) {
			if(media >=70) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + " esta aprovado com média " + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome +  " esta de recuperacao com média " + media);
				
			}
		}else {
			
			JOptionPane.showMessageDialog(null, "Aluno: " + nome + " esta reprovado com media de " + media);
		}
		

	}

}
