public class Capitulo {
    private int id;
    private static int contador=0;
    private String Título;
    private int pagina;
    private Livro livro;

    public Capitulo(String título, int pagina, Livro livro) {
        this.id = ++contador;
        this.Título = título;
        this.pagina = pagina;
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String título) {
        this.Título = título;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Capitulo"+ id +
                "{Título=" + Título +
                ", pagina=" + pagina +
                ", livro=" + livro.getNome() +
                '}';
    }
}
