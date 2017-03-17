import java.util.Scanner;

public class Heranca {

	public static void main(String[] args) {
		int op;
		
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		Scanner n = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("1. Cadastro de pessoa fisca");
		System.out.println("2. Cadastro de pessoa juridica");
		System.out.println("Opcao: ");
		op = n.nextInt();
		
		if (op==1) {
			System.out.println("Digite nome");
			pf.nome = n.next();
			System.out.println("Digite endereco");
			pf.endereco = n.next();
			System.out.println("Digite CPF");
			pf.CPF = n.next();
		} else {
			System.out.println("Digite nome");
			pj.nome = n.next();
			System.out.println("Digite endereco");
			pj.endereco = n.next();
			System.out.println("Digite CNPJ");
			pj.CNPJ = n.next();
		}
		n.close();
	}

}
