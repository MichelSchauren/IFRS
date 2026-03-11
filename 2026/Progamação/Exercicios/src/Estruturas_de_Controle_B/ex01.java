package Estruturas_de_Controle_B;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		/*
		 * 1. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome
		do usuário, mostrando uma mensagem de erro e voltando a pedir as informações. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Usuário: "); String nome = sc.nextLine();
		System.out.print("Senha: "); String senha = sc.nextLine();
		
		while (nome.equals(senha)) {
			System.out.println("ERRO! O nome de usuário não pode ser igual a senha");
			System.out.print("Usuário: "); nome = sc.nextLine();
			System.out.print("Senha: "); senha = sc.nextLine();
		}
		
		System.out.printf("Bem Vindo %s!\n", nome);
		
		sc.close();
	}

}
