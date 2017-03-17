import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		System.out.print("Qual mês vai nascer? ");
		int	m = t.nextInt();
		if (m % 2 == 0 && m > 0 && m <= 12) {
			System.out.print("\nÉ menina!! ");
		}
		if (m % 2 == 1 && m > 0 && m <= 12) {
			System.out.print("\nÉ menino!! ");
		}
		if (m <= 0 || m > 12) {
			System.out.print("\nMês inválido. ");
		}
		t.close();
	}
}
