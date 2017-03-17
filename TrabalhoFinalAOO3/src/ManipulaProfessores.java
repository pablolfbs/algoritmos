import java.util.Scanner;

public class ManipulaProfessores {

	public static void insereProfessor(Professor[] listaProfessores) {

		String nome, CPF, dataNascimento, matricula, data_contratacao;

		if (listaNaoEstaCheia(listaProfessores)) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Digite o nome: ");
			nome = scanner.nextLine();
			System.out.println("Digite o CPF: ");
			CPF = scanner.nextLine();
			System.out.println("Digite o dataNascimento: ");
			dataNascimento = scanner.nextLine();
			System.out.println("Digite o matricula: ");
			matricula = scanner.nextLine();
			System.out.println("Digite o salário:");
			double salario = Double.parseDouble(scanner.nextLine());
			System.out.println("Digite a Data Ingresso no Curso: ");
			data_contratacao = scanner.nextLine();

			Professor p = new Professor(nome, CPF, dataNascimento, matricula, salario, data_contratacao);
			insereProfessorPosicaoLivre(p, listaProfessores);
			System.out.println("Professor inserido com sucesso.");
		}
	}

	private static void insereProfessorPosicaoLivre(Professor p, Professor[] lista) {
		if (listaNaoEstaCheia(lista)) {
			int posicao_livre = -1;
			boolean encontrou = false;
			for (int i = 0; i < lista.length; i++) {
				if ((lista[i] == null) && !encontrou) {
					posicao_livre = i;
					encontrou = true;
				}
			}
			lista[posicao_livre] = p;
		} else {
			System.out.println("Lista Cheia !!");
		}
	}

	public static void listarProfessor(Professor[] lista) {

		boolean esta_vazia = true;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {

			} else {
				esta_vazia = false;
				System.out.println(i + " - " + exibeProfessor(lista[i]));
			}
		}
		if (esta_vazia) {
			System.out.println("Lista Vazia!!");
		}
	}

	private static boolean listaNaoEstaCheia(Professor[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				return true;
			}
		}
		return false;
	}

	private static String exibeProfessor(Professor professor) {
		return "[" + professor.getMatricula() + "][" + professor.getNome() + "][" + professor.getDataNascimento() + "]";
	}

	public static Professor localizarProfessor(Professor[] lista) {

		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("Digite a matricula: ");
		String matricula = scanner.nextLine();

		if (listaVazia(lista)) {
			System.out.println("Lista Vazia !!!Não tem ninguem aqui!!");
		} else {
			int i = posicaoProfessor(lista, matricula);
			if (i != -1) {
				System.out.println("Professor Existe !! Esta na posicao " + i);
				return lista[i];
			} else {
				System.out.println("Professor não encontrado !!");
			}

		}
		return null;
	}

	private static int posicaoProfessor(Professor[] lista, String matricula) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getMatricula().equals(matricula)) {
					return i;
				}
			}
		}

		return -1;
	}

	private static boolean listaVazia(Professor[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				return false;
			}
		}
		return true;
	}
	
}
