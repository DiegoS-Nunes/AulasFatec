package semana03;

import javax.swing.JOptionPane;

public class Erro01 {

	public static void main(String[] args) {
		while(true) {
			try {
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
			    // 1000000
				JOptionPane.showMessageDialog(null, "Idade digitada: " + idade);
				break;
			}
			catch(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite um valor inteiro: "+
			         erro.getMessage());
			}
			finally {
				JOptionPane.showMessageDialog(null, "FIM"); 
			}
		}
		
	}

}
