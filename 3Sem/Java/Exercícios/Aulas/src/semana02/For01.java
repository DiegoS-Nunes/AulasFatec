package semana02;

public class For01 {

	public static void main(String[] args) 
			throws InterruptedException {
		
		for(int a=1; a<=10; a++) {
			System.out.println(a);
			Thread.sleep(1000);
		}
		for(int a=10; a>=0; a--) {
			System.out.println(a);
			Thread.sleep(1000);
			if (a==2) break;
		}

	}

}
