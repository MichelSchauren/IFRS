package ex1138;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = -1, b = -1;
		int[] digits = new int[10];
		
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if ((a == 0 & b == 0) || b < a) break;
			
			Arrays.fill(digits, 0);
			
			for (int j = 1; j <= b; j*=10) {
				int aj = a/j; int bj = b/j;
				int d = (bj-aj)/10;
				int r = (bj-aj)%10;
				int ah = (a - (a/(j*10))*j*10) / j;
				
				for (int i = 0; i < 10; i++) {
					digits[i] += d*j;
				}
				
				for (int i = ah; i <= ah+r; i++) {
					if (i == 0) { 
						continue;
					} else if (i == ah && i == ah+r) {
						digits[i%10] += b%j - a%j +1;
					} else if (i == ah) {
						digits[i%10] += j - a%j;
					} else if (i == ah+r) {
						digits[i%10] += b%j +1;
					} else {
						digits[i%10] += j;
					}
				}
			}
			
			String resultado = Arrays.stream(digits)           // 1. Transforma o vetor em um Stream
				    .mapToObj(String::valueOf)                    // 2. Converte cada int para String
				    .collect(Collectors.joining(" "));
			
			System.out.println(resultado);
		}
		
		sc.close();
	}

}
