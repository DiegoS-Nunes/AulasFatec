package Pincel;

public class Pincel {
    public String cor;
    public double preco;
    public int comprimento;

    public Pincel(String cor, double preco, int comprimento) {
        this.cor = cor;
        this.preco = preco;
        this.comprimento = comprimento;
    }

    public void mostrar() {
        System.out.println(cor);
        System.out.println(preco);
        System.out.println(comprimento);
    }
    @Override
    public String toString() {
        return "O pincel "+this.cor+" custa: "+ this.preco + " e mede: "+ this.comprimento+" cm";

    }
}