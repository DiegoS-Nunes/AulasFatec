package semana02;

import javax.swing.JOptionPane;

public class B_Entrada02 {
	public static void main(String[] args) {
		
		float largura = Float.parseFloat(
			JOptionPane.showInputDialog("Entre com a largura: ")
		);
			
		float comprimento = Float.parseFloat(
			JOptionPane.showInputDialog("Entre com o comprimento: ")
		);
		
		JOptionPane.showMessageDialog(null, "A área é: "+largura*comprimento);
	}
}
