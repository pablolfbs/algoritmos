package modelo;

import java.util.Date;

public class Aluno extends Pessoa {
	
	private Inscricao[] listaInscricoes;
	private String matricula;
	private Date data_ingresso;
	
	public Aluno(String nome, String cpf, Date data_nascimento, String matricula, Date data_ingresso) {
		super(nome, cpf, data_nascimento);
		this.matricula = matricula;
		this.data_ingresso = data_ingresso;		
	}

	public Inscricao[] getListaInscricoes() {
		return listaInscricoes;
	}

	public void setListaInscricoes(Inscricao[] listaInscricoes) {
		this.listaInscricoes = listaInscricoes;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getData_ingresso() {
		return data_ingresso;
	}

	public void setData_ingresso(Date data_ingresso) {
		this.data_ingresso = data_ingresso;
	}
	
}
