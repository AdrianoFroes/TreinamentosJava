package br.com.xti.logicas;

import java.util.Random;
import java.util.Scanner;

public class Fluxo_Dado {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		 System.out.println("Qual seu palpite? ");
		 int palpite = s.nextInt();
		 
		 Random n = new Random();
		 int dado  = n.nextInt(6) + 1;
		 
		 System.out.println("Palpite = " + palpite);
		 System.out.println("Dado = " + dado);
		 
		 if(palpite == dado) {
			 System.out.println("Acertrou");
		 }else {
			 System.out.println("Errou");
		 }
		 
		 
		 
		 s.close();

	}

}
