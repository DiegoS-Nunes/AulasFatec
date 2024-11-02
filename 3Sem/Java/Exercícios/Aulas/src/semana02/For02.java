package semana02;

public class For02 {

	public static void main(String[] args) throws InterruptedException {
		
		for(char a='A'; a<='z'; a++) {
			System.out.println(a);
			Thread.sleep(1000);
		}

	}

}
