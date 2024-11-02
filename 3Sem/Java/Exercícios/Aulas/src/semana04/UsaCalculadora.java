package semana04;

public class UsaCalculadora {

	public static void main(String[] args) {
		
		Calculadora.somar(1, 2);
		Calculadora.somar(1, 2, 3);
		Calculadora.somar(1.3f, 2.4f, 3.5f, 4.8f);
		int[] v = {1,2,3,4,5,6,7};
		Calculadora.somar(v);
		Calculadora.somar();
		

	}

}
