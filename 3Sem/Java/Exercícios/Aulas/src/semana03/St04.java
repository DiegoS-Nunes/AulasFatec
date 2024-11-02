package semana03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class St04 {

	public static void main(String[] args) {
		String nomes = "Ana;Bia;Carla;Denis;Elaine;Fábio";
		String[] n = nomes.split(";");
		
		for(String s: n) {
			System.out.println(s);
		}
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("c:/temp/pessoas.txt");
			pw.println("Meus principais amigos:");
			for(String s: n) {
				pw.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Impossível escrever no arquivo!");
		}
		finally {
			pw.close();
		}

	}

}
