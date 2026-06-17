package Ex2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		
		Concessionaria con = new Concessionaria();
		Veiculo v = new Veiculo();
		
		System.out.print("Nome da concenssionaria: ");
		String cn = sc.nextLine();
		con.setNome(cn);
		
		System.out.print("Cidade da concenssionaria: ");
		String cc = sc.nextLine();
		con.setCidade(cc);
		
		System.out.print("Telefone da concenssionaria: ");
		String ct = sc.nextLine();
		con.setTelefone(ct);
		
		System.out.print("Modelo do veículo: ");
		String vm = sc.nextLine();
		v.setModelo(vm);
		
		System.out.print("Ano do veículo: ");
		int va = Integer.parseInt(sc.nextLine());
		v.setAno(va);
		
		System.out.print("Preço do veículo: ");
		double vp = Double.parseDouble(sc.nextLine());
		v.setPreco(vp);
		
		v.setConcenssionaria(con);
		
		sc.close();
		
		System.out.println("---------------");
		System.out.println("Vende-se carro do modelo " + v.getModelo() + ", ano " + String.valueOf(v.getAno()) + ", por apenas " + formatoMoeda.format(v.getPreco()) + ".");
		System.out.println("O veículo está disponível na concessionaria " + v.getConcenssionaria().getNome() + " na cidade de " + v.getConcenssionaria().getCidade() + ".");
		System.out.println("Ligue " + v.getConcenssionaria().getTelefone() + " para entrar em contato.");
	}

}
