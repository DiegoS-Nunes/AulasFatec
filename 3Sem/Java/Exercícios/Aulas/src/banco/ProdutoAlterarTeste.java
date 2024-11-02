package banco;

public class ProdutoAlterarTeste {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		dao.produto.setId(20);
		dao.produto.setNome("Brinquedo de pelúcia");
		dao.produto.setPreco(150);
		dao.produto.setEstoque(15);
		System.out.println(dao.alterar());
	}

}
