package Conceitos_OO_01;

public class Ex01 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.especie = "Cachorro";
		a1.idade = 6;
		a1.vivo = true;
		
		System.out.println(a1.especie);
		System.out.println(a1.idade);
		System.out.println(a1.vivo);
		a1.matarAnimal();
		
		
		Canal canal1 = new Canal();
		canal1.nome = "AyrtonGameplays";
		canal1.inscritos = 5;
		canal1.videos = 2;
		canal1.Inscrever();
		
		System.out.println(canal1.nome);
		System.out.println(canal1.inscritos);
		System.out.println(canal1.videos);
		
		
		Casa casa1 = new Casa();
		casa1.cidade = "Tupandi-RS";
		casa1.bairro = "Cristo Rei";
		casa1.rua = "Padre Matias";
		
		System.out.println(casa1.cidade);
		System.out.println(casa1.bairro);
		System.out.println(casa1.rua);
		
		
		Curso curso1 = new Curso();
		curso1.area = "TI";
		curso1.professor = "Moser";
		curso1.instituto = "IFRS";
		
		System.out.println(curso1.area);
		System.out.println(curso1.professor);
		System.out.println(curso1.instituto);
		
		
		Filme f1 = new Filme();
		f1.ano = 2026;
		f1.genero = "Comédia";
		f1.bom = false;
		
		System.out.println(f1.ano);
		System.out.println(f1.genero);
		System.out.println(f1.bom);
		
		
		Rodovia r1 = new Rodovia();
		r1.cidade = "Feliz";
		r1.nome = "Ayrton Oliveira Manhãe";
		r1.tamanho = 9999;
		
		System.out.println(r1.cidade);
		System.out.println(r1.nome);
		System.out.println(r1.tamanho);
		
		
		Smartphone s1 = new Smartphone();
		s1.ano = 2020;
		s1.funcionando = false;
		s1.marca = "Sansung";
		
		System.out.println(s1.ano);
		System.out.println(s1.funcionando);
		System.out.println(s1.marca);
	}

}
