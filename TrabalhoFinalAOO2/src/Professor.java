
public class Professor extends Pessoa {
	private Disciplina disciplina;
	private Turma[] lista_turmas;
	private String matricula;
	private double salario;
	private String data_contratacao;
	
	public Professor(String nome, String CPF, String dataNascimento, String matricula, double salario, String data_contratacao) {
		super(nome, CPF, dataNascimento);
		this.matricula = matricula;
		this.salario = salario;
		this.data_contratacao = data_contratacao;
		lista_turmas = new Turma[10];
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getData_contratacao() {
		return data_contratacao;
	}

	public void setData_contratacao(String data_contratacao) {
		this.data_contratacao = data_contratacao;
	}

}
