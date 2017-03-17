
import java.util.Scanner;

public class ManipulaAlunos {

	// METODO CHAMADO PELO PROGRAMA PRINCIPAL PARA INSERIR UM ALUNO
	public static void insereAluno(Aluno[] listaAlunos) {

		String nome, CPF, dataNascimento, matricula, data_ingresso;

		if (listaNaoEstaCheia(listaAlunos)) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Digite o nome: ");
			nome = scanner.nextLine();
			System.out.println("Digite o CPF: ");
			CPF = scanner.nextLine();
			System.out.println("Digite o dataNascimento: ");
			dataNascimento = scanner.nextLine();
			System.out.println("Digite o matricula: ");
			matricula = scanner.nextLine();
			System.out.println("Digite a Data Ingresso no Curso: ");
			data_ingresso = scanner.nextLine();

			Aluno a = new Aluno(nome, CPF, dataNascimento, matricula, data_ingresso);
			insereAlunoPosicaoLivre(a, listaAlunos);
			System.out.println("Aluno Inserido com Sucesso.");
		}
	}

	// METODO INTERNO QUE INSERIR O ALUNO EM UMA POSIÇÃO LIVRE
	private static void insereAlunoPosicaoLivre(Aluno a, Aluno[] lista) {
		if (listaNaoEstaCheia(lista)) {
			int posicao_livre = -1;
			boolean encontrou = false;
			for (int i = 0; i < lista.length; i++) {
				if ((lista[i] == null) && !encontrou) {
					posicao_livre = i;
					encontrou = true;
				}
			}
			lista[posicao_livre] = a;
		} else {
			System.out.println("Lista Cheia !!");
		}
	}

	// METODO CHAMADO PELO PROGRAMA PRINCIPAL PARA EXIBIR A LISTA DE ALUNOS
	public static void listarAluno(Aluno[] lista) {

		boolean esta_vazia = true;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {

			} else {
				esta_vazia = false;
				System.out.println(i + " - " + exibeAluno(lista[i]));
			}
		}
		if (esta_vazia) {
			System.out.println("Lista Vazia!!");
		}
	}

	// METODO INTERNO QUE VERIFICA SE A LISTA NÃO ESTÁ CHEIA
	private static boolean listaNaoEstaCheia(Aluno[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				return true;
			}
		}
		return false;
	}

	// METODO INTERNO QUE CONCATENA AS INFORMAÇÕES DE ALUNO PARA SEREM EXIBIDAS
	private static String exibeAluno(Aluno aluno) {
		return "[" + aluno.getMatricula() + "][" + aluno.getNome() + "][" + aluno.getDataNascimento() + "]";
	}

	// METODO CHAMADO PARA LOCALIZAR UM ALUNO, CASO NÃO ENCONTRE RETORNA NULL
	public static Aluno localizarAluno(Aluno[] lista) {

		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("Digite a matricula: ");
		String matricula = scanner.nextLine();

		if (listaVazia(lista)) {
			System.out.println("Lista Vazia !!!Não tem ninguem aqui!!");
		} else {
			int i = posicaoAluno(lista, matricula);
			if (i != -1) {
				System.out.println("Aluno Existe !! Esta na posicao " + i);
				return lista[i];
			} else {
				System.out.println("Aluno não encontrado !!");
			}

		}
		return null;
	}

	// METODO INTERNO CHAMADO PARA RETORNAR O INDICE NO ARRAY ONDE UM
	// DETERMINADO ALUNO ESTA. CASO NÃO ENCONTRE RETORNA -1
	private static int posicaoAluno(Aluno[] lista, String matricula) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getMatricula().equals(matricula)) {
					return i;
				}
			}
		}
		return -1;
	}

	// METODO INTERNO CHAMADO INDICAR SE A LISTA ESTÁ VAZIA OU NÃO
	private static boolean listaVazia(Aluno[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				return false;
			}
		}
		return true;
	}
}
