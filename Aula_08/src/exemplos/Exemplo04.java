package exemplos;

import java.util.Locale;

public class Exemplo04 {
	public static void main(String[] args) {
		// números inteiros -> byte, short, int, long -> %d
		// números flutuantes -> float, double -> %f
		Locale.setDefault(Locale.US); // , = .
		
		int num1 = 10;
		long num2 = 123456789;
		
		System.out.printf("Valor int = %d\n", num1);
		System.out.printf("VAlor long = %d\n", num2);
		
		float num3 = 3.14159f;
		double num4 = 1234.111111;
		
		System.out.printf("Valor float %f\n", num3);
		System.out.printf("Valor double = %.2f\n", num4);
		
		char letra = 'a';
		boolean flag = true;
		
		System.out.printf("Char = %c e Boolean = %b\n", letra, flag);
	}
}
