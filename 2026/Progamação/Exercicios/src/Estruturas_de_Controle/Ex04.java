package Estruturas_de_Controle;

public class Ex04 {

	public static void main(String[] args) {
		/*
		* 4. Crie um programa que gere a série até que o valor seja maior que 500.
		A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,...
		 */
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println(n1);
		System.out.println(n2);
		
		while (n2 <= 500) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}

}
