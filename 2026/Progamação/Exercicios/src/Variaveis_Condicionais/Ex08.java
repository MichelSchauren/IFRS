package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 8. Modifique o programa do exercício anterior usando condições if e else.
		Para este exercício você deve utilizar if e else if.
		 */

		Scanner leitor = new Scanner(System.in);
		
		double salario = Integer.parseInt(leitor.nextLine());
		double p_aumento = 0.1;
		
		if (salario <= 1000) {
			p_aumento = 0.2;
		}
		else if (salario <= 2000) {
			p_aumento = 0.15;
		}
		
		double aumento = salario * p_aumento;
		System.out.println("Aumento: " + aumento);
		System.out.println("Novo salário: " + (salario + aumento));
		
		leitor.close();
	}

}
