package principal;

import java.util.Date;
import java.util.Scanner;
import modelo.*;

public class MetodosUteis {

	Scanner in;
	
	public void listarAlunos() {
	
		in = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nome = in.next();
		System.out.println("Digite o CPF");
		String cpf = in.next();
		System.out.println("Digite a matrícula: ");
		String matricula = in.next();
				
		Aluno a = new Aluno(nome, cpf, new Date(),  new Inscricao[0], matricula, new Date());
		System.out.println(a.getNome());
		System.out.println(a.getCpf());
		System.out.println(a.getData_nascimento());
		System.out.println(a.getListaInscricoes());
		System.out.println(a.getData_ingresso());		
	}
	
	

}
