package principal;

import java.util.Scanner;
import java.util.Date;
import modelo.*;

public class MainApp {
	
	public static void main(String[] args) {		
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digite um nome: ");
	String nome = in.next();
	System.out.println("Digite o CPF: ");
	long cpf = in.nextLong();
	Pessoa p = new Pessoa(nome, cpf, new Date());
	System.out.println(p.getNome());
	System.out.println(p.getCpf());
	System.out.println(p.getDataNascimento());
	
	System.out.println("Digite um nome:");
	nome = in.next();
	System.out.println("Digite o CPF: ");
	cpf = in.nextLong();
	System.out.println("Digite o salário: ");
	float salario = in.nextFloat();
	System.out.println("Digite o cargo: ");
	String cargo = in.next();
	Funcionario f = new Funcionario(nome, cpf, new Date(), new Date(), salario, cargo);
	System.out.println(f.getNome());
	System.out.println(f.getCpf());
	System.out.println(f.getDataNascimento());
	System.out.println(f.getDataEntrada());
	System.out.println(f.getSalario());
	System.out.println(f.getCargo());
	
	System.out.println("Digite um nome: ");
	nome = in.next();
	System.out.println("Digite o CPF: ");
	cpf = in.nextLong();
	Cliente c = new Cliente(nome, cpf, new Date(), new Date());
	System.out.println(c.getNome());
	System.out.println(c.getCpf());
	System.out.println(c.getDataNascimento());
	System.out.println(c.getDataRegistro());
	
	System.out.println("Digite o nome: ");
	nome = in.next();
	System.out.println("Digite o CPF: ");
	cpf = in.nextLong();
	System.out.println("Digite o salário: ");
	salario = in.nextFloat();
	System.out.println("Digite o cargo:");
	cargo = in.next();
	System.out.println("Digite a comissão: ");
	float comissao = in.nextFloat();
	Vendedor v = new Vendedor(nome, cpf, new Date(), new Date(), salario, cargo, comissao);
	System.out.println(v.getNome());
	System.out.println(v.getCpf());
	System.out.println(v.getDataNascimento());
	System.out.println(v.getDataEntrada());
	System.out.println(v.getSalario());
	System.out.println(v.getCargo());
	System.out.println(v.getComissao());
	
	in.close();
	}
}