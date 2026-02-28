package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 2. Escreva um programa que l� um n�mero do teclado e que determine se ele � par ou impar.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int Num = Integer.parseInt(leitor.nextLine());
		
		if (Num % 2 == 0) {
			System.out.println("� PAR!");
		} else {
			System.out.println("� �MPAR");
		}
		
		leitor.close();
	}

}
