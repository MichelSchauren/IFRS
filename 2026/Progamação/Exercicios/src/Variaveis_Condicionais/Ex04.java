package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 4. Crie um programa que calcule e mostre o volume de uma esfera. O raio da esfera será fornecido
		pelo usuário através do teclado (tipo de dado double). Pesquisa a fórmula para cálcule de volume
		da esfera e considere para PI o valor 3.14159 (tipo de dado double).
		 */

		Scanner leitor = new Scanner(System.in);
		
		final double PI = 3.14159;
		int raio = Integer.parseInt(leitor.nextLine());
		
		double volume = 4/3 * PI * raio * raio * raio;
		
		System.out.println(volume);
		
		leitor.close();
	}

}
