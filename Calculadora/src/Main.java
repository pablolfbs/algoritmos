import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		double num1, num2;
		String op;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		num1 = in.nextDouble();
		System.out.println("Digite a opera��o:");
		op = in.next();
		System.out.println("Digite o segundo n�mero:");
		num2 = in.nextDouble();
		
		if (num2 == 0 && op.equals("/")) {
			System.out.println("Imposs�vel dividir!!");
		} else {
			if (op.equals("+")) {
				System.out.println(num1 + num2);
			} else if (op.equals("-")) {
					System.out.println(num1 - num2);
			} else if (op.equals("*")) {
					System.out.println(num1 * num2);
			} else if (op.equals("/")) {
					System.out.println(num1 / num2);
			}
		}
		
	}

}
