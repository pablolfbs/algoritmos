import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int contador, numero, total = 0; 
		double media = 0;
		System.out.println("Digite um número negativo quando quiser parar !! ");
		contador = -1;
		numero = 0;
		media = 0;
		
		while (numero >= 0) {
			contador = contador + 1;
			total = total + numero;
			System.out.println("Digite o número: ");
			numero = in.nextInt(); 
		}
		if (contador > 0) {
			media = total / contador;
		} else {
			media = 0;
		}
		System.out.println("Média Aritmética Simples: " + media);
	}

}
