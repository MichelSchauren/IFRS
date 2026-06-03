package Exemplo02;

public class Main {

	public static void main(String[] args) {
		
		Diretor d1 = new Diretor();
		d1.nome = "Ayrton";
		d1.cargo = "diretor";
		
		Campus c1 = new Campus();
		c1.nome = "Feliz";
		c1.diretor = d1;
		
		Instituto inst = new Instituto();
		inst.nome = "IFRS";
		inst.campus = c1;
		
		//-----------------------
		
		System.out.println("Instituto: " + inst.nome);
		System.out.println("Campus: " + inst.campus.nome);
		System.out.println("Diretor: " + inst.campus.diretor.nome);
		System.out.println("Cargo do diretor: " + inst.campus.diretor.cargo);
	}

}
