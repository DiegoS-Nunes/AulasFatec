package semana09;

public class Pessoa {

	private int cpf;
	private String nome;
	private Pessoa conjuge;
	
	public void mostrar() {
		System.out.println(cpf);
		System.out.println(nome);
		if(conjuge!=null) {
			System.out.println("Conjuge: "+ conjuge.nome);
		}
	}
	
	public Pessoa(int cpf, String nome, Pessoa conjuge) {
		this.cpf = cpf;
		this.nome = nome;
		this.conjuge = conjuge;
	}
	
	public Pessoa() {
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getConjuge() {
		return conjuge;
	}

	public void setConjuge(Pessoa conjuge) {
		this.conjuge = conjuge;
	}
	
	
	
}
