package control;
import model.Aluno;
import model.Disciplina;
import model.OfertaDisciplina;
import model.Professor;
import model.Turma;

public class ControlAvaliacao {
	
	public Aluno aluno;
	public Professor professor;
	public Turma turma;
	public OfertaDisciplina ofertaDisciplina;
	public Disciplina disciplina;
	
	public ControlAvaliacao() {
		aluno = new Aluno();
		professor = new Professor();
		turma = new Turma();
		ofertaDisciplina = new OfertaDisciplina();
		disciplina = new Disciplina();
	}
}
