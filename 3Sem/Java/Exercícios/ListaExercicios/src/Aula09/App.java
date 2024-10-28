public class App {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Diego", "03/09/1999", "Brasil");
        System.out.println("\n" + autor1.toString());

        Autor autor2 = new Autor("Elon Musk", "28/06/1971", "África do Sul");
        System.out.println("\n" + autor2.toString());

        Autor autor3 = new Autor("Tony Stark", "", "Estados Unidos");
        System.out.println("\n" + autor3.toString());

        Autor autor4 = new Autor("Bruce Wayne", "19/02/1939");
        System.out.println("\n" + autor4.toString());

        Autor autor5 = new Autor("Clark Kent", "18/04/1938", "Estados Unidos");
        System.out.println("\n" + autor5.toString());

        Autor autor6 = new Autor("Diana Prince");
        System.out.println("\n" + autor6.toString());

        Autor autor7 = new Autor("Barry Allen", "09/06/1956", "Estados Unidos");
        System.out.println("\n" + autor7.toString());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");

        Imagem imagem1 = new Imagem("Batman.png", "Batman");
        System.out.println("\n" + imagem1.toString());

        Imagem imagem2 = new Imagem("Superman.png", "Superman");
        System.out.println("\n" + imagem2.toString());

        Imagem imagem3 = new Imagem("WonderWoman.png", "Wonder Woman");
        System.out.println("\n" + imagem3.toString());

        Imagem imagem4 = new Imagem("Flash.png", "Flash");
        System.out.println("\n" + imagem4.toString());

        Imagem imagem5 = new Imagem("IronMan.png", "Iron Man");
        System.out.println("\n" + imagem5.toString());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");

        Livro livro1 = new Livro("Crônicas de Diego", 1257.55, "03/05/2019", autor6);
        System.out.println("\n" + livro1.toString());

        Livro livro2 = new Livro("Aventuras de Elon", 999.99, autor1);
        System.out.println("\n" + livro2.toString());

        Livro livro3 = new Livro("Tecnologias de Stark", 1500.00, autor1);
        System.out.println("\n" + livro3.toString());

        Livro livro4 = new Livro("Histórias de Clark", 850.75, "10/01/2021", autor3);
        System.out.println("\n" + livro4.toString());

        Livro livro5 = new Livro("Lendas de Diana", 1200.50, "05/07/2017");
        System.out.println("\n" + livro5.toString());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");

        Imagem_Livro imagem_livro1 = new Imagem_Livro(imagem1, livro1);
        System.out.println("\n" + imagem_livro1.toString());

        Imagem_Livro imagem_livro2 = new Imagem_Livro(imagem2, livro2);
        System.out.println("\n" + imagem_livro2.toString());

        Imagem_Livro imagem_livro3 = new Imagem_Livro(imagem3, livro3);
        System.out.println("\n" + imagem_livro3.toString());

        Imagem_Livro imagem_livro4 = new Imagem_Livro(imagem4, livro4);
        System.out.println("\n" + imagem_livro4.toString());

        Imagem_Livro imagem_livro5 = new Imagem_Livro(imagem5, livro5);
        System.out.println("\n" + imagem_livro5.toString());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");

        Capitulo capitulo1 = new Capitulo("Capítulo 1: A história começa aqui", 15, livro1);
        System.out.println("\n" + capitulo1.toString());

        Capitulo capitulo2 = new Capitulo("Capítulo 2: A jornada continua", 20, livro2);
        System.out.println("\n" + capitulo2.toString());

        Capitulo capitulo3 = new Capitulo("Capítulo 3: O desafio", 25, livro3);
        System.out.println("\n" + capitulo3.toString());

        Capitulo capitulo4 = new Capitulo("Capítulo 4: A descoberta", 30, livro4);
        System.out.println("\n" + capitulo4.toString());

        Capitulo capitulo5 = new Capitulo("Capítulo 5: O confronto", 35, livro5);
        System.out.println("\n" + capitulo5.toString());

        Capitulo capitulo6 = new Capitulo("Capítulo 6: A vitória", 40, livro2);
        System.out.println("\n" + capitulo6.toString());

        Capitulo capitulo7 = new Capitulo("Capítulo 7: A celebração", 45, livro2);
        System.out.println("\n" + capitulo7.toString());

        Capitulo capitulo8 = new Capitulo("Capítulo 8: O retorno", 50, livro1);
        System.out.println("\n" + capitulo8.toString());

        Capitulo capitulo9 = new Capitulo("Capítulo 9: A nova ameaça", 55, livro1);
        System.out.println("\n" + capitulo9.toString());

        Capitulo capitulo10 = new Capitulo("Capítulo 10: O sacrifício", 60, livro4);
        System.out.println("\n" + capitulo10.toString());

        Capitulo capitulo11 = new Capitulo("Capítulo 11: O renascimento", 65, livro3);
        System.out.println("\n" + capitulo11.toString());
    }
}