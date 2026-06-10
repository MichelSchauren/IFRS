package exemplos2;

public class Computador {
	private String processador;
	private String placaMae;
	private int ram;
	private int ssd;
	private String marcaDaPastaTermica;
	private int potenciaFonte;
	private boolean ligado;
	
	
	
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
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
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public String getMarcaDaPastaTermica() {
		return marcaDaPastaTermica;
	}
	public void setMarcaDaPastaTermica(String marcaDaPastaTermica) {
		this.marcaDaPastaTermica = marcaDaPastaTermica;
	}
	public int getPotenciaFonte() {
		return potenciaFonte;
	}
	public void setPotenciaFonte(int potenciaFonte) {
		this.potenciaFonte = potenciaFonte;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}
