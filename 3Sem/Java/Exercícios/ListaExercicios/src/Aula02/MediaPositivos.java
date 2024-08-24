package Aula02;

import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantos números quer inserir?");
        int qtd_val = scan.nextInt();
        double[] vals = new double[qtd_val];
        double soma = 0;
        boolean hasNegative = false;

        for (int i = 0; i < qtd_val; i++) {
            System.out.printf("Digite o %d número: ", i + 1);
            vals[i] = scan.nextDouble();

            if (vals[i] < 0) {
                hasNegative = true;
            }
            soma += vals[i];
        }

        scan.close();

        printVals(vals); // Chama o método para imprimir os valores

        if (hasNegative) {
            System.out.println("A média não pode ser calculada devido a valor negativo!");
        } else {
            double media = soma / vals.length;
            System.out.printf("A média dos números é: %.2f%n", media);
        }
    }

    public static void printVals(double[] vals) {
        System.out.println("Valores inseridos:");
        for (double val : vals) {
            System.out.println(val);
        }
    }
}