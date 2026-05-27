package Ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Filme criarFilme(Scanner sc) {
		Filme filme = new Filme();
		Cidade cidade = new Cidade();
		Diretor diretor = new Diretor();
		
		System.out.println("Responda questões sobre o filme:");
		
		System.out.print("Estado: ");
		cidade.estado = sc.nextLine();
		
		System.out.print("País: ");
		cidade.pais = sc.nextLine();
		
		System.out.print("Nome da cidade: ");
		cidade.nome = sc.nextLine();
		
		System.out.print("Quantidade de habitantes: ");
		cidade.habitantes = sc.nextLine();
		
		System.out.print("Nome do diretor: ");
		diretor.nome = sc.nextLine();
		
		System.out.print("Sobrenome do dirtetor: ");
		diretor.sobrenome = sc.nextLine();
		
		System.out.print("Quantidade de premios ganhos pelo diretor: ");
		diretor.n_premios = sc.nextLine();
		
		filme.cidade = cidade;
		filme.diretor = diretor;
		return filme;
	}

	public static void main(String[] args) {
		/*
		 * 3. Considere as seguintes classes:
			a) Filme, contendo um diretor e uma cidade principal onde foi filmado;
			b) Diretor, contendo o seu nome, sobrenome e número de prêmios;
			c) Cidade, contendo seu nome, país, estado e número de habitantes.
			Associe as classes para construir a classe Filme.
			Crie pelo menos 3 objetos desta classe, usando dados lidos do usuário via teclado.
		 */
		
		Cidade c1 = new Cidade();
		c1.pais = "EUA";
		c1.estado = "Pensilvania";
		c1.nome = "Nova York";
		c1.habitantes = "8,8 milhões";
		
		Diretor d1 = new Diretor();
		d1.nome = "Joe e Anthony";
		d1.sobrenome = "Russo";
		d1.n_premios = "5";
		
		Filme avengers = new Filme();
		avengers.cidade = c1;
		avengers.diretor = d1;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Filme> filmes = new ArrayList<>();
		
		// Usuário monta objetos
		while (true) {
			System.out.println("Oque você deseja fazer?");
			System.out.println("C - criar novo filme");
			System.out.println("V - ver filmes criados");
			System.out.println("S - Sair / encerrar programa!");
			
			String acao = sc.nextLine().toUpperCase();
			
			if (acao.equals("C")) {
				Filme f = criarFilme(sc);
				filmes.add(f);
				
			} else if (acao.equals("V")) {
				for (int i = 0; i < filmes.size(); i++) {
					Filme f = filmes.get(i);
					System.out.println("\n----- Filme " + String.valueOf(i) + " -----");
					f.mostrarDados();
				}
				
			} else if (acao.equals("S")) {
				System.out.println("Programa encerrado!");
				return;
			} else {
				System.out.println("Ação não reconhecida!");
			}
		}
	}

}
