package Exemplo03;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		p.setNome(nome);
		
		System.out.println("Idade: ");
		int idade = Integer.parseInt(sc.nextLine());
		p.setIdade(idade);
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + String.valueOf(p.getIdade()));
		
		sc.close();
	}

}
