
public class ControleRemoto implements Controlador {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int v) {
		this.volume = v;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean l) {
		this.ligado = l;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean t) {
		this.tocando = t;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
		
	

}
