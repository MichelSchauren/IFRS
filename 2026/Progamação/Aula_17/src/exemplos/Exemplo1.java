package exemplos;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Maria", 18);
		Pessoa p2 = new Pessoa();
		Aluno a = new Aluno("Ayrton", 16, 2);
		
		System.out.printf("%s tem %d anos.\n", p.getNome(), p.getIdade());
		System.out.printf("%s tem %d anos.\n", p2.getNome(), p2.getIdade());
		System.out.printf("O aluno %s, tem %d anos e tirou %d na prova.\n\n", a.getNome(), a.getIdade(), a.getNota());
		
		//-----------------
		
		Computador c = new Computador("Gigabyte B550M", 8, true);
		System.out.println("Placa mãe: " + c.getPlacaMae());
		System.out.println("RAM: " + c.getRam());
		if (c.isLigado()) {
			System.out.println("Computador está ligado.");
		} else {
			System.out.println("Computador NÃO está ligado.");
		}
	}

}
