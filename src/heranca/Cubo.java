package br.com.xti.heranca;

public class Cubo implements VolumeCalculavel, AreaCalculavel{
 
	double lado;
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return lado * lado * lado;
	}

	public double calcularVolume() {
		return 6 * lado * lado;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	 

}
