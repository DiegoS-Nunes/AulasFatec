package semana04;

import javax.swing.JOptionPane;

public class MetodosComRetorno {

	/**
	 * Recebe dois valores e retorna sua soma
	 * @param a - o primeiro valor
	 * @param b - o segundo valor
	 * @return - resultado da soma
	 */
	public static int somar(int a, int b) {
		System.out.println(a+b);
		return a + b;
	}
	
	/*forma incorreta de design
	public static int somar() {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("n1?"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("n2?"));
		return n1 + n2;
	}
	*/
	
	public static int somar(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	
	public static String parImpar(int numero) {
		String r = "ímpar";
		if(numero % 2 == 0) {
			r = "par";
		}
		return r;
	}

	/*
	public static String parImpar(int numero) {
		if(numero % 2 == 0) {
			return "par";
		}
		else {
			return "ímpar";
		}
	}
	*/
}
