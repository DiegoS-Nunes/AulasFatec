package semana02;

import javax.swing.JOptionPane;

public class If01 {

	public static void main(String[] args) {
		
		final int QUANTIDADE_MESES = 12;
		final int MENOR_MES = 1;
		final int MAIOR_MES = 12;
		int menor = Integer.MIN_VALUE;
		int maior = Integer.MAX_VALUE;
		System.out.println(menor);
		System.out.println(maior);
		
		
		String s = JOptionPane.showInputDialog(null, "Mês?");
		int m = Integer.parseInt(s);
		if(m>=MENOR_MES && m<=MAIOR_MES) {
			System.out.println("Mês válido!");
		}
		else {
			System.out.println("Mês inválido!");
		}
		
		if(s.equals("1")) {
			System.out.println("janeiro");
		}
		else if(s.equals("2")) {
			System.out.println("fevereiro");
		}

	}

}
