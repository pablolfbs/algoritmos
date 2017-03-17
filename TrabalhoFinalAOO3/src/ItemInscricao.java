
public class ItemInscricao {
	private Turma[] turmas;
	private Inscricao inscricao;
	private int id_item;
	private int nota;
	private boolean cancelado;
	
	public ItemInscricao(int id_item, int nota, boolean cancelado) {
		super();
		this.id_item = id_item;
		this.nota = nota;
		this.cancelado = cancelado;
		turmas = new Turma[10];
	}

	public int getId_item() {
		return id_item;
	}

	public void setId_item(int id_item) {
		this.id_item = id_item;
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
