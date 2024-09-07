package Impressora_incompleto;

public class Word02 extends Thread {
    String texto = "Apostila de Python";

    public void run (){
        Impressora.imprimir(texto);
    }
}
