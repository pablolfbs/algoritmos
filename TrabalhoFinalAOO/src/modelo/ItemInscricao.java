package modelo;

public class ItemInscricao {
	
	private Inscricao[] listaInscritos;
	private Turma cadastrarTurma;
	private int nota;
	private boolean cancelado;
	
	public ItemInscricao(Inscricao[] listaInscritos, Turma cadastrarTurma, int nota, boolean cancelado) {
		super();
		this.listaInscritos = listaInscritos;
		this.cadastrarTurma = cadastrarTurma;
		this.nota = nota;
		this.cancelado = cancelado;
	}

	public Inscricao[] getListaInscritos() {
		return listaInscritos;
	}

	public void setListaInscritos(Inscricao[] listaInscritos) {
		this.listaInscritos = listaInscritos;
	}

	public Turma getCadastrarTurma() {
		return cadastrarTurma;
	}

	public void setCadastrarTurma(Turma cadastrarTurma) {
		this.cadastrarTurma = cadastrarTurma;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}	
	
}
