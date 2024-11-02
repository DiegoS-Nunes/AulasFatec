package semana06;

public class Livro {

	private int qtdePaginas;
	private String titulo;
	private String autorPrincipal;
	private String editora;
	private double preco;
	private boolean novo;

	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(String titulo) {
		this.titulo = titulo;
	}

	public Livro(int qtdePaginas, String titulo, String autorPrincipal, String editora, double preco, boolean novo) {
		this.qtdePaginas = qtdePaginas;
		this.titulo = titulo;
		this.autorPrincipal = autorPrincipal;
		this.editora = editora;
		setPreco(preco);
		this.novo = novo;
	}

	public Livro(int qtdePaginas, String titulo) {
		this.qtdePaginas = qtdePaginas;
		this.titulo = titulo;
	}

	public int getQtdePaginas() {
		return qtdePaginas;
	}
	public void setQtdePaginas(int qtdePaginas) {
		this.qtdePaginas = qtdePaginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutorPrincipal() {
		return autorPrincipal;
	}
	public void setAutorPrincipal(String autorPrincipal) {
		this.autorPrincipal = autorPrincipal;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco>0) {
			this.preco = preco;
		}
		else {
			System.out.println("O preço deve ser positivo!");
		}
	}
	public boolean isNovo() {
		return novo;
	}
	public void setNovo(boolean novo) {
		this.novo = novo;
	}
	
	
}
