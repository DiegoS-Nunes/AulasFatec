package Impressora_incompleto;

public class Impressora {
    /**
     * simula uma impressora
     * @param texto: o texto a ser impresso.
     * @throws InterruptedException
     */
    public synchronized static void imprimir(String texto) {
        for (int i=0; i <=10; i++){
            System.out.println(texto+""+i);

            try {Thread.sleep(1000);
            }
            catch (InterruptedException e){}
        }
    }
}
