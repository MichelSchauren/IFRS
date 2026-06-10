package exemplo3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pet p = new Pet();
		
		System.out.print("Nome do pet: ");
		String np = sc.nextLine();
		p.setNome(np);
		
		System.out.print("Espécie do pet: ");
		String ep = sc.nextLine();
		p.setEspecie(ep);
		
		Dono d = new Dono();
		
		System.out.print("Nome do dono: ");
		String nd = sc.nextLine();
		d.setNome(nd);
		
		System.out.println("Endereço do dono: ");
		String ed = sc.nextLine();
		d.setEndereco(ed);
		
		d.setPet(p);
		
		System.out.println("-------------------------");
		System.out.println(d.getNome());
		System.out.println(d.getEndereco());
		System.out.println(d.getPet().getNome());
		System.out.println(d.getPet().getEspecie());
		
		sc.close();
	}
}
