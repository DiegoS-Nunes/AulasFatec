package semana07;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame01 extends JFrame {

	private JButton btOriginal;
	private Botao btPersonal;
	
	public Frame01() {
		setTitle("Usando a Herança");
		setBounds(0,0,300,200);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		btOriginal = new JButton("Original");
		btPersonal = new Botao("Personal");
		add(btOriginal);
		add(btPersonal);
	}
	
	public static void main(String[] args) {
		Frame01 f = new Frame01();
		f.setVisible(true);

	}

}
