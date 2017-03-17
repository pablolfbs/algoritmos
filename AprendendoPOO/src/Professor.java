
public class Professor extends Pessoa {
	
	private String matricula;
	private float salario;
	private String turma;
	
	public Professor(String nome, String matricula, float salario, String turma) {
		super(nome);
		this.matricula = matricula;
		this.salario = salario;
		this.turma = turma;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

}
