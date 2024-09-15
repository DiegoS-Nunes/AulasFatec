package Aula06;

public class Main {
    public static void main(String[] args) {
        Galinha g1 = new Galinha("Azul",15.54,245.89,3675);
        Galinha g2 = new Galinha("Preta",25.04,600.89,675);
        Galinha g3 = new Galinha("Rosa",9.14,150.89,4500);
        Galinha g4 = new Galinha("Marrom",18.4,302.89,3800);

        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());
        System.out.println(g4.toString());
    }
}