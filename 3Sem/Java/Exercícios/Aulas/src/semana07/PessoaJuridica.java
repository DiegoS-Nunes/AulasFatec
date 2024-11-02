package semana07;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Pessoa 
    implements Serializable{
	public String cnpj, inscricao;
	
	public void mostrar() {
		super.mostrar(); //chama o mostrar da superclasse
		System.out.println(cnpj);
		System.out.println(inscricao);
	}
	

	public void digitar() {
		super.digitar();
		cnpj = JOptionPane.showInputDialog("Cnpj?");
		inscricao = JOptionPane.showInputDialog("Inscricao?");
	}
}
