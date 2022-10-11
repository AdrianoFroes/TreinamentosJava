package Excecao;

public class Basico {

	public static void main(String[] args) throws Exception {
	
		geraErro1();
		geraErro2();
		
		System.out.println("Fim: )");
		
	}
	
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01");
	}
	
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02");
	}
}
