package jogo;

import jogo.pessoas.Treinador;
import jogo.pessoas.Jogador;

public class Equipe {
	private Treinador treinador;
	private Jogador[] reservas = new Jogador[3];

	private Jogador goleiro;
	private Jogador fixo;
	private Jogador pivo;
	private Jogador alaD;
	private Jogador alaE;
	
	
	public Treinador getTreinador() {
		return treinador;
	}
	public void setTreinador(Treinador treinador) {
		this.treinador = treinador;
	}
	public Jogador[] getReservas() {
		return reservas;
	}
	public void setReservas(Jogador[] reservas) {
		this.reservas = reservas;
	}
	public Jogador getGoleiro() {
		return goleiro;
	}
	public void setGoleiro(Jogador goleiro) {
		this.goleiro = goleiro;
	}
	public Jogador getFixo() {
		return fixo;
	}
	public void setFixo(Jogador fixo) {
		this.fixo = fixo;
	}
	public Jogador getPivo() {
		return pivo;
	}
	public void setPivo(Jogador pivo) {
		this.pivo = pivo;
	}
	public Jogador getAlaD() {
		return alaD;
	}
	public void setAlaD(Jogador alaD) {
		this.alaD = alaD;
	}
	public Jogador getAlaE() {
		return alaE;
	}
	public void setAlaE(Jogador alaE) {
		this.alaE = alaE;
	}
	
	
}
