
public class Pessoa {
	private String nome;
	private String CPF;
	private String dataNascimento;

	public Pessoa(String nome, String CPF, String dataNascimento) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
