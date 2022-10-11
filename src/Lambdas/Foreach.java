package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

     List<String> aprovado = Arrays.asList("ana,","bia,","gui");
     
     System.out.println("Forma Tradicional ");
     for(String nome: aprovado) {
    	 System.out.println(nome);
     }
     
     System.out.println("\nLambda #01...");
     
     aprovado.forEach(nome-> System.out.println(nome + "!!!"));
     
     System.out.println("\nMetohod Reference...");
     
     aprovado.forEach(System.out::println);
     
  System.out.println("\nLambda #02...");
     
     aprovado.forEach(nome-> meuImprimir(nome));

	}
	
	static void meuImprimir(String nome) {
		System.out.println("Meu nome é " + nome);
	}

}
