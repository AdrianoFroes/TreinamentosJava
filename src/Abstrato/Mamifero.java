package Abstrato;

public abstract class Mamifero extends Animal{
	
	@Override
	public String mover() {
		return  "ANDANDO";
	}
	
	@Override
	public String mamar() {
		return "--> USANDO LEITE";
	}

}
