package exemplos;

public class Campus {
	private String nome;
	private String endereco;
	private Diretor diretor;
	
	
	public Campus(String nome, String endereco, Diretor diretor) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.diretor = diretor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public Diretor getDiretor() {
		return diretor;
	}


	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	
	
}
