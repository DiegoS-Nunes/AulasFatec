package semana03;

import javax.swing.JOptionPane;

public class St03 {

	public static void main(String[] args) {
		
		String termosProibidos = "sexo tantã maluco doidão";
		String s = JOptionPane.showInputDialog("Digite o termo");

		if (termosProibidos.contains(s)) {
			JOptionPane.showMessageDialog(null, "Acesso proibido!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Acesso liberado!");
		}
	}

}
