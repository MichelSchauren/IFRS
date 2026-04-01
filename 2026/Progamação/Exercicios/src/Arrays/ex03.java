package Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		/*3. Crie um programa que leia do teclado 5 números double, os quais devem ser armazenados no
		array. Finalmente, imprima a média dos valores na tela.
		*/
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		double[] numeros = new double[5];
		
		System.out.println("Forneça 5 valores racionais: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextDouble();
		}
		
		System.out.printf("Valores armazenados: %s\n", Arrays.toString(numeros));
		
		sc.close();
	}

}
