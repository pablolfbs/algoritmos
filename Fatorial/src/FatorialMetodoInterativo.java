
public class FatorialMetodoInterativo {

	public static void main(String[] args) {
		int a = 7;
		System.out.println(fatorialMetodoInterativo(a));
	}

	private static int fatorialMetodoInterativo(int a) {
		if (a == 0) {
			return 1;
		}
		for (int i = a - 1; i > 0; i--) {
			a = a * i;
		}
		return a;
	}
	
}
