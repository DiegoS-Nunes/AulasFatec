package semana04;

public class Impressora {

	
	public static void imprimir()  {
		System.out.println("Apostila de POO");
	}
	
	public static void imprimir(String frase)  {
		System.out.println(frase);
		imprimirCaixaAlta(frase); //chamar ou invocar
	}
	
	public static void imprimirCopia(int qtdeCopias,String texto)  {
		for(int i=1; i<=qtdeCopias; i++) {
			System.out.println(texto);
		}
	}
	
	public static void imprimirCaixaAlta(String texto) {
		System.out.println(texto.toUpperCase());
	}
	
	public static void imprimir(int n2, int n)  {
		System.out.println(n + n2);
	}

	public static void imprimirSplit(String nomes) {
		String[] n = nomes.split(";");
		for(String s: n) {
			System.out.println(s);
		}
	}
	
	
	
}
