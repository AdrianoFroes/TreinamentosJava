package OperadoresLogicos;

public class opLogicaAlinhadas {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno aprovado direto parabens" + media);

				} else {
					System.out.println("Aluno esta aprovado direto " + media);
				}
			} else {
				System.out.println("aluno esta e, recuperacao " + media);
			}
		}else {
			System.out.println("aluno esta reprovado " + media);
		}
	}

}

