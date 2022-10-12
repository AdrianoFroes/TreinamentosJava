package br.com.xti.logicas;

public class Breack_Continue {

	public static void main(String[] args) {
	
		for(int i=0; i<10; i++) {
			if(i == 5) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
