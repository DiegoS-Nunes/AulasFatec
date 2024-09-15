package Pincel;

public class UsaPincel {
    public static void main(String[] args) {
        Pincel p1= new Pincel("Azul", 12.2, 4);
        Pincel p2 = new Pincel("Preto", 20,15);
        Pincel p3 = new Pincel("Verde", 22, 15);
        Pincel p4 = new Pincel("Amarelo", 12, 10);

        Pincel[] pinceis = new Pincel[] {p1,p2,p3,p4};

        for(Pincel p : pinceis){
            System.out.println(p.toString());
        }
    }
}
