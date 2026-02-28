package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/*
		 * 9. Escreva um programa que leia 4 números do teclado e imprima a média, o maior e o menor deles.
		 */

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite 4 números inteiros: ");
		int a = Integer.parseInt(leitor.nextLine());
		int b = Integer.parseInt(leitor.nextLine());
		int c = Integer.parseInt(leitor.nextLine());
		int d = Integer.parseInt(leitor.nextLine());
		
		double media = (a + b + c + d) / 4.0;
		int maior = Math.max(Math.max(a, b), Math.max(c, d));
		int menor = Math.min(Math.min(a, b), Math.min(c, d));
		
		System.out.println("Média: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		leitor.close();
	}

}
