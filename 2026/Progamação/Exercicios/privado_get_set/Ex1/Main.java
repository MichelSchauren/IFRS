package Ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1. Crie uma classe para cada um dos itens abaixo, incluindo 2 atributos privados e métodos get/set
		a) Animal
		b) Curso
		c) Smartphone
		d) Filme
		e) Canal (do Youtube)
		f) Casa
		g) Curso
		h) Empresa
		i) Computador
		
		2. Crie um objeto de cada classe do exercício anterior.
		Leia os dados do teclado e use o método set para alterar o valor dos atributos.
		Finalmente, imprima os valores usando os métodos get.
		*/

		// aaaaaaaaa
		
		Scanner sc = new Scanner(System.in);
		
		Animal animal = new Animal();
		
		System.out.println("Espécie do animal: ");
		String eAnimal = sc.nextLine();
		animal.setEspecie(eAnimal);
		
		System.out.println("Idade do animal: ");
		int iAnimal = Integer.parseInt(sc.nextLine());
		animal.setIdade(iAnimal);
		
		System.out.println("-------------");
		System.out.println("Espécie do animal: " + animal.getEspecie());
		System.out.println("Idade do animal: " + String.valueOf(animal.getIdade()));
	}

}
