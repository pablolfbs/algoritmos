package modelo;

import java.util.Date;

public class Vendedor extends Funcionario {
	
	private float comissao;

	public Vendedor(String nome, long cpf, Date dataNascimento, Date dataEntrada, float salario, String cargo, float comissao) {
		super(nome, cpf, dataNascimento, dataEntrada, salario, cargo);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	

}
