package semana04;

/**
 * Classe que implementa diversas operações matemáticas de soma
 */
public class Calculadora {

	/**
	 * Recebe dois valores e apresenta sua soma em tela
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	public static void somar(int a, int b) {
		System.out.println("Somar 1");
		System.out.println(a + b);
	}

	/**
	 * Realiza a soma de três valores e os apresenta em tela
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 * @param c - terceiro valor
	 */
	public static void somar(int a, int b, int c) {
		System.out.println("Somar 2");
		System.out.println(a + b + c);
	}
	
	/**
	 * Recebe um vetor, realiza a soma de seus elementos, e apresenta
	 * o total em tela.
	 * @param vetor - o vetor contendo os elementos
	 */
	public static void somar(int[] vetor) {
		System.out.println("Somar 3");
		int total = 0;
		for(int a=0; a < vetor.length; a++) {
			total += vetor[a];
		}
		System.out.println(total);
	}

	/**
	 * Recebe qualquer quantidade de elementos, realiza sua soma e
	 * apresenta o total em tela
	 * @param vetor - os elementos a serem somados
	 */
	public static void somar(float... vetor) {
		System.out.println("Somar 4");
		float total = 0;
		for(int a=0; a < vetor.length; a++) {
			total += vetor[a];
		}
		System.out.println(total);
	}
}
