package semana10;

import java.util.ArrayList;
import java.util.List;



public class PedidoItemAgregacao {

	public int numero;
	public List<Item> itens = new ArrayList<Item>();
	
	public void adicionarItem(Item item) {
		itens.add(item);
	}

	public void listarItens() {
		for(Item i: itens) {
			i.mostrar();
		}
	}

	public static void main(String[] args) {
		Item i1 = new Item();
		i1.nomeProduto = "Sabão";
		i1.quantidade = 10;
		i1.preco = 1.34;

		Item i2 = new Item();
		i2.nomeProduto = "Sabonete";
		i2.quantidade = 100;
		i2.preco = 1.50;
		
		PedidoItemAgregacao p1 = new PedidoItemAgregacao();
		PedidoItemAgregacao p2 = new PedidoItemAgregacao();
		
		p1.adicionarItem(i1);
		p1.adicionarItem(i2);
		p1.listarItens();
		System.out.println("-------------------------");
		p2.adicionarItem(i2);
		p2.listarItens();
	}
}
