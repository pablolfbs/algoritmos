import java.util.Date;

public class MainApp {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno ("Pablo", "123", "algoritmo");
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getDisciplina());
		
		Funcionario funcionario = new Funcionario ("Pablo", new Date(), "aluno");
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getDataNascimento());
		System.out.println(funcionario.getCargo());
		
		
		
		
		
//		Cliente c = new Cliente("Claudio");
//		System.out.println(c.getNome());
//		c.setNome("Pablo");
//		System.out.println(c.getNome());
	}

}
