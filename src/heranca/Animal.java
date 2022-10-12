package br.com.xti.heranca;

public abstract class Animal {

	double peso;
	String comida;

	final void dormir() {
		System.out.println("Doumiu ");
	}

	abstract void fazerBarulho();
}
