package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Endereco e1 = new Endereco("Rua das Oliveiras", "123", "Floresta", "Porto Alegre", "RS");
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Ayrton";
		p1.sobrenome = "Oliveira Manhães";
		p1.idade = 16;
		p1.endereco = e1;
	
		Pessoa p2 = new Pessoa();
		p2.nome = "Ayrton";
		p2.sobrenome = "Oliveira Manhães";
		p2.idade = 16;
		
		Pessoa chap = new Pessoa();
		chap.nome = "Chapolin";
		chap.sobrenome = "Colorado";
		chap.idade = 67;
		
		// ----------------------------
		
		p1.dizerOla();
		
		String ola = chap.getOla();
		System.out.println(ola);
		
		int a = 2;
		int b = 1;
		String frase = String.format("%d + %d é %d. Não sei matemática. Sou um betinha!", a, b, p2.realizarSoma(a, b));
		p2.falar(frase);
		
		// ----
		
		
	}
}
