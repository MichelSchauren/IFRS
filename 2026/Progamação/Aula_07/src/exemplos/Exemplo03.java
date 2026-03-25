package exemplos;

import java.util.Random;

public class Exemplo03 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int intR = r.nextInt(100);
		
		System.out.println(intR);
		
		// Faça 10 lançamentos
		int caras = 0, coroas = 0;
		
		for (int i = 0; i < 100000; i++) {
			int lancamento = r.nextInt(2);
			
			if (lancamento == 0) caras++; else coroas++;
		}
		
		System.out.printf("Caras: %d\nCoroas: %d\n", caras, coroas);
	}

}
