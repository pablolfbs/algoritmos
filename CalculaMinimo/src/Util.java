
public class Util {

	public static float min(float[] array) {

		float min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static float max(float[] array) {

		float max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static float med(float[] array) {

		float med, soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma = soma + array[i];
		}
		med = soma / array.length;
		return med;
	}

}
