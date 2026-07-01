package ex2;

public class Exercicio2 {

	public static void main(String[] args) {
		Computador c1 = new Computador();
		Computador c2 = new Computador("Gigabyte B550m", 8, true);
		
		System.out.printf("O pc 1 tem uma %s e %d de RAM.", c1.getPlacaMae(), c1.getRam());
		System.out.printf("O pc 2 tem uma %s e %d de RAM.", c2.getPlacaMae(), c2.getRam());
	}

}
