package semana02;
public class For03 {
	public static void main(String[] args) throws InterruptedException {
		for(char a='A'; a<='E'; a++) {

			for(int b=1; b<=10; b++) {
				System.out.println(a+""+b);
				Thread.sleep(1000);
			}
		}

	}

}
