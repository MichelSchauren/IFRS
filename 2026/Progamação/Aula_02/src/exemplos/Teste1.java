package exemplos;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("tifo");
		}
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos tifo deu? ");
		int tifos = leitor.nextInt();		
		System.out.println(tifos + " tifo deu!");
	}

}
