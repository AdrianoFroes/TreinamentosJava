package ClasseInstancia;

public class classeinstancia {
	
	public static void main(String[] args) {
		System.out.println("Quantidade minima estoque " + Produto.Quantidade_Minima_Estoque);	
		
		Produto produto = new Produto();
		produto.Quantidade_Minima_Estoque = 10;
		produto.nome = "Caneca";
		
		System.out.println("Quantidade minima estoque " + Produto.Quantidade_Minima_Estoque);	
		
		Produto produto2 = new Produto();
		produto2.nome = "Carteira";
		System.out.println("Quantidade minima estoque " + Produto.Quantidade_Minima_Estoque);	
		
		
		System.out.println("Produto 1 " + produto.nome);
		System.out.println("Produto 2 " + produto2.nome);
	}

}
