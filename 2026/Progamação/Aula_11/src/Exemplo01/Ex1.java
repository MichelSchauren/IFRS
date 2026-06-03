package Exemplo01;

public class Ex1 {
	public static void main(String[] args) {
		
		Partido part = new Partido();
		part.nome = "Primeiro Partido Presidiario Por Pinhamoiangaba";
		part.sigla = "PPPPP";
		
		Prefeito pref = new Prefeito();
		pref.nome = "Paulo Pinto";
		pref.partido = part;
		
		Cidade city = new Cidade();
		city.nome = "Pinhamoiangaba";
		city.prefeito = pref;
		
		//-----------------------
		
		System.out.println(city.nome);
		System.out.println(city.prefeito.nome);
		System.out.println(city.prefeito.partido.nome);
		System.out.println(city.prefeito.partido.sigla);
	}
}
