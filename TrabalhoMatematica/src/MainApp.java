import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
//		p || (q && r) <--> (p || q) && (p || r)
		
		Scanner in = new Scanner(System.in);
		String p = "" , q = "", r = "";
		boolean valorP = false, valorQ = false, valorR = false, pouqer, pouqepour;
		
//		Orienta��o ao usu�rio.
		System.out.println("Sabendo que 1 � verdadeiro e 0 � falso.");
//		Pede ao usu�rio para digitar o valor da vari�vel "p".
		int p1 = -1;
		do {
			try {
				System.out.print("Diga se p � 0 ou 1: ");
//				Pega o valor da vari�vel q digitada pelo usu�rio.
				p = in.next();
				p1 = Integer.parseInt(p);
				if (p1 == 0) {
					valorP = false;
				} else if (p1 == 1) {
					valorP = true;
				} else {
					System.out.println("Valor inv�lido.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Digite apenas 0 ou 1.");
			}
		} while (p1 > 1 || p1 < 0);
//		Pede ao usu�rio para digitar o valor da vari�vel "q".
		int q1 = -1;
		do {
			try {
				System.out.print("Diga se q � 0 ou 1: ");
//				Pega o valor da vari�vel q digitada pelo usu�rio.
				q = in.next();
				q1 = Integer.parseInt(q);
				if (q1 == 0) {
					valorQ = false;
				} else if (q1 == 1) {
					valorQ = true;
				} else {
					System.out.println("Valor inv�lido.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Digite apenas 0 ou 1.");
			}
		} while (q1 > 1 || q1 < 0);
//		Pede ao usu�rio para digitar o valor da vari�vel "r".
		int r1 = -1;
		do {
			try {
				System.out.print("Diga se r � 0 ou 1: ");
//				Pega o valor da vari�vel r digitada pelo usu�rio.
				r = in.next();
				r1 = Integer.parseInt(r);
				if (r1 == 0) {
					valorR = false;
				} else if (r1 == 1) {
					valorR = true;
				} else {
					System.out.println("Valor inv�lido.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Digite apenas 0 ou 1.");
			}
		} while (r1 > 1 || r1 < 0);
				
//		Mostra na tela o valor das vari�veis digitadas pelo usu�rio.		
		System.out.println("\nO valor de p �: " + valorP);
		System.out.println("O valor de q �: " + valorQ);
		System.out.println("O valor de r �: " + valorR + "\n");
		
//		System.out.println("p  |  q  |  r  |  p v (q ^ r)  |  (p v q) ^ (p v r) ");
		
		pouqer = (valorP || (valorQ && valorR));
//		Mostra na tela o resultado da proposi��o 'p v (q ^ r)' de acordo com os dados digitados pelo usu�rio.
		System.out.println("A proposi��o 'p v (q ^ r)' � " + pouqer + ".\n\n");
		
		
		pouqepour = (valorP || valorQ) && (valorP || valorR);
//		Mostra na tela o resultado da proposi��o 'p v (q ^ r)' de acordo com os dados digitados pelo usu�rio.
		System.out.println("A proposic�o '(p v q) ^ (p v r)' � " + pouqepour + ".\n\n");
		
		
//		Calcula a proposi��o 'p v (q ^ r) <--> (p v q) ^ (p v r)' e imprime o resultado final na tela.
		if ((pouqer == true &&  pouqepour == true) || (pouqer == false && pouqepour == false)) {
			System.out.println("Ent�o a proposi��o 'p v (q ^ r) <--> (p v q) ^ (p v r)' � Verdadeira");
		} else {
			System.out.println("Ent�o a proposi��o 'p v (q ^ r) <--> (p v q) ^ (p v r)' � Falsa");
		}					
		in.close();		
	}
}

//		p || (q && r) <--> (p || q) && (p || r)