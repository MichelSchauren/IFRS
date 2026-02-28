package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex01 {
	/*
	 *  1. Faça um programa que leia 2 números inteiros do teclado e que imprima na tela a soma,
	 * substração, multiplicação, divisão e resto da divisão desses dois números.
	*/
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int A = Integer.parseInt(leitor.nextLine());
		int B = Integer.parseInt(leitor.nextLine());
		
		int som = A + B;
		int sub = A - B;
		int mult = A * B;
		int div = A / B;
		int rest = A % B;
		
		System.out.println(som);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		System.out.println(rest);
		
		leitor.close();
	}
}
