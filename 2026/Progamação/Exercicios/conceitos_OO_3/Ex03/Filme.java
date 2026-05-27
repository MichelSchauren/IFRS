package Ex03;


public class Filme {
	public Diretor diretor;
	public Cidade cidade;
	
	public void mostrarDados() {
		System.out.println("Estado: " + cidade.estado);
		System.out.println("País: " + cidade.pais);
		System.out.println("Nome da cidade: " + cidade.nome);
		System.out.println("Quantidade de habitantes: " + cidade.habitantes);
		System.out.println("Nome do diretor: " + diretor.nome);
		System.out.println("Sobrenome do dirtetor: " + diretor.sobrenome);
		System.out.println("Quantidade de premios ganhos pelo diretor: " + diretor.n_premios);
		System.out.println("\n");
	}
}
