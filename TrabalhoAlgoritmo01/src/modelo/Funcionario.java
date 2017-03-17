package modelo;

import java.util.Date;

public class Funcionario extends Pessoa {
	
	private Date dataEntrada;
	private float salario;
	private String cargo;
		
	public Funcionario(String nome, long cpf, Date dataNascimento, Date dataEntrada, float salario, String cargo) {
		super(nome, cpf, dataNascimento);
		this.dataEntrada = dataEntrada;
		this.salario = salario;
		this.cargo = cargo;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
