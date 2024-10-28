public class Imagem_Livro {
    private int id;
    private static int contador=0;
    private Imagem imagem;
    private Livro livro;

    public  Imagem_Livro(Imagem imagem, Livro livro) {
        this.id = ++contador;
        this.imagem = imagem;
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Imagem_Livro"+ id +
                "{imagem=" + imagem.getDescricao() +
                ", livro=" + livro.getNome() +
                '}';
    }
}
