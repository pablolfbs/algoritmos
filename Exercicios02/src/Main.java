import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int senha1, senha2;
		float var1, var2;
		do {
			System.out.println("Cadastre a sua senha:");
			senha1 = in.nextInt();
			System.out.println("Confirme a sua senha:");
			senha2 = in.nextInt();
			if (senha1 != senha2) {
				System.out.println("Senha n�o confere!");
			}
		} while (senha1 != senha2);
		System.out.println("Senha cadastrada com sucesso!");
		System.out.println("Agora voc� ir� inserir dois n�meros.");
		
		do {
		System.out.println("Insira o primeiro n�mero:");
		var1 = in.nextFloat();
		System.out.println("Agora insira o segundo:");
		var2 = in.nextFloat();
		float res = var1 / var2;
			System.out.println("Digite a sua senha para mostrar o resultado da divis�o:");
			senha1 = in.nextInt();
			if (senha1 == senha2) {
				System.out.println("O resultado da divi�o �: " + res);
			} else {
				System.out.println("Senha incorreta!!!");
			}
		} while (senha1 != senha2);
		in.close();
	}

}
