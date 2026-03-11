package Estruturas_de_Controle;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		* 5. Crie um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
		Por exemplo, o fatorial de 3 é 6, ou seja, 3*2*1 = 6.
		Já, o fatorial de 4 é 24, ou seja, 4*3*2*1 = 24.
		E assim sucessivamente…

		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Número: ");
		int n = Integer.parseInt(leitor.nextLine());
		int result = n;
		
		while (n > 1) {
			n--;
			result *= n;
		}
		
		System.out.println("O FATORIAL é: " + result);
		
		leitor.close();
	}

}
