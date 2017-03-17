
public class Estacionamento {
	
	private int nVagas;
	private int nVagasLivres;
	
	public Estacionamento(int nVagas, int nVagasLivres) {
		super();
		this.nVagas = nVagas;
		this.nVagasLivres = nVagasLivres;
	}

	public int getnVagas() {
		return nVagas;
	}

	public void setnVagas(int nVagas) {
		this.nVagas = nVagas;
	}

	public int getnVagasLivres() {
		return nVagasLivres;
	}

	public void setnVagasLivres(int nVagasLivres) {
		this.nVagasLivres = nVagasLivres;
	}

}
