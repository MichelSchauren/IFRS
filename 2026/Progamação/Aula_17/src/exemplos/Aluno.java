package exemplos;

public class Aluno extends Pessoa {
	private int nota;

	public Aluno(String nome, int idade, int nota) {
		super(nome, idade);
		this.nota = nota;
	}
	
	public Aluno() {
		super();
		this.nota = 0;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
