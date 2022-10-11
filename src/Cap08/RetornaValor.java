package Cap08;

public class RetornaValor {

	public static void main(String[] args) {
      
		Double[] premissaInicial = new Double[] {100.0, 100.0};
		Double proporcao = 20.0;
		
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		
		System.out.println("Resultado 20% de 100 é: " + resultadoFinal);
		
		
		
	}
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado = (premissa[0] * proporcao) / premissa [1];
		return resultado;
	}

}
