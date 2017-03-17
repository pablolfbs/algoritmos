import java.util.Scanner;

public class ManipulaInscricao {

	public static void insereInscricao(Inscricao[] listaInscricao) {

		String periodo_referencia;

		if (listaNaoEstaCheia(listaInscricao)) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Digite o id de inscrição: ");
			int id_inscricao = Integer.parseInt(scanner.nextLine());
			System.out.println("Digite a quantidade de créditos: ");
			int qtdLimiteCreditos = Integer.parseInt(scanner.nextLine());
			System.out.println("Digite o período de referência: ");
			periodo_referencia = scanner.nextLine();
			
			Inscricao i = new Inscricao(id_inscricao, qtdLimiteCreditos, periodo_referencia);
			insereInscricaoPosicaoLivre(i, listaInscricao);
			System.out.println("Inscrição inserida com sucesso.");
		}
	}

	private static void insereInscricaoPosicaoLivre(Inscricao i, Inscricao[] lista) {
		if (listaNaoEstaCheia(lista)) {
			int posicao_livre = -1;
			boolean encontrou = false;
			for (int j = 0; j < lista.length; j++) {
				if ((lista[j] == null) && !encontrou) {
					posicao_livre = j;
					encontrou = true;
				}
			}
			lista[posicao_livre] = i;
		} else {
			System.out.println("Lista Cheia !!");
		}
	}

	public static void listarInscricao(Inscricao[] lista) {

		boolean esta_vazia = true;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {

			} else {
				esta_vazia = false;
				System.out.println(i + " - " + exibeInscricao(lista[i]));
			}
		}
		if (esta_vazia) {
			System.out.println("Lista Vazia!!");
		}
	}

	private static boolean listaNaoEstaCheia(Inscricao[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				return true;
			}
		}
		return false;
	}

	private static String exibeInscricao(Inscricao inscricao) {
		return "[" + inscricao.getId_inscricao() + "][" + inscricao.getQtdLimiteCreditos() + "][" + inscricao.getPeriodo_referencia() + "]";
	}

	public static Inscricao localizaInscricao(Inscricao[] listaI) {

		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("Digite o id_inscricao: ");
		String id_inscricao = scanner.nextLine();

		if (listaVazia(listaI)) {
			System.out.println("Lista Vazia !!!Não tem ninguem aqui!!");
		} else {
			int i = posicaoInscricao(listaI, id_inscricao);
			if (i != -1) {
				System.out.println("Inscrição Existe !! Esta na posicao " + i);
				return listaI[i];
			} else {
				System.out.println("Inscrição não encontrada !!");
			}

		}
		return null;
	}

	private static int posicaoInscricao(Inscricao[] listaI, String id_inscricao) {
		for (int i = 0; i < listaI.length; i++) {
			if (listaI[i] != null) {
				if (listaI[i].getId_inscricao().equals(id_inscricao)) {
					return i;
				}
			}
		}

		return -1;
	}

	private static boolean listaVazia(Inscricao[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				return false;
			}
		}
		return true;
	}
	
}
