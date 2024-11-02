package banco;

public class Produto {
	
	private int id, estoque;
	private String nome;
	private double preco;
	
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", estoque=" + estoque + ", nome=" + nome + ", preco=" + preco + "]";
	}

	public Produto() {
	}
	
	public Produto(int id, int estoque, String nome, double preco) {
		this.id = id;
		this.estoque = estoque;
		this.nome = nome;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	
}
