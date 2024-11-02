package banco;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ProdutoConsultarParametro {

	public static void main(String[] args) {
		BD bd = new BD();
		String s = 
			JOptionPane.showInputDialog("Forneça o caracter(es) para a busca");
		int e = Integer.parseInt(
				JOptionPane.showInputDialog("Estoque mínimo?"));

		if(bd.getConnection()) {
			String sql = "select * from produtos where estoque >= ? and "
					+ "nome like ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1,e);
				bd.st.setString(2, "%" + s + "%");
				
				bd.rs = bd.st.executeQuery();
				while(bd.rs.next()) {
					System.out.println(bd.rs.getInt("id")+","+
							bd.rs.getString("nome")+","+
							bd.rs.getDouble("preco")+","+
							bd.rs.getInt("estoque"));
				}
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
