package jogo;

import jogo.outras.Bola;
import jogo.outras.Quadra;
import jogo.pessoas.Arbitro;

public class Futsal {
	private String data;
	private Equipe mandante;
	private Equipe visitante;
	private Arbitro arbitro;
	private Quadra quadra;
	private Bola bola;
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Equipe getMandante() {
		return mandante;
	}
	public void setMandante(Equipe mandante) {
		this.mandante = mandante;
	}
	public Equipe getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipe visitante) {
		this.visitante = visitante;
	}
	public Arbitro getArbitro() {
		return arbitro;
	}
	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}
	public Quadra getQuadra() {
		return quadra;
	}
	public void setQuadra(Quadra quadra) {
		this.quadra = quadra;
	}
	public Bola getBola() {
		return bola;
	}
	public void setBola(Bola bola) {
		this.bola = bola;
	}
	
	
}
