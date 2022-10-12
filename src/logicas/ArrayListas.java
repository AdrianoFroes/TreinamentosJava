package br.com.xti.logicas;

import java.util.ArrayList;

public class ArrayListas {

	public static void main(String[] args) {
		 
	     
		 ArrayList<String> cores = new ArrayList<>();
		 cores.add("Branco");
		 cores.add("Amarelo");
		 cores.add("Azul");
		 cores.add(0,"Vermelho");
		 
		 
		 System.out.println(cores.toString());
		 System.out.println("Tamanho Array " + cores.size());
		 System.out.println("Elemento "+ cores.size());
		 System.out.println("Indice Branco"+ cores.indexOf(" Branco "));
		 
		 cores.remove("Branco");
		 
		 System.out.println("No arry tem a cor Preto? " + cores.contains("Preto"));
		 
		
	}

}
