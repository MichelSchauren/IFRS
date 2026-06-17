package Ex2;

public class Veiculo {
	private String modelo;
	private int ano;
	private double preco;
	private Concessionaria concenssionaria;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Concessionaria getConcenssionaria() {
		return concenssionaria;
	}
	public void setConcenssionaria(Concessionaria concenssionaria) {
		this.concenssionaria = concenssionaria;
	}
}
