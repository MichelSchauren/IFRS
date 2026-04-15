package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		Computador c1 = new Computador();
		c1.ram = 16;
		c1.placaMae = "Asus Rog Strix";
		c1.processador = "Ryzen 7800x3d";
		c1.ligado = true;
		
		Computador c2 = new Computador();
		c1.ram = 32;
		c1.placaMae = "Gigabyte";
		c1.processador = "Intel i5";
		c1.ligado = false;
		
		System.out.println(c1.ram);
		System.out.println(c1.placaMae);
		System.out.println(c1.processador);
		System.out.println(c1.ligado);
		System.out.println(c1);
		
		
		Pessoa aluno = new Pessoa();
		aluno.nome = "Ayrton";
		aluno.idade = 16;
		aluno.endereco = "na frenti do IF";
		aluno.vivo = true;
		
		System.out.println(aluno.nome);
		System.out.println(aluno.idade);
		System.out.println(aluno.endereco);
		System.out.println(aluno.vivo);
		aluno.falar();
		
	}

}
