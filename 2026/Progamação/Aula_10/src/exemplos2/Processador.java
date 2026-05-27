package exemplos2;

public class Processador {
	public String modelo;
	public String n_nucleos;
	public String velocidade;
	public String threads;
	
	public Processador(String modelo, String n_nucleos, String velocidade, String threads) {
		this.modelo = modelo;
		this.n_nucleos = n_nucleos;
		this.velocidade = velocidade;
		this.threads = threads;
	}
}
