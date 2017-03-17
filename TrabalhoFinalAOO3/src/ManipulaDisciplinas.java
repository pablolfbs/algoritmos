import java.util.Scanner;

public class ManipulaDisciplinas {
	
	public static void insereDisciplina(Disciplina[] listaDisciplinas) {

		String codigo, nome;

		if (listaNaoEstaCheia(listaDisciplinas)) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Digite o código: ");
			codigo = scanner.nextLine();
			System.out.println("Digite o nome: ");
			nome = scanner.nextLine();
			System.out.println("Digite a carga horária semanal: ");
			int cargaHorariaSemanal = Integer.parseInt(scanner.nextLine());

			Disciplina d = new Disciplina(codigo, nome,cargaHorariaSemanal);
			insereDisciplinaPosicaoLivre(d, listaDisciplinas);
			System.out.println("Disciplina Inserida com Sucesso.");
		}
	}

	private static void insereDisciplinaPosicaoLivre(Disciplina d, Disciplina[] lista) {
		if (listaNaoEstaCheia(lista)) {
			int posicao_livre = -1;
			boolean encontrou = false;
			for (int i = 0; i < lista.length; i++) {
				if ((lista[i] == null) && !encontrou) {
					posicao_livre = i;
					encontrou = true;
				}
			}
			lista[posicao_livre] = d;
		} else {
			System.out.println("Lista Cheia !!");
		}
	}

	public static void listarDisciplina(Disciplina[] lista) {

		boolean esta_vazia = true;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {

			} else {
				esta_vazia = false;
				System.out.println(i + " - " + exibeDisciplina(lista[i]));
			}
		}
		if (esta_vazia) {
			System.out.println("Lista Vazia!!");
		}
	}

	private static boolean listaNaoEstaCheia(Disciplina[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				return true;
			}
		}
		return false;
	}
	
	private static String exibeDisciplina(Disciplina disciplina) {
		return "[" + disciplina.getCodigo() + "][" + disciplina.getNome() + "][" + disciplina.getCargaHorariaSemanal() + "hrs]";
	}

	public static Disciplina localizarDisciplina(Disciplina[] lista) {

		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("Digite o codigo: ");
		String codigo = scanner.nextLine();

		if (listaVazia(lista)) {
			System.out.println("Lista Vazia !!!Não tem ninguem aqui!!");
		} else {
			int i = posicaoDisciplina(lista, codigo);
			if (i != -1) {
				System.out.println("Disciplina Existe !! Esta na posicao " + i);
				return lista[i];
			} else {
				System.out.println("Disciplina não encontrada !!");
			}

		}
		return null;
	}

	private static int posicaoDisciplina(Disciplina[] lista, String codigo) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getCodigo().equals(codigo)) {
					return i;
				}
			}
		}

		return -1;
	}

	private static boolean listaVazia(Disciplina[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				return false;
			}
		}
		return true;
	}

}
