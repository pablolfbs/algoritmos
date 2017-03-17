
public class Main {
	
	public static void main(String[] args) {
		
		float a[] = new float[3];
		a[0] = 100;
		a[1] = 20;
		a[2] = 1000;
		float valorMinimo = Util.min(a);
		System.out.println(valorMinimo);
		float valorMaximo = Util.max(a);
		System.out.println(valorMaximo);
		float valorMedio = Util.med(a);
		System.out.println(valorMedio);
		
	}

}
