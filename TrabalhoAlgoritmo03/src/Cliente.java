
public class Cliente extends Pessoa {
	
	private Veiculo[] veiculo;
	private String formaPagamento;
	
	public Cliente(String nome, long cpf, String endereco, long telefone, Veiculo[] veiculo, String formaPagamento) {
		super(nome, cpf, endereco, telefone);
		this.veiculo = veiculo;
		this.formaPagamento = formaPagamento;
	}

	public Veiculo[] getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo[] veiculo) {
		this.veiculo = veiculo;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}
