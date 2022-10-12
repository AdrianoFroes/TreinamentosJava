package br.com.xti.poo;

public class Carro {

	String modelo;
	int velocidadeMaxima;
	double segundosZeroAcem;
	Motor motor;

	public Carro() {

	}

	public Carro(String modelo, int velocidadeMaxima, double segundosZeraoAcem) {
       this(modelo, velocidadeMaxima,segundosZeraoAcem,null);

	}
	public Carro(String modelo, int velocidadeMaxima, double segundosZeraoAcemS,Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroAcem = segundosZeroAcem;
		this.motor = motor;

	}


}

