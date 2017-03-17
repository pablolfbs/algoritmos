
public class Aluno {
	
	private int idade;
	private String nome;
	private String turma;
	private String materia;
	
	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getIdade() {
		if (idade < 18) {
			System.out.print("O aluno é menor de idade. " + nome + " tem " + idade + " anos. ");
		} else if (idade >= 18) {
			System.out.print("O aluno é maior de idade. " + nome + " tem " + idade + " anos. ");
		}
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
