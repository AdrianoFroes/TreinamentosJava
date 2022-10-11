package Cap03;

public class TipoLogico {

	public static void main(String[] args) {
	
		Boolean variavelVerdadeiro = true;
		System.out.println("Variavel verdadeira" + variavelVerdadeiro);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel falsa " + variavelFalsa);
		
		
		System.out.println("---------------------------------");
		
		Integer idade = 17;
		
		Boolean podeTirarCarteira = idade >= 18;
		//System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		if(podeTirarCarteira) {
			System.out.println("Sim Ele(a) pode tira carteira");
		}else {
			System.out.println("Nao Ele(a) não tem idade minima");
		}
		
		
		

	}

}
