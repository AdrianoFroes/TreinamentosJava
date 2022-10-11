package MetodoInstancia;

public class metodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.primeiroNome = "Adriano";
		cliente.ultimoNome = "Froes";
		cliente.telefone = "06521284300";
		cliente.email = "adriano.costa@nbsi.com.br";
		
		System.out.println("Nome Cliente" + cliente.obterNomeCompleto(cliente) + " DDD " + cliente.obterDDD());
		
	}
   
//	 static String obterNomeCompletoCliente(Cliente cliente) {
//		 String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//	 }
}
