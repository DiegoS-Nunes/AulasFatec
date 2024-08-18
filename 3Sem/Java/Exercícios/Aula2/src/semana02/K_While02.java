package semana02;

import javax.swing.JOptionPane;

public class K_While02 {
	public static void main(String[] args) {
		
		final int MAIOR_NOTA = 10;
		final int MENOR_NOTA = 0;
		
		while(true) {
			float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota: "));
			if(nota >= MENOR_NOTA && nota<= MAIOR_NOTA) {
				JOptionPane.showMessageDialog(null, "Nota Digitada: "+nota);
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Nota Inválida");
			}
		}
	}
}
