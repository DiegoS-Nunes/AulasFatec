package semana08;

public class UsaReflection {

	public static void main(String[] args) {
		/*
		Autor a = new Autor();
		a.setNome("Sérgio");
		a.setEmail("furgeri@gmail.com");
		
		System.out.println(a.getNome()); //tradicional
		System.out.println(Reflection.getAtributo(a, "nome"));

		Livro l = new Livro();
		l.setNome("Ensino de Java");
		System.out.println(Reflection.getAtributo(l, "nome"));
		System.out.println(Reflection.getAtributo(l, "titulo"));
		*/
		
		Reflection.listarMetodos("semana08.Autor");
		Reflection.listarMetodos("semana08.Livro");
		Reflection.listarMetodos("semana08.Abacaxi");

		
	}

}
