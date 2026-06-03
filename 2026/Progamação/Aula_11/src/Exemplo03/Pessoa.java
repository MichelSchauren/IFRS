package Exemplo03;

public class Pessoa {
	private String nome;
	private int idade;
	
	// get nome
	public String getNome() {
		return this.nome;
	}
	
	// set nome
	public void setNome(String nome) {
		if (nome.length() >= 2) {
			this.nome = nome;
		} else {
			System.out.println("Tenque ser maior do q 2 cabaço");
		}
	}
	
	// get idade
	public int getIdade() {
		return this.idade;
	}
	
	// set idade
	public void setIdade(int idade) {
		if (idade >= 16) {
			this.idade = idade;
		} else {
			System.out.println("Não pode! Não deixo.");
		}
	}
}
