
public class Main {
	public static void main(String[] args) {
		int a = 3, b = 4;
//		System.out.println(calculaValorInterativo(a, b));
		System.out.println(calculaValorRecursivo(a, b));
	}

	private static int calculaValorRecursivo(int a, int b) {
		int result = 0;
		if (b >= 0) {
			result = a + calculaValorRecursivo(a, b - 1);
		}
		return result;
	}

//	private static int calculaValorInterativo(int a, int b) {
//		int result = 0;
//		for (int i = 0; i <= b; i++) {
//			result = result + a;
//		}
//		return result;
//	}
}