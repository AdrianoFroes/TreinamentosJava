package Encapsulamento;

public class encapsulamento {

	public static void main(String[] args) {
		
		Cliente cliente  = new Cliente();
		
		
//		cliente.nome = "Adriano Froes";
//		cliente.telefone = "6521284300";
//		
//		System.out.println("Nome cliente " + cliente.nome);
		cliente.setNome("Adriano Froes");
		cliente.setTelefone("06521284300");
		
		System.out.println("Nome cliente " + cliente.getNome());
		System.out.println("Primeiro nome " + cliente.getPrimeiroNome());
		System.out.println("Ultimo nome " + cliente.getUltimoNome());
		
	}

}
