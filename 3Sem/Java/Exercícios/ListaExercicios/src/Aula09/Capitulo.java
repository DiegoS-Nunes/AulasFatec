/**
 * Classe que representa um capítulo de um livro.
 */
public class Capitulo {

    /**
     * Identificador único do capítulo.
     */
    private int id;

    /**
     * Contador estático para gerar identificadores únicos.
     */
    private static int contador = 0;

    /**
     * Título do capítulo.
     */
    private String Título;

    /**
     * Número da página onde o capítulo começa.
     */
    private int pagina;

    /**
     * Livro ao qual o capítulo pertence.
     */
    private Livro livro;

    /**
     * Construtor da classe Capitulo.
     *
     * @param título Título do capítulo.
     * @param pagina Número da página onde o capítulo começa.
     * @param livro Livro ao qual o capítulo pertence.
     */
    public Capitulo(String título, int pagina, Livro livro) {
        this.id = ++contador;
        this.Título = título;
        this.pagina = pagina;
        this.livro = livro;
    }

    /**
     * Obtém o identificador do capítulo.
     *
     * @return Identificador do capítulo.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o título do capítulo.
     *
     * @return Título do capítulo.
     */
    public String getTítulo() {
        return Título;
    }

    /**
     * Define o título do capítulo.
     *
     * @param título Novo título do capítulo.
     */
    public void setTítulo(String título) {
        this.Título = título;
    }

    /**
     * Obtém o número da página onde o capítulo começa.
     *
     * @return Número da página.
     */
    public int getPagina() {
        return pagina;
    }

    /**
     * Define o número da página onde o capítulo começa.
     *
     * @param pagina Novo número da página.
     */
    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    /**
     * Obtém o livro ao qual o capítulo pertence.
     *
     * @return Livro ao qual o capítulo pertence.
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * Define o livro ao qual o capítulo pertence.
     *
     * @param livro Novo livro ao qual o capítulo pertence.
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     * Retorna uma representação em string do capítulo.
     *
     * @return Representação em string do capítulo.
     */
    @Override
    public String toString() {
        return "Capitulo" + id +
                "{Título=" + Título +
                ", pagina=" + pagina +
                ", livro=" + livro.getNome() +
                '}';
    }
}
