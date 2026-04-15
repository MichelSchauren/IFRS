package Conceitos_OO_01;

public class Canal {
	public String nome;
	public long inscritos;
	public int videos;
	
	public long Inscrever() {
		inscritos++;
		return inscritos;
	}
}
