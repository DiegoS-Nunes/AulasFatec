package semana02;
import javax.swing.JOptionPane;

public class Entrada03 {
	public static void main(String[] args) {
		
		int largura, comprimento;
		String s = JOptionPane.showInputDialog("Entre com a largura"); 
		if(s!=null) {
			largura = Integer.parseInt(s);
			s = JOptionPane.showInputDialog("Entre com o comprimento"); 
			if(s!=null) {
				comprimento = Integer.parseInt(s);
				JOptionPane.showMessageDialog(null, largura * comprimento);
			}
			else { 
				JOptionPane.showMessageDialog(null, "Cancelado pelo usuário");
			}
		}
		else { 
			JOptionPane.showMessageDialog(null, "Cancelado pelo usuário");
		}
		
		

	}
}
