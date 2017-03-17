import java.util.Scanner;

public class Mercado {

	public static void main(String[] args) {

		int op = 9;
		Cliente cli1 = new Cliente();
		Produto prod1 = new Produto();
		NFe nfiscal1 = new NFe();
		DetalheNFe detalhenfiscal1 = new DetalheNFe();

		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("1. Cadastrar Cliente ");
			System.out.println("2. Cadastrar Produto ");
			System.out.println("3. Registrar NFe ");
			System.out.println("4. Ver NFe ");
			System.out.println("5. Sair ");
	
			op = in.nextInt();
	
			switch(op) {
			case 1:
				System.out.println("===Cadastro de Cliente===");
				System.out.println("Digite Código Cliente: ");
				cli1.codigo_cliente = in.next();
				System.out.println("Digite Nome do Cliente: ");
				cli1.nome_cliente = in.next();
				System.out.println("Digite o endereço do Cliente: ");
				cli1.endereco_cliente = in.next();
				break;
			case 2:
				System.out.println("===Cadastro do Produto===");
				System.out.println("Digite Código Produto: ");
				prod1.codigo_produto = in.next();
				System.out.println("Digite Nome do Produto: ");
				prod1.nome_produto = in.next();
				break;
			case 3:
				System.out.println("===Cadastro da NFe===");
				System.out.println("Digite número da NFe: ");
				nfiscal1.numero_nfe = in.next();
				System.out.println("Digite Data da NFe: ");
				nfiscal1.data_nfe = in.next();
				nfiscal1.clientedanota = cli1;
	
				System.out.println("== Detalhe da NFe ==");
				detalhenfiscal1.nfiscalE = nfiscal1;
				detalhenfiscal1.produto1 = prod1;
				System.out.println("Para: " + prod1.codigo_produto + " " + prod1.nome_produto + " ");
				System.out.println("Digite quantidade: ");
				detalhenfiscal1.quantidade = in.nextInt();
				System.out.println("Digite preço unitário: ");
				detalhenfiscal1.preco_unitario = in.nextInt();
				break;
			case 4:
				System.out.println("=== NFe ===");
				System.out.println("Número: " + nfiscal1.numero_nfe);
				System.out.println("Data: " + nfiscal1.data_nfe);
				System.out.println("Cliente Código: " + nfiscal1.clientedanota.codigo_cliente);
				System.out.println("Cliente Nome: " + nfiscal1.clientedanota.nome_cliente);
				System.out.println("Cliente Endereço: " + nfiscal1.clientedanota.endereco_cliente);
				System.out.println("=== = ===");
				System.out.println(detalhenfiscal1.produto1.codigo_produto + " " + detalhenfiscal1.produto1.nome_produto + " " + detalhenfiscal1.quantidade + " " + detalhenfiscal1.preco_unitario + "\n");
				break;
			}
		} while(op != 5);
		in.close();
	}
}
