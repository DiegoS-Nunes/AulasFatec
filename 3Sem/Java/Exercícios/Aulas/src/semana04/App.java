package semana04;

public class App {

	public static void main(String[] args) {
		Impressora.imprimir();
		Impressora.imprimir("Boa noite!");
		
		Impressora.imprimirCopia(10, "Eu amo Java! "+"demais");
		
		String nomes = "Ana;Bia;Carlos";
		Impressora.imprimirSplit(nomes);
		
		System.out.println();

		

		

	}

}
