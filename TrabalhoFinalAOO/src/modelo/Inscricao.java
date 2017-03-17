package modelo;

import java.util.Date;

public class Inscricao {
	
	private ItemInscricao[] listaItensInscricao;
	private Aluno cadastrarAluno;
	private Date data_realizacao;
	private Date data_aprovacao;
	private int qtd_limite_credito;
	private String periodo_referencia;
	
	public void adicionarItemInscricao() {
	
	}
	
	public void deletarItemInscricao() {
	
	}

	public Inscricao(Aluno cadastrarAluno, Date data_realizacao,
			Date data_aprovacao, int qtd_limite_credito, String periodo_referencia) {
		super();
		this.cadastrarAluno = cadastrarAluno;
		this.data_realizacao = data_realizacao;
		this.data_aprovacao = data_aprovacao;
		this.qtd_limite_credito = qtd_limite_credito;
		this.periodo_referencia = periodo_referencia;
	}

	public ItemInscricao[] getListaItensInscricao() {
		return listaItensInscricao;
	}

	public void setListaItensInscricao(ItemInscricao[] listaItensInscricao) {
		this.listaItensInscricao = listaItensInscricao;
	}

	public Aluno getCadastrarAluno() {
		return cadastrarAluno;
	}

	public void setCadastrarAluno(Aluno cadastrarAluno) {
		this.cadastrarAluno = cadastrarAluno;
	}

	public Date getData_realizacao() {
		return data_realizacao;
	}

	public void setData_realizacao(Date data_realizacao) {
		this.data_realizacao = data_realizacao;
	}

	public Date getData_aprovacao() {
		return data_aprovacao;
	}

	public void setData_aprovacao(Date data_aprovacao) {
		this.data_aprovacao = data_aprovacao;
	}

	public int getQtd_limite_credito() {
		return qtd_limite_credito;
	}

	public void setQtd_limite_credito(int qtd_limite_credito) {
		this.qtd_limite_credito = qtd_limite_credito;
	}

	public String getPeriodo_referencia() {
		return periodo_referencia;
	}

	public void setPeriodo_referencia(String periodo_referencia) {
		this.periodo_referencia = periodo_referencia;
	}
	
}
