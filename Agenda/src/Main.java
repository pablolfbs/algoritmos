import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda");
		String nome = in.nextLine();
		
		Agenda agenda = new Agenda();
		agenda.setNome(nome);
		
		Contato[] contatos = new Contato[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as informações do contato" + (i + 1));
			Contato c = new Contato();
			
			System.out.println("Digite o nome: ");
			nome =  in.nextLine();
			c.setNome(nome);
			
			System.out.println("Digite o telefone: ");
			String telefone = in.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Digite o email: ");
			String email = in.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);	
		
		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		
	}

}
