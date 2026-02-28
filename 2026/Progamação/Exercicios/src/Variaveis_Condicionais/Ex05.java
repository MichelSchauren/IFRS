package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * 5. Faça um programa que calcule o aumento de um salário. Ele deve ler do teclado o valor do salário
		e a porcentagem de aumento. Finalmente, imprima na tela o valor do salário, o percentual de
		aumento, o valor do aumento e o novo salário. 
		 */

		Scanner leitor = new Scanner(System.in);
		
		int salario = Integer.parseInt(leitor.nextLine());
		int porcentagem = Integer.parseInt(leitor.nextLine()); // porcentagem do aumento
		double percentual = porcentagem / 100.0;
		
		double aumento = salario*percentual;
		double novo_salario = salario + aumento;
		
		System.out.println("Salário: " + salario);
		System.out.println("Percentual de aumento: " + porcentagem + "%");
		System.out.println("Aumento: " + aumento);
		System.out.println("Novo salário: " + novo_salario);
		
		leitor.close();
	}

}