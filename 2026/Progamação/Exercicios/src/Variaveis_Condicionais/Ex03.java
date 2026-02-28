package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 3. Faça um programa que leia 2 números inteiros do teclado e que imprima se os números são iguais
		ou diferentes. Caso sejam diferentes, imprima o maior deles apenas.
		 */

		Scanner leitor = new Scanner(System.in);
		
		int A = Integer.parseInt(leitor.nextLine());
		int B = Integer.parseInt(leitor.nextLine());
		
		if (A == B) {
			System.out.println("IGUAIS!");
		} else {
			System.out.println("DIFERENTES");
			
			System.out.println(Math.max(A, B));
		}
		
		leitor.close();
	}

}
