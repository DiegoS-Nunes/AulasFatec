package semana07;

public class UsaAnimal {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.raca = "x";
		System.out.println(a.getClass());
		System.out.println(a.toString());
		
		Vendedor v = new Vendedor();
		v.salario = 1000;

	}

}
