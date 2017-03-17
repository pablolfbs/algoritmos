
public class ManipulaAssociacoes {

	public static void relacionaAlunoComInscricao(Aluno[] listaA, Inscricao[] listaI) {
		Aluno a = ManipulaAlunos.localizarAluno(listaA);
		if (a != null) {
			Inscricao insc = ManipulaInscricao.localizaInscricao(listaI);
			if (insc != null) {
				a.insereInscricao(insc);
			} else {
				System.out.println("N�o foi poss�vel estabelecer a associa��o - Inscricao n�o encontrada !!");
			}
		} else {
			System.out.println("N�o foi poss�vel estabelecer a associacao - Inscricao n�o encontrada !!");
		}
	}
	
	public static void relacionaProfessorComTurma(Professor[] listaP, Turma[] listaT) {
		Professor p = ManipulaProfessores.localizarProfessor(listaP);
		if (p != null) {
			Turma t = ManipulaTurmas.localizarTurma(listaT);
			if (t != null) {
				p.insereTurma(t);
			} else {
				System.out.println("N�o foi poss�vel estabelecer a associa��o - Inscricao n�o encontrada !!");
			}
		} else {
			System.out.println("N�o foi poss�vel estabelecer a associacao - Inscricao n�o encontrada !!");
		}
	}
}
