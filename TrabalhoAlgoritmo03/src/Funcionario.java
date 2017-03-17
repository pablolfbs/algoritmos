import java.util.Date;

public class Funcionario extends Pessoa {
	
	private Date dataNascimento;
	private String cargo;
	private String estadoCivil;
	private Date dataAdmissao;
	
	public Funcionario(String nome, long cpf, String endereco, long telefone, Date dataNascimento, String cargo,
			String estadoCivil, Date dataAdmissao) {
		super(nome, cpf, endereco, telefone);
		this.dataNascimento = dataNascimento;
		this.cargo = cargo;
		this.estadoCivil = estadoCivil;
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	

}
