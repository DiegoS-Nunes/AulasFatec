package banco;

public class ProdutoInserirTeste {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		dao.produto.setId(10);
		dao.produto.setNome("Brinquedo");
		dao.produto.setPreco(100);
		dao.produto.setEstoque(10);
		System.out.println(dao.inserir());
	}

}
