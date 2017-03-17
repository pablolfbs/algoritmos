
public class Inscricao {
	private Aluno aluno;
	private int id_inscricao;
	private int qtdLimiteCreditos;
	private String periodo_referencia;
	
	public Inscricao(int id_inscricao, int qtdLimiteCreditos, String periodo_referencia) {
		super();
		this.id_inscricao = id_inscricao;
		this.qtdLimiteCreditos = qtdLimiteCreditos;
		this.periodo_referencia = periodo_referencia;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getId_inscricao() {
		return Integer.toString(id_inscricao);
	}

	public void setId_inscricao(int id_inscricao) {
		this.id_inscricao = id_inscricao;
	}

	public int getQtdLimiteCreditos() {
		return qtdLimiteCreditos;
	}

	public void setQtdLimiteCreditos(int qtdLimiteCreditos) {
		this.qtdLimiteCreditos = qtdLimiteCreditos;
	}

	public String getPeriodo_referencia() {
		return periodo_referencia;
	}

	public void setPeriodo_referencia(String periodo_referencia) {
		this.periodo_referencia = periodo_referencia;
	}
	
}
