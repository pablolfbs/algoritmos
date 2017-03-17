
public class Veiculo {
	
	private Cliente cliente;
	private String placa;
	private String modelo;
	private String cor;
	private String tipo;
	
	public Veiculo(Cliente cliente, String placa, String modelo, String cor, String tipo) {
		super();
		this.cliente = cliente;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.tipo = tipo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
