package semana07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PessoaJuridicaPersistente extends PessoaJuridica {

	
	public String gravar() {
		String s = "";
		try {
			FileOutputStream fos = new FileOutputStream(cnpj+".obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.flush();
			oos.close();
			s = "Objeto gravado com sucesso!";
		}
		catch(IOException erro) {
			s = "Falha na gravação "+erro.getMessage();
		}
		return s;
	}
	
	public static PessoaJuridica ler(String cnpj) {
		PessoaJuridica p = null;
		try {
			FileInputStream fos = new FileInputStream(cnpj+".obj");
			ObjectInputStream oos = new ObjectInputStream(fos);
			p = (PessoaJuridica) oos.readObject();
			oos.close();
		}
		catch(Exception erro) {}
		
		return p;
	}
}
