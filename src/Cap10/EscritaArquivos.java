package Cap10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<String>();

		for(int i = 0; i < 5; i++) {
			System.out.print("Jogador " + i + ": ");
			String nome = s.nextLine();
			
			linhas.add(nome);
		}
		
		Path arquivo = Paths.get("C:\\Users\\adriano.costa.NBS\\Desktop\\CURSOS\\DBA\\SCRIPT\\ArquivoJogador.txt");
    	Files.write(arquivo,linhas);
    	s.close();
    	System.out.println("Arquivo integrado com sucesso");

	}

}
