package semana02;

import java.util.Scanner;

public class A_Entrada01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a largura: ");
			float largura = scanner.nextFloat();
		System.out.println("Entre com o comprimento: ");
			float comprimento = scanner.nextFloat();
		
		System.out.println("A área é: "+largura*comprimento);
		scanner.close();
	}
}
