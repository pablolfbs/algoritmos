
public class Main {
	
	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		
//		v1.setNome("Juvenal");
//		v1.setIdade(22);
//		v1.setSexo("M");
		
//		System.out.println(v1.toString());
		
		a1.setNome("Claudio");
		a1.setMatricula(1111);
		a1.setCurso("Inform�tica");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
	}

}
