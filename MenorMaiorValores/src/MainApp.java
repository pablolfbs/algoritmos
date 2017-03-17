import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n[] = new int[10];
		
		for (int i = 0; i < n.length; i++) {
			System.out.print("Escreva o valor da posição " + (i+1) + ": ");
			n[i] = teclado.nextInt();
		}		
		teclado.close();
	}	
}
