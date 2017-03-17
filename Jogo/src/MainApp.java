import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letra = null;
		Random rand = new Random();
		String palavraAtual = retornaPalavra(rand);
		int opcao = 1;

		System.out.println("##########################");
		System.out.println("#                        #");
		System.out.println("#                        #");
		System.out.println("#   1 - Entrar no Jogo   #");
		System.out.println("#   2 - Sair             #");
		System.out.println("#                        #");
		System.out.println("#                        #");
		System.out.println("##########################");

		System.out.print("\nEscolha uma opção: ");

		int tamanho = palavraAtual.length();
		char letraRemovida = geraLetra(rand, palavraAtual, tamanho);
		String palavraSemLetra = palavraAtual.replace(letraRemovida, '_');
		opcao = input.nextInt();

		switch (opcao) {
		case 1:
			do {
				System.out.println("A palavra sorteada é: " + palavraSemLetra);
				System.out.println("Qual letra está faltando? ");
				letra = input.next();
			} while (letra.equalsIgnoreCase("" + letraRemovida) == false);
			System.out.println("Parabéns, você acertou!");
			System.out.printf("A palavra era: " + palavraAtual);
			input.close();
			break;
		case 2:
			System.out.println("Saiu com sucesso.");
		}

	}

	private static char geraLetra(Random rand, String palavraAtual, int len) {
		int posicaoLetra;
		char letraRemovida = ' ';
		while (letraRemovida == ' ') {
			posicaoLetra = rand.nextInt(len);
			letraRemovida = palavraAtual.charAt(posicaoLetra);
		}
		return letraRemovida;
	}

	public static String retornaPalavra(Random rand) {
		String palavraAtual;
		String[] palavras = { "java", "pascal", "algoritmo", "programação", "variavel", "metodo", "classe", "php",
				"python", "mouse", "procedure", "debug", "computador", "processador", "smartphone", "eclipse", "ruby",
				"javascript", "delphi", "teclado", "ubuntu", "linux", "windows", "eclipse", "netbeans", "android" };
		palavraAtual = palavras[rand.nextInt(palavras.length)];
		return palavraAtual;
	}
}