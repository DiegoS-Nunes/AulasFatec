package semana07;

import javax.swing.JOptionPane;

public class Vendedor extends Funcionario {

	public float comissao;
	
	public void mostrar() {
		super.mostrar(); 
		System.out.println(comissao);
		//System.out.println(codigo);
	}
	
	public void digitar() {
		super.digitar();
		comissao = Float.parseFloat(
				JOptionPane.showInputDialog("Comissao?"));
	}

}
