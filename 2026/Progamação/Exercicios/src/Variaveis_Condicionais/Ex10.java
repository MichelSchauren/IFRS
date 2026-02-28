package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * 10. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a
		quantidade de salários mínimos esse usuário ganha e imprima o resultado.
		 */

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Salário mínimo: ");
		double sal_minimo = Integer.parseInt(leitor.nextLine());
		System.out.println("Seu salário: ");
		double salario = Integer.parseInt(leitor.nextLine());
		
		int sals_minimos = (int) (salario / sal_minimo);
		
		System.out.println("Você recebe " + sals_minimos + " salários mínimos.");
		
		leitor.close();
	}

}
