package semana10;

public class PedidoItemComposicao {

	//forma 1
	public Item item4 = new Item();
	public Item item5 = new Item();
	public Item item6 = new Item();
	
	//forma 2
	public Item item1, item2, item3;
	public PedidoItemComposicao() {
		item1 = new Item();
		item2 = new Item();
		item3 = new Item();
	}
}
