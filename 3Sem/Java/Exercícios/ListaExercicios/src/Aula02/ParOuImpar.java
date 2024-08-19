package Aula02;

import java.util.Scanner;

//Faça uma aplicação para receber um número qualquer e informar na tela se é par ou ímpar

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite um número: ");
        double numero = scanner.nextDouble();

        scanner.close();

        if(numero%2==0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é ímpar");
        }
    }
}
