package Ex02;

import java.util.Scanner;

/*
 * 2. Considere as seguintes classes:
a) Carro, contendo 4 rodas e 1 motor;
b) Roda, contendo o seu tamanho (ex: 14, 15, 16 … 20);
c) Motor, contendo o número de cilindros e a potência (ex: 8 ciclindros e 200 cv).
Associe as classes para construir a classe Carro.
Crie pelo menos 3 objetos desta classe, usando dados lidos do usuário via teclado.
*/

public class Main {

	public static void main(String[] args) {
		/*
		Roda roda16 = new Roda();
		roda16.tamanho = "16";
		
		Motor motor1 = new Motor();
		motor1.cilindros = "8";
		motor1.potencia = "200 cv";
		
		Carro c1 = new Carro();
		c1.rodas = new Roda[4];
		c1.motor = motor1;
		*/
		
		Scanner sc = new Scanner(System.in);
		
		Roda roda = new Roda();
		System.out.print("Roda: ");
		roda.tamanho = sc.nextLine();
		
		Motor motor = new Motor();
		System.out.println("Motor:");
		System.out.print("Cilindros: ");
		motor.cilindros = sc.nextLine();
		System.out.println("Potência: ");
		motor.potencia = sc.nextLine();
	}

}
