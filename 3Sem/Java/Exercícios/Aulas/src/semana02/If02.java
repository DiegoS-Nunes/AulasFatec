package semana02;

public class If02 {

	public static void main(String[] args) {
		int n1 = 50, n2 = 50;
		if(n1 > n2) {
			System.out.println(n1);
		}
		else if(n2 > n1) {
			System.out.println(n2);
		}
		else {
			System.out.println("Valores iguais!");
		}

		int maior = (n1 > n2)? n1 : n2;
		System.out.println(maior);
		
		String s = (n1 > n2)? "n1="+n1 : (n2 > n1)? "n2="+n2 : "iguais";
		System.out.println(s);
	}

}
