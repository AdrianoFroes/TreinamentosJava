package Cap06;

public class InteracaoFor {

	public static void main(String[] args) {
	
		for(int i= 0; i<5; i++) {
			
			//System.out.println(i + " Imprimir uma frase");
		}
		
		Double[] carriDeCompra = new Double[] {50.0,51.0,55.0};
		Double total = 0.0;
		for(int i = 0; i < carriDeCompra.length; i++) {
			System.out.println("Interacao: " + i + ",Total " + total);
			total = total + carriDeCompra[i];
			
		}
		
		System.out.println("valores produtos " + total);

	}
    

}
