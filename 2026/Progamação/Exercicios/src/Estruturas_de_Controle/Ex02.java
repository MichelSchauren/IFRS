package Estruturas_de_Controle;

import java.util.Scanner;

public class Ex02 {
	public static boolean eh_primo(int n) {
		if (n < 2) {
			return false;
		} else {
			double raiz = Math.sqrt(n);
			for (int i = 2; i <= raiz; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	} 
	
	public static void main(String[] args) {
		/*
		 * 2. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
		Um número primo é aquele que é divisível somente por ele mesmo e por 1.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira um número natural: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		if (eh_primo(n)) {
			System.out.println("É primo!");
		} else {
			System.out.println("Não é primo!");
		}
		
		leitor.close();
	}
}
