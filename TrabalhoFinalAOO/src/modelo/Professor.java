package modelo;

import java.util.Date;

public class Professor extends Pessoa {
	
	private Disciplina[] listaDisciplinasHabilitado;
	private Turma[] listaTurmas;
	private double salario;
	private Date data_contratacao;
	private String matricula;
	
	public Professor(String nome, String cpf, Date data_nascimento, Disciplina[] listaDisciplinasHabilitado,
			Turma[] listaTurmas, double salario, Date data_contratacao, String matricula) {
		super(nome, cpf, data_nascimento);
		this.listaDisciplinasHabilitado = listaDisciplinasHabilitado;
		this.listaTurmas = listaTurmas;
		this.salario = salario;
		this.data_contratacao = data_contratacao;
		this.matricula = matricula;
	}

	public Disciplina[] getListaDisciplinasHabilitado() {
		return listaDisciplinasHabilitado;
	}

	public void setListaDisciplinasHabilitado(Disciplina[] listaDisciplinasHabilitado) {
		this.listaDisciplinasHabilitado = listaDisciplinasHabilitado;
	}

	public Turma[] getListaTurmas() {
		return listaTurmas;
	}

	public void setListaTurmas(Turma[] listaTurmas) {
		this.listaTurmas = listaTurmas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getData_contratacao() {
		return data_contratacao;
	}

	public void setData_contratacao(Date data_contratacao) {
		this.data_contratacao = data_contratacao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
		
}
