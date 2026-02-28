package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 * 7. Escreva um programa que pergunte o salário do funcionário e calcule o valor do aumento. Para
		salários até R$1.000,00 calcule um aumento de 20%. Para salários maiores que R$1.000,00 até
		R$2.000,00 calcule 15% de aumento, e por fim, para salários maiores que R$2.000,00 calcule 10%
		de aumento. Para este exercício você deve utilizar apenas if (não utilizar o else).
		 */

		Scanner leitor = new Scanner(System.in);
		
		double salario = Integer.parseInt(leitor.nextLine());
		double p_aumento = 0.1;
		
		if (salario <= 1000) {
			p_aumento = 0.2;
		}
		if (salario > 1000 && salario <= 2000) {
			p_aumento = 0.15;
		}
		
		double aumento = salario * p_aumento;
		System.out.println("Aumento: " + aumento);
		System.out.println("Novo salário: " + (salario + aumento));
		
		leitor.close();
	}

}
