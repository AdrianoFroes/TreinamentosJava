package Encapsulamento;

public class Cliente {
	
	String primeiroNome;
	String ultimoNome;
	String telefone;
	
	
	public String getNome() {
		return primeiroNome + " " + ultimoNome;
	}
	public void setNome(String nome) {
		String[] nomeComplento = nome.split("");
		primeiroNome = nomeComplento[0];
		ultimoNome = nomeComplento[1];
		

	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
