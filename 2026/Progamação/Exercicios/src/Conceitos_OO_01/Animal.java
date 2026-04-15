package Conceitos_OO_01;

public class Animal {
	public String especie;
	public int idade;
	public boolean vivo;
	
	public void matarAnimal() {
		if (vivo) {
			vivo = false;
			System.out.printf("Um animal da espécie %s morreu aos %d\n\n", especie, idade);
		} else {
			System.out.println("O animal já está morto.");
		}
	}
}
