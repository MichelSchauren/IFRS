package Estruturas_de_Controle;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		* 3. Desenvolva um programa para uma loja de tintas. Inicialmente, o programa deverá pedir o tamanho
		em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para
		cada 3 metros quadrados e que a tinta é vendida em latas de 10 litros, que custam R$50. Informe
		ao usuário a quantidade de latas de tinta necessária para pintar a área e o preço total.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira quantos metros quadrados da área a ser pintada: ");
		int area = Integer.parseInt(leitor.nextLine());
		double litros = area / 3;
		int latas = (int) (1 + (litros / 10));
		double preco = latas * 50.0;
		
		System.out.println("Você vai precisar de: ");
		System.out.println("Latas: " + latas);
		System.out.printf("Preço: R$%.2f%n", preco);
		
		leitor.close();
	}

}
