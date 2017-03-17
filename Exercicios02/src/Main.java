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
				System.out.println("Senha não confere!");
			}
		} while (senha1 != senha2);
		System.out.println("Senha cadastrada com sucesso!");
		System.out.println("Agora você irá inserir dois números.");
		
		do {
		System.out.println("Insira o primeiro número:");
		var1 = in.nextFloat();
		System.out.println("Agora insira o segundo:");
		var2 = in.nextFloat();
		float res = var1 / var2;
			System.out.println("Digite a sua senha para mostrar o resultado da divisão:");
			senha1 = in.nextInt();
			if (senha1 == senha2) {
				System.out.println("O resultado da divião é: " + res);
			} else {
				System.out.println("Senha incorreta!!!");
			}
		} while (senha1 != senha2);
		in.close();
	}

}
