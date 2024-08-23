//. Elabore uma aplicação que apresente os valores de conversão de graus
//Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10
//graus Celsius e finalizando em 100 graus Celsius. O programa deverá
//apresentar os valores das duas temperaturas.

package Aula02;

public class ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        System.out.println("Conversão de Celsius para Fahrenheit:");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.printf("%d°C = %.2f°F%n", celsius, fahrenheit);
        }
    }
}
