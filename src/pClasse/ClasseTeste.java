package pClasse;

public class ClasseTeste {

	public static void main(String[] args) {
	     Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.precoUnitario = 500.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);
		
	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantiadade em estoque produto: " + produto.nome + "\nPreço R$ " + produto.precoUnitario + "\nQtde = "  
	+ produto.quantidade);
	}

}
