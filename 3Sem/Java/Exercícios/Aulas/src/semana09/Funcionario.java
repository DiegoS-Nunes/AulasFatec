package semana09;
public class Funcionario {
	public int id;
	public String nome;
	public Mesa mesa;  //implementando a associação
	public Cargo cargo;
	
	public Funcionario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Funcionario(int id, Cargo cargo, String nome) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
	}

	public Funcionario(int id, String nome, Mesa mesa, Cargo cargo) {
		this.id = id;
		this.nome = nome;
		this.mesa = mesa;
		this.cargo = cargo;
	}

	public Funcionario(int id, String nome, Mesa mesa) {
		this.id = id;
		this.nome = nome;
		this.mesa = mesa;
	}
	
	public void mostrar() {
		System.out.println(id);
		System.out.println(nome);
		if(cargo!=null) {
			System.out.println(cargo.nome);
		}
		else {
			System.out.println("Não possui cargo!");
		}
		if(mesa!=null) {
			System.out.println(mesa.material);
			System.out.println(mesa.descricao);
		}
		else {
			System.out.println("Não possui mesa!");
		}
	}
	
}
