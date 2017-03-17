
public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacci(10));

		// int num1 = 1, num2 = 0;
		//
		// System.out.println(num2);
		// System.out.println(num1);
		//
		// for(int i = 0; i < 28; i++){
		// num1 = num1 + num2;
		// num2 = num1 - num2;
		// System.out.println(num1);
	}

	public static int fibonacci(int a) {
		if (a < 2) {
			return a;
		} else {
			return fibonacci(a - 2) + fibonacci(a - 1);
		}
	}
}
