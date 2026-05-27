package exemplos;

public class Pessoa {
	// Atributos
	// Caracterizam a classe e determinam  estado
	public String nome = "Jane";
	public String sobrenome = "Doe";
	public int idade = 0;
	public Endereco endereco;
	
	// Método construtor
	/*public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}*/
	
	// Métodos
	// Comportamento da classe (ação)
	public void dizerOla() {
		System.out.printf("%s %s falou Olá!\n", this.nome, this.sobrenome);
	}
	
	public String getOla() {
		return this.nome + " " + this.sobrenome + " falou olá!\n";
	}
	
	public void falar(String frase) {
		System.out.printf("%s %s falou %s\n", this.nome, this.sobrenome, frase);
	}
	
	public int realizarSoma(int n1, int n2) {
		int soma = n1 + n2;
		if (this.nome.equals("Ayrton")) {
			soma++;
		}
		return soma;
	}
}
