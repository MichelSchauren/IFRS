package Ex1;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bicicleta b = new Bicicleta();
		
		System.out.print("Cor: ");
		String bc = sc.nextLine();
		b.setCor(bc);
		
		System.out.print("Nome: ");
		String bn = sc.nextLine();
		b.setNome(bn);
		
		System.out.print("Aro: ");
		int ba = Integer.parseInt(sc.nextLine());
		b.setAro(ba);
		
		sc.close();
		
		System.out.println("---------------");
		System.out.println("Cor: " + b.getCor());
		System.out.println("Nome: " + b.getNome());
		System.out.println("Aro: " + String.valueOf(b.getAro()));
	}
}
