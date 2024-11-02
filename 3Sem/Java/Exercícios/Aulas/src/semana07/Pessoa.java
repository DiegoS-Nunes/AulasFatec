package semana07;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class Pessoa implements Serializable{

	public int id;
	public String nome;

	public Pessoa() {
	}
	
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public void mostrar() {
		System.out.println(id);
		System.out.println(nome);
	}
	
	public void digitar() {
		id = Integer.parseInt(JOptionPane.showInputDialog("Id?"));
		nome = JOptionPane.showInputDialog("Nome?");
	}
}
