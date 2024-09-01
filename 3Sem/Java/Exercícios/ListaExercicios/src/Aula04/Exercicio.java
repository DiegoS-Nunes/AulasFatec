package Aula04;

import java.util.Random;
import java.util.List;

public class Exercicio {
    /**
     * Um método que receba uma palavra e apresente em tela todas as
     * letras desta Palavra separadamente.
     * @param frase Digite uma frase.
     */
    public static void letras(String frase) {
        /**
         * Exibe cada caractere em tela, incluindo espaços em branco.
         */
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
    }

    /**
     * Um método que recebe um número entre 1 e 10 e outro até infinito e apresenta em tela a
     * tabuada desse número. Caso o número fornecido esteja fora da faixa,
     * imprimir em tela a mensagem “número inválido”.
     * @param qtd Até qual número deve ser multiplicado.
     * @param tabuada Por qual número deve ser multiplicado.
     */
    public static void tabuada(int qtd, int tabuada) {
        /**
         * Valida se a quantidade de vezes que a operação deve ser realizada não é negativa
         */
        if (qtd < 0){
            System.out.println("Quantidade não pode ser negativa!!");
        }
        /**
         * Verifica se a tabuada solicitada está entre 1 e 10.
         */
         else if(tabuada < 1 || tabuada > 10){
            System.out.println("Tabuada pode ser de 1 até 10 apenas!!");
        }else {
            /**
             * Exibe a tabuada em tela.
             */
            for (int i = 1; i <= qtd; i++) {
                System.out.printf("%d x %d = %d\n", tabuada, i, tabuada * i);
            }
        }
    }

    /**
     * Um método que imprima em tela cinco números inteiros
     * aleatoriamente (os valores devem estar entre 1 e 100).
     * @param qtd Quantidade de gerações
     * @param limite Limite máximo do maior número a ser gerado
     */
    public static void numeroAleatorio(int qtd, int limite) {
        /**
         * Instancia a classe Random na variável "gerador".
         */
        Random gerador = new Random();
        /**
         * Exibe em tela a quantidade de números aleatórios solicitado até o valor máximo.
         */
        for (int i = 0; i < qtd; i++) {
            System.out.println(gerador.nextInt(limite));
        }
    }

    /**
     * Um método que receba um número inteiro entre 1 e 7 e mostre em
     * tela domingo, segunda .... ou sábado, ou ainda “inexistente” caso o
     * valor esteja fora da faixa.
     * @param numeroDia Número que representa o dia da semana iniciando em 1-Domingo
     */
    public static void diaSemana(int numeroDia) {
        /**
         * Cria um array de dia da semana, atribuindo à eles um índice.
         */
        String[] diaSemana = {"Domingo", "Segunda-feira","Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        /**
         * Verifica se o valor digitado é um int de 1 à 7.
         */
        if (numeroDia>=1 && numeroDia<=7) {
            System.out.println(diaSemana[numeroDia - 1]);
        }else{
            /**
             * Utiliza-se do índice do array diaSemana para retornar em tela o número do dia à partir de um inteiro.
             */
            System.out.println("Por favor, insira um valor entre 1 e 7, sendo 1 = Domingo!");
        }
    }

    /**
     * Um método que recebe uma lista de nomes (use List do pacote java.util)
     * e apresente em tela todos os nomes existentes na lista.
     * @param nomes 0 ou infinitos valores String.
     */
    public static void nomes (String... nomes){
        for(String nome: nomes) {
            System.out.println(nome);
        }
    }
    /**
     * um método que receba uma lista (use List do pacote java.util)
     * contendo diversos valores inteiros e retorne a quantidade de números pares.
     * @param numeros Lista de numeros inteiros.
     */
    public static int pares(List<Integer> numeros) {
        int qtdPares = 0;
        for (int numero: numeros){
            /**
             * Verifica se o número divido por 2 é 0, se sim é par e exibe em tela.
             */
            if (numero%2 == 0) {
                qtdPares++;
            }
        }
        return qtdPares;
    }

     /**
      * um método que recebe um array de 10 elementos contendo valores inteiros e retorna à soma desses valores.
      * @param numeros array de nuemros inteiros
      */
    public static int soma(int[] numeros) {
        int soma = 0;
        for (int numero: numeros){
                soma+=numero;
        }
        return soma;
    }

    /**
     * um método que recebe qualquer quantidade de notas de prova e retorna a média aritmética dessas notas.
     * @param notas Recebe 0 ou infinitas notas float.
     */
    public static float mediaProvas(int... notas) {
        float soma = 0;
        for (float nota: notas){
            soma += nota;
        }
        float media = soma/notas.length;
        return media;
    }

     /**
     * um método que recebe dois números inteiros (n1 e n2) e retorna um
     * vetor contendo n1 valores gerados aleatoriamente cujos valores estejam compreendidos entre 0 e n2.
     * @qtd Quantidade de valores aleatórios a ser gerado.
     * @limite O maior valor que pode ser gerado.
     */
    public static int[] vetorAleatorio (int qtd, int limite){
        /**
         * Instancia a classe Random.
         */
        Random gerador = new Random();
        /**
         * Cria o vetor com a quantidade desejada.
         */
        int[] vetor= new int[qtd];
        /**
         * Gera um número aleatório e atribui à uma das casas do vetor.
         */
        for (int i=0; i<qtd;i++){
            vetor[i]=gerador.nextInt(limite);
        }
        return vetor;
    }

     /**
     * um método que receba um número de CPF e retorne verdadeiro caso ocorram as seguintes condições:
     * a. deve conter 11 algarismos
     * b. deve conter o formato xxx.xxx.xxx-xx (os algarismos devem estar no lugar de cada x)
     */
    public static boolean validadorCPF(String CPF) {
        /**
         * Elimina todos os caracteres especiais de um CPF, os "." e "-".
         */
        CPF = CPF.replaceAll("\\.", "").replaceAll("\\-", "");

        /**
         * Verifica se sobrou 11 dígitos. Que devem ser os algarísmos do CPF
         */
        if(CPF.length() != 11) {
            return false;
        }

        /**
         * Verifica se todos os 11 dígitos que sobraram são realmente algarismos e não caracteres.
         */
        for (int i=0; i<CPF.length(); i++){
            if (!Character.isDigit(CPF.charAt(i))){
                return false;
            }
        }
        return true;
    }
}