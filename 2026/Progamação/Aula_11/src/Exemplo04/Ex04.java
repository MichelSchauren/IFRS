package Exemplo04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro c = new Carro();
		
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		c.setModelo(modelo);
		
		System.out.println("Potencia: ");
		int pot = Integer.parseInt(sc.nextLine());
		c.setPotencia(pot);
		
		System.out.println("Valor: ");
		double val = Double.parseDouble(sc.nextLine());
		c.setValor(val);
		
		System.out.println("--------------");
		System.out.println(c.getModelo());
		System.out.println(c.getPotencia());
		System.out.println(c.getValor());
	}
}
