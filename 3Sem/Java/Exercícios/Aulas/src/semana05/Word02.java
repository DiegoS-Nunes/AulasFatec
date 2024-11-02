package semana05;

public class Word02 extends Thread {
	
	String texto = "Apostila de Python";
	
	public void run() { //inicia
		Impressora.imprimir(texto);
	}
}
