package Variaveis_Condicionais;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 6. Escreva um programa que solicite as seguintes informações sobre uma viagem: quilometragem
		inicial do carro, quilometragem do carro após a viagem e o número de litros de combustível
		consumidos. Com base nessas informações calcule a média de consumo do carro por litro e
		imprima na tela. 
		 */

		Scanner leitor = new Scanner(System.in);
		
		double k_init = Integer.parseInt(leitor.nextLine());
		double k_end = Integer.parseInt(leitor.nextLine());
		double litros = Integer.parseInt(leitor.nextLine());
		
		double k_trip = k_end - k_init;
		double consumo = litros / k_trip;
		
		System.out.println(consumo + " litros por kilômetro.");
		
		leitor.close();
	}

}