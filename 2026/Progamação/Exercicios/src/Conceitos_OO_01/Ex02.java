package Conceitos_OO_01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Curso c1 = new Curso();
		
		System.out.println("Vamos criar um novo curso: ");
		
		System.out.print("Area do curso: ");
		c1.area = sc.nextLine();
		
		System.out.print("Instituto: ");
		c1.instituto = sc.nextLine();
		
		System.out.print("Professor: ");
		c1.professor = sc.nextLine();
		
	}

}
