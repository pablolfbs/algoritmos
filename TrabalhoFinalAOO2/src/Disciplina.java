
public class Disciplina {
	private Turma[] lista_turmas;
	private Professor[] lista_professores;
	private String codigo;
	private String nome;
	private int cargaHorariaSemanal;
	
	public Disciplina(String codigo, String nome, int cargaHorariaSemanal) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHorariaSemanal = cargaHorariaSemanal;
		lista_turmas = new Turma[10];
		lista_professores = new Professor[10];
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}

	public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}
	
}
