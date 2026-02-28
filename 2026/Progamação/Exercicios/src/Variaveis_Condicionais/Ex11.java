package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * 11. Crie um programa que leia do usuário um número inteiro e imprima o seu sucessor e seu
		antecessor.
		 */

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Sucessor: " + (n+1));
		System.out.println("Antecessor: " + (n-1));
		
		leitor.close();
	}

}
