
public class FatorialMetodoRecursivo {

	public static void main(String[] args) {
		int a = 7;
		System.out.println(fatorialMetodoRecursivo(a));
	}

	private static int fatorialMetodoRecursivo(int a) {
		if (a == 0) {
			return 1;
		}
		a = a * fatorialMetodoRecursivo(a - 1);
		return a;
	}

}
