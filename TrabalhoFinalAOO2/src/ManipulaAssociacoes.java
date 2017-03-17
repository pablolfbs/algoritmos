
public class ManipulaAssociacoes {

	public static void relacionaAlunoComInscricao(Aluno[] listaA, Inscricao[] listaI) {
		Aluno a = ManipulaAlunos.localizarAluno(listaA);
		if (a != null) {
			Inscricao insc = ManipulaInscricao.localizaInscricao(listaI);
			if (insc != null) {
				a.insereInscricao(insc);
			} else {
				System.out.println("Não foi possível estabelecer a associação - Inscricao não encontrada !!");
			}
		} else {
			System.out.println("Não foi possível estabelecer a associacao - Inscricao não encontrada !!");
		}
	}
}
