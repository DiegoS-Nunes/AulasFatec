package semana09;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Pessoa p4 = new Pessoa();
		Pessoa p5 = new Pessoa();
		p1.setCpf(1);
		p2.setCpf(2);
		p3.setCpf(3);
		p4.setCpf(4);
		p5.setCpf(5);
		p1.setNome("Ana");
		p2.setNome("Carlos");
		p3.setNome("Pedro");
		p4.setNome("Lucas");
		p5.setNome("Sofia");
		p1.setConjuge(p2);
		p2.setConjuge(p1);
		p4.setConjuge(p5);
		p5.setConjuge(p4);
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
		p4.mostrar();
		p5.mostrar();

	}

}
