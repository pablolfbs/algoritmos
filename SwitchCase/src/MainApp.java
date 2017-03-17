import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		String s;

		do {
			System.out.println("Digite um mês: ");
			int mes = in.nextInt();
			
			switch (mes) {
			case 1:
				s = "Janeiro";
				break;
			case 2:
				s = "Fevereiro";
				break;
			case 3:
				s = "Março";
				break;
			case 4:
				s = "Abril";
				break;
			case 5:
				s = "Maio";
				break;
			case 6:
				s = "Junho";
				break;
			case 7:
				s = "Julho";
				break;
			case 8:
				s = "Agosto";
				break;
			case 9:
				s = "Setembro";
				break;
			case 10:
				s = "Outubro";
				break;
			case 11:
				s = "Novembro";
				break;
			case 12:
				s = "Dezembro";
				break;
			default:
				s = "Mês inválido.";
			}
			System.out.println(s);
		} while (s == "Mês inválido.");
		in.close();
	}
	
}
