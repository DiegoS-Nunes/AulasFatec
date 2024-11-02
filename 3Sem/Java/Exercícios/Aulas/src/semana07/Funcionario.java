package semana07;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaJuridica {

	private int codigo;
	protected double salario;
	
	public void mostrar() {
		super.mostrar(); 
		System.out.println(salario);
	}
	
	@Override
	public void digitar() {
		super.digitar();
		salario = Double.parseDouble(
				JOptionPane.showInputDialog("Salário?"));
	}
}
