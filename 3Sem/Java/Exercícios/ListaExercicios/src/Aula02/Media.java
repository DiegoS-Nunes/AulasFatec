package Aula02;
// 2. Faça uma classe que peça as 3 notas bimestrais e mostre a média.

import javax.swing.*;

public class Media {
    public static void main(String[] args) {

        int MAIOR_NOTA = 10, MENOR_NOTA=0;
        float qtd_Notas=Float.parseFloat(JOptionPane.showInputDialog("Quantas notas quer inserir?"));

        while (true){
            int i= 1;
            if(i<=qtd_Notas) {
                float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota " + i + ": "));
                if (nota <= MAIOR_NOTA && nota >= MENOR_NOTA) {
                    nota+=nota;
                    i++;
                }
            }
        }
    }
}

