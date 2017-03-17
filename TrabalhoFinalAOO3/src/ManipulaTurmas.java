import java.util.Scanner;

public class ManipulaTurmas {

	public static void insereTurma(Turma[] listaTurmas) {
		String codigo, dias_da_semana, hora_inicio, hora_final, periodo_referencia;

		if (listaNaoEstaCheia(listaTurmas)) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Digite o codigo: ");
			codigo = scanner.nextLine();
			System.out.println("Digite a quantidade de vagas: ");
			int qtdVagas = Integer.parseInt(scanner.nextLine());
			System.out.println("Digite o dia da semana: ");
			dias_da_semana = scanner.nextLine();
			System.out.println("Digite a hora de início: ");
			hora_inicio = scanner.nextLine();
			System.out.println("Digite a hora de término: ");
			hora_final = scanner.nextLine();
			System.out.println("Digite o período de referência: ");
			periodo_referencia = scanner.nextLine();

			Turma t = new Turma(codigo, qtdVagas, dias_da_semana, hora_inicio, hora_final, periodo_referencia);
			insereTurmaPosicaoLivre(t, listaTurmas);
			System.out.println("Turma inserida com sucesso.");
		}
	}

	private static void insereTurmaPosicaoLivre(Turma t, Turma[] lista) {
		if (listaNaoEstaCheia(lista)) {
			int posicao_livre = -1;
			boolean encontrou = false;
			for (int i = 0; i < lista.length; i++) {
				if ((lista[i] == null) && !encontrou) {
					posicao_livre = i;
					encontrou = true;
				}
			}
			lista[posicao_livre] = t;
		} else {
			System.out.println("Lista Cheia !!");
		}
	}

	public static void listarTurma(Turma[] lista) {

		boolean esta_vazia = true;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {

			} else {
				esta_vazia = false;
				System.out.println(i + " - " + exibeTurma(lista[i]));
			}
		}
		if (esta_vazia) {
			System.out.println("Lista Vazia!!");
		}
	}

	private static boolean listaNaoEstaCheia(Turma[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				return true;
			}
		}
		return false;
	}

	private static String exibeTurma(Turma turma) {
		return "[" + turma.getCodigo() + "][" + turma.getQtdVagas() + "][" + turma.getDias_da_semana() + "]";
	}
	
	public static Turma localizarTurma(Turma[] lista) {

		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("Digite o código: ");
		String codigo = scanner.nextLine();

		if (listaVazia(lista)) {
			System.out.println("Lista Vazia !!!Não tem ninguem aqui!!");
		} else {
			int i = posicaoTurma(lista, codigo);
			if (i != -1) {
				System.out.println("Turma Existe !! Esta na posicao " + i);
				return lista[i];
			} else {
				System.out.println("Turma não encontrada !!");
			}

		}
		return null;
	}
	
	private static int posicaoTurma(Turma[] lista, String codigo) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getCodigo().equals(codigo)) {
					return i;
				}
			}
		}

		return -1;
	}

	private static boolean listaVazia(Turma[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				return false;
			}
		}
		return true;
	}
	
}
