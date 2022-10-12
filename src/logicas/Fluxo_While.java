package br.com.xti.logicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Fluxo_While {

	public static void main(String[] args) {
		
		ArrayList<String>produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
         
		System.out.println("Liste seus produtos: para sair digite fim ");
		
		String produto;
		
		;
		
		while(!"FIM".equals(produto =  s.nextLine())) {
			produtos.add(produto);
			
		}
		
		System.out.println(produtos.toString());
		
		
		
		s.close();
		

	}

}
