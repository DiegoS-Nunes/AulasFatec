package semana05;

public class Metodos {

	public final static String meses[] = 
	 {"","jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
	
	public static String getMes(int numero)
			 throws ArrayIndexOutOfBoundsException { //1--jan
		return meses[numero];
	}
	
}
