package ex1021;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static final int[] Notas = {10000, 5000, 2000, 1000, 500, 200};
	public static final int[] Moedas = {100, 50, 25, 10, 5, 1};

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		int valor = (int) Math.round(n*100);
		
		System.out.println("NOTAS:");
		for (int i = 0; i < Notas.length; i++) {
			int quant_notas = 0;
			int nota = Notas[i];
			
			while (valor >= nota) {
				valor -= nota;
				quant_notas++;
			}
			
			System.out.printf("%d nota(s) de R$ %.2f\n", quant_notas, nota/100.0);
		}
		
		System.out.println("MOEDAS:");
		for (int i = 0; i < Moedas.length; i++) {
			int quant_coin = 0;
			int coin = Moedas[i];
			
			while (valor >= coin) {
				valor -= coin;
				quant_coin++;
			}
			
			System.out.printf("%d moeda(s) de R$ %.2f\n", quant_coin, coin/100.0);
		}
		
		sc.close();
		
	}

}

