package exemplo4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Prefeito p = new Prefeito();
		
		System.out.print("Nome do prefeito: ");
		String np = sc.nextLine();
		p.setNome(np);
		
		System.out.print("Partido do prefeito: ");
		String pp = sc.nextLine();
		p.setPartido(pp);
		
		Cidade c = new Cidade();
		
		System.out.print("Nome do Cidade: ");
		String nc = sc.nextLine();
		c.setNome(nc);
		
		c.setPrefeito(p);
		
		System.out.println("-------------------------");
		System.out.println(c.getNome());
		System.out.println(c.getPrefeito().getNome());
		System.out.println(c.getPrefeito().getPartido());
		
		sc.close();
	}

}
