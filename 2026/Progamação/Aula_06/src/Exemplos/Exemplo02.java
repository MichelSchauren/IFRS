package Exemplos;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de elementos: ");
		int[] numeros = new int[sc.nextInt()];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Informe o %dº valor: ", i+1);
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("----------------");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		sc.close();
	}
}
