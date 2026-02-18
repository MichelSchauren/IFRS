package exemplos;

public class Exemplo3 {
	public static void main(String[] args) {
		
		// FLUTUANTES
		
		// 32 bits
		float f1 = 3.14f;
		f1 -= 2;
		System.out.println(f1);
		
		// 64 bits
		double d1 = 3.1415;
		d1 -= 2;
		System.out.println(d1);
		
		// BOLEANO
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		// CHAR
		char c1 = 65;
		char c2 = 'a';
		System.out.println(c1 + " " + c2);
		
		// STRING (é uma classe, não é um tipo de dado primitivo)
		String MyString = "str";
		System.out.println(MyString);
	}
}
