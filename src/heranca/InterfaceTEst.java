package br.com.xti.heranca;

public interface InterfaceTEst {
	
	public static void area(AreaCalculavel o) {
		System.out.println(o.calculaArea());
	}
	
	public static void main(String[] args) {
		
		area(new Quadrado(2));
	
		
	}

}
