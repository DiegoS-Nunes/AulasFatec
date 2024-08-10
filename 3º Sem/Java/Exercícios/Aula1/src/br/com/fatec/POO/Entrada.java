package br.com.fatec.POO;

import javax.swing.*;

public class Entrada {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite uma palavra: ");
        String entrada2 = JOptionPane.showInputDialog("\nDigite mais uma palavra: ");
        JOptionPane.showMessageDialog(null, entrada+"\n"+entrada2);
    }
}
