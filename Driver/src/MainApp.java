import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Digite sua quantidade de pontos na carteira:");
		Scanner s = new Scanner(System.in);
		int pontosNaCarteira = s.nextInt();
		
		if(pontosNaCarteira < 20){
			System.out.println("Digite sua idade:");
		    int idade = s.nextInt();
				
		    if(idade > 18) {
					System.out.println("Pode dirigir");
			} else {
					System.out.println("Não pode dirigir");
			} 
		} else {
			System.out.println("Não pode dirigir");
		}
		s.close();
	}
}