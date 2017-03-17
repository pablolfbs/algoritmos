import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
//		p || (q && r) <--> (p || q) && (p || r)
		
		Scanner in = new Scanner(System.in);
		String p = "" , q = "", r = "";
		boolean valorP = false, valorQ = false, valorR = false, pouqer, pouqepour;
		
//		Orientação ao usuário.
		System.out.println("Sabendo que 1 é verdadeiro e 0 é falso.");
//		Pede ao usuário para digitar o valor da variável "p".
		int p1 = -1;
		do {
			try {
				System.out.print("Diga se p é 0 ou 1: ");
//				Pega o valor da variável q digitada pelo usuário.
				p = in.next();
				p1 = Integer.parseInt(p);
				if (p1 == 0) {
					valorP = false;
				} else if (p1 == 1) {
					valorP = true;
				} else {
					System.out.println("Valor inválido.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Digite apenas 0 ou 1.");
			}
		} while (p1 > 1 || p1 < 0);
//		Pede ao usuário para digitar o valor da variável "q".
		int q1 = -1;
		do {
			try {
				System.out.print("Diga se q é 0 ou 1: ");
//				Pega o valor da variável q digitada pelo usuário.
				q = in.next();
				q1 = Integer.parseInt(q);
				if (q1 == 0) {
					valorQ = false;
				} else if (q1 == 1) {
					valorQ = true;
				} else {
					System.out.println("Valor inválido.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Digite apenas 0 ou 1.");
			}
		} while (q1 > 1 || q1 < 0);
//		Pede ao usuário para digitar o valor da variável "r".
		int r1 = -1;
		do {
			try {
				System.out.print("Diga se r é 0 ou 1: ");
//				Pega o valor da variável r digitada pelo usuário.
				r = in.next();
				r1 = Integer.parseInt(r);
				if (r1 == 0) {
					valorR = false;
				} else if (r1 == 1) {
					valorR = true;
				} else {
					System.out.println("Valor inválido.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Digite apenas 0 ou 1.");
			}
		} while (r1 > 1 || r1 < 0);
				
//		Mostra na tela o valor das variáveis digitadas pelo usuário.		
		System.out.println("\nO valor de p é: " + valorP);
		System.out.println("O valor de q é: " + valorQ);
		System.out.println("O valor de r é: " + valorR + "\n");
		
//		System.out.println("p  |  q  |  r  |  p v (q ^ r)  |  (p v q) ^ (p v r) ");
		
		pouqer = (valorP || (valorQ && valorR));
//		Mostra na tela o resultado da proposição 'p v (q ^ r)' de acordo com os dados digitados pelo usuário.
		System.out.println("A proposição 'p v (q ^ r)' é " + pouqer + ".\n\n");
		
		
		pouqepour = (valorP || valorQ) && (valorP || valorR);
//		Mostra na tela o resultado da proposição 'p v (q ^ r)' de acordo com os dados digitados pelo usuário.
		System.out.println("A proposicão '(p v q) ^ (p v r)' é " + pouqepour + ".\n\n");
		
		
//		Calcula a proposição 'p v (q ^ r) <--> (p v q) ^ (p v r)' e imprime o resultado final na tela.
		if ((pouqer == true &&  pouqepour == true) || (pouqer == false && pouqepour == false)) {
			System.out.println("Então a proposição 'p v (q ^ r) <--> (p v q) ^ (p v r)' é Verdadeira");
		} else {
			System.out.println("Então a proposição 'p v (q ^ r) <--> (p v q) ^ (p v r)' é Falsa");
		}					
		in.close();		
	}
}

//		p || (q && r) <--> (p || q) && (p || r)