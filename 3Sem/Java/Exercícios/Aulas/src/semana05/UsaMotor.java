package semana05;

public class UsaMotor {

	public static void main(String[] args) {
		
		Motor m1 = new Motor();
		Motor m2 = new Motor();		
		
		
		m1.mostrar();
		m1.acelerar();
		m1.acelerar();
		m1.acelerar();
		m1.mostrar();
		for(int i=0;i<1000000;i++) {
			m2.acelerar();
		}
		m2.mostrar();
		

	}

}
