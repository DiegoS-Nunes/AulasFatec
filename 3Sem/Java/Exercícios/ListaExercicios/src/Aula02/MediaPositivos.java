//Lista 2 ex.4
//Faça uma aplicação que leia três números e mostre a média entre eles somente se todos forem positivos. 
//Caso haja algum número negativo apresente a mensagem “A média não pode ser calculada”.
package Aula02;

import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Quantos números quer inserir?");
        int qtd_val= scan.nextInt();
        double[] vals= new double[qtd_val];

        for(int i=0; i<qtd_val; i++){
            System.out.printf("Digite o %d número: ",i+1);
            vals[i]= scan.nextDouble();
        }

        scan.close();

        public static double printVals (double[] vals) {
            for(double val: vals){
                System.out.println(val);
            }
        }

        for(double val: vals){
            double soma = 0+val;
            if (val<0){
                System.out.println("A média não pode ser calculado devido valor negativo!!");
                printVals();
                break;
            }
            
            double media = soma/vals.length;
            System.out.println("A média dos números é: "+media);
        }
    }
}