package boundary;

import java.util.Scanner;
import control.ControlAvaliacao;

public class FormularioAvaliacao {
		
	ControlAvaliacao controlAvaliacao;
	Scanner in;
	
	public FormularioAvaliacao() {
		controlAvaliacao = new ControlAvaliacao();
		in = new Scanner(System.in);
	}
	
	public void formulario() {
		
	}
	
	public void formularioAvaliacao() {
		
	}

	public void cadastroProfessor() {
		System.out.println("Digite CPF: ");
		controlAvaliacao.professor.setCpf(in.next());
		System.out.println("Digite Nome: ");
		controlAvaliacao.professor.setNome(in.next());
	}

	public void cadastroTurma() {
		System.out.println("Digite C�digo Turma: ");
		controlAvaliacao.turma.setCodigo_turma(in.next());
		System.out.println("Digite Nome Turma: ");
		controlAvaliacao.turma.setNome_turma(in.next());
	}

	public void CadastroAluno() {
		System.out.println("Digite Matr�cula: ");
		controlAvaliacao.aluno.setMatricula(in.next());
		System.out.println("Digite Nome: ");
		controlAvaliacao.aluno.setNome(in.next());
	}

	public void cadastroDisciplina() {
		System.out.println("Digite C�digo: ");
		controlAvaliacao.disciplina.setCodigo(in.next());
		System.out.println("Digite Disciplina: ");
		controlAvaliacao.disciplina.setNome(in.next());
		
	}
	
	public void formularioOfertaDisciplina() {
		
	}

}
