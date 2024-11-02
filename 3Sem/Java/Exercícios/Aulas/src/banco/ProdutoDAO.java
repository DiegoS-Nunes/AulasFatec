package banco;

import java.sql.SQLException;

public class ProdutoDAO implements DAO {

	public Produto produto;
	public BD bd;
	private String sql, men; //variáveis auxiliares
	
	public ProdutoDAO() {
		produto = new Produto();
		bd = new BD();
	}
	
	@Override
	public String inserir() {
		sql = "insert into produtos values (?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, produto.getId());
			bd.st.setString(2, produto.getNome());
			bd.st.setDouble(3, produto.getPreco());
			bd.st.setInt(4, produto.getEstoque());
			bd.st.executeUpdate();
			men = "Produto inserido com sucesso!";
		}
		catch(SQLException e) {
			men = "Falha na inclusão " + e;
		}
		finally {
			bd.close();
		}
		return men;
	}

	@Override
	public String alterar() {
		sql = "update produtos set nome=?,preco=?,estoque=? where id=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(4, produto.getId());
			bd.st.setString(1, produto.getNome());
			bd.st.setDouble(2, produto.getPreco());
			bd.st.setInt(3, produto.getEstoque());
			int qtde = bd.st.executeUpdate();
			if(qtde==1) {
				men = "Produto alterado com sucesso!";
			}
			else {
				men = "Produto não encontrado!";
			}
		}
		catch(SQLException e) {
			men = "Falha na alteração " + e;
		}
		finally {
			bd.close();
		}
		return men;

	}

	@Override
	public String excluir() {
		sql = "delete from produtos where id = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, produto.getId());
			int qtde = bd.st.executeUpdate();
			if(qtde==1) {
				men = "Produto excluído com sucesso!";
			}
			else {
				men = "Produto não encontrado!";
			}
		}
		catch(SQLException e) {
			men = "Falha na exclusão " + e;
		}
		finally {
			bd.close();
		}
		return men;

	}
}
