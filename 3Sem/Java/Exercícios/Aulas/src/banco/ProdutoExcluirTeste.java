package banco;

public class ProdutoExcluirTeste {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		dao.produto.setId(10);
		System.out.println(dao.excluir());
	}

}
