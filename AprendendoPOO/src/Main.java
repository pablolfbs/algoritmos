import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//		Aluno aluno = new Aluno();
//		aluno.setNome("Pablo");
//		aluno.setIdade(38);
//		System.out.println(aluno.getIdade());
		
//		String nomeRua = null, numero = null, complemento = null, cidade = null, estado = null, cep = null;
//		Endereco end = new Endereco(nomeRua, numero, complemento, cidade, estado, cep);
//		end.setNomeRua("Rua Andiara");
//		end.setNumero("42");
//		end.setComplemento("ap 202 fds");
//		end.setCidade("Rio de Janeiro");
//		end.setEstado("Rio de Janeiro");
//		end.setCep("21051-000");
//		System.out.print(end.getNomeRua() + " ");
//		System.out.print(end.getNumero() + ", ");
//		System.out.print(end.getComplemento() + " - ");
//		System.out.print(end.getCidade() + " - ");
//		System.out.print(end.getEstado() + " - ");
//		System.out.print(end.getCep());
		
		Scanner in = new Scanner(System.in);
			
//		String nomeRua = null, numero = null, complemento = null, cidade = null, estado = null, cep = null;
		Endereco end = new Endereco(null, null, null, null, null, null);
		System.out.println("Digite o nome da rua: ");
		end.setNomeRua(in.nextLine());
		end.setNumero(in.nextLine());
//		end.setComplemento(in.nextLine());
//		end.setCidade(in.nextLine());
//		end.setEstado(in.nextLine());
//		end.setCep(in.nextLine());
		System.out.println(end.getNomeRua() + " " + end.getNumero());
		
//		Contato contato = new Contato();
//		contato.setNome("Pablo");
//		contato.setTelefone("21 96434-4975");
//		contato.setEndereco(end);
//		System.out.println(contato.getEndereco().getNomeRua());
	}

}
