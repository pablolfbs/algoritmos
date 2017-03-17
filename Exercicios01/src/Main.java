
public class Main {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1 = new Funcionario();
		
		f1.setNome("Pablo");
		f1.setDepartamento("Tesouraria");
		f1.setDataEntrada("12/09/2010");
		f1.setRG("123456");
		f1.setSalario(2000.00);
		f1.mostra();
		
		f1.bonifica(1000);
		f1.mostra();
	}
	
}
