package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 18;
		d1.mes = 6;
		d1.ano = 2022;
		
		var d2 = new Data(31,12,2022);
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2022;
				
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprirDataFormatada();
		d2.imprirDataFormatada();
		
	}
}
