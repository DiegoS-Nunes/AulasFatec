package semana10;

import java.util.ArrayList;
import java.util.List;

public class PedidoItemInterno {

	public int numero;
	public List<ItemPedido> itens = new ArrayList<ItemPedido>();
	
	public void adicionarItem(
			String nomeProduto, int quantidade, double preco) {
		ItemPedido item = new ItemPedido();
		item.nomeProduto = nomeProduto;
		item.quantidade = quantidade;
		item.preco = preco;
		itens.add(item);
	}
	
	public void listarItens() {
		for(ItemPedido i: itens) {
			i.mostrar();
		}
	}
	
	private class ItemPedido{
		public String nomeProduto;
		public int quantidade;
		public double preco;
		
		public void mostrar() {
			System.out.println(nomeProduto);
			System.out.println(quantidade);
			System.out.println(preco);
		}
	}
	
	public static void main(String[] args) {
		PedidoItemInterno p = new PedidoItemInterno();
		p.adicionarItem("Detergente", 10, 1.34);
		p.adicionarItem("Sabão", 5, 1.14);
		p.adicionarItem("Sabonete", 100, 1.50);
		p.listarItens();
		
	}
}
