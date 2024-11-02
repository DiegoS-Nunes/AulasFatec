package semana09;

public class Cargo {

	public int id;
	public String nome;
	public Funcionario[] funcionario;
	
	public Cargo() {
	}
	
	public Cargo(int id, String nome, Funcionario[] funcionario) {
		this.id = id;
		this.nome = nome;
		this.funcionario = funcionario;
	}
	
	public void mostrar() {
		System.out.println(id);
		System.out.println(nome);
		//for(int i=0; i<funcionario.length; i++)
		System.out.println("Relação de funcionários:");
		for(Funcionario f: funcionario) {
			System.out.println(f.id);
			System.out.println(f.nome);
		}
	}
	
}
