package Estruturas_de_Controle;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 1. Crie um programa que compute o número médio de alunos por turma. Para tal, leia do teclado o
		número de turmas e o número de alunos em cada turma. Nenhuma turma pode ter mais de 32
		alunos! Se o usuário informar que uma turma tem mais de 32 alunos, pergunte novamente
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de turmas: ");
		int turmas = Integer.parseInt(leitor.nextLine());
		double soma_alunos = 0;
		
		for (int i = 1; i <= turmas; i++) {
			System.out.print("Insira a quantidade de alunos da turma " + i + ": ");
			
			int alunos = Integer.parseInt(leitor.nextLine());
			
			if (alunos > 32) {
				while (alunos > 32) {
					System.out.print("A turma não pode ter mais do que 32 alunos. Insira novamente: ");
					alunos = Integer.parseInt(leitor.nextLine());
				}
			}

			soma_alunos += alunos;
		}
		
		double media_alunos = soma_alunos/turmas;
		System.out.printf("A média de alunos por turma é %.2f \n", media_alunos);
		
		leitor.close();
		
	}

}
