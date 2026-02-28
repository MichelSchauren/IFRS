package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * 12. Crie um programa que leia 6 números double. Logo após calcule a média aritmética dos 3 primeiros
		e a média aritmética dos 3 últimos. Imprima a soma das médias, e a média das médias.
		 */

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite 6 números: ");
		int[] nums = new int[6];
		
		for (int i = 0; i < 6; i++) {
			nums[i] = Integer.parseInt(leitor.nextLine());
		}
		
		double media1 = (nums[0] + nums[1] + nums[2]) / 3;
		double media2 = (nums[3] + nums[4] + nums[5]) / 3;
		double soma_medias = media1 + media2;
		double media_geral = soma_medias / 2;
		
		System.out.println("Soma das médias: " + soma_medias);
		System.out.println("Média das médias: " + media_geral);
		
		leitor.close();
	}

}
