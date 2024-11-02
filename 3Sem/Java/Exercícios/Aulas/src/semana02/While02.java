package semana02;

import javax.swing.JOptionPane;

public class While02 {

	public static void main(String[] args) {
		
		final int MENOR_NOTA = 0;
		final int MAIOR_NOTA = 10;
		
		while(true) {
			float nota = Float.parseFloat(
				JOptionPane.showInputDialog("Nota?"));
			if(nota >= MENOR_NOTA && nota <= MAIOR_NOTA) {
				JOptionPane.showMessageDialog(null, "Nota digitada:"+nota);
				break;
			}
		}
		
		float n = -1; //nota inválida
		while(n < MENOR_NOTA || n > MAIOR_NOTA) {
			n = Float.parseFloat(
				JOptionPane.showInputDialog("Nota 2?"));
		}
		JOptionPane.showMessageDialog(null, "Nota digitada 2: "+n);
		
		
		do {
			n = Float.parseFloat(
				JOptionPane.showInputDialog("Nota 3?"));
		}
		while(n < MENOR_NOTA || n > MAIOR_NOTA);
		JOptionPane.showMessageDialog(null, "Nota digitada 3: "+n);
	}

}
