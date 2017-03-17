
public class Main {

	public static void main(String[] args) {
		int a = 3, b = 3;
//		System.out.println(retornaValor(a, b));
		System.out.println(calculaValorRecursivo(a, b));
	}

	private static int calculaValorRecursivo(int a, int b) {
		if (b == 0) {
			return 0;
		}
		int result = a;
		if (b > 1) {
			result = a * calculaValorRecursivo(a, b - 1);
		}
		return result;
	}

//	private static int retornaValor(int a, int b) {
//		if (b == 0) {
//		return 0;
//		}
//		int result = 1;
//		for (int i = 0; i < b; i++) {
//			result = result * a;
//		}
//		return result;
//	}
	
}