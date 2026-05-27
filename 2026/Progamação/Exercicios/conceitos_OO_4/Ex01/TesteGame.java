package Ex01;

import java.util.Scanner;

public class TesteGame {
	/*
	 * Crie uma classe chamada Game que contenha 5 atributos escolhidos por você. Logo após, crie
		uma classe chamada TesteGame (contendo o método main) que faça as seguintes tarefas:
		a) Leia do teclado do usuário dados para criar um objeto da classe Game;
		b) Construa um objeto com os dados lidos;
		c) Imprima na tela os atributos do objeto.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game jogo = new Game();
		
		System.out.println("\n --- Vamos criar um novo jogo: --- ");
		
		System.out.print("Nome do jogo: ");
		jogo.nome = sc.nextLine();		
		System.out.print("Desenvolvedor: ");
		jogo.dev = sc.nextLine();
		System.out.println("Engine: ");
		jogo.engine = sc.nextLine();
		System.out.println("Quantidade de fases: ");
		jogo.fases = sc.nextLine();
		System.out.println("Versão do jogo: ");
		jogo.versao = sc.nextLine();
		
		System.out.println("Jogo CRIADO com sucesso!\n");
		
		sc.close();
	}
}
