package semana02;

import javax.swing.JOptionPane;

public class D_Final01 {

	public static void main(String[] args) {
		
		final int QUANTIDADE_MESES = 1;
		final int MENOR_MES = 1;
		final int MAIOR_MES = 12;
		
		String s = JOptionPane.showInputDialog("Mês?");
		int m = Integer.parseInt(s);
		
		if (m>=MENOR_MES && m<=MAIOR_MES) {
			JOptionPane.showMessageDialog(null, "Mês válido!");
		}else {
			JOptionPane.showMessageDialog(null, "Mês inválido!");
		}
	}
}
