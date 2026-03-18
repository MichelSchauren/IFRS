package Exemplos;

public class ExemploMatematica {

	public static void main(String[] args) {
		double p = Math.pow(2, 3); // potenciação
		System.out.println(p);
		
		double v1 = 3.3, v2 = 3.8;
		
		System.out.println(Math.round(v1));
		System.out.println(Math.round(v2));
		
		System.out.println(Math.ceil(v1));
		System.out.println(Math.ceil(v2));
		
		System.out.println(Math.floor(v1));
		System.out.println(Math.floor(v2));
		
		System.out.println(Math.PI);
		
		double maior = Math.max(v1, v2);
		double menor = Math.min(v1, v2);
		
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
	}

}
