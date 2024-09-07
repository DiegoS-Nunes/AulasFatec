package semana02;

import javax.swing.JOptionPane;

public class E_If01 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Mês");
		if(s.equals("1")) {
			System.out.println("Janeiro");
		}else if(s.equals("2")) {
			System.out.println("Fevereiro");
		}
	}

}
