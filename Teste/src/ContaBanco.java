
public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		if ("CC".equals(t)) {
			this.setSaldo(50);
		} else if ("CP".equals(t)) {
			this.setSaldo(150);
		}		
		System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar");
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossível sacar");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if ("CC".equals(this.getTipo())) {
			v = 12;
		} else if ("CP".equals(this.getTipo())){
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar");
		}
	}

	public ContaBanco() {
		super();
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean s) {
		this.status = s;
	}
	
}



