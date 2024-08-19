//2. Faça uma classe que peça as 3 notas bimestrais e mostre a média.

package Aula02;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        int MAIOR_NOTA = 10, MENOR_NOTA = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas notas quer inserir? ");
        int qtd_Notas = scanner.nextInt();

        float somaNotas = 0;
        int i = 1;
        while (i <= qtd_Notas) {
            System.out.print("Digite a nota " + i + ": ");
            float nota = scanner.nextFloat();
            if (nota <= MAIOR_NOTA && nota >= MENOR_NOTA) {
                somaNotas += nota;
                i++;
            } else {
                System.out.println("Nota inválida. Tente novamente.");
            }
        }
        
        scanner.close();

        float media = somaNotas / qtd_Notas;
        System.out.println("A média das notas é: " + media);
    }
}