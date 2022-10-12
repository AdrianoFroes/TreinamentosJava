package br.com.xti.logicas;

public class Fluxo_Foreach {

	public static void main(String[] args) {
		
		int[] pares = {2,4,6,8};
		for(int i=0; i<pares.length; i++) {
			int par = pares[1];
			System.out.println(par);
		}
		
		System.out.println();
		
		for(int par : pares) {
			System.out.println(par);
		}

	}

}
