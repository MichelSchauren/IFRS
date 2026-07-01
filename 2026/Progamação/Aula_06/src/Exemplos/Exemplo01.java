package Exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		//int i1 = 10;
		//int i2 = 20;
		
		int[] intArray = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] *= 2;
			System.out.println(intArray[i]);
		}
	}

}
