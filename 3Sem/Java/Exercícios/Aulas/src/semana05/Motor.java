package semana05;

public class Motor {

	public final int VELOCIDADE_MAXIMA = 100;
	public final int VELOCIDADE_MINIMA = 0;
	
	private String sql; //variável
	
	private int velocidade; //variável de instância
	private boolean status; //variável de instância
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void acelerar() {
		if(velocidade < VELOCIDADE_MAXIMA) {
			velocidade++;
		}
	}
	public void frear() {
		if(velocidade > VELOCIDADE_MINIMA) {
			velocidade--;
		}
	}
	public void mostrar() {
		System.out.println(velocidade);
		System.out.println(status);
	}
	
}
