import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		System.out.print("Qual m�s vai nascer? ");
		int	m = t.nextInt();
		if (m % 2 == 0 && m > 0 && m <= 12) {
			System.out.print("\n� menina!! ");
		}
		if (m % 2 == 1 && m > 0 && m <= 12) {
			System.out.print("\n� menino!! ");
		}
		if (m <= 0 || m > 12) {
			System.out.print("\nM�s inv�lido. ");
		}
		t.close();
	}
}
