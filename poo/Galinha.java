package br.com.xti.poo;

public class Galinha {
	
	
	   public static int ovosDaGranja;//variavel global criado unica vez
	   public int ovos;
	   
	   
	   public Galinha botar() {
		   this.ovos++;
		   Galinha.ovosDaGranja++;
		   return this;
	   }
     
	   public static double mediaDeOvos(int galinhas) {
		   return Galinha.ovosDaGranja / galinhas;
		   
	   }
}
