package Cap12;

public class AlgoritmoAvc {

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		
		Aluno aluno = new Aluno();
		aluno.nome = "João";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Maria";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Alexandre";
		lista.adicionar(aluno);
	
		aluno = new Aluno();
		aluno.nome = "Fernando";
		lista.adicionar(aluno);
	
		aluno = new Aluno();
		aluno.nome = "Tiago";
		lista.adicionar(aluno);
	
		for(int i = 0; i < lista.tamanho(); i ++) {
			Aluno a = lista.obter(i);
			System.out.println("Aluno " + a.nome);
			
		}
		
		
	}

}
