package modelo;

import java.util.Date;

public class Cliente extends Pessoa {
	
	private Date dataRegistro;

	public Cliente(String nome, long cpf, Date dataNascimento, Date dataRegistro) {
		super(nome, cpf, dataNascimento);
		this.dataRegistro = dataRegistro;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	
	

}
