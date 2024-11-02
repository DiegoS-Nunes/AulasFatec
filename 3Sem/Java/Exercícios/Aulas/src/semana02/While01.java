package semana02;

public class While01 {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			Thread.sleep(1000);
			i++;
		}

	}

}
