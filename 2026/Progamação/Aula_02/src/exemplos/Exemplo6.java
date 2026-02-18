package exemplos;

import java.util.Scanner;

public class Exemplo6 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int a, b;
		System.out.println("Min da numero: ");
		a = Integer.parseInt(leitor.nextLine());
		System.out.println("Min da oto:");
		b = Integer.parseInt(leitor.nextLine());;
		
		if (a < b) {
			System.out.println("A é Minó q B");
		} else if (a > b) {
			System.out.println("A é Maió q B");
		} else {
			System.out.println("É tudo Ingual");
		}
		
		leitor.close();
	}
}
