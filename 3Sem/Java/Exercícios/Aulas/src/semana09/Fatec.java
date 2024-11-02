package semana09;

public class Fatec {

	public String endereco;
	public Laboratorio lab1 = new Laboratorio();
	public Laboratorio lab2 = new Laboratorio();
	
	public static void main(String[] args) {
		Fatec fatec = new Fatec();
		fatec.lab1.lamp1.status = true;
		
	}
}
