package exemplos;

public class Exemplo02 {

	public static void main(String[] args) {
		int num = 10;
		
		float f1 = num;
		double d1 = num;
		double frac = 3.14;
		int i1 = (int) frac;
		int i2 = (int) Math.floor(frac);
		int i3 = (int) Math.ceil(frac);
		
		System.out.println(f1);
		System.out.println(d1);
		System.out.printf("%d %d %d\n", i1, i2, i3);
	}

}
