//Elabore uma aplicação que apresente no final o somatório dos valores pares
//existentes na faixa de 1 até 500.

package Aula02;

public class SomatorioPares {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("O somatório dos valores pares de 1 a 500 é: " + soma);
    }
}