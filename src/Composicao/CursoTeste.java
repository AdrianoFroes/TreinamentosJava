package Composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno("Joao ");
		Aluno aluno2 = new Aluno("Maria ");
		Aluno aluno3 = new Aluno("Pedro ");
		
		Curso curso1 = new Curso("Java WEB");
		Curso curso2 = new Curso("ORACLE");
		Curso curso3 = new Curso("Spring Boot");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("estou matriculado no curso 1..." + curso3.nome + "...");
			System.out.println("meu nome é " + aluno.nome);
			
			System.out.println();
		}
	}

}
