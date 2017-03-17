
public class Funcionario {
	
	private String nome;
	private String departamento;
	private String dataEntrada;
	private String RG;
	private double salario;
	
	void mostra(){
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Entrou em: " + this.dataEntrada);
        System.out.println("RG: " + this.RG);
        System.out.println("Salário: " + this.salario);
        System.out.println("Ganha anualmente: " + calculaGanhoAnual() + "\n");
    }
	
	public void bonifica(double aumento) {
		this.salario += aumento;
	}
	
	public double calculaGanhoAnual() {
		return (salario * 12);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

}
