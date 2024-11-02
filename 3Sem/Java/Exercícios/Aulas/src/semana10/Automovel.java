package semana10;

public class Automovel implements Motor, Capota {

	public void ligar() {
		System.out.println("Ligando o automovel");
	}
	public void desligar() {
		System.out.println("Desligando o automovel");
	}
	public void acelerar() {
		System.out.println("Acelerando o automovel");
	}
	public void frear() {
		System.out.println("Freando o automovel");
	}
	public void mostrar() {
		
	}
	@Override
	public void abrir() {
		System.out.println("Abrindo a capota");
		
	}
	@Override
	public void fechar() {
		System.out.println("Fechando a capota");
		
	}
	
}
