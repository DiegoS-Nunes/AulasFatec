package banco;

import java.sql.SQLException;

public class ProdutoConsultar {

	public static void main(String[] args) {
		BD bd = new BD();
		if(bd.getConnection()) {
			String sql = "select * from produtos";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				while(bd.rs.next()) {
					System.out.println(bd.rs.getInt("id")+","+
							bd.rs.getString("nome")+","+
							bd.rs.getDouble("preco")+","+
							bd.rs.getInt("estoque"));
				}
				
				sql = "select sum(preco) as total from produtos";
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				bd.rs.next();
				System.out.println(bd.rs.getDouble("total"));
				
				sql = "select max(estoque) as maior_estoque from produtos";
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				bd.rs.next();
				System.out.println(bd.rs.getDouble("maior_estoque"));
			}
			catch(SQLException erro) {
				System.out.println(erro);
			}
			finally {
				bd.close();
			}
		}
		else {
			System.out.println("Falha ao conectar!");
		}

	}

}
