package semana08;

public class Descascador {

	public static void descascar(Fruta f, int qtde) {
		f.descascar(qtde);
	}
	
	public static void main(String[] args) {
		Banana b = new Banana();
		descascar(b,10);
		
		Fruta f = new Abacaxi();
		descascar(f,2);
		
		Laranja l = new Laranja();
		descascar(l,50);
		
		Mamona m = new Mamona();
		descascar(m,10);
		
	}
}
