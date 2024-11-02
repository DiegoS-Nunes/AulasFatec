package semana02;

public class For04 {

	public static void main(String[] args) throws InterruptedException {
		String[] nomes = new String[5];
		nomes[0]="Sérgio";
		nomes[1]="Ana";
		nomes[2]="Bia";
		nomes[3]="Carlos";
		nomes[4]="Denise";
		
		int[] numeros = {1,2,3,4,5,6,7,8};
		
		for(int i: numeros) { //iterator
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		for(String s: nomes) { //iterator
			System.out.println(s);
			Thread.sleep(1000);
		}

		for(int i=0; i<nomes.length; i++) { //convencional
			System.out.println(nomes[i]);
			Thread.sleep(1000);
		}
	}

}
