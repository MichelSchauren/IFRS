package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		String nome = "Ayrton";
		
		String cidade = new String("Feliz");
		
		char[] letras = {'I', 'F', 'R', 'S'};
		String instituto = new String(letras);
		
		System.out.println(nome);
		System.out.println(cidade);
		System.out.println(instituto);
		
		System.out.printf("%S %s %s", nome, cidade, instituto);
		
		
		System.out.println("\n-------------------------------------------\n");
		
		
		String inst = "Instituto Federal do Rio Grande do Sul";
		
		// split = separa partes de uma string
		
		String[] palavras = inst.split(" ");
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.println(palavras[i]);
		}
		
		
		System.out.println("\n-------------------------------------------\n");
		
		
		String frase = "TheXbookXisXonXtheXtable";
		String[] pfrase = frase.split("X");
		
		for (int i = 0; i < pfrase.length; i++) {
			System.out.println(pfrase[i]);
		}
 	}

}
