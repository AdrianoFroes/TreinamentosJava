package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome + "!!!");
				
				Produto p1 = new Produto("Caneta ", 12.34, 0.99);
				imprimir.accept(p1);
				
				Produto p2 = new Produto("Notebook ", 2987, 0.99);
				Produto p3 = new Produto("Caderno ", 19.90, 0.3);
				Produto p4 = new Produto("Borrcha ", 7.80, 0.18);
				Produto p5 = new Produto("Lapis ",4.39, 0.19);
				
			List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
			
			produtos.forEach(imprimir);
				
	}
	
	
	

}
