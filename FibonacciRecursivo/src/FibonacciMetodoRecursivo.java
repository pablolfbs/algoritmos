
public class FibonacciMetodoRecursivo {

	public static void main(String[] args) {
//		int n = 0;
//		fibonacciMetodoRecursivo(n);
//		imprimeArray(n);
//		System.out.println(fibonacciMetodoRecursivo(a[30]));
		
		int count = 1;
		for (int i = 0; i < 40; i++) {
			System.out.print(count++ + " - ");
			System.out.println(fibonacciMetodoRecursivo(i));
		}
	}
	
//	private static void imprimeArray(int n) {
//		
//	}

	private static int fibonacciMetodoRecursivo(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return (fibonacciMetodoRecursivo(n - 1) + fibonacciMetodoRecursivo(n - 2));
		

		
//		int[] a = new int[30];
//		a[0] = 0;
//		a[1] = 1;
//		int i = 2;
//		if(b < 30) {
//			a[b] += fibonacciMetodoRecursivo((b+1), a);
//		}
//		return fibonacciMetodoRecursivo((b+1), a);
//
	}
	

}
