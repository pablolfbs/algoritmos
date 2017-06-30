
public class FibonacciMetodoRecursivo {

	public static void main(String[] args) {
		
		int[] a = new int[30];
		a[0] = 0;
		a[1] = 1;
		int b = 0;
		fibonacciMetodoRecursivo(b, a);
		imprimeArray(a);
//		System.out.println(fibonacciMetodoRecursivo(a[30]));

	}
	
	private static void imprimeArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static int fibonacciMetodoRecursivo(int b, int[] a) {
		if(b == 0) {
			return 0;
		}
		if(b == 1) {
			return 1;
		}
		return (fibonacciMetodoRecursivo(b - 1, a[i -1]));
		

		
//		int[] a = new int[30];
//		a[0] = 0;
//		a[1] = 1;
//		int i = 2;
		if(b < 30) {
			a[b] += fibonacciMetodoRecursivo((b+1), a);
		}
		return fibonacciMetodoRecursivo((b+1), a);

	}
	

}
