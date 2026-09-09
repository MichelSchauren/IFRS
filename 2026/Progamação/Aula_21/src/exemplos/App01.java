package exemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class App01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Campus> lista = new ArrayList<Campus>();
		
		int opcao = 0;
		do {
			System.out.println("---------------");
			System.out.println("[1] Adicionar");
			System.out.println("[2] Listar");
			System.out.println("[3] Sair");
			System.out.print("Informe uma opção: ");
			opcao = Integer.parseInt(sc.nextLine());
			
			switch (opcao) {
				case 1:
					System.out.print("Nome do diretor: ");
					String nd = sc.nextLine();
					System.out.print("Área do diretor: ");
					String ad = sc.nextLine();
					
					System.out.print("Nome do campus: ");
					String nc = sc.nextLine();
					System.out.println("Endereco do campus: ");
					String ec = sc.nextLine();
					
					lista.add(new Campus(nc, ec, new Diretor(nd, ad))); // Adicionar à lista
					break;
				case 2:
					for (int i = 0; i < lista.size(); i++) {
						Campus camp = lista.get(i);
						System.out.println(camp.getNome());
						System.out.println(camp.getEndereco());
						System.out.println(camp.getDiretor().getNome());
						System.out.println(camp.getDiretor().getArea());
					}
					break;
				case 3:
					break;
				default:
					System.out.println("Opção inválida!");
			}
		} while (opcao != 3);
	}
}
