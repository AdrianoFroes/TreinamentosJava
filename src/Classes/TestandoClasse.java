package Classes;

public class TestandoClasse {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Adriano");
		
		
		Diretor diretor =  new Diretor();
		diretor.setRegistroGeral("2465465464");
		
		Secretario sec = new Secretario();
		sec.setExperiencia("ADM BANCO");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(sec);

	}

}
