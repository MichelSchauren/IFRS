package exemplos;

public class Pessoa {
	
	 public String nome;
	 public int idade;
	 public String endereco;
	 public boolean vivo;
	 
	 public void falar() {
		 if (vivo) {
			 System.out.printf("Meu nome é %s e tenho %d anos de idade.", nome, idade);
		 }
	 }
}
