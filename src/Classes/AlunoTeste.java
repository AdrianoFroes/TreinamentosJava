package Classes;

import javax.swing.JOptionPane;

public class AlunoTeste {

	public static void main(String[] args) {
		try {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno");
		String idade = JOptionPane.showInputDialog("Informe a idade");
		String dataNascimento = JOptionPane.showInputDialog("Informe data nascimento");
		String rg = JOptionPane.showInputDialog("Informe o numero RG");
		String cpf = JOptionPane.showInputDialog("Informe o numero CPF");
		String nomeMae = JOptionPane.showInputDialog("Informe o nome da mae");
		String nomePai = JOptionPane.showInputDialog("Informe o nome da pai");
		String matricula = JOptionPane.showInputDialog("Informe o numero matricula");
		String serie = JOptionPane.showInputDialog("Informe o seria do aluno");
		String escola = JOptionPane.showInputDialog("Informe o nome da Escola");
		String nota1 = JOptionPane.showInputDialog("Informe a nota1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota4");
		
		/*Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieEscola(serie);
		aluno1.set1NomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota1(Double.parseDouble(nota2));
		aluno1.setNota1(Double.parseDouble(nota3));
		aluno1.setNota1(Double.parseDouble(nota4));*/
		
		
	  Aluno aluno = new Aluno();
	  System.out.println(aluno.toString());
		
		
		

	}catch (Exception e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null,"Erro ao processar dados");
	}
		
	}
}
