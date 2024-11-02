package semana05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela extends JFrame {

	private JButton bt, bt2, btMes;
	private JTextField tf, tf2, tfMes;
	
	public Tela() { //definir as propriedades da tela
		setTitle("My First Frame");
		setBounds(0,0,500,200);
		setLayout(new FlowLayout());
		bt = new JButton("Contar");
		tf = new JTextField(10);
		add(bt);
		add(tf);
		bt2 = new JButton("Contar2");
		tf2 = new JTextField(10);
		add(bt2);
		add(tf2);
		btMes = new JButton("Mostrar Mês");
		tfMes = new JTextField(10);
		add(btMes);
		add(tfMes);
		
		btMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n = Integer.parseInt(tfMes.getText());
					JOptionPane.showMessageDialog(btMes,Metodos.getMes(n));
				}
				catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(btMes,"Forneça um inteiro");	
				}
				catch(ArrayIndexOutOfBoundsException e2) {
					JOptionPane.showMessageDialog(btMes,"Forneça um mês válido");	
				}
				
			}
		});
		
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread t1 = new Thread(new Runnable() {
					public void run() {
						for(int i=1; i<=10; i++) {
							tf.setText(""+i);
							try {
								Thread.sleep(1000);
							} 
							catch (InterruptedException e1) {	}
						}	
					}
				});
				t1.start();
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread t2 = new Thread(new Runnable() {
					public void run() {
						for(int i=100; i>=1; i--) {
							tf2.setText(""+i);
							try {
								Thread.sleep(100);
							} 
							catch (InterruptedException e2) {	}
						}	
					}
				});
				t2.start();
			}
		});
	}
	
	
	public static void main(String[] args) {
		Tela t = new Tela();
		t.setVisible(true);
	}

}
