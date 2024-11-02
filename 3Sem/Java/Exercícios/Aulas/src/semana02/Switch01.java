package semana02;

import javax.swing.JOptionPane;

public class Switch01 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Mês?");

		switch(s) {
			case "1": System.out.println("janeiro");break;
			case "2": System.out.println("fevereiro");break;
			case "3": System.out.println("março");break;
			// até o 12
			default: System.out.println("Desconhecido!!");
		}

	}

}
