package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {

		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrai Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroAcem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12;

		Carro k = new Carro("kenigsseg CCXR", 430, 3.1);
		Motor v8 = new Motor("V8", 118);
		k.motor = v8;
		
		Carro bugatti = new Carro("Bugatti Veyron ", 430,2.2, new Motor("W16",1200));

		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia);

	}

}
