package semana02;

import javax.swing.JOptionPane;

public class C_Entrada03 {
	public static void main(String[] args) {
		
		float largura, comprimento;
		
		String s = JOptionPane.showInputDialog("Entre com a largura: ");
		if(s!=null) {
			largura = Float.parseFloat(s);
			
			s = JOptionPane.showInputDialog("Entre com o comprimento: ");
			if(s!=null) {
				comprimento = Float.parseFloat(s);
				
				JOptionPane.showMessageDialog(null, largura * comprimento);
				
			}else {
				JOptionPane.showMessageDialog(null, "Cancelado pelo usuário.");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Cancelado pelo usuário.");
		}
	}
}
