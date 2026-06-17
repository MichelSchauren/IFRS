package jogo;

import java.util.Scanner;

import jogo.outras.Bola;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Bola
		System.out.print("Marca da bola: ");
		String mbola = sc.nextLine();
		
		Bola bola = new Bola();
		bola.setMarca(mbola);
		
		// Quadra
		System.out.print("Largura quadra: ");
		String lquadra = sc.nextLine();
		
		System.out.print("Comprimento quadra: ");
		String cquadra = sc.nextLine();
		
		//Bola quadra = new Quadra();
	}
}
