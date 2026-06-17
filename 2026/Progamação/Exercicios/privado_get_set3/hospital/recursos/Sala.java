package hospital.recursos;

public class Sala {
	private String numero;
	private String capacidade;
	
	public Sala(String numero, String capacidade) {
		super();
		this.numero = numero;
		this.capacidade = capacidade;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
}
