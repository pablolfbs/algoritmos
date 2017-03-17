
import java.util.Scanner;

public class SistemaAcademico {
	// === início declaração LISTAS CADASTRAIS GERAIS
	public static Aluno[] listaA;
	public static Disciplina[] listaD;
	public static Professor[] listaP;
	public static Turma[] listaT;
	public static Inscricao[] listaI;
	// === fim declaração LISTAS CADASTRAIS

	public static void main(String[] args) {
		// === criando as listas mestres
		listaA = new Aluno[10];
		listaD = new Disciplina[10];
		listaP = new Professor[10];
		listaT = new Turma[10];
		listaI = new Inscricao[10];
		// === fim criando as listas mestres
		int opcao;
		do {

			opcao = opcaoMenuPrincipal();
			switch (opcao) {
			case 1:
				cadastroAluno();
				break;
			case 2:
				cadastroProfessor();
				break;
			case 3:
				cadastroDisciplina();
				break;
			case 4:
				cadastroTurma();
				break;
			case 5:
				cadastroInscricao();
				break;
			case 6:
				criarAssociacoes();
				break;
			case 7:
				listarAlunosDeTurma();
				break;
			case 8:
				listarProfessoresDeDisciplina();
				break;
//			case -1:
//				System.out.println("FIM !!!");
//				break;
			default:
				if (opcao != -1) {
					System.out.println("Opção Inválida !!!");
				}
			}
		} while (opcao != -1);
		System.out.println("FIM !!!");
	}

	private static void listarProfessoresDeDisciplina() {

	}

	private static void listarAlunosDeTurma() {

	}

	// EXIBE NO OUTPUT AS OPÇÕES DO MENU PRINCIPAL
	private static int opcaoMenuPrincipal() {

		System.out.println("    ####SISTEMA ACADÊMICO###     ");
		System.out.println("#################################");
		System.out.println("#####B E M  V I N D O	! !######");
		System.out.println("#################################");
		System.out.println("#################################");
		System.out.println("");
		System.out.println("1 - CADASTRO ALUNOS;");
		System.out.println("2 - CADASTRO PROFESSORES;;");
		System.out.println("3 - CADASTRO DISCIPLINAS;");
		System.out.println("4 - CADASTRO TURMAS;");
		System.out.println("5 - REALIZAR INSCRIÇÃO;");
		System.out.println("6 - CRIAR ASSOCIAÇÕES;");
		System.out.println("7 - LISTAR ALUNOS DE UMA TURMA;");
		System.out.println("8 - LISTAR PROFESSORES DE UMA DISCIPLINA;");
		System.out.println("#(para sair digite -1)#");
		System.out.println("#################################");
		System.out.println("Opção Desejada: ");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		return opcao;
	}

	// ABRE AS OPÇOES DO CADASTRO DE ALUNOS
	private static void cadastroAluno() {
		int opcao;
		do {
			opcao = opcaoMenuCadastroAluno();
			switch (opcao) {
			case 1:
				ManipulaAlunos.insereAluno(listaA);
				break;
			case 2:
				ManipulaAlunos.listarAluno(listaA);
				break;
			case -1:
				System.out.println("====saindo modulo====");
				System.out.println("");
				break;
			default:
				System.out.println("Opção Inválida !!!");
			}
		} while (opcao != -1);
	}

	// EXIBE NO OUTPUT AS OPÇÕES DO MENU DE CADASTRO DOS ALLUNOS
	private static int opcaoMenuCadastroAluno() {
		System.out.println("====MODULO DE CADASTRO DE ALUNOS===");
		System.out.println("");
		System.out.println("1 - CADASTRAR ALUNO");
		System.out.println("2 - LISTAR ALUNOS");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		return opcao;
	}

	private static int opcaoMenuCadastroDisciplina() {
		System.out.println("====MODULO DE CADASTRO DE DISCIPLINAS===");
		System.out.println("");
		System.out.println("1 - CADASTRAR DISCIPLINA");
		System.out.println("2 - LISTAR DISCIPLINAS");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		return opcao;
	}

	private static int opcaoMenuCadastroTurma() {
		System.out.println("====MODULO DE CADASTRO DE TURMAS===");
		System.out.println("");
		System.out.println("1 - CADASTRAR TURMA");
		System.out.println("2 - LISTAR TURMAS");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		return opcao;
	}

	private static int opcaoMenuCadastroProfessor() {
		System.out.println("====MODULO DE CADASTRO DE PROFESSORES===");
		System.out.println("");
		System.out.println("1 - CADASTRAR PROFESSOR");
		System.out.println("2 - LISTAR PROFESSORES");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		return opcao;
	}

	private static int opcaoMenuCadastroInscricao() {
		System.out.println("====MODULO DE CADASTRO DE INSCRICAO===");
		System.out.println("");
		System.out.println("1 - CADASTRAR INSCRICAO");
		System.out.println("2 - LISTAR INSCRICOES");
		System.out.println("2 - CADASTRAR ITENS DE INSCRICAO");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		return opcao;
	}

	private static int opcaoMenuCriaAssociacoes() {
		System.out.println("====MODULO DE ASSOCIAÇÕES===");
		System.out.println("");
		System.out.println("1 - Aluno - Inscricao");
		System.out.println("2 - Disciplina - Turma");
		System.out.println("3 - Disciplina - Professor");
		System.out.println("4 - Professor - Turma");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		return opcao;
	}

	private static void cadastroInscricao() {
		int opcao;
		do {
			opcao = opcaoMenuCadastroInscricao();
			switch (opcao) {
			case 1:
				ManipulaInscricao.insereInscricao(listaI);
				break;
			case 2:
				ManipulaInscricao.listarInscricao(listaI);
				break;
			case -1:
				System.out.println("====saindo modulo====");
				System.out.println("");
				break;
			default:
				System.out.println("Opção Inválida !!!");
			}
		} while (opcao != -1);
	}

	private static void cadastroTurma() {
		
		int opcao;
		do {
			opcao = opcaoMenuCadastroTurma();
			switch (opcao) {
			case 1:
				ManipulaTurmas.insereTurma(listaT);
				break;
			case 2:
				ManipulaTurmas.listarTurma(listaT);
				break;
			case -1:
				System.out.println("====saindo modulo====");
				System.out.println("");
				break;
			default:
				System.out.println("Opção Inválida !!!");
			}
		} while (opcao != -1);
	}

	private static void cadastroDisciplina() {
		int opcao;
		do {
			opcao = opcaoMenuCadastroDisciplina();
			switch (opcao) {
			case 1:
				ManipulaDisciplinas.insereDisciplina(listaD);
				break;
			case 2:
				ManipulaDisciplinas.listarDisciplina(listaD);
				break;
			case -1:
				System.out.println("====saindo modulo====");
				System.out.println("");
				break;
			default:
				System.out.println("Opção Inválida !!!");
			}
		} while (opcao != -1);
	}

	private static void cadastroProfessor() {
		int opcao;
		do {
			opcao = opcaoMenuCadastroProfessor();
			switch (opcao) {
			case 1:
				ManipulaProfessores.insereProfessor(listaP);
				break;
			case 2:
				ManipulaProfessores.listarProfessor(listaP);
				break;
			case -1:
				System.out.println("====saindo modulo====");
				System.out.println("");
				break;
			default:
				System.out.println("Opção Inválida !!!");
			}
		} while (opcao != -1);
	}

	private static void criarAssociacoes() {

	}

}
