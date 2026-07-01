package exemplos;

public class Computador {
	private String placaMae;
	private int ram;
	private boolean ligado;
	
	
	public Computador(String placaMae, int ram, boolean ligado) {
		super();
		this.placaMae = placaMae;
		this.ram = ram;
		this.ligado = ligado;
	}


	public String getPlacaMae() {
		return placaMae;
	}


	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
}
