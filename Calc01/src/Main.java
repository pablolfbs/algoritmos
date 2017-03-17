import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double a, b;
		String op;
		System.out.print("Digite um valor: ");
		a = in.nextDouble();
		System.out.print("Digite o operador: ");
		op = in.next();
		System.out.print("Digite o segundo valor: ");
		b = in.nextDouble();
		
		if (op.equals("+")) {
			System.out.println(a + b);
		} else if (op.equals("-")) {
			System.out.println(a - b);
		} else if (op.equals("*")) {
			System.out.println(a * b);
		} else if (b == 0 && op.equals("/")) {
			System.out.println("Impossível dividir!!");
		} else if (op.equals("/")) {
			System.out.println(a / b);
		}
		in.close();
	}

}
