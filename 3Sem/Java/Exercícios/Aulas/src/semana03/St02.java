package semana03;

public class St02 {
	public static void main(String[] args) {

		String s = "0123456789abcdefABCDEF!@#$%¨&*()";
		String senha = "";
		for(int i=0;i<10;i++) {
			int indice = (int)(Math.random() * s.length());
			char c = s.charAt(indice);
			senha += c;
			//System.out.println(senha);
		}
		System.out.println(senha);
	}
}
