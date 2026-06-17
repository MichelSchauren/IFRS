package hospital;

import hospital.pessoas.Enfermeiro;
import hospital.pessoas.Medico;
import hospital.pessoas.Paciente;
import hospital.recursos.Sala;

public class Internacao {
	private int capacidade = 3;
	private int contPacientes = 0;
	private Paciente[] leitos = new Paciente[capacidade];
	
	private Enfermeiro enfermeiro = new Enfermeiro(null);
	private Sala sala = new Sala(null, null);
	private Medico medico = new Medico(null, null);
	
	
	
	public Internacao(int capacidade) {
		this.capacidade = capacidade;
		this.leitos = new Paciente[3];
	}
	public Paciente[] getLeitos() {
		return leitos;
	}
	public void setLeitos(Paciente[] leitos) {
		this.leitos = leitos;
	}
	public void addLeito(Paciente leito) {
		if (this.contPacientes >= capacidade) {
			this.leitos[contPacientes] = leito;
			contPacientes++;
		} else {
			System.out.println("Hospital lotado.");
		}
	}
	
	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}
	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
}
