package Exercicios_String_Format;

public class exercicio {

	public static void main(String[] args) {
		// 1
		String pais = "Brasil";
		System.out.println(pais.substring(4, 5));
		
		// 2
		String cidade = "Bom Princípio";
		System.out.println(cidade.split(" ")[1]);
		
		// 3
		String nome = "Antonia MAria Moreira";
		System.out.println(nome.substring(0, 7));
		
		// 4
		System.out.printf("Cidade: %s - Pais: %s\n", cidade, pais);
		
		// 5
		double numero = 5345.19367566;
		System.out.printf("%.5f", numero);
	}

}
