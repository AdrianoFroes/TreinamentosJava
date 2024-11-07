package Classes;

public class Diretor extends Pessoa {
	
	private String regsitroEducacao;
	private int tempoDirecao;
	private String titulacao;
	public String getRegsitroEducacao() {
		return regsitroEducacao;
	}
	public void setRegsitroEducacao(String regsitroEducacao) {
		this.regsitroEducacao = regsitroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [regsitroEducacao=" + regsitroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	

}
