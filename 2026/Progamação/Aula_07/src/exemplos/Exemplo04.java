package exemplos;

import java.util.Random;

public class Exemplo04 {

	public static void main(String[] args) {
		// Simule 100000 lançamentos de um dado de 6 faces
		
		Random r = new Random();
		
		int[] contagens = new int[6];
		
		for (int i = 0; i < 100000; i++) {
			int sorteio = r.nextInt(6);
			
			contagens[sorteio]++;
		}
		
		for (int i = 0; i < contagens.length; i++) {
			System.out.printf("%dº face: %d\n", i+1, contagens[i]);
		}
	}

}
