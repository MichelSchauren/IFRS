package exemplos2;

public class Exemplo01 {

	public static void main(String[] args) {
		Computador pc1 = new Computador();
		pc1.gabinete = "CV100";
		pc1.monitor = "AOC 24";
		pc1.fonte = "";
		pc1.gpu = "RX 6600 xt";
		pc1.ram = "8GB";
		pc1.motherBoard = "msi A520 A pro";
		pc1.cpu = new Processador("Rizen 5 5500", "6", " 3.6 GHz", "12");
		
		// -------------------------------
		
		System.out.println(pc1.cpu.modelo);
	}

}
