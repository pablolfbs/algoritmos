
public class FibonacciMetodoInterativo {

	public static void main(String[] args) {
		int[] a = fibonacciMetodoInterativo();
		imprimeArray(a);
	}

	private static void imprimeArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);			
		}
	}

	private static int[] fibonacciMetodoInterativo() {

		int[] a = new int[30];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		 return a;
	}

}
