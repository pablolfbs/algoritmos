
public class Turma {	
		private Professor professor;
		private Disciplina disciplina;
		private String codigo;
		private int qtdVagas;
		private String dias_da_semana;
		private String hora_inicio;
		private String hora_final;
		private String periodo_referencia;
		private ItemInscricao[] itens_inscricao;
		
		public Turma(String codigo, int qtdVagas, String dias_da_semana, String hora_inicio, String hora_final, String periodo_referencia) {
			super();
			this.codigo = codigo;
			this.qtdVagas = qtdVagas;
			this.dias_da_semana = dias_da_semana;
			this.hora_inicio = hora_inicio;
			this.hora_final = hora_final;
			this.periodo_referencia = periodo_referencia;
			itens_inscricao = new ItemInscricao[10];
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

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public int getQtdVagas() {
			return qtdVagas;
		}

		public void setQtdVagas(int qtdVagas) {
			this.qtdVagas = qtdVagas;
		}

		public String getDias_da_semana() {
			return dias_da_semana;
		}

		public void setDias_da_semana(String dias_da_semana) {
			this.dias_da_semana = dias_da_semana;
		}

		public String getHora_inicio() {
			return hora_inicio;
		}

		public void setHora_inicio(String hora_inicio) {
			this.hora_inicio = hora_inicio;
		}

		public String getHora_final() {
			return hora_final;
		}

		public void setHora_final(String hora_final) {
			this.hora_final = hora_final;
		}

		public String getPeriodo_referencia() {
			return periodo_referencia;
		}

		public void setPeriodo_referencia(String periodo_referencia) {
			this.periodo_referencia = periodo_referencia;
		}	

}
