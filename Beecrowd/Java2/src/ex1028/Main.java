package ex1028;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static int calcMDC(int a, int b) {
		
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		
		return a;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);;
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(calcMDC(a, b));
		}
		
		sc.close();
	}

}
