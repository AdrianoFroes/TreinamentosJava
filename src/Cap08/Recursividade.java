package Cap08;

public class Recursividade {

	public static void main(String[] args) {
		String[] alunos = new String[] {"Adriano", "Joao","Maria"};
           
		iterarNomes(alunos, 0);
	}
	static void iterarNomes(String[] alunos, Integer i) {
			System.out.println("Aluno: " + alunos[i]);
			i++;
			if( i < alunos.length) {
				iterarNomes(alunos,i);
		}
	}

}	
