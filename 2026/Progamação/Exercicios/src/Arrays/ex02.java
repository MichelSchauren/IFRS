package Arrays;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		/*
		 * 2. Crie um programa que leia do teclado 5 números double, os quais devem ser armazenados no
		array. Finalmente, imprima a soma dos valores na tela.
		 */
		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[5];
		double soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
