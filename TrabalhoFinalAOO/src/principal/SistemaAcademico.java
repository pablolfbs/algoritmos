package principal;

import java.util.Scanner;

import modelo.*;

public class SistemaAcademico {
	
	public static Aluno[] listaA;

	public static void main(String[] args) {
		
		listaA = new Aluno[10];

		int opcao;
		do {
			opcao = opcaoMenuPrincipal();
			switch (opcao) {
			case 1:
				listarAlunos();
				break;
			case 2:
				inserirAlunos();
				break;
			case 3:
				localizarAluno();
				break;
			default:
				System.out.println("Opção Inválida!!!");
			}
		} while (opcao != -1); {
			System.out.println("=== FIM ===");
		}

	}

	private static void localizarAluno() {
		// TODO Auto-generated method stub
		
	}

	private static void inserirAlunos() {
		// TODO Auto-generated method stub
		
	}

	private static void listarAlunos() {
		// TODO Auto-generated method stub
		
	}

	private static int opcaoMenuPrincipal() {

		System.out.println("#### MENU PRINCIPAL DO PROGRAMA ####");
		System.out.println("####################################");
		System.out.println("############ BEM VINDO ############");
		System.out.println("####################################");
		System.out.println("####################################");
		System.out.println("");
		System.out.println("1 - LISTAR AGENDA;");
		System.out.println("2 - INSERIR NOVO CONTATO;");
		System.out.println("3 - LOCALIZAR NOVO CONTATO;");
		System.out.println("# (para sair digite um número negativo) #");
		System.out.println("#########################################");
		System.out.println("Opção desejada: ");

		Scanner in = new Scanner(System.in);
		int opcao = in.nextInt();
		return opcao;
	}
	
}
