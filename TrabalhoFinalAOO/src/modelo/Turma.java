package modelo;

import java.util.Date;

public class Turma {
	
	private ItemInscricao[] listaItensInscricao;
	private Professor professor;
	private Disciplina disciplina;
	private int qtd_vagas;
	private String codigo;
	private Date[] dias_semana;
	private Date hora_inicio;
	private Date hora_final;
	private String periodo_referencia;
	
	public Turma(ItemInscricao[] listaItensInscricao, Professor professor, Disciplina disciplina, int qtd_vagas,
			String codigo, Date[] dias_semana, Date hora_inicio, Date hora_final, String periodo_referencia) {
		super();
		this.listaItensInscricao = listaItensInscricao;
		this.professor = professor;
		this.disciplina = disciplina;
		this.qtd_vagas = qtd_vagas;
		this.codigo = codigo;
		this.dias_semana = dias_semana;
		this.hora_inicio = hora_inicio;
		this.hora_final = hora_final;
		this.periodo_referencia = periodo_referencia;
	}

	public ItemInscricao[] getListaItensInscricao() {
		return listaItensInscricao;
	}

	public void setListaItensInscricao(ItemInscricao[] listaItensInscricao) {
		this.listaItensInscricao = listaItensInscricao;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public int getQtd_vagas() {
		return qtd_vagas;
	}

	public void setQtd_vagas(int qtd_vagas) {
		this.qtd_vagas = qtd_vagas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date[] getDias_semana() {
		return dias_semana;
	}

	public void setDias_semana(Date[] dias_semana) {
		this.dias_semana = dias_semana;
	}

	public Date getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(Date hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public Date getHora_final() {
		return hora_final;
	}

	public void setHora_final(Date hora_final) {
		this.hora_final = hora_final;
	}

	public String getPeriodo_referencia() {
		return periodo_referencia;
	}

	public void setPeriodo_referencia(String periodo_referencia) {
		this.periodo_referencia = periodo_referencia;
	}
	
	
	
}
