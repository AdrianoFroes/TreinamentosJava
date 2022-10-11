package Fundamento.Operadores;

import java.util.Scanner;

public class DesaCalculadora {

	public static void main(String[] args) {
	
		
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Informe um numero");
		 double num1 = s.nextDouble();
		 
		 System.out.println("Informe o numero ");
		 double num2 = s.nextDouble();
		 
		 System.out.println("Informe a operacao ");
		 String op = s.next();
		 
		 double resultado = "+".equals(op) ? num1 + num2 : 0;
		 resultado = "-".equals(op) ? num1 - num2 : resultado;
		 resultado = "*".equals(op) ? num1 * num2 : resultado;
		 resultado = "/".equals(op) ? num1 / num2 : resultado;
		 resultado = "%".equals(op) ? num1 % num2 : resultado;
		 
		 System.out.printf("%.2f %s %.2f = %.2f" , num1,op,num2,resultado);
		 
		 
		 
		 
		 s.close();

	}

}
