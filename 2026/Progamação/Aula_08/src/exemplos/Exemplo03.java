package exemplos;

public class Exemplo03 {

	public static void main(String[] args) {
		String palavra = "Processador Ryzen";
		
		String subpalavra = palavra.substring(0, 10);
		
		System.out.println(palavra);
		System.out.println(subpalavra);
		System.out.println(palavra.toLowerCase());
		
		char[] letras = palavra.toCharArray();
		System.out.println(letras);
		
		String cidade = "	Feliz     ";
		System.out.println(cidade.trim());
	}

}
