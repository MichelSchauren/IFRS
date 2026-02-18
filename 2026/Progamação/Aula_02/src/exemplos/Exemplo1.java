package exemplos;

import java.util.Scanner;

public class Exemplo1 {
	
	public static void main(String[] args) {
		
		// comentário de uma linha
		/* 
		 * comentário
		 * multiplas
		 * linhas
		 */
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.print("Olá");
		System.out.println(" Mundo");
		System.out.println();
	}
}
