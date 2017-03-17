import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int var[] = new int[10];
		
		for (int i = 0; i < var.length; i++) {
			System.out.print("Digite o valor " + (i+1) + ": ");
			var[i] = tec.nextInt();		
		}
		tec.close();	
	}
}
