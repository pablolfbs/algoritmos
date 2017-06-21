import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 double num1, num2;
		 System.out.print("Digite um valor: ");
		 num1 = in.nextDouble();
		 System.out.print("Digite o operador: ");
		 String op = in.next();
		 System.out.print("Digite o segundo valor: ");
		 num2 = in.nextDouble();
		 if (op.equals("+")) {
			 System.out.println(num1 + num2);
		 } else if (op.equals("-")) {
			 System.out.println(num1 - num2);
		 } else if (op.equals("*")) {
			 System.out.println(num1 * num2);
		 } else if (op.equals("/")) {
			 System.out.println(num1 / num2);
		 } else {
			 System.out.println("Operador inválido. ");
		 }
		 in.close();
	}
	
}
