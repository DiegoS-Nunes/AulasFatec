package semana02;

public class H_For03 {

	public static void main(String[] args) throws InterruptedException {
		String[] nomes = new String[5];
		nomes[0]= "Sérgio";
		nomes[1]= "Mauricio";
		nomes[2]= "Bia";
		nomes[3]= "Daniel";
		nomes[4]= "Carlos";
		
		int[] numeros= {1,2,3,4,5};
		
		for(int i: numeros) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		for (String s: nomes) {
			System.out.println(s);
			Thread.sleep(500);
		}
	}
}
