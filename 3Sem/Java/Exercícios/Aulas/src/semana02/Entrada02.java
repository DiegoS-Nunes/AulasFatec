package semana02;
import javax.swing.JOptionPane;

public class Entrada02 {
	public static void main(String[] args) {
		int area;
		int largura = Integer.parseInt(
			JOptionPane.showInputDialog("Entre com a largura"));
		int comprimento = Integer.parseInt(
			JOptionPane.showInputDialog("Entre com a comprimento"));
		area = largura * comprimento;
		JOptionPane.showMessageDialog(null, area);
		

	}
}
