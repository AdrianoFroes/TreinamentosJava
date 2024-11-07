package ClassesTeste;

import javax.swing.JOptionPane;

import Classes.Aluno;
import Classes.Disciplina;

public class AlunoTeste {

	public static void main(String[] args) {
		
		try {
	
		/* new Aluno() é uma instacia(criacao de objeto)*/
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno ");
		/*String idade = JOptionPane.showInputDialog("Informe a idade do aluno ");
		String dataNascimento = JOptionPane.showInputDialog("Informe a data nascimento ");
		String rg = JOptionPane.showInputDialog("Informe o registro geral ");
		String cpf = JOptionPane.showInputDialog("Informe o registro numero CPF ");
		String mae = JOptionPane.showInputDialog("Informe o nome da mae");
		String pai = JOptionPane.showInputDialog("Informe o nome do pai");
		String dataMatricula = JOptionPane.showInputDialog("Informe a data da matricula ");
		String serieMatricula = JOptionPane.showInputDialog("Informe a  serie ");
		String nomeEscola = JOptionPane.showInputDialog("Informe o nome da escola ");*/
		

		
		Aluno aluno1 = new Aluno();
		
		/*aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatricula);
		aluno1.setNomeEscola(nomeEscola);*/
		
		for(int pos = 1; pos <=4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome disciplina "+pos +" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
			
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.parseDouble(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
		if(escolha == 0) {
			
			int continuarRemover = 0;
			
			while(continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4? ");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue());
				continuarRemover = JOptionPane.showConfirmDialog(null, "continuar remover? ");
				
				JOptionPane.showMessageDialog(null, "Disciplina removida foi " + disciplinaRemover);
			}
			
		}
		
		System.out.println(aluno1);
		System.out.println("media do aluno " + aluno1.getMediaNota());
		System.out.println("Resultado " + aluno1.getAlunoAprovado());
				
		}catch (Exception e) {
			e.printStackTrace();
			
			System.out.println(" Mesangem: " + e.getMessage());
			
			JOptionPane.showMessageDialog(null, "Erro ao processar notas");
		}			
	}
	
}
