package Aula02;

//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 

import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua altura? ");
        double altura = scanner.nextDouble();

        scanner.close();

        if(altura>100){
            altura /= 100;
        }

        double altura_ideal = (72.7*altura) - 58;

        System.out.printf("Seu peso ideal é %.2f Kg\n", altura_ideal);
    }
}
