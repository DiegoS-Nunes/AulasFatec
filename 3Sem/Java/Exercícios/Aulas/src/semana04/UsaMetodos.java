package semana04;

import javax.swing.JOptionPane;

public class UsaMetodos {

	public static void main(String[] args) {

		//System.out.println(MetodosComRetorno.somar(10,20));
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("n1?"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("n2?"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("n3?"));

		JOptionPane.showMessageDialog(
				null,MetodosComRetorno.somar(n1,n2,n3));

	}

}
