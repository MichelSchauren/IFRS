package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		// {'I', 'r', 'o', 'n', ' ', ...}
		String banda = "Iron Maiden";
		
		System.out.println(banda.length());
		
		for (int i = 0; i < banda.length(); i++) {
			System.out.print(banda.charAt(i));
		}
		System.out.println("\n");
		
		// O operador + é uma operação aritmética nesse caso
		int i1 = 10;
		int i2 = 20;
		System.out.println(i1 + i2);
		
		// concatenação
		System.out.println("Soma = " + i1 + i2); // ?
		System.out.println("Soma = " + (i1 + i2));
	}

}
