package semana03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Erro09 {

	public static void main(String[] args) 
			throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("nomes.txt"));
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		br.close();
		
		
		
	}

}
