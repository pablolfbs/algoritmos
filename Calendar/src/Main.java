
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
		
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(Calendar.YEAR, 2015);
//		calendar.set(Calendar.MONTH, 03);
//		calendar.set(Calendar.DAY_OF_MONTH, 10);
//		calendar.set(Calendar.HOUR, 21);
//		calendar.set(Calendar.MINUTE, 15);
//		Date date = calendar.getTime();
//		System.out.println(date);
//		
//		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yy HH:mm");
//		String dataFormatada = f.format(date);
//		System.out.println(dataFormatada);
		
		
		
		
//		try {
//			String data = in.next();
//			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//			Date dt = df.parse(data);
//			System.out.println(dt);
//		} catch (Exception ex) {
//	        ex.printStackTrace();
//	    }
		
		
		
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        Calendar calendario = Calendar.getInstance();
        
        System.out.printf("Você nasceu em " + (calendario.get(Calendar.YEAR) - entrada.nextInt()) + "\n");
	}

}
