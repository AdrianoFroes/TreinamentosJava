package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		 
		  Scanner s = new Scanner(System.in);
		  
		  System.out.println("Quantas notas ");
		   int qtdeNotas = s.nextInt();
		   
		   
		   double[] notas = new double[qtdeNotas];
		   
		   for(int i = 0; i < notas.length; i++) {
			   System.out.println("Infome a nota " + (i + 1) + ": ");
			   notas[i] = s.nextDouble();
		   }
		   
		 
		   double total = 0;
		   for(double nota: notas) {
			   total += nota;
		   }
		   
		   double media = total / notas.length;
		   System.out.println("A média é " + media + "!");
		  s.close();
		 

	}

}
