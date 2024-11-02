package semana02;

import java.util.Scanner;

public class Entrada01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com a largura");
		int largura = scanner.nextInt();		
		System.out.println("Entre com a comprimento");
		int comprimento = scanner.nextInt();
		System.out.println("A área é: " + (largura * comprimento));
		scanner.close();

	}
}
