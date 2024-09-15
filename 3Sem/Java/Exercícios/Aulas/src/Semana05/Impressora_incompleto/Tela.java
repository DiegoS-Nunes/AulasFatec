package Impressora_incompleto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame {
    private JButton bt;
    private JTextField tf;
    private JButton bt2;
    private JTextField tf2;
    private JButton btMes;
    private JTextField tfMes;

    public Tela() { //definir as propriedades da tela
        setTitle("My First Frame");
        /**
         * @param setBounds: Define tamanho e início da tela
         */
        setBounds(0,0,500,200);
        /**
         * @param setLayout: Faz a tela ter o mesmo comportamento de um documento do word (quebra de linha)
         */
        setLayout(new FlowLayout());

        /**
         * @param add(tf): Adiciona tf ao frame
         * @param add(bt): Adiciona bt ao frame
         */
        bt = new JButton("Contar");
        tf = new JTextField(10);
        add(tf);
        add(bt);

        bt2 = new JButton("Descontar");
        tf2 = new JTextField(10);
        add(bt2);
        add(tf2);

        btMes = new JButton("Descontar");
        tfMes = new JTextField(10);
        add(btMes);
        add(tfMes);

        /**
         * @param bt.addActionListener: Adiciona um ouvidor de eventos ao botão, que executa uma ação ao clicar.
         */
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(bt, "Hello World");
                Thread t1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=1; i<=10; i++) {
                            tf.setText(""+i);
                            System.out.println(""+i);
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e){}
                        }
                    }
                });
                t1.start();
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(bt, "Hello World");
                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=100; i<=10; i--) {
                            tf2.setText(""+i);
                            System.out.println(""+i);
                            try{
                                Thread.sleep(100);
                            }catch (InterruptedException e){}
                        }
                    }
                });
                t2.start();
            }
        });

        btMes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(bt, "Hello World");
                Thread t3 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=1; i<=10; i++) {
                            tfMes.setText(""+i);
                            System.out.println(""+i);
                            try{
                                Thread.sleep(1000);
                            }catch (InterruptedException e){}
                        }
                    }
                });
                t3.start();
            }
        });
    }
    public static void main(String[] args) {
        Tela t = new Tela();
        t.setVisible(true);
    }
}
