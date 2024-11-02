package semana06;

public class Garrafa {

	public final int VOLUME_MAXIMO = 500;
	private String material;
	private int volume;
	private double preco;
	
	public void setPreco(double preco) {
		if(preco>0){
			this.preco = preco;
		}
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setVolume(int v) {
		if(v <= VOLUME_MAXIMO) {
			volume = v;
		}
		// 
	}
	
	public int getVolume() {
		return volume;
	}
}
