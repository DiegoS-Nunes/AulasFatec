package semana07;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {

	public String rg, cpf;
	
	public void digitar() {
		//super.digitar();
		cpf = JOptionPane.showInputDialog("CPF?");
		rg = JOptionPane.showInputDialog("rg?");
	}
}
