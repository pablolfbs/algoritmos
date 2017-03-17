package modelo;

public class Disciplina {
	
	private Turma[] listaTurmas;
	private Professor[] listaProfessoresHabilitados;
	private String nome;
	private int carga_horaria_semanal;
	
	public Disciplina(Turma[] listaTurmas, Professor[] listaProfessoresHabilitados, String nome,
			int carga_horaria_semanal) {
		super();
		listaTurmas = new Turma[10];
		listaProfessoresHabilitados = new Professor[10];
		this.nome = nome;
		this.carga_horaria_semanal = carga_horaria_semanal;
	}

	public Turma[] getListaTurmas() {
		return listaTurmas;
	}

	public void setListaTurmas(Turma[] listaTurmas) {
		this.listaTurmas = listaTurmas;
	}

	public Professor[] getListaProfessoresHabilitados() {
		return listaProfessoresHabilitados;
	}

	public void setListaProfessoresHabilitados(Professor[] listaProfessoresHabilitados) {
		this.listaProfessoresHabilitados = listaProfessoresHabilitados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCarga_horaria_semanal() {
		return carga_horaria_semanal;
	}

	public void setCarga_horaria_semanal(int carga_horaria_semanal) {
		this.carga_horaria_semanal = carga_horaria_semanal;
	}
	
	public void adicionarTurma(Turma t) {
		insereTurmaPosicaoLivre(t);
		System.out.println("Turma inserida com sucesso.");
	}

	private void insereTurmaPosicaoLivre(Turma t) {
		if (listaNaoEstaCheia) {
			int posicao_livre = -1;			
		}		
	}
	
	public boolean listaNaoEstaCheia() {
	}	
}
