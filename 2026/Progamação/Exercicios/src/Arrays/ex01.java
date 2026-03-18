package Arrays;

public class ex01 {

	public static void main(String[] args) {
		/*
		 * 1. Crie um programa Java que contenha um array de 10 números criados por você.
		Imprima na tela os valores do array precedidos pelo seu respectivo índice.
		 */

		int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Indice %d: %d\n", i, numeros[i]);
		}
	}

}
