package semana03;

import javax.swing.JOptionPane;

public class Erro04 {

	public static void main(String[] args) {
		try {
			int qtde = Integer.parseInt(JOptionPane.showInputDialog("qtde?"));
			int valor = Integer.parseInt(JOptionPane.showInputDialog("valor?"));
			int calculo = valor / qtde;
			JOptionPane.showMessageDialog(null, "Cálculo: "+calculo);
		}
		catch(Exception erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
		}
	}

}
