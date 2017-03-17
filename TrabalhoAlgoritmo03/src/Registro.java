import java.util.Date;

public class Registro {
	
	private String veiculo;
	private Date dataEntrada;
	private Date dataSaida;
	
	public Registro(String veiculo, Date dataEntrada, Date dataSaida) {
		super();
		this.veiculo = veiculo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

}
