package semana09;

public class UsaCargo {

	public static void main(String[] args) {
		
		Funcionario[] f = new Funcionario[3];
		
		f[0] = new Funcionario(1,"Ana");
		f[1] = new Funcionario(2,"Bia");
		f[2] = new Funcionario(3,"Carlos");
		
		Cargo c = new Cargo(1,"Programador",f);
		c.mostrar();
		
		
	}

}
