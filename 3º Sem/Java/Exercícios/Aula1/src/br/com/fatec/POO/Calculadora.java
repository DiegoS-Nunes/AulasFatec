package br.com.fatec.POO;

public class Calculadora {
    public static void main(String[] args) {
        /** ->Documentação
         * Printa todas as posições de args
         * @params args
         */
        for (String numero: args){
            System.out.printf(numero+" ");
        }

        if (args.length == 2) {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.printf("\n%d + %d = %d\n", n1, n2, n1 + n2);
        } else {
            System.out.printf("\nForneça 2 argumentos, apenas!\n");
        }
    }
}
