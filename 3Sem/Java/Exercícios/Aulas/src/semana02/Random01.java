package semana02;

import java.util.Random;

public class Random01 {

	public static void main(String[] args) {
		
		Random r = new Random(1000);
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(50));
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		
		
		
		

	}

}
