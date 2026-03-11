package Estruturas_de_Controle;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		* 6. Escreva um aplicativo que localize o menor e o maior de vários inteiros informados pelo usuário.
		Suponha que o primeiro valor lido corresponde ao número de valores a serem digitados pelo
		usuário na sequência (por exemplo, se o primeiro número digitado for 5, serão lidos 5 números na
		sequência, sendo que o seu programa deve indicar o maior e o menor desses 5 números).
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int r = Integer.parseInt(leitor.nextLine());
		int n = 0;
		int menor = 0;
		int maior = 0;
		
		for (int i = 0; i < r; i++) {
			n = Integer.parseInt(leitor.nextLine());
			if (n < menor || i == 0) {
				menor = n;
			}
			if (n > maior || i == 0) {
				maior = n;
			}
		}
		
		System.out.println("MENOR: " + menor);
		System.out.println("MAIOR: " + maior);
		
		leitor.close();
	}

}
