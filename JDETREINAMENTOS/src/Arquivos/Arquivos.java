package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa p1 = new Pessoa();
		p1.setEmail("pessoa1@gmail.com");
		p1.setIndade(50);
		p1.setNome("Adriano Froes");

		Pessoa p2 = new Pessoa();
		p2.setEmail("pessoa2@gmail.com");
		p2.setIndade(30);
		p2.setNome("Jubileu Corno veio");
		
		Pessoa p3 = new Pessoa();
		p3.setEmail("pessoa2@gmail.com");
		p3.setIndade(40);
		p3.setNome("Mané...");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		
		
		File arquivo = new File("C:\\Users\\ADRIANO.COSTA\\eclipse-workspace\\JDETREINAMENTOS\\src\\Arquivos\\Arquivos.txt");
        
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for(Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + " ; " + p.getEmail() + " ; "  + p.getIndade() + "\n" );
		}
		
		escrever_no_arquivo.write("Meu texto no arquivo");
		escrever_no_arquivo.write("\n");
		escrever_no_arquivo.write("MInha segunda linha \n");
		
		for(int i = 1 ;  i<=10; i++) {
			escrever_no_arquivo.write("Texto da linha " + i + "\n");
			
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
		
	
	}
	

}
