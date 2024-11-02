package semana03;

import javax.swing.JOptionPane;

public class Erro08 {

	public static void main(String[] args) {
		final byte MAIORIDADE = 18;
		
		int idade = 
			Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
		if(idade < MAIORIDADE) {
			throw new ArithmeticException("Menor de Idade");
		}

	}

}
