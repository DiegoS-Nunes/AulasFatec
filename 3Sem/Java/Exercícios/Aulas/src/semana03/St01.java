package semana03;

public class St01 {

	public static void main(String[] args) throws InterruptedException {
		
		String s = "Aula de Java na sexta-feira";
		System.out.println(s.length());
		//System.out.println(s.charAt(20));
		for(int i=0; i<s.length();i++) {
			System.out.print(s.charAt(i));
			Thread.sleep(500);
		}
		
		
	
		

	}

}
