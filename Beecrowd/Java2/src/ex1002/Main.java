package ex1002;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		
		double raio = leitor.nextDouble();
		double area = PI * raio * raio;
		
		System.out.printf("A=%.4f\n", area);
		
		leitor.close();

	}

}
